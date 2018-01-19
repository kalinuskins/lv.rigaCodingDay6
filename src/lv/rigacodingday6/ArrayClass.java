/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacodingday6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oleg
 */
public class ArrayClass {
    public void test(){
        int[] firstArray = new int[5];
        
        firstArray[0] = 1;
        firstArray[1] = 3;
        firstArray[2] = 5;
        // bus ka kluda
        // firstArray [3] = 6;
        
        //aizpilde ar ciklu:
        for(int i = 0; i < 3; i++){
            firstArray[i] = 5;
        }
        
        Arrays.fill(firstArray, 5);
        
        //aizpilde ar while
        int i = 0;
        while(true){
        firstArray[i] = 5;
        i++;
        
        if(i >= 3){
            break;
        }
        }
        int [] secondArray = new int []{
            1,3,5
        };
        
        // izvada katru masiva elementu
        for(int element : firstArray){
            System.out.print(element);
        }
        /*for(int i = 0; i < secondArray.length; i++){
            // cikls dara to pasu kas -->
            int element2 = secondArray[i];
            System.out.print(element2);
        }*/
        
    }
    
    public void listTest(){
        ArrayList<Integer> firstList = new ArrayList<Integer>();
            
        ArrayList<String> textList = new ArrayList<String>();
        textList.add("test1");
        textList.add("test2");// remove will work on this line
        
        textList.remove(1); // text 2
        
        String element = textList.get(0); // text 1
        
        
        ArrayList<String> textList2 = new ArrayList<String>(){{ // {{..}}; izmanto lai atkartot textList2
            add("text1");
            add("text2");
            add("text3");
        }};
    }
    
    
    private static Scanner input = new Scanner(System.in);
    public static void listTest2(){
        
        int[] numbers = new int[]{ // pievieno skaitlus
            0, 10, 20, 30, 40, 50
        };
        
        System.out.print("Ievadiet skaitli: ");
        int n = input.nextInt();
        
        //
        
        boolean isFound = false;
        for(int element : numbers){
            if(n == element){
                System.out.println("skaitlis atrasts!");
                isFound = true;
            }
        }
        
        if(!isFound){
        System.out.println("Skatlists nav atrasts!");
        }

    }
    
    private static void listTest3(){
        
        System.out.print("Ievadiet skaitli: ");
        int n = input.nextInt();

        // define masivu
        int[] userNumbers = new int[n];
        // ar for aizpilda masivu
        for(int i = 0; i < n; i++){
            System.out.print("Ievadi skaitli: ");
            userNumbers[i] = input.nextInt();
        }
        int min = userNumbers[0];
        int max = userNumbers[0];
        // ar for() mekle min un max vertibas
        for(int number : userNumbers){ // number javlaeca elementom massiva kotorij i budet prohoditj proverku po o4eredi
            if(number > max){
                max = number; // устанавливает максимальное значение введённого числа
            }
            if(number < min){
                min = number; // устанавливает минимальное значение введённого числа
            }
        }
        
        System.out.println("min = " + min);
        System.out.println("max =" + max);
    }   
}