package polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attack Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids escape maze";
    }
}

class Starwars extends Movie {
    public Starwars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Rebels rebel";
    }
}
class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
}


public class Main {

    //ülemklass ja alamklassid. Iga (alam)klass kirjeldab mingit unikaalset käitumist
    //ning samal ajal jagab ülemklassi mingit funktsionaalsust.
    //Selleks, et polümorfismi saavutada, tuleb kasutada vähemalt ühte ülemklassi meetodit

    //See lubab kasutada sama koodi ja funktsioone erinevate andmetüüpidega

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie (){
        int randomNumber = (int) (Math.random() * 5) + 1 ;
        //Math.random() annab double'i väärtuse 0 ja 1 vahel
        System.out.println("Random number = " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgettable();
        }
        return null;
        // "null" ei ole 0; on tühi, mitte midagi
    }

}
