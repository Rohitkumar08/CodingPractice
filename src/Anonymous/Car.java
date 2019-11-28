package Anonymous;

public class Car {

     protected  Car intialize(){
         return this;
     }
     public  int getCarlength(){
       return 7;
     }

  private String name;
  private String model;
   public String carName="CAR";
  public void display(){
    System.out.println("Base class CAR");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
  public Car(String name, String model){
    this.model=model;
    this.name=name;
  }

  public Car(){

  }
  @Override public String toString() {
    return (this.name+ " "+ this.model);
  }

  @Override public boolean equals(Object obj) {
    if(this == obj){
      return true;
    }
    Car car =(Car) obj;
    if(name != car.name){
      return false;
    }
   return model!=null ? model.equals(car.model) : car.model== null;
  }

  @Override public int hashCode() {
    return  (31  + (name != null ? name.hashCode() : 0));
  }
}
