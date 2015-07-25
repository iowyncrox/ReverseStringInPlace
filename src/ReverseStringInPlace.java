public class ReverseStringInPlace {

	public static String Reverse(String str) {

		if (str == null || str.length() == 0)
			return "";

		char temp;
		char[] charArray = str.toCharArray();

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}

		return String.valueOf(charArray); // new String(charArray);
	}

	public static void main(String[] args) {
		System.out.println(ReverseStringInPlace.Reverse("sunny    B "));
	}
}
