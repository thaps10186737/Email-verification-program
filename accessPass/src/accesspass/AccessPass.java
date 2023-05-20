/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesspass;

import java.util.Scanner;

/**
 *
 * @author Thapelo Maoto
 */
public class AccessPass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String pass;
        pass = scan.nextLine();
       
        //Calling method getComplexity to validate input complexity
     getComplexity(getChar(pass), getCaps(pass), getChars(pass), Address(pass));   
    }
    //Method getComplexity
public static boolean getComplexity(boolean c, boolean C, boolean ch, boolean Addr){
boolean result = false;    

if(c && C && ch && Addr){
result = true;
    System.out.println("**********************************************************");
    System.out.println("Correct Email Complexity");
}
else{result = false;
    System.out.println("**********************************************************");
    System.out.println("Incorrect email complexity, make sure your email is in this format: name@gmail.com And Must Contain Atleast 1 Uppercase Letter");
}
return result;
}    
    //Method getChar, checks if a particular character is present on password
  public static boolean getChar(String pass){
  boolean result = false;
  
 for(int i = 0; i < pass.length();i++){
 if(pass.charAt(i)=='@'){
 System.out.println(pass.indexOf('@'));    
 result = true;
 break;
 
 }
 }
  return result;
  } 
    
  //Method getCaps, checks if the password has Uppercase
  public static boolean getCaps(String pass){
  boolean result = false;
  
  for(int i = 0; i < pass.length();i++){
  if(pass.charAt(i)>=65 && pass.charAt(i)<=90){
  result = true;
  System.out.println(pass.charAt(i));
  break;
  }
  }
  return result;
  }
  
    //Method getChars, checks if the password has "."
  public static boolean getChars(String pass){
  boolean result = false;
  
  for(int i = 0; i < pass.length();i++){
  if(pass.charAt(i)=='.'){
  result = true;
  System.out.println(pass.indexOf('.'));
  break;
  }
  }
  return result;
  }
    
    // Method Address checks if user entry is an email address
  public static boolean Address(String pass){
  
  boolean result = false;    
  String addr = "@gmail.com";
  
  for(int i = 0; i < pass.length();i++){
  if(pass.endsWith(addr)){
  result = true;
  System.out.println("Good");
  break;
  }
  }
  return result;
  }
}
