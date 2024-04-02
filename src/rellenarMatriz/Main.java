package rellenarMatriz;

public class Main {
	public static void main(String[] args) {
		int matrizDiagonal [][] = new int [4][4];
		for (int i = 0; i < matrizDiagonal.length; i++) {
			for (int j = 0; j < matrizDiagonal.length; j++) {
				if (i == j) {
					matrizDiagonal[i][j] = 0;
				} else {
					matrizDiagonal[i][j] = (int)(Math.random() * 9 + 1);
				}
				System.out.print(matrizDiagonal[i][j]);
			}
			System.out.println();
		}
	}
	
}
