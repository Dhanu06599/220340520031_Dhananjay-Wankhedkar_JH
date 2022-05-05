class TwoStackArray
{
	int arr[];
	int top1;
	int top2;
	int size;
	
	 TwoStackArray(int n)
	{
		arr = new int[n];
		size = n;
		top1 =-1;
		top2 = size;
	}
	
	void push1(int x)
	{
		if(top1<top2-1)
		{
			top1++;
			arr[top1] = x;
		}
		else 
		{
			System.out.println("Stack is overFlow");
			System.exit(1);
		}
	}
	
	void push2(int x)
	{
		if(top1<top2-1)
		{
			top2--;
			arr[top2] = x;
		}
		else 
		{
			System.out.println("Stack is overflow");
			System.exit(1);
		}
	}
	
	int pop1()
	{
		if (top1>=0)
		{
			int x = arr[top1];
			top1--;
			return x;
		}
		else
		{
			System.out.println("Stack is underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2()
	{
		if (top2<size)
		{
			int x = arr[top2];
			top2++;
			return x;
		}
		else
		{
			System.out.println("Stack is underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public static void main (String[] args)
	{
		TwoStackArray t = new TwoStackArray(5);
		t.push1(5);
		t.push2(10);
		t.push2(15);
		t.push1(11);
		t.push2(7);
		
		System.out.println("Popped element from stack1 is " + t.pop1());
		t.push2(40);
		System.out.println("Popped element from stack2 is " + t.pop2());
	}
}