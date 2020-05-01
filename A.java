class Test{
	public static void main(String [] args){
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		sb1.append(" world ");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("String");
		System.out.println(sb2);
		sb2.append(" Builder ");
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
		
		
		
	}
}
