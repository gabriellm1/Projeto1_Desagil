package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException {
		FileReader fr= new FileReader("C:\\Users\\gabri\\OneDrive\\Documentos\\Insper\\3_semestre\\Desagil\\lab.txt");    
        BufferedReader br = new BufferedReader(fr);    
        int i,row,col;
        row = Character.getNumericValue((char)br.read()); 
        //System.out.print(row);
        br.read();
        col = Character.getNumericValue((char)br.read());
        //System.out.print(col);
        br.read();
        br.read();
        while((i = br.read())!=-1){  
        	if ((char)i == '#'){
        		System.out.print('X');
        		}
        	else{
        		System.out.print((char)i);
        		}
              }
        br.close();
	  }
}
