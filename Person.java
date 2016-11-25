package adressbook;

import java.io.Serializable;


public class Person implements Serializable, Comparable<Person>{
    String firstName;
    String lastName;
    String adress;
    String telephoneNumber;

    public Person(String firstName, String lastName, String adress, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return firstName +" "+  lastName +" "+ adress +" "+ telephoneNumber;
    }

 
    @Override
    public int compareTo(Person o) {
        int compare = lastName.compareTo(o.lastName);
        if(compare == 0){
            compare = firstName.compareTo(o.firstName);
        }
        return compare;
    }

    
}
