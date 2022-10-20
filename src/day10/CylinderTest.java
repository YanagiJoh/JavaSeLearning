package day10;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);

        double volume = cy.findVolume();
        System.out.println("円柱の体積: " + volume);

        //double area = cy.findArea();
        //System.out.println("底面円の面積: " + area);

        double area = cy.findArea();
        System.out.println("底面円の表面積: " + area);

        System.out.println("********************");
        Cylinder cy1 = new Cylinder();

        double volume1 = cy.findVolume();
        System.out.println("円柱の体積: " + volume1);
    }
}
