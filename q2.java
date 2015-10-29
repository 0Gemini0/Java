class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private int hands;
   
    
   // Constructor of the class...
   public Person(String aName, int anAge, int noHands) {
      name = aName;
      age  = anAge;
      hands = noHands;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and I have " + hands + " hands");
	  commentAboutAge();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
	  if (age > 60) {
         System.out.println("old person");
      }
   }

   public void growOlder() {
      age++;
   }

   public void growOlderBy(int years) {
      age = age + years;
   }

   public void giveKnightnood() {
      name = "sir " + name;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();

      System.out.println("and my age is " + ls.age);
      
	  ls.talk();
      wp.talk();

      wp.growOlder();
      ls.growOlderBy(10);
	  wp.giveKnightnood();
   }
}
