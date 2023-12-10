package lecture6;

public class bufferappend {
	public static void main(String[]args) {
		StringBuffer a=new StringBuffer("Yasiru");
		a.append("java");
		a.insert(2,"XYZ");
		System.out.println(a);
	}

}
