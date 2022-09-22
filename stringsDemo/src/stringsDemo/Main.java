package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Today is a good day.";
		System.out.println("number of variables: " + message.length());
		System.out.println("5th variable: "+ message.charAt(4));
		System.out.println(message.indexOf("T"));
		
		System.out.println(message.replace(" ", "-"));
		System.out.println(message.substring(5));
	}

}
