public class Meetod {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;


        calculateScore(true, 2000, 5, 100);
        //saame sisestada väärtused
        calculateScore(gameOver,score,levelCompleted,bonus);
        //saame sisestada muutujad
        boolean minuBooleanmuutja = true;
        int abc = 700;
        int bonus2 = 200;
        calculateScore(minuBooleanmuutja, abc,2, bonus2);

        int lowScore = calculateScore(true,1,2,3);
        lowScore += 113;
        System.out.println(lowScore);
        int highScore = calculateScore(true,10000,8,200);
        System.out.println(highScore);

        int topScore = calculatePosition(1500);
        displayPosition("juku",topScore);
        displayPosition("Juhan",calculatePosition(900));
        displayPosition("Juss", calculatePosition(calculateScore(gameOver,score,levelCompleted,bonus)));



    }


    public static int calculateScore (boolean gameOver, int score,
                                       int levelCompleted, int bonus) {
        if (gameOver) { //kontorll, kas gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println(finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayPosition(String name, int position) {
        System.out.println(name + " saavutas " + position + " koha tabelis");
    }
    public static int calculatePosition(int score) {

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;


        /*
        if (score >= 1000) {
            return 1;
        } else if (score >=500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
        */
    }

}