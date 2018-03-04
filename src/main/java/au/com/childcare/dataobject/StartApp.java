package au.com.childcare.dataobject;


public class StartApp {

    public static void main(String[] args) {


        ChildCare childcare1 = new ChildCare("One Tree", "Altona Meadows");

        Child child1 = new Child(1,"Kati", 24);
        Child child2 = new Child(2, "Zoli", 14);
        Child child3 = new Child(3, "Andi", 36);
        Child child4 = new Child(4, "Reka", 6);
        Child child5 = new Child(5, "Sebi", 12);
        Child child6 = new Child(6, "Bulcsu", 38);
        Child child7 = new Child(7, "Kornel", 7);
        Child child8 = new Child(8,"Oliver", 30);
        Child child9 = new Child(9, "Kahu", 9);
        Child child10 = new Child(10, "Kea", 11);


        childcare1.getKidsInChildCare().add(child1);
        childcare1.getKidsInChildCare().add(child2);
        childcare1.getKidsInChildCare().add(child3);
        childcare1.getKidsInChildCare().add(child4);
        childcare1.getKidsInChildCare().add(child5);
        childcare1.getKidsInChildCare().add(child6);
        childcare1.getKidsInChildCare().add(child7);
        childcare1.getKidsInChildCare().add(child8);
        childcare1.getKidsInChildCare().add(child9);
        childcare1.getKidsInChildCare().add(child10);


        System.out.println("Looping through kids list");
        for (Child currentChild : childcare1.getKidsInChildCare()) {

            System.out.println(currentChild.getFullName());

            if (currentChild.getAgeMonth() < 24) {
                childcare1.getBabyRoom().add(currentChild);
                //System.out.println("Baby room");
            } else if (currentChild.getAgeMonth() >= 24 && currentChild.getAgeMonth() <= 34) {
                childcare1.getToddlerRoom().add(currentChild);
                //System.out.println("Toddler room");
            } else if (currentChild.getAgeMonth() > 35) {
                childcare1.getKinderRoom().add(currentChild);
                //System.out.println("Kinder room");
            } else {
                System.out.println("Some message..................");
            }

        }

        System.out.println("Looping through babies list---------------------------------");
        for (Child currentChild : childcare1.getBabyRoom()) {

            System.out.println(currentChild.getFullName());

        }

        System.out.println("Looping through toddler list---------------------------------");
        for (Child currentChild : childcare1.getToddlerRoom()) {

            System.out.println(currentChild.getFullName());

        }

        System.out.println("Looping through kinder list---------------------------------");
        for (Child currentChild : childcare1.getKinderRoom()) {

            System.out.println(currentChild.getFullName());

        }

        Teacher teacher1 = new Teacher(1, "Besset");
        Teacher teacher2 = new Teacher(2, "Simone");
        Teacher teacher3 = new Teacher(3, "Rhonda");
        Teacher teacher4 = new Teacher(4, "Jill");
        Teacher teacher5 = new Teacher(5, "Karen");
        Teacher teacher6 = new Teacher(6, "Ruby");
        Teacher teacher7 = new Teacher(7, "Connie");
        Teacher teacher8 = new Teacher(8, "Philippa");
        Teacher teacher9 = new Teacher(9, "Melissa");

        childcare1.getTeacherList().add(teacher1);
        childcare1.getTeacherList().add(teacher2);
        childcare1.getTeacherList().add(teacher3);
        childcare1.getTeacherList().add(teacher4);
        childcare1.getTeacherList().add(teacher5);
        childcare1.getTeacherList().add(teacher6);
        childcare1.getTeacherList().add(teacher7);
        childcare1.getTeacherList().add(teacher8);
        childcare1.getTeacherList().add(teacher9);

        System.out.println("Looping through Teacher list---------------------------------");
        for (Teacher currentTeacher : childcare1.getTeacherList()) {

            System.out.println(currentTeacher.getName());

        }

    }
}