package deep;

public class Person {
	
	String name;
	int age;
	
		public Person(String name, int age) {
			this.name= name;
			this.age= age;
		}
		
		public boolean isAdult() {
				return age>=18;
			}
		
		public void birthday() {
			age+=1;
		}
		
		public void introduce() {
			
			System.out.println("Hi my name is " + name + " and I am " + age + " years old.");
		}

}
