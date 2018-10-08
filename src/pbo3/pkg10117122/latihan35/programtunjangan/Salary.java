/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Salary{
    private String status;
    private double gajiPokok, calSal, Subsidy;
    
    Scanner input = new Scanner(System.in);
    public double Salary(){
        System.out.print("Status Anda? (Menikah/belum)     : ");
        status  = input.next();
        System.out.print("Berapa Gaji Pokok Anda Perbulan  : Rp ");
        gajiPokok = input.nextDouble();
        
        System.out.println();
        System.out.println("=========Hasil Perhitungan Gaji Anda=========");
        return gajiPokok;
    }
    public double Subsidy (){
        Subsidy = (status.equals("menikah"))? 0.35 * gajiPokok : 0;
        Subsidy = gajiPokok * 0.35;
        return Subsidy;
    }
    
    public double calSal (){
        calSal = gajiPokok + Subsidy;
        return calSal;
    }
}
