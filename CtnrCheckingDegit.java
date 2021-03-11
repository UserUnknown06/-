import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class CtnrCheckingDegit{
  public static double calcheckingdegit(String ctnn){
   char[] ctnChar = ctnn.toCharArray();
   String s = "0123456789A-BCDEFGHIJK-LMNOPQRSTU-VWXYZ";
   double total = 0;
   double subtotal = 0;
   for(int loop = 0; loop <= 9 ; loop++){
     subtotal = s.indexOf(ctnChar[loop]) * (Math.pow(2, loop));
     total = total + subtotal;
   }//for
   int scheckingdegit = (int)(total / 11);
   int checkingdegit = (int)(total - (scheckingdegit * 11));
   return checkingdegit;
  }//calcheckingdegit
  public static double checheckingdegit(String ctnn){
    char[] ctnChar = ctnn.toCharArray();
    String s = "0123456789A-BCDEFGHIJK-LMNOPQRSTU-VWXYZ";
    int ctnindex = s.indexOf(ctnChar[10]);
    double total = 0;
    double subtotal = 0;
    for(int loop = 0; loop <= 9; loop++){
      subtotal = s.indexOf(ctnChar[loop]) * (Math.pow(2, loop));
      total = total + subtotal;
    }//for
    int scheckingdegit = (int)(total / 11);
    int checkingdegit = (int)(total - (scheckingdegit * 11));
    double sig = 0;
    if(ctnindex == (int)checkingdegit){
      return sig;
    }else{
      sig = 1;
      return sig;
    }//if
  }//checheckingdegit
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input Container#: ");
    String ctnn = sc.next();
    System.out.println();
    System.out.println("- - - PROCESSING - - -");
    System.out.println();

    if(ctnn.length() == 10){
      System.out.printf("The check degit for " + ctnn + " should be %1.0f", calcheckingdegit(ctnn));
      System.out.println();
      System.out.printf("The container# is " + ctnn + "%1.0f", calcheckingdegit(ctnn));
    }//if
    else if(ctnn.length() == 11){
      if((int)checheckingdegit(ctnn) == 0){
        System.out.println("Container# " + ctnn + " is good.");
      }else{
        System.out.println("Ops! There is something wrong with Container# " + ctnn + ". ");
        System.out.println("Please check again! ");
      }
    }//else if
    else{
      System.out.println("FBI WARNING: Container# " + ctnn + " is not correct. Please check again! ");
    }//else
  }//main
}//class
