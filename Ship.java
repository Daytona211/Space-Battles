import java.util.Random;
public class Ship extends Item{
  
 /*Fields */
  
  // amount of space left in the ship
  private Double cargoSpace;
  // amount of ammo ship has stored in it's cargo hold
  private int ammo;
  // ammount of spareParts stored in the ship's cargo hold (currency used to repair ships)
  private int spareParts;
  // amount of luxuryGoods stored in the ship's cargo hold
  private int luxuryGoods;
  // amount of food in the ships cargo hold
  private int food;
  // durability of hull (health)
  private Double hull;
  
    //Constructor to set values
  public Ship(String name, Double weight, Double cargoSpace, int ammo, int spareParts, int luxuryGoods, int food, Double hull ){
    super(name,weight);
    this.cargoSpace = cargoSpace;
    this.ammo = ammo;
    this.spareParts = spareParts;
    this.luxuryGoods = luxuryGoods;
    this.food = food;
    this.hull = hull;
  }
  
 /** Methods */
  /* Accessors */ 
  // getter that returns the value of the cargoSpace variable
  public Double getCargoSpace(){
    return cargoSpace;
  }
  
    // getter that returns the value of the ammo variable
  public int getAmmo(){
    return ammo;
  }
  
    // getter that returns the value of the spareParts variable
  public int getSpareParts(){
    return spareParts;
  }
  
    // getter that returns the value of the luxuryGoods variable
  public int getLuxuryGoods(){
    return luxuryGoods;
  }
  
    // getter that returns the value of the food variable
  public int getFood(){
    return food;
  }
  
    // getter that returns the value of the hull variable
  public Double getHull(){
    return hull;
  }
  
  /* Mutator */ 
  // setter that sets the value of the cargoSpace variable to the passed parameter
  public void setCargoSpace(Double cargoSpace){
    this.cargoSpace = cargoSpace;
  }
  
    // setter that sets the value of the ammo variable to the passed parameter
  public void setAmmo(int ammo){
    this.ammo = ammo;
  }
  
    // setter that sets the value of the spareParts variable to the passed parameter
  public void setSpareParts(int spareParts){
    this.spareParts = spareParts;
  }
  
      // setter that sets the value of the luxuryGoods variable to the passed parameter
  public void setLuxuryGoods(int luxuryGoods){
    this.luxuryGoods = luxuryGoods;
  }
  
      // setter that sets the value of the food variable to the passed parameter
  public void setFood(int food){
    this.food = food;
  }
  
        // setter that sets the value of the hull variable to the passed parameter
  public void setHull(Double hull){
    this.hull = hull;
  }
  
  /** Action methods */
  
  // Used when a ship attacks another ship
  public void attack(Ship tobeAttacked){
    // random number generator to simulate a dice roll
    Random diceRoll = new Random();
    
    // calculating atack/defense scores for the ships
    int attackScore = (diceRoll.nextInt(6-1)+1);
    int defenseScore = (diceRoll.nextInt(6-1)+1);
    
    // if the attacker has a higher roll
    if (attackScore > defenseScore){
      
      // if the ship is not destroyed
      if (tobeAttacked.getHull() > (attackScore - defenseScore) || (tobeAttacked.getHull() == 0)) {
      tobeAttacked.setHull(tobeAttacked.getHull() - (attackScore - defenseScore));
      return;
      }
      // if ship is destoyed
      else {
        System.out.println("Ship destroyed");
        return;
      }
      
    }
  }
  
  
}