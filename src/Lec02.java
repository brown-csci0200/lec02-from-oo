package src;

public class Lec02 {
    
    public static void main(String[] args) {
        Boa fredBoa = new Boa("Fred", 20, "lettuce");
        //System.out.println(fredBoa);
        // Boa[name=Fred, length=20, eats=lettuce

        FuncList<Integer> scoreList = new FuncList<>();
//        scoreList.link(98);
//        scoreList.link(75);
//        scoreList.link(82);
        FuncList<Integer> newScoreList = scoreList.link(98).link(75).link(82);
        System.out.println(scoreList);
        System.out.println(newScoreList);

    }

    public static boolean isVeg(Boa b) {
        return b.eats().equals("lettuce") ||
                b.eats().equals("apples");
    }
    public static Boa growBoa(Boa b) {
        // TODO: left in bug, eats = name
        return new Boa(b.name(), b.length() * 2, b.name());
    }
}
