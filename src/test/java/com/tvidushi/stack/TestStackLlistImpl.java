/**
 * 
 */
package com.tvidushi;

import org.junit.Test;

import com.tvidushi.stack.exception.StackOverFlowException;
import com.tvidushi.stack.exception.StackUnderFlowException;
import com.tvidushi.stack.stack.IStack;
import com.tvidushi.stack.stack.IStackArray;
import com.tvidushi.stack.stack.StackArrayImpl;
import com.tvidushi.stack.stack.StackLlistImpl;
import com.tvidushi.stack.stack.StackLlistImpl.Node;

import junit.framework.TestCase;

/**
 * @author takshila.vidushi
 *
 */
public class TestStackLlistImpl extends TestCase {


	StackLlistImpl stack = new StackLlistImpl(new Node(90,null));
		
	   public void setup() {

	   }	
	   
	   @Test
	   public void testPush() {	
		   try {
			   stack.push(45);
			   stack.push(89);;
		} catch (StackOverFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	   }

	   @Test
	   public void testPeek() {	
		   try {
			   stack.peek();
		} catch (StackUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
	   
	   
	   @Test
	   public void testPop() {	
		   try {
			   stack.pop();
			   //stack.pop();
		} catch (StackUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
	   

	   @Test(expected =StackUnderFlowException.class)
	   public void testPop1() {	
		   try {
			   stack.pop();

		} catch (StackUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
	   
	   
	
	   
}
