package nothing;

public class reverse_ {

	public static void main(String[] args) {
		String str="Aryra";
		String reverse = "";
		
		for(int a=str.length()-1;a>=0;a--) {
			reverse=reverse+str.charAt(a);
		}
		System.out.println(reverse);
		System.out.println(str.equalsIgnoreCase(reverse));
	}

}
