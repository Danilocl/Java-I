import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;

public class main {

	public static void main(String[] args) {
		// Calendar calendar = Calendar.getInstance();
		// calendar.set(Calendar.YEAR, 2017);
		// calendar.set(Calendar.MONTH, 4);
		// calendar.set(Calendar.DAY_OF_MONTH, 01);
		// Date date = calendar.getTime();
		// System.out.println(date);

		// Date data = new Date();
		// SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		// String dataFormatada = f.format(date);
		// System.out.println(dataFormatada);

		Date dth = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(f.format(dth));

	}
}
