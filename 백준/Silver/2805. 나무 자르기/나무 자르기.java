import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());

		long n = Long.parseLong(tkn.nextToken());
		long[] treeHeights = new long[(int) n];
		long m = Long.parseLong(tkn.nextToken());

		tkn = new StringTokenizer(br.readLine());

		treeHeights[0] = Long.parseLong(tkn.nextToken());

		long maxTreeHeight = treeHeights[0];

		for (int i = 1; i < n; i++) {
			treeHeights[i] = Long.parseLong(tkn.nextToken());

			if (maxTreeHeight < treeHeights[i]) {
				maxTreeHeight = treeHeights[i];
			}
		}

		long result = binarySearch(treeHeights, maxTreeHeight, m);
	
		System.out.println(result);

	}

	private static long binarySearch(long[] treeList, long maxHeight, long check) {
		long low = 0;
		long high = maxHeight;

		long candidateHeight = 0;

		while (low <= high) {
			long mid = (low + high) / 2;

			if (getWoodLength(treeList, mid) >= check) {
				candidateHeight = mid;
				low = mid + 1;
			} else if (getWoodLength(treeList, mid) < check) {
				high = mid - 1;
			}

		}

		return candidateHeight;

	}

	private static long getWoodLength(long[] treeList, long cutHeight) {

		long cuttingHeight = 0;

		for (int i = 0; i < treeList.length; i++) {
			if (treeList[i] > cutHeight) {
				cuttingHeight += treeList[i] - cutHeight;
			}
		}
		return cuttingHeight;
	}
}