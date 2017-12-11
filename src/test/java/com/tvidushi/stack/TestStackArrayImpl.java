/**
 * 
 */
package com.tvidushi;

import org.junit.Test;

import com.tvidushi.stack.exception.StackOverFlowException;
import com.tvidushi.stack.exception.StackUnderFlowException;
import com.tvidushi.stack.stack.IStackArray;
import com.tvidushi.stack.stack.StackArrayImpl;

import junit.framework.TestCase;

/**
 * @author takshila.vidushi
 *
 */
public class TestStackArrayImpl extends TestCase {

		
	IStackArray st = new StackArrayImpl(-1,10,new Integer[10]); 
		

	   
	   @Test
	   public void testPush() {	
		   try {
			st.push(45);
			st.push(89);;
		} catch (StackOverFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	   }

	   @Test
	   public void testPeek() {	
		   try {
			st.peek();
		} catch (StackUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
	   
	   
	   @Test
	   public void testPop() {	
		   try {
			st.pop();
			st.pop();
			st.pop();
		} catch (StackUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
	   

	   @Test(expected =StackUnderFlowException.class)
	   public void testPop1() {	
		   try {
			st.pop();

		} catch (StackUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
	   
	   
	
	   
}
