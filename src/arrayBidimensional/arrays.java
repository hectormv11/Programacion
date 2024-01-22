package arrayBidimensional;

import java.util.Iterator;

public class arrays {

	public static void main(String[] args) {

		int[][] num = {{1,1,1,1},
					  {2,2,2,2},
					  {3,3,3,3},
				  	  {4,4,4,4},
					  {5,5,5,5}	}; //aray bidimensional

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				System.out.print(num[i][j]);
				System.out.print(" ");

			}

			System.out.print("\n");

		}
		
		System.out.print("\n");

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {
				
				if(j == num[i].length-1) {
					num[i][j] = 0;
				}

				System.out.print(num[i][j]);
				System.out.print(" ");

			}

			System.out.print("\n");

		}

	}


}
