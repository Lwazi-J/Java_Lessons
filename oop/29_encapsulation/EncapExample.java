/* In java we borrow the word encapsulation and use it to describe a class that
 * hides its member(instance) variables by assigning then access modifier private or protected. */

public class EncapExample {
    private String name;
    private String surname;


    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
}

