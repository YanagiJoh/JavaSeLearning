package day19;

public class SeasonTest1 {

    public static void main(String[] args) {

        Season1 summer = Season1.SUMMER;
        System.out.println(summer.toString());
        System.out.println(Season1.class.getSuperclass());

        System.out.println("********************");

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length ; i++) {
            System.out.println(values[i]);
            values[i].show();
        }

        System.out.println("********************");

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values1[i]);
        }

        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }

}

interface Info{
    void show();
}

enum Season1 implements Info{

    SPRING("春", "暖かい"){
        @Override
        public void show() {
            System.out.println("春は来る");
        }
    },
    SUMMER("夏", "暑い"){
        @Override
        public void show() {
            System.out.println("夏は来る");
        }
    },
    AUTUMN("秋", "涼しい"){
        @Override
        public void show() {
            System.out.println("秋は来る");
        }
    },
    WINTER("冬", "寒い"){
        @Override
        public void show() {
            System.out.println("冬は来る");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("これは季節です。");
//    }


//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}
