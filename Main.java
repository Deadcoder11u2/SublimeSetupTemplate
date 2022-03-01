import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String args[]) throws Exception{
		Reader fs = new Reader();
		PrintWriter pw = new PrintWriter(System.out);
		int n = fs.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = fs.nextInt();
		}
		for(int x : a) System.out.print(x + " ");
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

		String next() throws IOException {
			check();
			return st.nextToken();
		}
	}
}