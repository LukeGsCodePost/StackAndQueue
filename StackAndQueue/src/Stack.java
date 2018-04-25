
public class Stack { // class is created
	private int top; // indicates the most recently inserted element
	private int [] myArray; // the items in the stack

	
	
	//*** constructor ***
	public Stack(int size){     //constructor
		this.myArray = new int[size];  // the number of items in the stack
		this.top = 0;                  //top is assigned a primitive of 0
	}
	//*** String method ***
	public String toString(){
		StringBuffer details = new StringBuffer(); //string buffer is used as it is safe for multiple threads
		for(int i= 0; i<this.myArray.length;i++){
			details.append(this.myArray[i]).append(","); // integer of the for loop is run through the array length
		}                                                // integer from the passed through for loop is put into the array and is printed
		details.append("Top position:").append(top);
		return details.toString(); 
	}
	//*** Push ***
	public void push(int num){ 
		if(this.isFull()){        //passes on the isFull method and if it proves true it prints out an error message
			System.err.println("stack is full cannot push");
		}
		else{
			this.myArray[top]=num; 
			this.top++;           //pushes the stack by one
		}
	}
	//*** Pop ***
	public int pop(){ // method with return type int 
		if(this.isEmpty()){
			System.err.println("Stack is empty cannot pop");
			return 0; 
		}
		this.top--; 
		int tmp =  this.myArray[this.top];
		this.myArray[this.top] = 0; // overrides the top value of the array with a zero
		return tmp;  
	}

	public boolean isFull(){  //full method used to measure if the stack is full
		if(this.top==this.myArray.length)
			return true; 
		return false; 
	}// end of isFull method

	public int top(){ // a method that puts the top with a -1 into the array and returns it 
		return this.myArray[this.top-1];
	} /* 
	   * End of Top method
	   */ 

	public boolean isEmpty(){ // a boolean method to measure if the stack is empty 
		if(this.top==0)
			return true;
		return false; 
	}

	public static void main(String[] args) {
		Stack myStack = new Stack(10);  // stack has 10 spaces
		myStack.pop();     // pops the stack
		for(int i=0; i<11; i++){
			myStack.push((int)(Math.random()*100)+1); //randomly generates numbers for the stack 
			System.out.println(myStack.toString()); //returns a string representation of the object
			System.out.println("Value at position top-1:"+myStack.top()); //top of the array 
		}
		for (int i=0; i<11; i++){
			System.out.println(myStack.pop());    //for loop is desgned to pop the stack 
		}
		System.out.println();
	}
}