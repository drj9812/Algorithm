import java.util.*;
	public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int[] iArr = new int[a];
			int b = scanner.nextInt();
			
			for (int i=0; i<a; i++) {
				iArr[i]=scanner.nextInt();
				if (iArr[i]<b) {
					System.out.print(iArr[i]+" ");
				}
			}
			
			
			
		}
	}