/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author user
 */
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int myArr[] = new int [10] ;
        int sum = 0;
        int maxNumber = 50;
        int minNumber = 0;
                
        for(int = 0; i < myArr.lenght; i++){
            myArr[i] = random.nextInt(49 + 1);
        }
        for(int = 0; i < myArr.lenght; i++){
            System.out.println("%4d", myArr[i]);
        }
        System.out.println(sum);
        
          for(int = 0; i < myArr.lenght; i++){
            if(maxNumber < myArr[i]) {
               maxNubmer = myArr[i];
               
            } if (minNumer < myArr[i]) {
                minNumber = myArr[i];
            }
          
            
    }
        
        System.out.println("Сумма всех чисел массива: ");
        System.out.println("min = " + minNumber);
        System.out.println("max = "+ maxNumber);
        System.out.println("----- конец задачи 3 ------");
    }
}
