package com.tvidushi.stack.stack;

import com.tvidushi.stack.exception.StackOverFlowException;
import com.tvidushi.stack.exception.StackUnderFlowException;




public class StackLlistImpl<T> implements IStack{
	     Node head;
	

	public StackLlistImpl(Node node) {
		this.head = node;
	}
	
	


	public void push(Object num) throws StackOverFlowException {
			if(head == null){
				head = new Node(num,null);
				return;
			}	
			Node previous = head;
			head = new Node(num,previous);

		}
		 



	public T peek() throws StackUnderFlowException {
		if(head == null) throw new StackUnderFlowException("Stack is empty ");
		return (T) head.data;
	}


	public T pop() throws StackUnderFlowException {
		if(isEmpty()) throw new StackUnderFlowException("") ;
		T value = (T) head.data;
		head = head.next;
		return value;
	}

	public boolean isEmpty() {

		return false;
	}




	public boolean isFull() {
	
		return false;
	}



	public static class Node<T> {
			
			Node next;
			T data;
			
			public Node(T data, Node node){
					this.next = node;
					this.data = data;
		    }
		}


}
