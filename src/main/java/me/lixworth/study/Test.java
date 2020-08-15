package me.lixworth.study;


public class Test{
	public static void main(String[] args)
	{
		Human aPenson = new Human(5);
//		aPenson.breath();
//		System.out.print(aPenson.height);
		aPenson.growHeight(10);
		System.out.println(aPenson.getHeight());
		aPenson.repeatBreath(6);

		Human bPenson = new Human(180,"fUCK");
		System.out.println(bPenson	.getHeight());

	}
}