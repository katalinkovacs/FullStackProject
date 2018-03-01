package co.fullstack.childcare;

import java.util.ArrayList;

public class ChildCare {

    private String name;
    private String suburb;
    private ArrayList<Child> kidsInChildCare;
    private ArrayList<Child> babyRoom;
    private ArrayList<Child> toddlerRoom;
    private ArrayList<Child> kinderRoom;
    private ArrayList<Teacher> teacherList;



    // CONSTRUCTORS
    public ChildCare() {

    }

    public ChildCare(String name, String suburb) {

        this.name = name;
        this.suburb = suburb;
        kidsInChildCare = new ArrayList<Child>();
        babyRoom = new ArrayList<Child>();
        toddlerRoom = new ArrayList<Child>();
        kinderRoom = new ArrayList<Child>();
        teacherList = new ArrayList<Teacher>();

    }

    // SETTERS AND GETTERS
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSuburb() {

        return suburb;
    }

    public void setSuburb(String suburb) {

        this.suburb = suburb;
    }

    public ArrayList<Child> getKidsInChildCare() {
        //System.out.println("----------------GET ALL OF THE KIDS---------------");
        return kidsInChildCare;
    }

    public void setKidsInChildCare(ArrayList<Child> kids) {
        //System.out.println("----------------When do I use this?????????????????????????");
        this.kidsInChildCare = kids;
    }

    public ArrayList<Child> getBabyRoom() {

        return babyRoom;
    }

    public void setBabyRoom(ArrayList<Child> babyRoom) {
        //System.out.println("----------------When do I use this?????????????????????????");
        this.babyRoom = babyRoom;
    }

    public ArrayList<Child> getToddlerRoom() {

        return toddlerRoom;
    }

    public void setToddlerRoom(ArrayList<Child> toddlerRoom) {
        //System.out.println("----------------When do I use this?????????????????????????");
        this.toddlerRoom = toddlerRoom;
    }

    public ArrayList<Child> getKinderRoom() {

        return kinderRoom;
    }

    public void setKinderRoom(ArrayList<Child> kinderRoom) {
        //System.out.println("----------------When do I use this?????????????????????????");
        this.kinderRoom = kinderRoom;
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}

