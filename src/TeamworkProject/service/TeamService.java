package TeamworkProject.service;

import TeamworkProject.domain.Architect;
import TeamworkProject.domain.Designer;
import TeamworkProject.domain.Employee;
import TeamworkProject.domain.Programmer;

import java.util.Spliterator;

public class TeamService {

    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;

    public TeamService() {
        super();
    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("開発メンバーが満員になるため、追加不可");
        }

        if (!(e instanceof Programmer)) {
            throw new TeamException("当メンバーは開発メンバーではないため、追加不可");
        }

        if (isExist(e)) {
            throw new TeamException("当メンバーはすでにチーム内に追加済です");
        }

        Programmer p = (Programmer) e;
        if ("BUSY".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("当メンバーはすでに某チームに所属している");
        } else if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("当メンバーは休暇中");
        }

        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException("チーム内には一名のアーキテクトしかいられない");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("チーム内には最大二名のデザイナーしかいられない");
            }
        } else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("チーム内には最大三名のプログラマーしかいられない");
            }
        }

        //正しくない
//        if (p instanceof Architect && numOfArch >= 1) {
//
//            throw new TeamException("チーム内には一名のアーキテクトしかいられない");
//
//        } else if (p instanceof Designer && numOfDes >= 2) {
//
//            throw new TeamException("チーム内には最大二名のデザイナーしかいられない");
//
//        } else if (p instanceof Programmer && numOfPro >= 3) {
//
//            throw new TeamException("チーム内には最大三名のプログラマーしかいられない");
//
//        }

        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }

    private boolean isExist(Employee e) {

        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }

        return false;

    }

    public void removeMember(int memberId) throws TeamException {

        int i = 0;
        for (; i < total; i++) {

            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }

        }

        if (i == total) {
            throw new TeamException("指定の社員のメンバーIDは存在しない");
        }

        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        team[total - 1] = null;
        total--;
    }


}
