interface Device{
    public abstract String getBrand();
}
class Computer implements Device{
    private String brand;
    public Computer(String brand)
    {
        this.brand  = brand;
    }
    public String  getBrand()
    {
         return this.brand;
    }
}
class Phone implements Device{
    private String brand;
    public Phone(String brand)
    {
        this.brand  = brand;
    }
    public String  getBrand()
    {
         return this.brand;
    }
}
class DeviceFactory{
    public static Device getDevice(String type,String brand)
    {
        if("computer".equalsIgnoreCase(type))
        {
            return new Computer(brand);
        }
        else if("phone".equalsIgnoreCase(type))
        {
             return new Phone(brand);
        }
        return null;
    }
}
public class MyClass {
  public static void main(String args[]) {
      DeviceFactory f = new DeviceFactory();
      Device device = f.getDevice("comPuter","Dell");
      System.out.println(device.getBrand());
  }
}