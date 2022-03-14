import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static Reader fs;
	static PrintWriter pw;
	
	static void solve() throws IOException{
        int n = fs.nextInt();
        int f_cost[] = new int[n+1];
        int s_cost[] = new int[n+1];
        for(int i = 0 ; i < n ; i++) {
            f_cost[i] = fs.nextInt();
        }
        for(int i = 0 ; i < n ; i++) {
            s_cost[i] = fs.nextInt();
        }
        int f_to_s[] = new int[n];
        int s_to_f[] = new int[n];
        for(int i = 1 ; i < n; i++) f_to_s[i] = fs.nextInt();
        for(int i = 1 ; i < n; i++) s_to_f[i] = fs.nextInt();
        Integer dp_1[] = new Integer[n+1];
        Integer dp_2[] = new Integer[n+1];
        dp_1[1] = f_cost[0];
        dp_2[1] = s_cost[0];
        for(int i = 1 ; i <= n ; i++) {
            dp_1[i] = min(dp_1[i-1], dp_2[i-1]+s_to_f[i-1]) + f_cost[i-1];
            dp_2[i] = min(dp_2[i-1], dp_1[i-1]+f_to_s[i-1]) + s_cost[i-1];
        }
        System.err.println(Arrays.toString(dp_1));
        System.err.println(Arrays.toString(dp_2));
        System.err.println(Arrays.toString(f_to_s));
        System.err.println(Arrays.toString(s_to_f));
        int first_min = Collections.min(Arrays.asList());
	}

	public static void main(String args[]) throws Exception{
		System.setErr(new PrintStream("error.txt"));
		fs = new Reader();
		pw = new PrintWriter(System.out);
		int t = 1;
		t = fs.nextInt();
		while(t-- > 0) {
			solve();
		}
		pw.close();
	}

	static class Reader {
		BufferedReader br;
		StringTokenizer st;
		Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		void fill() throws IOException{
			st = new StringTokenizer(br.readLine());
		}

		void check() throws IOException{
			if(!st.hasMoreTokens()) fill();
		}

		int nextInt() throws IOException{
			check();
			return Integer.parseInt(st.nextToken());
		}

		double nextDouble() throws IOException{
			check();
			return Double.parseDouble(st.nextToken());
		}

		long nextLong() throws IOException { 
			check();
			return Long.parseLong(st.nextToken());
		}

		int [] readArray(int n) throws IOException{
			int a[] = new int[n];
			for(int i = 0 ; i < n ;i++) a[i] = nextInt();
			return a;
		}

		String next() throws IOException {
			check();
			return st.nextToken();
		}
	}
}