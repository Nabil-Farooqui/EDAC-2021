
public class ArrayOfObject {

	//.............. Calling ByMethod Java

		String name;
		int age;
		
		
		void studObj (String n, int a)
		{
			name=n;
			age=a;
		}
		void display()
		{
			System.out.println(name+"  "+age);
		}
		
		public static void main(String[] args)
		{
			ArrayOfObject student=new ArrayOfObject();     // creating a object
			student.studObj("Nabil", 24);					
			student.display();										//calling function through objects
			
		}

}

