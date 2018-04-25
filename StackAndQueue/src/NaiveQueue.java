import java.util.Arrays;

public class NaiveQueue { //classes is created
	private String[] queueArray;  //reference type used to describe the classes behaviour  
	private int queueSize;        //primitive integer type 
	
	// Sets stack as empty
	
	private int tail = 0;  //the tail is only used in the Naive queue
	
	NaiveQueue(int size){  //constructor
		
		queueSize = size;     //reference queueSize is passed into the constructor
		queueArray = new String[size]; //String Array is created with the size passed into it
		
				
		Arrays.fill(queueArray, "-1"); // Assigns the value of -1 to every value in the array
		// as it controls what gets printed to screen
	}
		
	public boolean qEmpty (){ //boolean method is created 
		if (tail==0){    // returns true if the tail equals 0
			return true; 
		}
		else {
			System.out.print("Queue isn't empty");  
		}
		return false;
	}
	public boolean qFull (){ //boolean full method
		if (tail==queueArray.length){// if the tail is the same as the arrays length  return true
			return true;
		}
		else {
return false;		}
	}
	
	
public void Enqueue(String i){ //Enqueue method with String i, acts as an input 
		
		if(qFull()){  //passes on the full method
			System.err.println("Sorry But the Queue is Full a.k.a. Overflow");
		}
		else{
			
			queueArray[tail] = i; //tail of the array equals String i
			
			tail++; //increments one
			System.out.println("INSERT " + i + " Was Added to the Queue \n");  //inserts i to the back of the queue
		}
		
		}
public String Dequeue(String temp){ //return type String
	if(qEmpty()){ //passes on empty method
		System.err.println("Sorry But the Queue is empty a.k.a. underflow");
	}
	else{ // when the empty method isn't true
		
		 temp = queueArray[0];    // String temp is assigned the 0 index i.e. the first position
		for(int i =0; i < tail-1; i++){ //moves the queue one space to the left
		
			queueArray[i] = queueArray[i + 1]; 
			tail--; //tail decrement
		}
		System.out.println(" " + "Contents moved one index to the left " );
		}
	return temp;
		
}

	
	

public void displayTheQueue(){ // method used to display index of the queue/array and creates nice boxes
	System.out.println("Array Index");
	for(int n = 0; n < 61; n++)System.out.print("-");
	System.out.println();
	
	for(int n = 0; n < queueSize; n++){
		
		System.out.format("| %2s "+ " ", n);
		
	}
	
	System.out.println("|");
	
	for(int n = 0; n < 61; n++)System.out.print("-");
	System.out.println();
	System.out.println("Naive Queue contents");
	for(int n = 0; n < 61; n++)System.out.print("-");
	System.out.println();
	
	
	for(int n = 0; n < queueSize; n++){
		
		if(queueArray[n].equals("-1")) System.out.print("|     ");
		else System.out.print(String.format("| %2s "+ " ", queueArray[n]));
		
	}	
	System.out.println("|");
	
	for(int n = 0; n < 61; n++)System.out.print("-");
	System.out.println();
	
	

}
	public static void main(String[] args){ //main method used to implement all the methods
		NaiveQueue theQueue = new NaiveQueue(10);
		theQueue.Enqueue("1");		
		theQueue.displayTheQueue();	
		theQueue.Enqueue("16");		
		theQueue.displayTheQueue();		
		theQueue.Enqueue("28");		
		theQueue.displayTheQueue();		
		theQueue.Enqueue("27");	
		theQueue.displayTheQueue();		
		theQueue.Enqueue("2");		
		theQueue.displayTheQueue();	
		theQueue.Enqueue("2");	
		theQueue.displayTheQueue();	
		theQueue.Enqueue("2");	
		theQueue.displayTheQueue();	
		theQueue.Enqueue("2");	
		theQueue.displayTheQueue();	
		theQueue.Enqueue("2");
		theQueue.displayTheQueue();	
		theQueue.Enqueue("2");
		theQueue.displayTheQueue();
		theQueue.Dequeue(" ");	
		theQueue.displayTheQueue();	
	
		
		
		
	}

}

	