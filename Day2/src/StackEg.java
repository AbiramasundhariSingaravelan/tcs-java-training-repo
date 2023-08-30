import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		boolean result=s.empty();
		System.out.println("IS the stack Empty: "+result);
		for(int i=0;i<51;i=i+5)
		{
		s.push(i);
		}
		System.out.println("Elements in stack: "+s);
		result=s.empty();
		System.out.println("After Insertion: Is the stack empty: "+result);
		for(int i=50;i<=0;i=i-5)
		{
		s.pop();
		}
		result=s.empty();
		System.out.println("After Deletion: Is the stack empty: "+result);
		
	}

}
