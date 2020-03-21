package test.calendar;

public class TestRegex {
	public static void main(String[] args) {
		String s = "1";
		String regex = "\\d?";
		boolean b = s.matches(regex);
		System.out.println(b);
	}
}
