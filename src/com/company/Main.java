package com.company;
import java.util.Scanner;

public class AlignedGaps {

	private static boolean areGapsAligned(double coordinates_x[], double coordinates_y[], double coordinates_z[]) {
		double xdiff = coordinates_x[1] - coordinates_x[0], ydiff = coordinates_y[1] - coordinates_y[0], zdiff = coordinates_z[1] - coordinates_z[0];
		for(int i = 1; i < coordinates_x.length - 1; i++){
			if(Math.abs(xdiff) > Math.abs(ydiff) && Math.abs(xdiff) > Math.abs(zdiff)){
				double r = (coordinates_x[coordinates_x.length - i] - coordinates_x[0] / xdiff);
				if(Math.abs((coordinates_y[coordinates_x.length - 1] - coordinates_y[0]) - r * ydiff) < 0.00001 &&
						Math.abs((coordinates_z[coordinates_x.length - 1] - coordinates_z[0]) - r * zdiff) < 0.00001){
				}
				else{
					return false;
				}
			}
			if(Math.abs(ydiff) > Math.abs(xdiff) && Math.abs(ydiff) > Math.abs(zdiff)){
				double r = (coordinates_y[coordinates_x.length - i] - coordinates_y[0] / ydiff);
				if(Math.abs((coordinates_x[coordinates_x.length - 1] - coordinates_x[0]) - r * xdiff) < 0.00001 &&
						Math.abs((coordinates_z[coordinates_x.length - 1] - coordinates_z[0]) - r * zdiff) < 0.00001){
				}
				else{
					return false;
				}
			}
			else{
				double r = (coordinates_z[coordinates_x.length - i] - coordinates_z[0] / zdiff);
				if(Math.abs((coordinates_y[coordinates_x.length - 1] - coordinates_y[0]) - r * ydiff) < 0.00001 &&
						Math.abs((coordinates_x[coordinates_x.length - 1] - coordinates_x[0]) - r * xdiff) < 0.00001){
				}
				else{
					return false;
				}
			}
		}
		/* ------------------- INSERT CODE HERE ---------------------*/

		/*
		 * coordinates_x[i], coordinates_y[i], coordinates_z[i] denote the x-y-z coordinates of the i'th gap in the asteroid field.
		 *
		 * Your code should return true if all the gaps are aligned, i.e., they all lie on a single line.
		 *
		 */


		/* -------------------- END OF INSERTION --------------------*/

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();

		for(int n = 0; n < numCases; n++)
		{
			int num = sc.nextInt();
			double[] coordinates_x = new double[num];
			double[] coordinates_y = new double[num];
			double[] coordinates_z = new double[num];
			for(int i = 0; i < num; i++) {
				coordinates_x[i] = sc.nextDouble();
				coordinates_y[i] = sc.nextDouble();
				coordinates_z[i] = sc.nextDouble();
			}

			if(areGapsAligned(coordinates_x, coordinates_y, coordinates_z)) {
				System.out.println("Gaps are aligned.");
			} else {
				System.out.println("Gaps are NOT aligned.");
			}
		}

		sc.close();
	}
}
