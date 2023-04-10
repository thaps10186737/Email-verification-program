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
     
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String pass;
        pass = scan.nextLine();
        
     getComplexity(getChar(pass), getCaps(pass), getChars(pass), Address(pass));   
    }
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
