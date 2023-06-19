/* Create a class called ExtenderAccessor.
 * place it in the za.access package.
 * make sure it extends AccessMe.
 * Create a bean-style getter method called getProperty() this method must get the name from the super-class using the getName method */


public class ExtenderAccessor extends AccessMe {
    public String getProperty() {
        return getName();
    }
}

