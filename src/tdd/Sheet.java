package tdd;

public class Sheet {

	public static void main(String[] args) {
		String la = " 1234";
		String temp = la.replaceAll("\\s", "");

		System.out.println(temp);
		System.out.println(isNumber(la));
		System.out.println(isNumber(temp));
	}

	private static boolean isNumber(String s){
		try{
			int num = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public Object get(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void put(String theCell, String string) {
		// TODO Auto-generated method stub
		
	}
}
