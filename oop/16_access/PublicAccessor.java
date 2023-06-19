/* Create a class called PublicAccessor.
 * Do not place it in any package.
 * Create a bean-style getter method called getProperty() this method must create an instance of AccessMe and get the name from it using the getName method */


public class PublicAccessor {
    public String getProperty() {
        AccessMe accessMe = new AccessMe();
        return accessMe.getName();
    }
}

