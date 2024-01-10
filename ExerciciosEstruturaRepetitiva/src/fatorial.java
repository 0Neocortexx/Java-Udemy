import java.util.*;

public class fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int y = 1;
		for (int i = 1; i <= n; i++) {
			y = y * i;
		}
		System.out.println(y);
	}

}
 