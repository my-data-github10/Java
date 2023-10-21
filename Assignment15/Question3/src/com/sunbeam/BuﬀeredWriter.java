package com.sunbeam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BuﬀeredWriter {
	public static void writeData() {
		try(FileWriter fout = new FileWriter("String.txt")) {
			try(BufferedWriter bout = new BufferedWriter(fout)) {
				
				for(int i=1; i<=4; i++) {
					System.out.println("Enter string :");
					String line = new Scanner(System.in).nextLine();
					bout.write(line);
					}
				String line = new Scanner(System.in).nextLine();
				bout.write(line);
				bout.newLine();
				}
			} // dout.close();
 catch (Exception e) {
				
				e.printStackTrace();
			}
		} // fout.close();
	
	public static void main(String[] args) {
		writeData();

	}

}