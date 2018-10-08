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
public class Biodata {
    private String name;  
    Scanner inputProfile = new Scanner(System.in);

    public String getNama() {
        return name;
    }

    public void setNama(String name) {
        this.name = name;
    }

    public Scanner getInputProfile() {
        return inputProfile;
    }

    public void setInputProfile(Scanner inputProfile) {
        this.inputProfile = inputProfile;
    }
    
    public String Profile(){
        System.out.print("Masukkan Nama Anda               : ");
        name = inputProfile.next();
        return name;
    }
}
