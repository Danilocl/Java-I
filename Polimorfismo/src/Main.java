
public class Main {

	public static void main(String[] args) {

		Employee[] func = new Employee[05];

		func[0] = new Professor("Danilo", 350, 35);
		func[1] = new Professor("Danilo", 250, 25);
		func[2] = new Professor("Danilo", 450, 45);
		func[3] = new secretary("Júlia", 150, 15);
		func[4] = new secretary("Roberta", 120, 10);

		for (Employee em : func) {
			System.out.println(em);
		}
	
	}
}