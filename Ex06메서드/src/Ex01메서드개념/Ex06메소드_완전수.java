package Ex01메서드개념;

public class Ex06메소드_완전수 {

	public static void main(String[] args) {
	      //완전수
	      int startValue = 2;
	      int endValue = 1000;
	      
	      System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");
	      
	      // start~end 완전수를 발견하면 출력하는 메소드
	      getPerfectNumber(startValue, endValue);
	   }
	   
	   public static void getPerfectNumber(int s, int e) {
	      // s~e 완전수인지 판단
	      for(int i=s; i<=e; i++) {
	            int sum = 0;
	         // -> s가 완전수라는 근거 : 1~s 미만 까지의 수를 다 s에 나눠보고,
	         //                      나눠떨어지는 수의 합이 s와 같아야 해요
	         for(int j=1; j<i; j++) {
	            // j는 1부터 i 미만 수까지 반복하면서
	            // i에 나눴을때 나눠떨어지는지 검사
	            // 나눠떨어졌다면 합산
	            if(i%j==0) {
	               sum += j;
	            }
	         }
	         if(sum==i) { //완전수
	            System.out.print(i+" ");
	         }
	      }
	      
	      
	   }
}
