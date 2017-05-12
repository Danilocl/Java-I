package recursividade;

public class Fatorial {

	public static int fat(int num) {
		if(num==0) {
			return 1;
		}
		return num * fat(num-1);
	}
	
	public static void main(String[] args) {
		Fatorial f = new Fatorial();
		System.out.println(f.fat(5));
	}
}
