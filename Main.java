import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static Reader fs;
	static PrintWriter pw;
	
	static void solve() throws IOException{
		
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