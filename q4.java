class Flea {
   
   // Properties of the class...
   public String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public String name;
   private int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   
   // Methods of the class...
   public String toString() {
      return "I am a dog called " + name + " of " + age + " years old, and " + dogsFlea.name + " is my flea!";
   }

}

class DogOwner {

   // Properties of the class...
   private String name;
   private int    salary;
   public Dog   ownersDog;

   // Constructor of the class...
   public DogOwner(String aName, int anSalary, Dog aDog) {
      name      = aName;
      salary    = anSalary;
      ownersDog = aDog;
   }

   // Methods of the class...
   public String toString() {
      return "I am a dog owner called " + name + " with a salary of " + salary + " and a dog called " + ownersDog.name + "!";
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Flea Pop = new Flea("Pop");
      Flea Squeak = new Flea("Squeak");
      Flea Zip = new Flea("Zip");

      Dog Rex = new Dog("Rex", 8, Pop);
      Dog Jimbo = new Dog("Jimbo", 4, Squeak);
      Dog Fido = new Dog ("Fido", 6, Zip);

      DogOwner Angus = new DogOwner("Angus", 40000, Rex);
      DogOwner Brian = new DogOwner("Brian", 60000, Jimbo);
      DogOwner Charles = new DogOwner("Charles", 50000, Fido);

      System.out.println(Rex.toString());
      System.out.println(Angus.toString());
      System.out.println(Angus.ownersDog.dogsFlea.toString());

   }
}
