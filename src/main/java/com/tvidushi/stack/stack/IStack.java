package com.tvidushi.stack.stack;

import com.tvidushi.stack.exception.StackOverFlowException;
import com.tvidushi.stack.exception.StackUnderFlowException;

public interface IStack<T> {
	
	public void push(T num) throws StackOverFlowException;

	public T peek() throws StackUnderFlowException ;
	public T pop() throws StackUnderFlowException;
	public boolean isEmpty();
	public boolean isFull();
	
}
