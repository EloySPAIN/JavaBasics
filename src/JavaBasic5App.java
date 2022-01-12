/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
public class JavaBasic5App {

	public static void main(String[] args) {
		int A=6,B=15,C=7,D=24;
		
		System.out.println("A: "+A+" B: "+B+" C: "+C+" D: "+D);
		B=C;
		System.out.println("B=C: "+B);
		C=A;
		System.out.println("C=A: "+C);
		A=D;
		System.out.println("A=D: "+A);
		D=B;
		System.out.println("D=B: "+D);
	}

}
