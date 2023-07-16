package TeamworkProject.view;

import TeamworkProject.domain.Employee;
import TeamworkProject.domain.Programmer;
import TeamworkProject.service.NameListService;
import TeamworkProject.service.TeamException;
import TeamworkProject.service.TeamService;

public class TeamView {

    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    private void enterMainMenu() {

        boolean loopFlag = true;
        char menu = '0';

        while (loopFlag) {

            if (menu != '1') {
                listAllEmployees();
            }

            System.out.print("1-チームリスト 2-チームメンバーを追加 3-チームメンバーを削除 4-退出 (1~4)を選択してください: ");
            menu = TSUtility.readMenuSelection();

            switch (menu) {

                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("本当に退出しますか？(Y/N)");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
                    break;

            }
        }

    }

    private void listAllEmployees() {
        System.out.println("--------------------開発チームメンバー調整ソフトウェア--------------------\n");
        Employee[] employees = listSvc.getAllEmployees();
        if (employees == null || employees.length == 0) {
            System.out.println("社員の情報は存在しません。");
        } else {
            System.out.println("ID\t名前\t年齢\t給料\t職位\tステータス\tボーナス\t株\t使用端末");

            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }

        System.out.println("----------------------------------------------------------------------");
    }

    private void getTeam() {
        //System.out.println("開発チームの状況を確認する");
        System.out.println("--------------------開発チームメンバーリスト--------------------\n");
        Programmer[] team = teamSvc.getTeam();
        if (team == null || team.length == 0) {
            System.out.println("開発チームにはメンバーがいません");
        } else {
            System.out.println("TID/ID\t名前\t年齢\t給料\t職位\tボーナス\t株");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsForTeam());
            }
        }
        System.out.println("----------------------------------------------------------------------");
    }

    private void addMember() {
        //System.out.println("チームメンバーを追加する");
        System.out.println("--------------------開発メンバー追加--------------------\n");
        System.out.print("社員のIDを入力してください: ");
        int id = TSUtility.readInt();

        try {
            Employee emp = listSvc.getEmployee(id);
            teamSvc.addMember(emp);
            System.out.println("追加成功");
        } catch (TeamException e) {
            System.out.println("追加失敗、原因: " + e.getMessage());
        }

        TSUtility.readReturn();

    }

    private void deleteMember() {
        //System.out.println("チームメンバーを削除する");
        System.out.println("--------------------開発メンバー削除--------------------\n");
        System.out.print("社員のTIDを入力してください: ");
        int memberId = TSUtility.readInt();

        System.out.print("本当に削除しますか?(Y/N): ");
        char isDelete = TSUtility.readConfirmSelection();
        if (isDelete == 'N') {
            return;
        }

        try {
            teamSvc.removeMember(memberId);
            System.out.println("削除成功");
        } catch (TeamException e) {
            System.out.println("削除失敗、原因: " + e.getMessage());
        }

        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }


}
