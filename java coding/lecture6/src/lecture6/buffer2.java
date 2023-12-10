package lecture6;

public class buffer2 {
	public static void main(String[]args) {
		StringBuffer sb =new StringBuffer("buffer reverse example");
		System.out.println("Original Buffer content:"+sb);
		sb.reverse();
		System.out.println("Reverse Stringbuffer content:"+sb);
	}

}
