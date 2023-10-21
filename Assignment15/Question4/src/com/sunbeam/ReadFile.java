package com.sunbeam;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFile {
	


	public static void main(String[] args) {
		
		
		String path = "/home/jagdish/Desktop/jagdishsep23/Java/Assignment15/Question3/String.txt";
		File file = new File(path);
		if(! file.exists()) {
			System.out.println("Path doesn't exists.");
			System.exit(1);
		}
		if(file.isFile()) {
			
			try(FileReader fin = new FileReader(path)) {
				try(BufferedReader  bin = new BufferedReader (fin)) {

					String line;
					while( (line =(String) bin.readLine())!=null){
						System.out.println(line);
						//printf("\n");
				
					}
				}
		}catch(Exception e) {
			e.printStackTrace();}
		}

	}

}