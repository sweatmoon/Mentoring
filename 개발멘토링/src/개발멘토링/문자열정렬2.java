package 개발멘토링;

public class 문자열정렬2 {
	public static void main(String[] args) {

		String arr[] = { "김민정", "김종훈", "김지훈", "김채은", "김태호", "김현선", "김현호", "노은영", "유성희", "이태환", "이현우", "정혜정", "조영호",
				"조현영", "홍원상", "강애정", "김수엽", "김정훈", "류경숙", "박범진", "박승진", "박정근", "양권묵", "이운주", "이지은", "장덕호", "최성욱", "최정욱",
				"최지윤", "황극인" };

		sortArray(arr);
		printArray(arr);

	}

	public static void sortArray(String[] arr) {
		String temp;
		for (int inx = 0; inx < arr.length - 1; inx++) { // 버블정렬 시 로직의 논리적 정확성을 위해 배열길이 - 1 까지
			for (int jnx = inx + 1; jnx < arr.length; jnx++) {
				if (arr[inx].compareTo(arr[jnx]) > 0) {
					temp = arr[inx];
					arr[inx] = arr[jnx];
					arr[jnx] = temp;
				}
			}
		}
	}

	public static void printArray(String[] arr) {
		for (int inx = 0; inx < arr.length; inx++) {
			System.out.print(arr[inx]);
			if (inx < arr.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
