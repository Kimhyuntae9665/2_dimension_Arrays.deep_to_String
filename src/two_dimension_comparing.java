import java.util.Arrays;
import java.util.Comparator;

public class two_dimension_comparing {

	public static void main(String[] args) {
		
		int[][] arr = {{2,5},{1,5},{1,4}};
		
		Arrays.sort(arr,Comparator.comparingInt(o1->o1[0]));
		
		//java.util.Arrays.deepToString() 메소드를 이용하면 
		//ㅈ타원 배열의 값을 문자열로 출력 가능 
		System.out.println(Arrays.deepToString(arr));

	}

}
