public class Superhero {

    private final String name;
    private Squad squad; // Could be changed to final unless the super hero is later able to change squad

    public Superhero(String name) {
        
        this.name = name;
    }

    public String getName(){

        return this.name;
    }

    public Squad getSquad(){

        return this.squad;
    }

    public void setSquad(Squad squad){
        this.squad = squad;
    }

    public boolean equals(Superhero otherHero){
        return this.name.equals(otherHero.getName());
    }

    public String toString(){
        return this.name;
    }

    public boolean isSquadMate(Superhero hero) {

        return hero.getSquad() == this.squad;
    }

}
