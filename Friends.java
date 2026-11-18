import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

   // declare and initialize the ArrayList
   ArrayList<Name> friends = new ArrayList<>();
   // declare and initialize the Random class
   Random r = new Random();
   
   // the constructor
   public void addFriend (String first, String middle, String last) {
       // add three names to the ArrayList
        Name n = new Name(first, middle, last);
        friends.add(n);
   }
   
   public void printRandomFriend(){
       //return a random Name object from the List
       //return friends.get(r.nextInt(friends.size()-1));
       System.out.println(friends.get(r.nextInt(friends.size())).fullName());
    }
   
  
}