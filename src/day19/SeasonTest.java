package day19;

public class SeasonTest {

    public static void main(String[] args) {

        Season spring = Season.SPRING;
        System.out.println(spring);

    }

}

class Season {

    private final String seasonName;
    private final String seasonDesc;

    public Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final Season SPRING = new Season("春", "暖かい");
    public static final Season SUMMER = new Season("夏", "暑い");
    public static final Season AUTUMN = new Season("秋", "涼しい");
    public static final Season WINTER = new Season("冬", "寒い");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
