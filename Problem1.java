public class Problem1 {

public static void main(String[] args)
{
int sum = 0;
int target = 1000;
int div1 = 3;
int div2 = 5;
for (int i = 1; i < target; i++)
{
  if(i%div1 == 0)
  {
    sum += (i);
    System.out.println(i);
  }
  else if(i%div2 == 0)
  {
    sum += (i);
    System.out.println(i);
  }
}
System.out.println(sum);
}
}
