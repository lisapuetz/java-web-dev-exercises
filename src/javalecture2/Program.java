package javalecture2;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        String theSeason = "Winter";
        int inchesOfSnow = 2;

        HashMap<String, Integer> favoriteNumbers = new HashMap<>();
        favoriteNumbers.put("Jade", 3);
        favoriteNumbers.put("Amy", 31415);
        favoriteNumbers.put("Melanie", 11);

        System.out.println(favoriteNumbers);


//        ArrayList<Integer> favoriteNumbers = new ArrayList<>();
//        favoriteNumbers.add(12);
//        favoriteNumbers.add(27);
//        favoriteNumbers.remove(1);
//
//        System.out.println(favoriteNumbers.get(1));
//
//        for(Integer i : favoriteNumbers) {
//            System.out.println(i);
//        }

//        if (inchesOfSnow == 2) {
//            System.out.println("School is canceled");
//        }
//
//        if (theSeason.equals("Winter")) {
//            System.out.println("Winter is HERE");
//        }

//        switch(theSeason) {
//
//            case "Spring":
//                System.out.println("It's too humid and hot");
//                break;
//
//            case "Winter":
//                System.out.println("It's too cold.");
//                break;
//
//            default:
//                System.out.println("Time for allergies");
//        }
//
        String[] seasons = {"Spring", "Summer", "Fall", "Winter"};
//        for (int i = 0; i < seasons.length; i++) {
//            System.out.println(seasons[i]);
//        }

//        for (String season : seasons) {
//            System.out.println(season);
//        }
    }
}
