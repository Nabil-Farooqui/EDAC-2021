
public class StaticSimpleExample 
{
				int x1=10;
				static int x2=20;
				
				
				
	public static void main(String[] args) 
	{
		StaticSimpleExample object=new StaticSimpleExample();
		//normal output
		System.out.println("object.x1");
		System.out.println("object.x2");
		//now we changed values
		object.x1=200;
		object.x2=300;
		System.out.println(object.x1);
		System.out.println(object.x2);
		StaticSimpleExample object2=new StaticSimpleExample();
		System.out.println(object2.x1);
		System.out.println(object2.x2);
// static value remain same
	}

}
