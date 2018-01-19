/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacodingday6;

import java.util.Scanner;

/**
 *
 * @author oleg
 */
public class SwitchClass {
   private static Scanner input = new Scanner(System.in);
    
    public static void country(){
        
        System.out.print("Ievadi valsti: ");
        String country = input.next().toLowerCase();
        switch(country){
            case "latvia":
                System.out.println("Riga");
                break;
            case "somija":
                System.out.println("Riga");
                break;
            case "austrija":
                System.out.println("Riga");
                break;
            case "lietuva":
                System.out.println("Riga");
                break;
            case "francijatrija":
                System.out.println("Parize");
                break;
           
            default:
                System.out.println("Nezinama galvaspilseta");
                break;
            
                
/*Latvia - Riga
   
*/               
        }
        
        
            
    }
    
    
    public static void calculatorLoop(){
        while(true){
            calculator();
            
            System.out.println("vai turpinat (y/n)?");
            if(Character.toLowerCase(input.next().charAt(0))
                    == 'n'){
                break;
            }
        }
    
    }      
    public static void Aritmetika(){
        System.out.print("Ievadiet skaitli: ");
        int sk1 = input.nextInt();
        System.out.print ("Ievadi darbibu: ");
        char op  = input.next().charAt(0);
        System.out.print("Ievadi 2. Skaitli: ");
        int sk2 = input.nextInt();
        
        double result = 0;
        boolean isOk = true;
        
        switch(op){
        
            case '+':
                result = sk1 + sk2;
                break;
            case "-":
                result = sk1 - sk2;
                break;
            case "*":
                result = sk1 * sk2;
                break;
            case "/":
                result = sk1 / sk2;
                break;
            default:
                isOk = false;
                break;
             
        }
        if(isOk){
            System.out.println("Rezultats = ");
              + String.format("%.2f", result));
        }else{
            System.out.println("Neatlauta darbiba!");
                    }
        }

    private static void calculator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        

}