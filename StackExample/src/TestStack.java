class Stack{
	int stck[]=new int[10];
	int tos;
	Stack(){
		tos=-1;
	}
	void Push(int item){
		if(tos==9){
			System.out.println("Stack is full.");
		}
		else{
			stck[++tos]=item;
		}
	}
	int Pop(){
		if(tos<0){
			System.out.println("Stack Underflow.");
			return 0;
		}
		else
			return stck[tos--];
	}
}

public class TestStack {

	public static void main(String[] args) {
		Stack mystack1=new Stack();
		Stack mystack2=new Stack();
		
		for(int i=0;i<10;i++) mystack1.Push(i);
		for(int i=10;i<20;i++) mystack2.Push(i);
		
		System.out.println("Stack in mystack1:");
		for(int i=0;i<10;i++) 
			System.out.println(mystack1.Pop());
			
			System.out.println("Stack in mystack2:");
			for(int i=0;i<10;i++) 
				System.out.println(mystack2.Pop());

	}

}
