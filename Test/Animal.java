//Multiple Methods 

public class Animal
{

	public void eat()    //method 1
	{
		System.out.println("1. Eats alot");
	}
	 public void run()   //method 2
	 {
		 System.out.println("2. Run around in house");
	 }
	 public void sleep()  //method 3
	 {
		 System.out.println("3. Sleep inside house");
	 }
	 public void play()  //method 4
	 {
		 System.out.println("4. He loves to play catch");
	 }
	 
	 
	 
	
	public static void main(String[] args) 
	{
		System.out.println("My Dog usually");
		
		Animal dog=new Animal();
		dog.eat();
		dog.run();
		dog.sleep();
		dog.play();
	}

}
