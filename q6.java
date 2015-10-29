class CartoonCharacter {

   // Properties of the class...
   public static int count;
   private String name;
   public String favouriteColour;
   private int    favouriteNumber;

   // Constructor of the class...
   public CartoonCharacter(String aName, String aColour, int aNumber) {
      name            = aName;
      favouriteColour = aColour;
      favouriteNumber = aNumber;
      count++;
   }

   // Methods of the class...
   public void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class CartoonTest { 

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      CartoonCharacter Fred = new CartoonCharacter("Fred Flintstone", "blue", 2);
      CartoonCharacter Wilma = new CartoonCharacter("Wilma Flintstone", "red", 8);
      CartoonCharacter Barney = new CartoonCharacter("Barney Rubble", "yellow", 5);

      Fred.displayMe();
      Wilma.displayMe();
      Barney.displayMe();

      System.out.println(Barney.favouriteColour); 
      System.out.println(CartoonCharacter.count);
      System.out.println(Math.PI);     
   
   }
}
