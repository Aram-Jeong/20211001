package co.micol.exam1001;

public class RankAlgorithm {
	private int[] grade = { 80, 100, 50, 80, 73, 42 };
	private int[] rank;

	private void rank() {
		rank = new int[grade.length];
		for (int i = 0; i < rank.length; i++) { // rank 배열 초기화
			rank[i] = 1;
		}


		for (int i = 0; i < grade.length - 1; i++) { // 순위
			for (int j = i + 1; j < grade.length; j++) {
				if (grade[i] > grade[j]) {
					rank[j]++;
				} else if (grade[i] < grade[j]) {
					rank[i]++;
				}
			}
		}
	}

	public String toString() {
		rank();
		for (int g : grade) {   // 보다 나은 for문, forEach구문 값을 읽을 때 사용한다. :뒤에 객체가 와야 함.
			System.out.print(g + " ");
		}
		System.out.println();
		for (int r : rank) {
			System.out.print(r + " ");
		}
		return null;
	}
}
