public class Practice {

	public static void main(String[] args) {
		// Given string str
		String str = "whatIsYourName"; // WHAT_IS_YOUR_NAME
		String str1 = "WHAT_IS_YOUR_NAME"; //snake
		// Print the modified string
		// System.out.print(camelToSnake(str));
		System.out.print(snakeToCamel(str1));
	}

	public static String camelToSnake(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				result = result + "_";
				result = result + Character.toUpperCase(str.charAt(i));
			} else {
				result = result + Character.toUpperCase(str.charAt(i));
			}
		}

		return result;
	}

	public static String snakeToCamel(String str) {
				
		StringBuilder s = new StringBuilder(str.toLowerCase());
		
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)== '_')
			{
				s.deleteCharAt(i);
				s.replace(i, i+1,String.valueOf(Character.toUpperCase(s.charAt(i))));
			}
		} 
		
		return s.toString();
	}

}
