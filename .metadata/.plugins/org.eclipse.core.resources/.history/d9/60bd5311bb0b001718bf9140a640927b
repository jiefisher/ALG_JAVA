package exec;
import quicksort.quicksorting;
import sort.Selection;
import quicksort.MultiQuick;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import BaseUtil.StdRandom;
public class exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=StdRandom.getIntegerArray(1000);
		long begintime = System.currentTimeMillis();
		quicksorting.quicksort(a,0,a.length-1);
		//Selection.sort(a);
		long endtime=System.currentTimeMillis();
		long costTime = endtime - begintime;
		System.out.println("test"  + ":" + costTime + "ms");
		
	        for(int i=0;i<10;i++)
	        	System.out.print(a[i]);
	        
	}

}
