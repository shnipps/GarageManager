//unfortunately this class is not used in the program 
public class Garage{
  public String name;
  public int floors; 

  public Garage(){
  }

  public Garage(String name, int floors){
    this.name = name;
    this.floors = floors;
  }

  public String getGarageName(){
    return name;
  }

  public int getGarageFloors(){
    return floors;
  }
}