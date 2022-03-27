package test;

public class napa {
	static boolean romaji(String s) {
		String str = s;
		int vcount = 0, ccount = 0;
		str = str.toLowerCase();
		char truoc = str.charAt(0); // truoc

		char ch = str.charAt(str.length()-1);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			
		} else if ((ch >= 'a' && ch <= 'z') &&ch!='n') {
			return false;
		}

		for (int i = 1; i < str.length(); i++) {
			char sau = str.charAt(i);
			if (truoc == 'a' || truoc == 'e' || truoc == 'i' || truoc == 'o' || truoc == 'u') {
				System.out.println("na");
			} else if ((truoc >= 'a' && truoc <= 'z') && truoc != 'n') {
				if (sau == 'a' || sau == 'e' || sau == 'i' || sau == 'o' || sau == 'u') {

				} else if ((sau >= 'a' && sau <= 'z')) {
					return false;
				}

			}

			truoc = str.charAt(i);
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(romaji("aaab"));
	}

}
