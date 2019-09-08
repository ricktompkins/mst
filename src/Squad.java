import java.util.Arrays;

public class Squad {

    private final String squadName;
    private static final int MAX_HEROES = 4; // static final as its a constant across all squads
    private Superhero[] squadMembers;
    private int numHeroes;


    public Squad(String squadName) {

        this.squadName = squadName;
        squadMembers = new Superhero[MAX_HEROES];
        numHeroes = 0;
    }


    public String toString(){

        return this.squadName + ": " + Arrays.toString(squadMembers);
    }

    public String getSquadName() {

        return this.squadName;
    }

    public boolean isMember(Superhero otherHero) {
        for(int i = 0; i < numHeroes; i++){
            if(squadMembers[i].equals(otherHero)){
                return true;
            }
        }
        return false;
    }

    public void addMember(Superhero hero) {

        if(numHeroes < MAX_HEROES) { // Check if we've hit max heroes yet
            if(!this.isMember(hero)) { // Make sure we dont already have them on the team
                squadMembers[numHeroes] = hero; // Add them to the list
                hero.setSquad(this); // Set the hero's squad to "this" which is the current squad
                numHeroes++;
            }
        }
    }

}
