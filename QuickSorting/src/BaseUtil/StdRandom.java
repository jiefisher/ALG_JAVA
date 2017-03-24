package BaseUtil;

import java.util.Random;

public class StdRandom {

	private static Random random;
	private static long seed;
	
	static {
		seed = System.currentTimeMillis();
		random = new Random(seed);
	}
	public static void setSeed(long s) {
		seed   = s;
		random = new Random(seed);
	}
	public static long getSeed() {
		return seed;
	}
	/**
	 * 鑾峰緱 [0, 1) 鍖洪棿鍐呯殑闅忔満瀹炴暟
	 * @return [0, 1) 鍖洪棿鍐呯殑闅忔満瀹炴暟
	 */
	public static double getDouble() {
		return random.nextDouble();
	}
	/**
	 * 鑾峰緱 [0, 1) 鍖洪棿鍐呯殑闅忔満瀹炴暟
	 * @return [0, 1) 鍖洪棿鍐呯殑闅忔満瀹炴暟
	 */
	public static double random() {
		return getDouble();
	}
	/**
	 * 鑾峰緱 [0, n) 鍖洪棿鍐呯殑闅忔満鏁存暟
	 * @param n 鍙兘鐨勬暣鏁颁釜鏁�
	 * @return [0, n) 鍖洪棿鍐呯殑闅忔満鏁存暟
	 */
	public static int getInteger(int n) {
		if (n <= 0) throw new IllegalArgumentException("argument must be positive");
		return random.nextInt(n);
	}
	/**
	 * 鑾峰緱鎸囧畾鍖洪棿鍐呯殑闅忔満鏁存暟
	 * @param a 鍖洪棿宸︾
	 * @param b 鍖洪棿鍙崇
	 * @return [a, b) 鍖洪棿鍐呯殑闅忔満鏁存暟
	 */
	public static int getInteger(int a, int b) {
		if ((b <= a) || ((long) (b-a) >= Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("invalid range: [" + a + ", " + b + "]");
		}
		return a + getInteger(b-a);
	}
	/**
	 * 鑾峰緱 [a, b) 鍖洪棿鍐呯殑闅忔満瀹炴暟
	 * @param a 鍖洪棿宸︾
	 * @param b 鍖洪棿鍙崇
	 * @return [a, b) 鍖洪棿鍐呯殑闅忔満瀹炴暟
	 */
	public static double getDouble(double a, double b) {
		if (!(a < b)) {
			throw new IllegalArgumentException("invalid range: [" + a + ", " + b + "]");
		}
		return a + random() * (b-a);
	}
	/**
	 * 鎵撲贡鏁扮粍鍏冪礌
	 * @param a 寰呮墦涔辩殑鏁扮粍
	 */
	public static void shuffle(Object[] a) {
		if (a == null) throw new IllegalArgumentException("argument array is null");
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + getInteger(n-i); //between i and n-1
			Object temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	/**
	 * 鎵撲贡鏁扮粍鍏冪礌
	 * @param a 寰呮墦涔辩殑鏁扮粍
	 */
	public static void shuffle(double[] a) {
		if (a == null) throw new IllegalArgumentException("argument array is null");
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + getInteger(n-i); //between i and n-1
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	/**
	 * 鎵撲贡鏁扮粍鍏冪礌
	 * @param a 寰呮墦涔辩殑鏁扮粍
	 */
	public static void shuffle(int[] a) {
		if (a == null) throw new IllegalArgumentException("argument array is null");
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + getInteger(n-i); //between i and n-1
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	/**
	 * 鎵撲贡鏁扮粍鍏冪礌
	 * @param a 寰呮墦涔辩殑鏁扮粍
	 */
	public static void shuffle(char[] a) {
		if (a == null) throw new IllegalArgumentException("argument array is null");
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + getInteger(n-i); //between i and n-1
			char temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	/**
	 * 鎵撲贡鏁扮粍鎸囧畾鍖洪棿鐨勫厓绱�
	 * @param a 寰呮墦涔辩殑鏁扮粍
	 * @param low 鏁扮粍鍖洪棿宸︾锛堝寘鍚級
	 * @param high 鏁扮粍鍖洪棿鍙崇锛堜笉鍖呭惈锛�
	 */
	public static void shuffle(Object[] a, int low, int high) {
		if (a == null) throw new IllegalArgumentException("argument array is null");
		if (low < 0 || low >= high || high > a.length) {
			throw new IndexOutOfBoundsException("invalid subarray range: [" + low + ", " + high + ")");
		}
		for (int i = low; i < high; i++) {
			int r = i + getInteger(high - i); //between i and high - 1
			Object temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	/**
	 * 鎵撲贡鏁扮粍鎸囧畾鍖洪棿鐨勫厓绱�
	 * @param a 寰呮墦涔辩殑鏁扮粍
	 * @param low 鏁扮粍鍖洪棿宸︾锛堝寘鍚級
	 * @param high 鏁扮粍鍖洪棿鍙崇锛堜笉鍖呭惈锛�
	 */
	public static void shuffle(double[] a, int low, int high) {
		if (a == null) throw new IllegalArgumentException("argument array is null");
		if (low < 0 || low >= high || high > a.length) {
			throw new IndexOutOfBoundsException("invalid subarray range: [" + low + ", " + high + ")");
		}
		for (int i = low; i < high; i++) {
			int r = i + getInteger(high-i); //between i and high-1
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	/**
	 * 鎵撲贡鏁扮粍鎸囧畾鍖洪棿鐨勫厓绱�
	 * @param a 寰呮墦涔辩殑鏁扮粍
	 * @param low 鏁扮粍鍖洪棿宸︾锛堝寘鍚級
	 * @param high 鏁扮粍鍖洪棿鍙崇锛堜笉鍖呭惈锛�
	 */
	public static void shuffle(int[] a, int low, int high) {
		if (a == null) throw new IllegalArgumentException("argument array is null");
		if (low < 0 || low >= high || high > a.length) {
			throw new IndexOutOfBoundsException("invalid subarray range: [" + low + ", " + high + ")");
		}
		for (int i = low; i < high; i++) {
			int r = i + getInteger(high-i); //between i and high-1
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	/**
	 * 鑾峰緱闅忔満鎺掑簭鐨勬暣鏁版暟缁�(闀垮害涓簄)
	 * @param n 鍏冪礌涓暟
	 * @return 涓�涓厓绱犱负 0 鑷� n-1 鐨勯殢鏈烘帓搴忕殑鏁存暟鏁扮粍
	 */
	public static int[] getIntegerArray(int n) {
		if (n < 0) throw new IllegalArgumentException("argument is negative");
		int[] perm = new int[n];
		for (int i = 0; i < n; i++)
			perm[i] = i;
		shuffle(perm);
		return perm;
	}
	/**
	 * 鑾峰緱闅忔満鎺掑簭鐨勬暣鏁版暟缁�(闀垮害涓簁)
	 * @param n 鍙�夌殑鍏冪礌涓暟
	 * @param k 閫夋嫨鐨勫厓绱犱釜鏁�
	 * @return 鍖呭惈 [0,n) 涓� k 涓厓绱犵殑鎵撲贡鐨勬暟缁�
	 */
	public static int[] permutation(int n, int k) {
		if (n < 0) throw new IllegalArgumentException("argument is negative");
		if (k < 0 || k > n) throw new IllegalArgumentException("k must be between 0 and n");
		int[] perm = new int[k];
		//鑾峰緱鍖呭惈鎵撲贡鐨�0鑷砶鐨勬暟缁�
		for (int i = 0; i < k; i++) {
			int r = getInteger(i+1); //between 0 and i
			perm[i] = perm[r];
			perm[r] = i;
		}
		//闅忔満灏嗕竴浜涘厓绱犳崲鎴怺k,n-1)涓厓绱�
		for (int i = k; i < n; i++) {
			int r = getInteger(i+1); //between 0 and i
			if (r < k) perm[r] = i;
		}
		return perm;
	}
	public static void main(String[] args) {
		int[] testArray = StdRandom.getIntegerArray(100);
		for (int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i] + "\t");
			if ((i+1) % 10 == 0) System.out.println();
		}
	}
}
