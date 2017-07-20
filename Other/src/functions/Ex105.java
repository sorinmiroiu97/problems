package functions;

public class Ex105 {

	public static void main(String[] args) {
		a();
		System.out.println(b());
		c(true);
		d();
		e(9);
		f("fire");
		System.out.println(g());
		h(2);
		System.out.println();
		
		i(2);
		System.out.println(j(2));
		k();
		l(false, true);
		m(true, false);
		n("nemesis");
		System.out.println(o());
		System.out.println(p());
		q();
		System.out.println();
		
		System.out.println(r(true));
		s(6);
		t("telekinesis");
		System.out.println(u());
		v(4);
		w(5);
		System.out.println(x(1));
		y();
		System.out.println(z(false, true));
		System.out.println();
	}

	/**************************************
	 * Don't change anything below here!! *
	 *************************************/

	public static void a() {
		System.out.print("Ant ");
	}

	public static String b() {
		return "Banana ";
	}

	public static void c(boolean doit) {
		if (doit)
			System.out.print("Crocodile ");
	}

	public static void d() {
		System.out.print("Doggie ");
	}

	public static void e(int howmany) {
		String s;
		s = "Elephant ";
		int x = 0;
		while (x < howmany) {
			System.out.print(s.charAt(x));
			x = x + 1;
		}

	}

	public static void f(String word) {
		System.out.print(word + " ");
	}

	public static String g() {
		return "Gorilla ";
	}

	public static void h(int reps) {
		int x = 0;
		while (x < reps) {
			System.out.print("Horseradish ");
			x = x + 1;
		}

	}

	public static void i(int ignoredparameter) {
		ignoredparameter = 32;
		String space = Character.toString((char) ignoredparameter);
		System.out.print("Ice_cream" + space);
	}

	public static String j(int whichone) {
		if (whichone == 1)
			return "Jambalaya ";
		else if (whichone == 2)
			return "Juniper ";
		else
			return "Jackrabbit ";
	}

	public static void k() {
		// the bird OR the fruit
		System.out.print("Kiwi ");
	}

	public static void l(boolean a, boolean b) {
		if (a && b)
			System.out.print("Lettuce ");
		else
			System.out.print("Lhasa_apso ");
	}

	public static void m(boolean a, boolean b) {
		if (a || b)
			System.out.print("Mango ");
		else
			System.out.print("Monkey! ");
	}

	public static void n(String word) {
		System.out.print(word + " ");
	}

	public static int o() {
		System.out.print("Orangutan ");
		return 1; // just for kicks; the return value doesn't mean anything
	}

	public static String p() {
		return "Parrot ";
	}

	public static void q() {
		System.out.print("Quail ");
	}

	public static String r(boolean first) {
		if (first)
			return "Rabbit ";
		else
			return "Radish ";
	}

	public static void s(int howmany) {
		String s;
		s = "Snake ";
		int x = 0;
		while (x < howmany) {
			System.out.print(s.charAt(x));
			x = x + 1;
		}
	}

	public static void t(String word) {
		System.out.print(word + " ");
	}

	public static String u() {
		return "Ugli_fruit ";
	}

	public static void v(int reps) {
		int x = 0;
		while (x < reps) {
			System.out.print("Valentine_candy ");
			x = x + 1;
		}
	}

	public static void w(int ignoredparameter) {
		ignoredparameter = 32;
		String space = Character.toString((char) ignoredparameter);
		System.out.print("Walrus" + space);
	}

	public static String x(int whichone) {
		if (whichone == 1)
			return "X_files ";
		else
			return "X_men ";
	}

	public static void y() {
		System.out.print("Yams ");
	}

	public static String z(boolean a, boolean b) {
		if (a || b)
			return "Zanahorias ";
		else
			return "Zebra ";
	}

}
