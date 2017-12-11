package com.tvidushi.stack.stack;

import com.tvidushi.stack.exception.StackOverFlowException;
import com.tvidushi.stack.exception.StackUnderFlowException;

public interface IStackArray {
	
	public void push(Integer num) throws StackOverFlowException;
	public Integer peek() throws StackUnderFlowException ;
	public Integer pop() throws StackUnderFlowException;
	public boolean isEmpty();
	public boolean isFull();
	
}
