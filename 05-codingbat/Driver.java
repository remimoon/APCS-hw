public class Driver {
    public static void main(String[]args) {
	StringStuff s = new StringStuff();
	System.out.println("Testing nonStart");
	System.out.println(s.nonStart("Hello", "There"));
	System.out.println(s.nonStart("java", "code")); 
	System.out.println(s.nonStart("shotl", "java"));

	System.out.println("Testing makeAbba");
	System.out.println(s.makeAbba("Hi", "Bye"));
	System.out.println(s.makeAbba("Yo", "Alice"));

	System.out.println("Testing diff21");
	System.out.println(s.diff21(19));
	System.out.println(s.diff21(21));
	System.out.println(s.diff21(23));

    }}
