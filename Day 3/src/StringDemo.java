
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Welcome";
		String s2="   Java    Learning        ....     ";
		System.out.println("Length of the String: "+s2.length());
		System.out.println("Equals Method: "+s1.equals(s2));
		System.out.println("Concatenate: "+s1.concat(s2));
		System.out.println("SubString: "+s2.substring(3));
		System.out.println("Char At: "+s1.charAt(5));
		System.out.println("UpperCase: "+s1.toUpperCase());
		System.out.println("LowerCase: "+s2.toLowerCase());
		System.out.println(s2+"at TCS");//without trim
		System.out.println(s2.trim()+"at TCS");
		String check=s2.trim();
		System.out.println("Length of String: "+check.length());
		String replace=s2.replace("Java Learning", "Learn Java");
		System.out.println("String Replace:"+replace);
	}

}
