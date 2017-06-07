// item class will be used as the super class for many in game items(ships, planets etc)
public class item{
  
  // fields
  private String name;
  private int weight;
  
  // Methods
    //Mutators
  public void setName(String name){
    this.name = name;
  }
  
  public void setWeight(int weight){
    this.weight = weight;
  }
  
    //Accessors
  public String getName(){
    return name;
  }
  
  public int getWeight(){
    return weight;
  }
  
}