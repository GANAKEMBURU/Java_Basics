class Typecastingexp1{
	public static void main(String[] args){
		int a=97;
		System.out.println(a);
		a=(int)98.98;
		System.out.println(a);
		double b=98.98;
		System.out.println(b);
		b=(int)b ;
		System.out.println(b);
		int c=(int)b;
		System.out.println(c);
	}
}
