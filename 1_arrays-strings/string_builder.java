public class string_builder {

	/*  */

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("bir ");
		sb.append("iki ");
		sb.append("üç.");

		sb.insert(1, 'i');
		sb.delete(4, 8);
		sb.replace(0, 4, "BİİR");

		System.out.println(sb); // "BİİR üç."

		String str = sb.toString();

	}
}
