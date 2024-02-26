package org.example;

/**
 * Hello world!
 *
 */
class NoodleRestaurant {
    String name;

    public NoodleRestaurant(String customerName){
        name = customerName;
    }

    //super class parameter (Noodle)
    public void order(Noodle noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Order for " + name + " is ready.");
    }

    public static void main(String[] args) {
        Noodle spaghetti, ramen, pho;
        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        // putting instances of different classes that share a parent class together in an array or ArrayList
        Noodle[] allTheNoodles = {spaghetti, ramen, pho};
        //looping through each noodle in allTheNoodles
        for(Noodle noodle : allTheNoodles ) {
            //printing cook prep for each type of noodle
            System.out.println(noodle.getCookPrep());
        }

        NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
        NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");


        customer1.order(pho);
        customer2.order(ramen);


    }
}