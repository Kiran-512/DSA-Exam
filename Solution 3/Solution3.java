class Solution3{
	
	int[] stackArray;
	int top1;
	int top2;
	
	Solution3(){
		top1=-1;
		top2=20;
		stackArray=new int[20];
	}
	
	void push1(int x){
		if(top1==top2-1){
			System.out.println("stack overflow :");
			return;
		}
		top1++;
		stackArray[top1] = x;
	}
	void push2(int x){
		if(top2==top1+1){
			System.out.println("stack overflow :");
			return;
		}
		top2--;
		stackArray[top2] = x;
	}
	int pop1(){
		int x;
		if(top1==-1){
			System.out.println("stack underflow :");
			return -1;
		}
		x=stackArray[top1];
		top1--;
		System.out.println("Popped Element from stack1 is "+x);		
		return x;
	}
	int pop2(){
		int x;
		if(top2 == 20 ){
			System.out.println("stack underflow :");
			return -1;
		}
		x=stackArray[top2];
		top2++;
		System.out.println("Popped Element from stack2 is "+x);
		return x;
	}
	
	public static void main(String... args){
		
		Solution3 stack = new Solution3();
		
		stack.push1(5);
		stack.push2(10);		
		stack.push2(15);
		stack.push1(11);
		stack.push2(7);
		stack.push2(40);
		
		stack.pop1();
	
		stack.pop2();
		
	}
	
}