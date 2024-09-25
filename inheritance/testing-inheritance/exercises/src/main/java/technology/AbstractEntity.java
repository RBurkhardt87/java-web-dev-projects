package technology;

public abstract class AbstractEntity {

    //TODO: create a variable to keep count of objects instantiated
    private static int objectCount = 0;
    private int id;

    public static int getObjectCount() {
        return objectCount;
    }

    public static void setObjectCount(int objectCount) {
        AbstractEntity.objectCount = objectCount;
    }

    public int getId() {
        return id;
    }



    //TODO: even tho we aren't created objects from this class, make a constructor
    //Do I make a constructor in the abstract class to keep counts of the different objects?
    public AbstractEntity() {
        objectCount++;
    }



    //TODO: Create an abstract method to be overridden in other classes
    abstract String objectId();

}
