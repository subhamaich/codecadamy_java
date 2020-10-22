public class Droid {

  int batteryLevel;
  String name;

  public Droid (String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public String toString(){
    return "Hello, I'm the droid: " + name;
  }

  public void energyReport(){
    System.out.println("My battery level is: " + batteryLevel);
  }

  public void energyTransfer(int power, Droid transferTo){  
    batteryLevel -= power;
    transferTo.batteryLevel += power;
}

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }
  public static void main(String[] args){

    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.energyReport();
    Codey.performTask("dancing");
    Codey.energyReport();
    Droid Bob = new Droid("Bob");
    System.out.println(Bob);
    Bob.energyReport();
    Bob.energyTransfer(5, Codey);
    System.out.println("Hello again, I'm Codey. Bob gave me some of his energy!");
    Codey.energyReport();
    System.out.println("Hi there!, Bob here. I transferred a bit of energy to Codey.");
    Bob.energyReport();

  }
}
