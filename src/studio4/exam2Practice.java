package studio4;

import edu.princeton.cs.introcs.StdDraw;

public class exam2Practice {
	
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 9};
		int[] b = {2, 4, 6, 8, 10};
		int[] c = merge(a, b);
		for(int i : c) {
			System.out.println(i);
		}
	}
	
	public static void recursiveCarpet(double x, double y) {
		StdDraw.filledRectangle(x, y, halfWidth, halfWidth);
		if(halfWidth > 0.0025) {
			recursiveCarpet(x - 2*halfWidth, y + halfWidth, (1/3));
			recursiveCarpet(x + 2*halfWidth, y + halfWidth, (1/3));
			recsuriveCarpet(x - 2*halfWidth);
			recursiveCarpet();
			
		}
	}
	
	public static int direction() {
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && StdDraw.isKeyPressed()) {
			return 3;
		} else if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
			return 1;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
			return 2;
		} else {
			return 0;
		}
	}
	
//	public static int m2(int x, int y) {
//		if (y > 3) {
//			m2(x, y - 1);
//		} else if (x > 0) {
//			
//		}
	
	public static int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		
		int aPos = 0;
		int bPos = 0;
		
		for(int i = 0; i < result.length; i++) {
			if (aPos < a.length && bPos < b.length && a[aPos] < b[bPos]) {
				result[i] = a[aPos];
				aPos++;
			} else if (bPos < b.length){
				result[i] = b[bPos];
				bPos++;
			} else {
				result[i] = a[aPos];
				aPos++;
			}
		
		}
		return result;
	}
}
