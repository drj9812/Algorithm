import java.io.*;
import java.util.StringTokenizer;

public class Main {
	private static int[] tmp; // 병합할 때 사용할 임시 배열
	private static int k;
	private static int target = -1;
	private static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stkn = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(stkn.nextToken());
		k = Integer.parseInt(stkn.nextToken());
		
		int[] arr = new int[n];
		tmp = new int[arr.length]; // 병합할 때 사용할 임시 배열 생성
		
		stkn = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stkn.nextToken());
        }

		mergeSort(arr, 0, arr.length - 1); // 병합 정렬 수행

		System.out.println(target);
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if(cnt > k) {
			return;
		}
		
		if (start < end) {
			int mid = (start + end) / 2; // 배열을 반으로 나누는 중간 인덱스

			mergeSort(arr, start, mid); // 왼쪽 부분 배열을 재귀적으로 정렬
			mergeSort(arr, mid + 1, end); // 오른쪽 부분 배열을 재귀적으로 정렬

			merge(arr, start, mid, end); // 정렬된 두 배열을 병합
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int l = start; // 왼쪽 부분 배열의 시작 인덱스
		int r = mid + 1; // 오른쪽 부분 배열의 시작 인덱스
		int idx = start; // 임시 배열에 값을 저장할 인덱스

	

		while (l <= mid && r <= end) {
			if (arr[l] <= arr[r]) {
				tmp[idx++] = arr[l++]; // 왼쪽 부분 배열의 값이 작으면 tmp 배열에 저장하고 l, idx 증가

			} else {
				tmp[idx++] = arr[r++]; // 오른쪽 부분 배열의 값이 작으면 tmp 배열에 저장하고 r, idx 증가
			}
		}

		while (l <= mid) {
			tmp[idx++] = arr[l++]; // 왼쪽 부분 배열이 남은 경우 tmp 배열에 복사
		}

		while (r <= end) {
			tmp[idx++] = arr[r++]; // 오른쪽 부분 배열이 남은 경우 tmp 배열에 복사
		}

		for (int i = start; i <= end; i++) {
			arr[i] = tmp[i]; // 임시 배열의 값을 원래 배열에 복사
			cnt++;
			
			if (cnt == k) {
				target = arr[i];
				break;
			}
		}
	}
}