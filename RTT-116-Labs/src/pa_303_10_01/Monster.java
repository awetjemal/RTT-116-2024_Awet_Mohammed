package pa_303_10_01;

public class Monster {
    private String monsterName;

    public Monster() {

    }
    public Monster(String monsterName) {
        this.monsterName = monsterName;
    }
   public String attack(){
       return "I dont know how to attack!";
   }
}
