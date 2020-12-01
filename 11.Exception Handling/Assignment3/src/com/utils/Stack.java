package com.utils;

import java.util.Arrays;

public class Stack {
	int [] array;
	int top,size;
	
	public Stack() {
		super();
	}

	public Stack(int size) {
		super();
		this.top = -1;
		this.size = size;
		this.array=new int[size];
	}
	public void push(int data)
	{
		if(!isFull())
		{
			top++;
			array[top]=data;
		}
		else
			throw new RuntimeException("Stack is Full");
		
	}
	public int pop()
	{
		if(!isEmpty())
		{
			int data=array[top];
			top--;
			return data;
		}
		else
			throw new RuntimeException("Stack is Empty");
	}
	public boolean isEmpty()
	{
		if(size==-1)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Stack" + Arrays.toString(array);
	}
	
	
}
