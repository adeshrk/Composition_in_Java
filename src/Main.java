/**
 * Created by Adesh on 06-08-2019
 */

public class Main {
    public static void main(String[] args) {
         Wall wall1 = new Wall("East","white");
         Wall wall2 = new Wall("West","Blue");
         Wall wall3 = new Wall("North","Grey");
         Wall wall4 = new Wall("South","white");

         Ceiling ceiling = new Ceiling(12,"White");
        Lamp lamp = new Lamp("AC current",4);
        Bed bed = new Bed(4,2,6,4);

        Bedroom bedroom=new Bedroom("Adesh's Bed",wall1,wall2,wall3,wall4,ceiling,lamp,bed);
        bedroom.makeBed();
        bedroom.lampOn();
        System.out.println("Ceiling color -> "+bedroom.getCeil().getColor());
        System.out.println("No. of quilts -> "+bedroom.getBed().getQuilt());

    }
    
}
