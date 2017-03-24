package quicksort;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class MultiQuick extends RecursiveAction{
    private int[] array;
    private int low;
    private int hight;
    
    public MultiQuick(int[] array, int low, int hight) {
        this.array = array;
        this.low = low;
        this.hight = hight;
    }
	
	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		if(low>hight)
			return ;
		int temp=array[low];
		int  i=low;
		int j=hight;
		while(i!=j)
		{
			while(array[j]>=temp&&i<j)
				j--;
			while(array[j]<=temp&&i<j)
				i++;
			if(i<j)
			{
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
			}
		}
		array[low]=array[i];
		array[i]=temp;
		int  middle=i;
		MultiQuick left = new MultiQuick(array, low, middle-1);
		MultiQuick right = new MultiQuick(array, middle + 1, hight);

        left.fork();
        right.fork();
        left.join();
        right.join();
	}
}
