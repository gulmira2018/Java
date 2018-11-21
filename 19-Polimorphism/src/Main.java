
public class Main {

	
	public static void main (String[] args){
		
//		Dog d1=new Dog();
//		d1.speak();
//		
//		
//		Cat c1=new Cat();
//		c1.speak();
//		
//		Bird b1=new Bird();
//		b1.speak();
		//polimorhism
		
//	-------------------------------------	
//		Animal a1=new Dog();
//		a1.speak();
//		Animal a2=new Cat();
//		a2.speak();
//		Animal a3=new Bird();
//		a3.speak();
		//dog is speaking
				//cat can speak
				//Bird is speaking
		///still 3 object you have, polim only 1 obj
//-----------------------
		
	
		
		Animal a=new Dog();
		a.speak();
		
		a=new Cat();
		a.speak();
		
		a=new Bird();
		a.speak();
		//same output 
		//dog is speaking
		//cat can speak
		//Bird is speaking
//--------------------------------------------
		//polimorh need cuz its save some space in memory
		// 1 obj and can 
		//garbage collection Dog, cat,bird.... you moving next line ,previous line is gone, 
		//deleted in garbage collections, if you need dog again, create a new dog.
	}
	
	
	
}
