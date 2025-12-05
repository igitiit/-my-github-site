public class Test
{
   public  static void main(String [ ] args)
    {
        Employee bigShot = new Employee("Joe Manager", 10);
        Employee littleShot = new Employee("Homer Simpson", 1);
        if (bigShot.compareTo(littleShot) > 0)
        {
            System.out.println(bigShot);
            System.out.println(littleShot);            
        }
        else
        {
            System.out.println(littleShot);
            System.out.println(bigShot);
        }
    }    
}