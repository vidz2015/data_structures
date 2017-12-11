package com.tvidushi.stack;

import com.tvidushi.stack.exception.StackOverFlowException;
import com.tvidushi.stack.exception.StackUnderFlowException;
import com.tvidushi.stack.stack.IStack;
import com.tvidushi.stack.stack.IStackArray;
import com.tvidushi.stack.stack.StackArrayImpl;
import com.tvidushi.stack.stack.StackLlistImpl;
import com.tvidushi.stack.stack.StackLlistImpl.Node;


public class TestClient {

	public static  <T> void main(String[] args) {
		
		try {

		
		IStackArray st = new StackArrayImpl(-1,10,new Integer[10]); 
		
             st.push(45);
             st.push(458);
             st.push(4);
             st.push(5);
             st.push(47);
			System.out.println(st.pop());
			//System.out.println(""+st.peek());
			
			StackLlistImpl stack = new StackLlistImpl(new Node(90,null));
		} catch (StackOverFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StackUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
