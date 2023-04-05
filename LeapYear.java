class LeapYear
{
 public static void main(String args[])
{
  for(int i=2000;i<=2005;i++)
  {
   if((i%4==0)||(i%400==0))
   {
    System.out.println("Leap year");
   }
   else
   {
    System.out.println("Not leap year");
   }
}

}

}   