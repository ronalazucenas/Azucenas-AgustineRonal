public class PersonDemo {
   public static void main(String[] args){
      Person person = new Person();
     
    
      person.setFirstName("Agustine Ronal"); 
      person.setMiddleName("Cordero");
      person.setLastName("Azucenas");
      person.setAge(19);
      person.setBday("December 19,2003");
      person.setAddress("Inayawan Cebu City"); 
      
      
     System.out.println("First Name: " +person.getFirstName());
     System.out.println("Middle Name: " +person.getMiddleName());
     System.out.println("Last Name: " +person.getLastName());
     System.out.println("Age: " +person.getAge());
     System.out.println("BirthDay: " +person.getBday());
     System.out.println("Address: " +person.getAddress());
   
 
 }
}