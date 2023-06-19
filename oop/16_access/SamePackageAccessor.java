/* Create a class called SamePackageAccessor.
 *place it in the za.access package.
 *Create a bean-style getter method called getProperty() this method must create an instance of AccessMe and get the name from it using the getName method */


public class SamePackageAccessor {
    public String getProperty() {
        AccessMe accessMe = new AccessMe();
        return accessMe.getName();
    }
}
