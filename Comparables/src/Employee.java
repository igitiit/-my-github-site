class Employee implements Comparable<Employee>
{
   private int rank;
   private String name;
   public int compareTo(Employee e) 
   {
       return  - e.rank;
   }
   public Employee(String n, int r)
   {
       rank = r;
       name = n;
   }
   public String toString()
   {
       return name + " : " + rank;
   }
}
