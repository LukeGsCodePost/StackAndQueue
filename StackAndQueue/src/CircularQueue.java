import java.util.Arrays;

public class CircularQueue {
	
	private String[] queueArray;
	private int queueSize;
	
	// Sets stack as empty
	
	private int head, numberOfItems, tail = 0;
	
	CircularQueue(int size){
		
		queueSize = size;
		queueArray = new String[size];
		
		// Assigns the value of -1 to every value in the array
		// so I control what gets printed to screen
				
		Arrays.fill(queueArray, "-1");
		
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
	
	public void Enqueue(String input){ // inserts the new element at the tail and increments the size of the items
		
		if(qFull()){
		
			System.out.println("Sorry But the Queue is Full a.k.a. Overflow");
		
		} else {
			System.out.println("Sorry But the Queue is Full a.k.a. Overflow");
			queueArray[tail] = input;
			tail++;
			numberOfItems++;
			
			System.out.println("INSERT " + input + " Was Added to the Queue \n");
		}
		
	}
	
	// This priority insert will add items in order from high to low
		
	public void dequeue(){ //removes the first elements(index 0) and creates the second element (inde 1) as the head 
		
		if(qEmpty()){
		
			System.out.println("Sorry But the Queue is Empty");
		
		} else {		
			System.out.println("Sorry But the Queue is Empty");
			System.out.println("REMOVE " + queueArray[head] + " Was Removed From the Queue\n");
			queueArray[head] = "-1";
			head++;
			numberOfItems--;
		}	
	}
	
	public void peek(){ // prints the first element
		
		System.out.println("The First Element is " + queueArray[head]);
		
	}
	
	public void displayTheQueue(){ //displays the queue and creates a template
		System.out.println("Array Index");
		for(int n = 0; n < 61; n++)System.out.print("-");
		System.out.println();
		
		for(int n = 0; n < queueSize; n++){
			
			System.out.format("| %2s "+ " ", n);
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		System.out.println();
		System.out.println("Circular Queue contents");
		for(int n = 0; n < 61; n++)System.out.print("-");
		System.out.println();
		
		
		for(int n = 0; n < queueSize; n++){
			
			if(queueArray[n].equals("-1")) System.out.print("|     ");
			else System.out.print(String.format("| %2s "+ " ", queueArray[n]));
			
		}	
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		System.out.println();
		
		// Number of spaces to put before the F
		
		int spacesBeforeFront = 3*(2*(head+1)-1);
		for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");
		System.out.print("F");  //monitors the top of the queue with a F
		
		// Number of spaces to put before the R
		int spacesBeforeRear = (2*(3*tail)-1) - (spacesBeforeFront);
		
		for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");
		System.out.print("R");  //monitors the end of the queue with an R 
		System.out.println("\n");
	
}
	
	public static void main(String[] args){ //main method where all the methods are implemented
		
		CircularQueue theQueue = new CircularQueue(10); //calls the constructor
		theQueue.Enqueue("2");		
		theQueue.displayTheQueue();	
		theQueue.Enqueue("16");		
		theQueue.displayTheQueue();		
		theQueue.Enqueue("28");		
		theQueue.displayTheQueue();		
		theQueue.Enqueue("27");	
		theQueue.displayTheQueue();		
		theQueue.Enqueue("2");		
		theQueue.displayTheQueue();	
		theQueue.dequeue();	
		theQueue.displayTheQueue();	
		theQueue.dequeue();	
		theQueue.displayTheQueue();	
		theQueue.peek();
		
	}

}