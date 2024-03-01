//Andres Ramos
//Chpt5 PA
import java.util.Scanner;
public class StackAsArray{
    
    //declare variables
    public static int maxLength;
    public static int topIndex = 0;
    public static int allocationSize;
    public static int [] stack;
    public static int length = 0;

    public static void main(String[]args){

        //create Scanner obj
        Scanner scnr = new Scanner(System.in);

        //prompt user for allocationSize and length
        System.out.print("Enter the allocation size of the stack: ");
        allocationSize = scnr.nextInt();

        System.out.print("Enter the maximum length of the stack: ");
        maxLength = scnr.nextInt();

        //initialize stack as array w/ allocationSize
        stack = new int[allocationSize];

        //declare variables for methods
        boolean pushed = false;
        int item;

        System.out.println("");

        //push item 1 to stack
        item = 1;
        pushed = push(item);
        if(pushed){
            System.out.println("Item 1 was pushed succesfully");
        } else {
            System.out.println("Item 1 was not pushed succesfully");
        }

        //push item 2 stack
        item = 2;
        pushed = push(item);
        if(pushed){
            System.out.println("Item 2 was pushed succesfully");
        } else {
            System.out.println("Item 2 was not pushed succesfully");
        }

        //peek method to return top of stack 
        System.out.println("The top item on the stack is: " + peek());

        //push item 3 to stack
        item = 3;
        pushed = push(item);
        if(pushed){
            System.out.println("Item 3 was pushed succesfully");
        } else {
            System.out.println("Item 3 was not pushed succesfully");
        }

        //display length of stack
        System.out.println("The length of the stack is: " + length);

        System.out.println("");

        //pop top of stack and return popped value
        System.out.println("The item popped was: " + pop());

        //peek method to display top of stack
        System.out.println("The top item on the stack is: " + peek());

        System.out.println("");

        //push item 4 to stack
        item = 4;
        pushed = push(item);
        if(pushed){
            System.out.println("Item 4 was pushed succesfully");
        } else {
            System.out.println("Item 4 was not pushed succesfully");
        }

        System.out.println("");

        //print all items in stack
        printStack();

        System.out.println("");

        //push item 5 to stack
        item = 5;
        pushed = push(item);
        if(pushed){
            System.out.println("Item 5 was pushed succesfully");
        } else{
            System.out.println("Item 5 was not pushed succesfully");
        }

        //pop top of stack and display popped value
        System.out.println("The item popped was: " + pop());
        
        //push item 6 to stack
        item = 6;
        pushed = push(item);
        if(pushed){
            System.out.println("Item 6 was pushed succesfully");
        } else{
            System.out.println("Item 6 was not pushed succesfully");
        }

        System.out.println("");

        //print all items in stack 
        printStack();

        System.out.println("");

        //pop top of stack and display popped value
        System.out.println("The item popped was: " + pop());

        //call isEmpty to display whether stack is empty or not
        System.out.println("The stack is empty: " + isEmpty());

        System.out.println("");

        //pop top of stack 3 times consecutively 
        System.out.println("The item popped was: " + pop());

        System.out.println("The item popped was: " + pop());

        System.out.println("The item popped was: " + pop());
        
        //call isEmpty to display whether stack is empty or not
        System.out.println("The stack is empty: " + isEmpty());

    }

    //method to resize stack
    public static void stackResize(){
        
        int itemIndex;
        //calculate newSize 
        int newSize = 2 * allocationSize;
        
        //make sure newSize does not exceed maxLength
        if(maxLength > 0){
            newSize = Math.min(newSize,maxLength);
        }

        //create new stack with newSize
        int[] newStack = new int [newSize];
        
        //copy elements to new stack
        for(int i = 0; i < length; ++i){
            newStack[i] = stack[i];
        }

        //update stack to reference new stack
        stack = newStack;
        allocationSize = newSize;
    }

    //method to push items to stack
    public static boolean push(int item){
        //check if stack reached maxLength
        if(length == maxLength){
            return false;
        }

        //check if stack needs to be resized
        if(length == allocationSize){
            stackResize();
        }

        //add item to top of stack
       stack[length] = item;
       topIndex = length;
        length++;
       return true;
    }

    //mehtod to pop top element of stack 
    public static int pop(){
       //check if stack is empty
        if(isEmpty()){
        System.out.println("Stack is empty");
       }
       //assign popped item with top element
       int popped = stack[topIndex];
       length--;
       topIndex--;
       return popped;
    }

    //method to determine if stack is empty
    public static boolean isEmpty(){
        return topIndex == -1;
    }

    //method to print all elements in stack
    public static void printStack(){
        //check if stack is empty
        if(isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("The Stack contents are the folllowing: ");
            //itirate through each element of stack and display
            for(int i = topIndex; i >= 0; --i){
                System.out.println(stack[i]);
            }
        }
    }

    //method that returns top element of stack
    public static int peek(){
        //check if stack is empty
        if(isEmpty()){
            System.out.println("Stack is empty");
        } 
        //return top element of stack 
        return stack[topIndex]; 
    }     
}