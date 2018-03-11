package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;

public class Board {
	private boolean[][] isWall;
	private int numRows;
	private int numCols;
	
	public boolean isWall(int row, int col) {
	    return isWall[row][col];
	}
	
	
	public Board(String path) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));

			String linha = reader.readLine();

			String[] words = linha.split(" ");

			numRows = Integer.parseInt(words[0]);
			numCols = Integer.parseInt(words[1]);

			isWall = new boolean[numRows][numCols];

			for(int i = 0; i < numRows; i++) {
				linha = reader.readLine();

				for(int j = 0; j < numCols; j++) {
					boolean parede;

					if(linha.charAt(j) == '#') {
						parede = true;
					}
					else {
						parede = false;
					}

					isWall[i][j] = parede;
				}
			}
			reader.close();
		}
		catch(FileNotFoundException exception) {
			System.out.println(exception);
		}
		catch(IOException exception) {
			System.out.println(exception);
		}
	}
	
	public int getNumRows() {
		return numRows;
	}
	public int getNumCols() {
		return numCols;
	}
}