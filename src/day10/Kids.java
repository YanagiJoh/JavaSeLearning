package day10;

public class Kids extends ManKind{
    private int yearsOld;

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids() {
    }

    public void printAge(){
        System.out.println("I am " + yearsOld + " years old. ");
    }

    public int getYearsOld(){
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public void empolyeed(){
        System.out.println("Kids should study hard and no job");
    }
}
