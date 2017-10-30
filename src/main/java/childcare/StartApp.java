package childcare;


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

            System.out.println(currentChild.getName());

            if (currentChild.getAge() < 24) {
                childcare1.getBabyRoom().add(currentChild);
                //System.out.println("Baby room");
            } else if (currentChild.getAge() >= 24 && currentChild.getAge() <= 34) {
                childcare1.getToddlerRoom().add(currentChild);
                //System.out.println("Toddler room");
            } else if (currentChild.getAge() > 35) {
                childcare1.getKinderRoom().add(currentChild);
                //System.out.println("Kinder room");
            } else {
                System.out.println("Some message..................");
            }

        }

        System.out.println("Looping through babies list---------------------------------");
        for (Child currentChild : childcare1.getBabyRoom()) {

            System.out.println(currentChild.getName());

        }

        System.out.println("Looping through toddler list---------------------------------");
        for (Child currentChild : childcare1.getToddlerRoom()) {

            System.out.println(currentChild.getName());

        }

        System.out.println("Looping through kinder list---------------------------------");
        for (Child currentChild : childcare1.getKinderRoom()) {

            System.out.println(currentChild.getName());

        }


    }
}