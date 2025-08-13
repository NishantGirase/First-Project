package src;

public class Stack {

	int stack[] = new int[5];
	int top=0;
	public void push(int i) {
		// TODO Auto-generated method stub
		stack[top]=i;
		top++;
		
	}
	
	public void show() {
		for(int i : stack) {
			System.out.print(i+" ");
		}
	}

	public int pop() {
		// TODO Auto-generated method stub
		top--;
		int data = stack[top];
		stack[top]=0;
		return data;
		
	}

	public int peek() {
		// TODO Auto-generated method stub
		int data = stack[top-1];
		return data;
	}

}
