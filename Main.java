import java.util.*;
import java.math.*;
import java.util.ArrayList;


class Main {
  public static void main(String[] args) {
    Garage ParkingGarage1 = new Garage("Garage" , 1);
    Garage ParkingGarage2 = new Garage("Garage" , 2);
    Garage ParkingGarage3 = new Garage("Garage" , 3);

    ArrayList <Garage> ParkingGarages = new ArrayList <Garage>();
    ParkingGarages.add(ParkingGarage1);
    ParkingGarages.add(ParkingGarage2);
    ParkingGarages.add(ParkingGarage3);
      
    int parkingSpots = 0;
    int cost = 0;
    Scanner key = new Scanner(System.in);
    
    System.out.println("Welcome! Which parking garage are you entering?" + "\n" + "1, 2, or 3?");
    String gnum = key.nextLine();
    System.out.println("Welcome to Garage " + gnum + ", what type of automobile are you parking today?");
    String atype = key.nextLine();
    
    if (atype.equals("car")|| atype.equals("Car") || atype.equals("truck") || atype.equals("Truck")){
      System.out.println("Ok so you are driving a " + atype + ". What body type is it? (SUV, Truck, Sedan, Coupe)");
      String cbody = key.nextLine();
      if(cbody.equals("SUV")||cbody.equals("Truck")||cbody.equals("truck") || cbody.equals("suv")){
        parkingSpots+=10;
        cost+=12;
      }
      if(cbody.equals("Sedan")||cbody.equals("sedan")||cbody.equals("coupe") || cbody.equals("Coupe")){
        parkingSpots+=25;
        cost+=7;
      }
      System.out.println("Is your " + cbody + " " + " an electrical vehicle?");
      String e = key.nextLine();
      if (e.equals("yes")||e.equals("Yes")){
        parkingSpots+=35; 
        cost+=5;
      }
    }
    
    if (atype.equals("Motorcycle") || atype.equals("motorcycle")){
      System.out.println("Ok so you are driving a " + atype);
      parkingSpots+=50;
      cost+=3;
    }
    System.out.println("There are " + parkingSpots + " many parking spots for your specific autmobile");
    
    System.out.println("Type 'Exit' when you are ready to leave.");
    String exit = key.nextLine();

    int finalCost=0;
    if (exit.equals("Exit")){
      System.out.println("How many hours long was your stay?");
      int hours = key.nextInt();
      finalCost = cost*hours;
      System.out.println("You owe $" + cost);
    }

  }
}