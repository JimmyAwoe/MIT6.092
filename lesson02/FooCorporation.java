public class FooCorporation {

	public static void CompPay (double workhour, double basepay) {
		if (workhour <= 40) {
			System.out.println("The wage is " + workhour * 8);}
		else if (workhour > 60) {
			System.out.println("error:the worked hour violate the Labor Law.");}
		else {
			double extrahour = workhour - 40;
			System.out.println("The wage is " + (40 * basepay + extrahour * basepay * 1.5));
			}
	}

	public static void main(String[] args){
		CompPay(35, 7.5);
		CompPay(47, 8.2);
		CompPay(73, 10);
	}
}

