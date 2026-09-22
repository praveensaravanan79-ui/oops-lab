import java.util.*;
class rockpaperscissor
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    System.out.println("Rock Paper Scissor:");
    System.out.println("1.Rock:");
    System.out.println("2.Paper:");
    System.out.println("3.Scissor:");
    System.out.print("Enter Your Choice:");
    int user = sc.nextInt();
    
    int computer = r.nextInt(3)+1;
    
    System.out.println("Computer choice:"+computer);
    
    if(user == computer)
    {
      System.out.println("Match Draw");
    }
    else if((user==1 && computer==3)||(user==2 && computer==1)||(user==3 && computer==2))
    {
       System.out.println("Player Wins");
    }
    else
    {
       System.out.println("Computer Wins");
    }
  }
}
