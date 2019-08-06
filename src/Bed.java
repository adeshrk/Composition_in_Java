/**
 * Created by Adesh on 06-08-2019
 */

public class Bed {
    private int pillows;
    private int sheets;
    private int height;
    private int quilt;

    public Bed(int pillows, int sheets, int height, int quilt) {
        this.pillows = pillows;
        this.sheets = sheets;
        this.height = height;
        this.quilt = quilt;
    }
     public void make(){
         System.out.println("Bed is made!!!");
     }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getHeight() {
        return height;
    }

    public int getQuilt() {
        return quilt;
    }
}
