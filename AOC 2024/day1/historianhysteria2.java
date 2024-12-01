import java.io.*;
import java.util.*;

public class historianhysteria {
  public static void main(String[] iLoveJavaILoveJavaILoveJava) {
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);

    ArrayList<Integer> ar = new ArrayList<>();
    HashMap<Integer, Integer> hm = new HashMap<>();

    long total = 0;

    int input = in.nextInt();

    while (input-- > 0) {
      ar.add(in.nextInt());
      int q = in.nextInt();
      hm.put(q, hm.getOrDefault(q,0)+1);
    }
    for (Integer i : ar) {
      if (hm.containsKey(i)) {
        total += i * hm.get(i);
      }
    }
    out.println(total);
    
    in.close();
    out.close();
  }

  static class FastScanner {

    /*BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));*/
    BufferedReader br;
    FastScanner() {
        try {
            // Replace "input.in" with your file name or path
            br = new BufferedReader(new FileReader("input1.in"));
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