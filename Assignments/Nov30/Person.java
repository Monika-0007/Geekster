package objects;

public class Person {
	 // fields
	   private String name;
	   private String email;
	   private String phoneNumber;

	   //constructor
	   public Person(String theName)
	   {
		   //Constructor Chaining
		  this("sana@gmail.com","080 256-1353");
	      this.name = theName;
	   }
	   
	   //****************************************
	   //parameterized constructor(Newly added)
	   public Person(String theEmail,String thePhoneNumber)
	   {
	      this.email = theEmail;
	      this.phoneNumber=thePhoneNumber;
	   }
	   public Person(String theName,String theEmail,String thePhoneNumber)
	   {
		  this.name = theName;
	      this.email = theEmail;
	      this.phoneNumber=thePhoneNumber;
	   }
	   //default constructor
	   public Person()
	   {
		  System.out.println("DEFAULT CONSTRUCTOR");
	   }//Modified Part**************************
	   
	   // methods - getters
	   public String getName() { return this.name;}
	   public String getEmail() { return this.email;}
	   public String getPhoneNumber() { return this.phoneNumber;}

	   // methods - setters
	   public void setName(String theName) { this.name = theName;}
	   public void setEmail(String theEmail) {this.email = theEmail;}
	   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
	   public String toString()
	   {
	      return this.name + " " + this.email + " " + this.phoneNumber;
	   }

	   // main method for testing
	   public static void main(String[] args)
	   {
		  System.out.println("NAME \t EMAIL \tPHONE NUMBER");
	      Person p1 = new Person("Sana");
	      System.out.println(p1+"\n");
	      Person p2 = new Person("Jean");
	      p2.setEmail("jean@gmail.com");
	      p2.setPhoneNumber("404 899-9955");
	      System.out.println(p2+"\n");
	      
	      //*********
	      Person p3 = new Person("Jay","jay14@gmail.com","020 856-4739");
	      System.out.println(p3+"\n");
	      Person p4 = new Person();
	      System.out.println(p4);
	   }


}
