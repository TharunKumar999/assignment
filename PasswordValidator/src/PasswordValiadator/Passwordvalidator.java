package PasswordValiadator;
import java.util.Scanner;

public class Passwordvalidator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Password:");
    String s1 = sc.nextLine();
        int n = UserMainCode.display(s1);
        if(n==1){
         System.out.println("Valid password");
        }else
        {
         System.out.println("Invalid password");
        }

  }
}

class UserMainCode {
   
    
    public static int display(String password){
if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=20)
                    {
                                    return 1;
                    }
                    else
                    {
                    	System.out.println("it does not satisfys the condition");
                                    return -1;
                    }
       }

    }