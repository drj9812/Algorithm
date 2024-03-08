import java.io.*;

public class Main {
	static int recursionCallCnt = 0;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < t; i++) {
    		String s = br.readLine();
    		int isPalindromReturnValue = isPalindrome(s);
    		
    		System.out.println(isPalindromReturnValue + " " + recursionCallCnt);
    	}
    }
    
    public static int isPalindrome(String s) {
    	recursionCallCnt = 0;
    	
    	return recursion(s, 0, s.length() - 1);
    }
    
    public static int recursion(String s, int l, int r) {
    	recursionCallCnt++;
    	
    	if (l >= r) {
    		return 1;
    		
    	} else if (s.charAt(l) != s.charAt(r)) {
    		return 0;
    		
    	} else {
    		return recursion(s, l + 1, r - 1);
    	}
    }
}