package com.spring5;


public class drawShape {
	
	private String shape;
	
	public void DrawShape()
	{
		System.out.println("Drawing shape....");
		System.out.println(getShape() + " is drawn");
	}
	
	public String getShape()
	{
		return shape;
	}
	
	public void setShape(String shape)
	{
		this.shape = shape;
	}

}
