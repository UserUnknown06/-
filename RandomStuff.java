//Since I'm a sb in the first place, I'm writing tones of comments, just in case I forgot.
import java.util.Scanner;

public class RandomStuff{
  public static void checkIn(){//尝试套娃、因为不return数值，直接void就行。
    Scanner sc = new Scanner(System.in);
    System.out.print("How many are enrolling? ");
    int count = sc.nextInt();//input how many times it repeats.
    System.out.println();//makes it looks good

    String[] enrollingNames;
    enrollingNames = new String[count];//define a string array
    int[] enrollingAges;
    enrollingAges = new int[count];//define a integer array;

    for(int loop = 0; loop < count; loop++){
      System.out.println("Input name: ");
      enrollingNames[loop] = sc.next();//input name(great，至少可以input进去了！)
      System.out.println("Input age: ");
      enrollingAges[loop] = sc.nextInt();//input age

      System.out.println(enrollingNames[loop]+", "+enrollingAges[loop]+", recorded. ");
      System.out.println();
    }//for

    System.out.println("All inputs: ");

    for(int loop = 0; loop < count; loop++){
      System.out.println(enrollingNames[loop]+", "+enrollingAges[loop]);
    }//for
  }//checkin

  public static void main(String[] args){
    checkIn();//直接打出class的名字就可以执行。
  }//main
}//class
