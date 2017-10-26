import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solutionunion {

   int[] id, sz;
	Solutionunion(int n) {
		id = new int[n];
		sz = new int[n];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	public boolean connected(int p, int q) {
		return find(p)== find(q);
	}

	private int find(int p) {
		int q=p;
		while(q!=id[q]){
			q=id[q];
		}
		id[p]=q;
		return q;
	}


	public void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);

		if (pId == qId) {
			return;
		} else {
			if (sz[pId] >= sz[qId]) {
				id[qId] = pId;
				sz[pId]=sz[pId]+sz[qId];

			} else if(sz[pId] < sz[qId]){
				id[pId] = qId;
				sz[qId]=sz[qId]+sz[pId];
			}	

		}
	}


	public int countFreq(int[] a, int n) {
		int nRoot=find(n);
		return sz[nRoot];
	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		Solutionunion c = new Solutionunion(N+1);
		while (Q-- != 0) {
			String s = sc.next();
			char ch = s.charAt(0);

			if (ch == 'Q') {
				int q = sc.nextInt();
				System.out.println(c.countFreq(c.id, q));
			} else {
				int p = sc.nextInt();
				int q = sc.nextInt();
				if (!c.connected(p, q)) {
					c.union(p, q);

				}

			}
		}
                
	}
}