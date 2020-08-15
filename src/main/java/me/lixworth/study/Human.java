package me.lixworth.study;

public class Human {
	private int height = 170;

	public Human(int h){
		this.height = h;
		System.out.println("I was born...");
	}

	public Human(int h,String text){
		this.height = h;
		System.out.println(text);
	}
	private void breath()
	{
		System.out.print("hu...hu...");
	}

	/**
	 * ohhhhhhh
	 * @return int
	 */
	int getHeight()
	{
		return this.height;
	}

	public void growHeight(int h)
	{
		this.height = height+h;
	}

	public void repeatBreath(int rep)
	{
		int i;
		for(i = 0;i<rep;i++){
			this.breath();
		}
	}
}
