import java.util.Arrays;
import java.util.Comparator;

public class two_dimension_comparing {

	public static void main(String[] args) {
		
		int[][] arr = {{2,5},{1,5},{1,4}};
		
		Arrays.sort(arr,Comparator.comparingInt(o1->o1[0]));
		
		//java.util.Arrays.deepToString() �޼ҵ带 �̿��ϸ� 
		//��Ÿ�� �迭�� ���� ���ڿ��� ��� ���� 
		System.out.println(Arrays.deepToString(arr));

	}

}
