public class Lec02 {
    
    public static void main(String[] args) {
        Boa fred = new Boa("Fred", 20, "lettuce");
        System.out.println(fred.name());

        // "Immutable", like the Boa record
        FuncList<Integer> scoreList = new FuncList<>();
        //scoreList.link(98);
        //scoreList.link(75);
        //scoreList.link(82);
        scoreList = scoreList.link(98).link(75).link(82);
        System.out.println(scoreList);

        FuncList<Boa> boaList = new FuncList<>();
        boaList = boaList.link(fred).link(new Boa("Lily", 80, "ants"));

        FuncList<Boa> wellFed =
                boaList.map(b -> grow(b));
        FuncList<Boa> vegetarians =
                boaList.filter(b -> isVegetarian(b));
        System.out.println(vegetarians);
        System.out.println(wellFed);



//        for(Boa b: boaList) {
//            if(isVegetarian(b)) {
//                System.out.println(b.name());
//            }
//        }

        /*
        Given: list of records about plane flights
        (1) get a list of flights to Denver
          selection
        (2) get a list of all flights dept before 9am
          selection
        (3) get the earliest flight that goes to
            Chicago after noon
          selection
          selection
          pick "best"
        (4) get back the list of flights, with duration added
            transformation

         */


    }

    /**
     * Is this Boa a vegetarian?
     * @param b the Boa in question
     * @return true if and only if the Boa b is vegetarian
     */
    public static boolean isVegetarian(Boa b) {
        return b.eats().equals("lettuce") ||
                b.eats().equals("carrots");
    }

    /**
     * The Boa is growing up. Return a new Boa record with all the same data
     * except for a higher length value.
     * @param b the Boa in question
     * @return a new Boa record object
     */
    public static Boa grow(Boa b) {
        return new Boa(b.name(), b.length()+1, b.eats());
    }
}
