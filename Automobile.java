//unfortunately this class is not used in the program 
public class Automobile{
  public String type;
  public String body; 

  public Automobile(){
  }

  public Automobile(String type, String body){
    this.type = type;
    this.body = body;
  }

  public String getAutomobileType(){
    return type;
  }

  public String getAutomobileBody(){
    return body;
  }
}