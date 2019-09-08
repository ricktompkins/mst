public class Main {

    public static void main(String[] args) {

        Squad avengers = new Squad("The Avengers");
        Superhero spiderman = new Superhero("Spider-Man");
        Superhero thor = new Superhero("Thor");
        Superhero blackwidow = new Superhero("Black Widow");
        Superhero ironman = new Superhero("Iron Man");
        Superhero hulk = new Superhero("The hulk");


        System.out.println(thor.toString());
        System.out.println(avengers.toString());
        avengers.addMember(thor);
        avengers.addMember(thor);
        avengers.addMember(spiderman);
        System.out.println(spiderman.getSquad());
        System.out.println(avengers.toString());
        System.out.println(thor.isSquadMate(spiderman));
        System.out.println(thor.isSquadMate(blackwidow));
        avengers.addMember(blackwidow);
        avengers.addMember(hulk);
        avengers.addMember(ironman);
        System.out.println(avengers.toString());
        System.out.println(avengers.isMember(ironman));


    }


}
