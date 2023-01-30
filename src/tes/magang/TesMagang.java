/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.magang;
/**
 *
 * @author Fajar
 */

import java.util.Scanner;

public class TesMagang {
    
  public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan berapa bilangan ganjil yang ditampilkan: ");
    int N = input.nextInt();
    int nilai = 0;
    for (int i = 1; nilai < N; i += 2) {
      System.out.print(i + " ");
      nilai++;
    }
  }
}

