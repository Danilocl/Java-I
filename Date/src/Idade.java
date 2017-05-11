import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		try {
			Calendar today = Calendar.getInstance();

			Scanner s = new Scanner(System.in);
			System.out.println("Digite sua data de narcimento: ");
			String datanasc = s.nextLine();
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date nasc = df.parse(datanasc);

			Calendar dateOfBirth = new GregorianCalendar();

			dateOfBirth.setTime(nasc);

			int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

			if (today.before(dateOfBirth)) {
				age--;
			}

			System.out.println("\n A sua idade é: " + age);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
