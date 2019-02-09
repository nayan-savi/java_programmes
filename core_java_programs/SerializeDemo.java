import java.io.*;

public class SerializeDemo
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "sfheiorh";
      e.address = "ewiterijterjtoretyo";
      e.SSN = 11122333;
      e.number = 103;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("employee1.ser");
         ObjectOutputStream out =
                            new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
          fileOut.close();
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}