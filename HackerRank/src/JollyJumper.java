import java.util.Arrays;

public class JollyJumper {
	static  boolean check(int[] a) {
		boolean b=true;
		int[] bool=new int[a.length-1];
		int[] t = new int[a.length-1];
		for(int i=0;i<a.length-1;i++) { 
			t[i]=Math.abs(a[i]-a[i+1]);
			//System.out.println(t[i]);
			if(t[i]==0 || t[i]>=a.length)
				return false;
			if(bool[t[i]-1]==0) {
				bool[t[i]-1]=1;
				continue;
			}
			else
				return false;
		}
		return b;
	}
	public static void main(String[] args) {
		int[] a={1,-1,0,3,7,7};
		System.out.println(check(a));

	}

}
