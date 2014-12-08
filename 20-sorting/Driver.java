public class Driver{
    public static void main(String[] args){
	SuperArray s = new SuperArray(8);

	s.add("danish");
	s.add("crossaint");
	s.add("bagel");
	s.add("muffin");
	s.add("eggs");
	s.add("donut");
	s.add("coffee");
	s.add("tea");

	System.out.println("Original: " + s.toString() + "\n");
 
	//	s.isort();

	//	System.out.println("isort: " + s.toString() + "\n");

	//	s.ssort();
	//	System.out.println ("ssort: " + s.toString() + "\n");
    }
}
