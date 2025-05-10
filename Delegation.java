class Printer{
   public void print()
   {
       System.out.println("Printer is printing");
   }
}
class Manager
{
    private Printer printer = new Printer();
    public void print()
    {
        printer.print();
    }
}
public class MyClass {
  public static void main(String args[]) {
   
    Manager manager = new Manager();
    manager.print();
  }
}