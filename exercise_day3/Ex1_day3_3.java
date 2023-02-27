package exercise_day3;

public class Ex1_day3_3 {
	public static void main(String[] args) {
	//fixedStack
	FixedStack f=new FixedStack(10);
	for(int i=1;i<=10;i++) {
		f.push(i);
		System.out.println("the element of the fixed stack are : "+f.pop());
	}
	//System.out.println("the elements of the fixed stack are : "+f.pop());
	//for dynamic stack
	DynamicStack d=new DynamicStack(7);
	for(int i=1;i<=10;i++) {
		d.push(i);
		System.out.println("the elements of the dynamic stack are : "+d.pop());
	}
	
    }
}
interface Stack{
	void push(int n);
	int pop();
}

class FixedStack implements Stack{
	int stack[];
	int top=-1;
	int size;
	FixedStack(int size){
		this.size=size;
		stack=new int[size];
	}
	@Override
	public void push(int n ) {
		if(top==size-1) {
			System.out.println("stack is full");
		}
		else {
			stack[++top]=n;
		}
	}
	@Override
	public int pop() {
		if(top==-1) {
			System.out.println("empty stack");
			return -1;
		}
		else {
			return stack[top--];
		}
	}
}
class DynamicStack implements Stack{
	int stack[];
	int top;
	DynamicStack(int size){
		stack=new int[size];
	}
	@Override
	public void push(int a) {
		if(top==stack.length-1) {
			int[] anotherStack =new int[stack.length *2];
			for(int i=0;i<=top;i++) {
				anotherStack[i]=stack[i];
			}
			stack=anotherStack;
		}
		stack[++top]=a;
	}
	@Override
	public int pop() {
		if(top==-1) {
			System.out.println("undeflow condition");
			return -1;
		}
		return stack[top--];
	}
}
