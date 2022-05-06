package package1;

 class Class1 {
	
   Class1(int a)
	{
	  
		System.out.println("This is Default constructor");
		System.out.println(a);
		
	}
  Class1(String s, int b)
  {
	  System.out.println(s);
	  System.out.println(b);
  }
	
	public static void main(String[] args) {
		Class1 obj = new Class1(10);
		Class1 obj2 = new Class1("Akhilesh" , 10);
		
		
	}
}
