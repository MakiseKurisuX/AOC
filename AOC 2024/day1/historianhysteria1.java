import java.io.*;
import java.util.*;

public class historianhysteria {
  public static void main(String[] iLoveJavaILoveJavaILoveJava) {
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);

    PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    PriorityQueue<Integer> pq2 = new PriorityQueue<>();
    long total = 0;

    int input = in.nextInt();

    while (input-- > 0) {
      pq1.add(in.nextInt());
      pq2.add(in.nextInt());
    }
    while (!pq1.isEmpty() && !pq2.isEmpty()) {
      total += Math.abs(pq1.poll()-pq2.poll());
    }

    out.println(total);
    
    in.close();
    out.close();
  }

  static class FastScanner {
    BufferedReader br;

    FastScanner() {
        try {
            // Replace "input.in" with your file name or path
            br = new BufferedReader(new FileReader("input.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    StringTokenizer st = new StringTokenizer("");

    String next() {
      while (!st.hasMoreTokens())
      try {
        st = new StringTokenizer(br.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    int[] readArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
      a[i] = nextInt();
      return a;
    }

    String nextLine() {
      try {
        return br.readLine();  
      } catch (IOException e) {
        e.printStackTrace();
        return null;
      }
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    void close() {
      try {
        br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}