package com.company;

public class Main {

    public static void main(String[] args) {

	    int[][] array = new int[3][4];
		System.out.print("STAMPA VERTICALE\n\n");
	    for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (j + 1) * (i + 1);
				System.out.println("[" + (i+1) + "][" + (j+1) + "] ==> " + array[i][j]);
			}
            System.out.println();
		}

        System.out.print("\nSTAMPA ORIZZONTALE\n\n");
        for (int p = 0; p < array.length; p++) {
            for (int q = 0; q < array[p].length; q++) {
                array[p][q] = (q+1) * (p+1);
                System.out.print("[" + array[p][q] + "]");
            }
            System.out.println();
        }
    }
}
