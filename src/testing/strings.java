package testing;

public class strings {

	public static void main(String[] args) {
		String p="my name is saddam shaikh";
		
		System.out.println(p.length());
		System.out.println(p.isEmpty());
		System.out.println(p.startsWith("u"));
		System.out.println(p.endsWith("g"));
		
		System.out.println(p.trim());
		System.out.println(p.replace('s','$'));
		System.out.println(p.replaceFirst("h","#"));
		System.out.println(p.replaceAll("name","identity"));
		

	}

}
