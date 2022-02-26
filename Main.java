package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in); 
        System.out.println("Введите размерность массива: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        System.out.println("Массив :");
        for(int i=0;i<nums.length;i++) {
            nums[i] = rnd.nextInt(20);
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        int min = nums[0];
        double Sredn = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]< min){
                min = nums[i];
            }
        }
        System.out.println("Минимальное значение "+ min);
        if (nums.length > 0) {
            double sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
            }
            Sredn = sum/nums.length;
        }
        double summa = Sredn + min;
        System.out.println("Среднее арифметическое значение "+ Sredn);
        System.out.println("Сумма мин. и сред. арифметического значения " + summa);
    }
}

