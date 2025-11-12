public  class  TestRandom {
	public static void main(String[]  args) {

		int n = Integer.parseInt(args[0]);
		int above = 0;
		int under = 0;
		for (int i = 0; i < n; i++) 
			{  if (Math.random()>0.5)
				{
					above++;
				}
				else 
				{
					under++;
				}
			}
		System.out.println("> 0.5 " + above + " times" );
		System.out.println("<= 0.5 " + under + " times" );
		System.out.println("ratio " + (double)under/above);

}
}

