package Anonymous;

/**
 * @author rrawani
 */
public class Audi extends Car{

    Car c = new Car();
    public String carName="AUDI";
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    String data;

    public Audi(){ super();}

    @Override
    public void display(){
        System.out.println("Derived class AUDI");
    }
/*
    public static class AudiHelper{
        private static final Audi instance =new Audi().intialize();
    }

    public static Audi getInstance(){
        return AudiHelper.instance;
    }

    @Override
    protected Audi intialize() {
        super.intialize();
        return this;
    }*/
    public void audiMethod(){
        System.out.println("method inside Audi");
    }
}
