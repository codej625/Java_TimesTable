package test;

class TimesTableMethod {

	// static field
	private static TimesTableMethod singleton;

	// singleton 구현
	public static TimesTableMethod getInstance() {

		if (singleton == null) {
			singleton = new TimesTableMethod();
		}
		return singleton;
	}

	// public whileLoop method
	public void whileLoop(int i, int j) {

		while (i <= 9) {
			System.out.println(i + "단 시작 -> ");
			while (j <= 9) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}
	}

	// static forLoop method
	static public void forLoop(int i, int j) {

		for (; i <= 9; i++) {
			System.out.println(i + "단 시작 -> ");
			for (; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
			j = 1;
		}
	}

}

public class TimesTable {

	public static void main(String[] args) {

		// i 단수
		int i = 2;
		// j 곱하기
		int j = 1;

		// 객체 생성
//		TimesTableMethod TimesTable = new TimesTableMethod();

		// singleton 구현
		TimesTableMethod timesTable = TimesTableMethod.getInstance();

		// public method ( 객체 instance o => 구현 가능)
		timesTable.whileLoop(i, j);

		// static method ( 객체 instance x => 구현 가능)
		TimesTableMethod.forLoop(i, j);

	}
}
