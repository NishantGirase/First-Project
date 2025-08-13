package src;

public class Runner {
	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		list.insert(17);
//		list.insert(98);
//		list.insert(24);
//		list.insert(32);
//		
//		list.show();
		
		Stack num = new Stack();
		num.push(10);
		num.push(23);
		num.push(35);
		num.push(89);
		num.push(21);
		
		 System.out.println(num.pop()); 
		 
		 System.out.println(num.pop()); 
		 
		 System.out.println(num.peek());
		
		num.show();
	}

}
