
public class MinGap {
	public static void main(String[] args) {
		int[] array = {2,6,5,8,9,7,3,4,9,1,6,7,3,6,8,8,1,0};
		System.out.println(minGap(array));
		
	}
	public static int minGap (int[] array) {
		int gapConstant = 0;
		int gapForReal = 0;
		for (int i = 0; i < array.length - 1; i++) {
			gapConstant = array[i] - array[i+1];
			if (i == 0) {
				gapForReal =  gapConstant;
			}
			if (gapConstant < gapForReal) {
				gapForReal = gapConstant;
			}
		}
		return gapForReal;
	}

}
