package au.com.childcare.dataobject;

public class Child {

    private int id;
    private String fullName;
    private int ageMonth;


    // CONSTRUCTORS
    public Child() {

        //System.out.println("------------------Empty CONSTRUCTOR-----------------");
    }

    public Child(int id, String fullName, int ageMonth) {
        this.id = id;
        this.fullName = fullName;
        this.ageMonth = ageMonth;
        //System.out.println("------------------3 argument CONSTRUCTOR-----------------");
    }


    // SETTERS AND GETTERS

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }
    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public int getAgeMonth() {

        return ageMonth;
    }

    public void setAgeMonth(int ageMonth) {

        this.ageMonth = ageMonth;
    }


}
