/**
 * Created by Adesh on 06-08-2019
 */

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceil;
    private Lamp lamp;
    private Bed bed;


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceil, Lamp lamp, Bed bed) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceil = ceil;
        this.lamp = lamp;
        this.bed = bed;
    }


    public Lamp getLamp() {
        return lamp;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeil() {
        return ceil;
    }

    public Bed getBed() {
        return bed;
    }

    public void makeBed(){
        System.out.println("Bed is being ready");
        bed.make();
    }

    public void lampOn(){
        System.out.println("Turning lamp on");
        lamp.turnOn();
    }





}
