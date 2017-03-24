package sort;

public class Sort {
	protected static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	protected static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	protected static void exch(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	protected static void exch(double[] a, int i, int j) {
		double t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	protected static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	protected static void show(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	protected static void show(double[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	protected static void show(char[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	protected static boolean isSorted(Comparable[] a, boolean desc) {
		if (desc) {
			for (int i = 0; i < a.length - 1; i++)
				if (less(a[i],a[i+1])) return false;
			return true;
		} else {
			for (int i = 1; i < a.length; i++)
				if (less(a[i],a[i-1])) return false;
			return true;
		}
	}
	protected static boolean isSorted(Comparable[] a) {
		return isSorted(a, false);
	}
	protected static boolean isSorted(int[] a, boolean desc) {
		if (desc) {
			for (int i = 0; i < a.length - 1; i++)
				if (a[i] < a[i+1]) return false;
			return true;
		} else {
			for (int i = 1; i < a.length; i++)
				if (a[i] < a[i-1]) return false;
			return true;
		}
	}
	protected static boolean isSorted(int[] a) {
		return isSorted(a, false);
	}
	protected static boolean isSorted(double[] a, boolean desc) {
		if (desc) {
			for (int i = 0; i < a.length - 1; i++)
				if (a[i] < a[i+1]) return false;
			return true;
		} else {
			for (int i = 1; i < a.length; i++)
				if (a[i] < a[i-1]) return false;
			return true;
		}
	}
	protected static boolean isSorted(double[] a) {
		return isSorted(a, false);
	}
}
