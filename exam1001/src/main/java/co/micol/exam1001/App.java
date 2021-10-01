package co.micol.exam1001;

/**
 * Hello world!
 *
 */
public class App {   // stack(참조, 공유영역): main/stack/class  <- heap
	private static int[] a = { 7, 9, 3, 6, 1, 4, 2, 5, 8, 10 };

	public static void main(String[] args) {
//		System.out.println("Hello World!");
//	 	selectionSort(); // 오름차순 Sort
//		toPrint();
//		System.out.print("\n");
//		System.out.println("====================");
//		newSelectionSort();
//		toPrint();
		RankAlgorithm rankAlgorithm=new RankAlgorithm();
		rankAlgorithm.toString();
	}

	private static String toPrint() {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return null;
	}

	private static void selectionSort() { // 메인메소드에서 실행하려면 static
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { // 내림차순은 < 부호를 반대로 바꿔주면 됨.
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

	private static void newSelectionSort() {
		int min; // 인덱스의 위치값을 기억할 변수
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] < a[j])
					min = j;
			}
			if (i != min) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}

	}
}
