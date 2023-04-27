package 개발멘토링;
//수정을 했다2
public class 문자열정렬 {

	    public static void main(String[] args) {
	        
	        String temp;
	        String Arr[] = { "김민정", "김종훈", "김지훈", "김채은", "김태호", "김현선", "김현호", "노은영", "유성희", "이태환", "이현우", "정혜정", "조영호", "조현영", "홍원상",
	                        "강애정", "김수엽", "김정훈", "류경숙", "박범진", "박승진", "박정근", "양권묵", "이운주", "이지은", "장덕호", "최성욱", "최정욱", "최지윤", "황극인" };
	        String[] ASC = new String[Arr.length];
	        String[] DESC = new String[Arr.length];

	        for (int inx = 0; inx < Arr.length; inx++) {
	            for (int jnx = inx + 1; jnx < Arr.length; jnx++) {
	                if (Arr[inx].compareTo(Arr[jnx]) > 0){
	                    temp = Arr[inx];
	                    Arr[inx] = Arr[jnx];
	                    Arr[jnx] = temp;
	                }
	            }
	            ASC[inx] = Arr[inx];
	        } 

	        for (int inx = 0; inx < Arr.length; inx++) {
	            for (int jnx = inx + 1; jnx < Arr.length; jnx++) {
	                if (Arr[inx].compareTo(Arr[jnx]) < 0){
	                    temp = Arr[inx];
	                    Arr[inx] = Arr[jnx];
	                    Arr[jnx] = temp;
	                }
	            }
	            DESC[inx] = Arr[inx];
	        }

	        System.out.print("오름차순 : ");
	        for (int inx = 0; inx < ASC.length; inx++) {
	            System.out.print(ASC[inx]);
	            if (inx < ASC.length - 1){
	                System.out.print(", ");
	            }
	        } System.out.println();
	       
	       System.out.print("내림차순 : ");
	        for (int inx = 0; inx < DESC.length; inx++) {
	            System.out.print(DESC[inx]);
	            if (inx < DESC.length - 1){
	                System.out.print(", ");
	            }
	        } System.out.println();
	    }
	
}
