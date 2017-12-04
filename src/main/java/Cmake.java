public class Cmake extends Object {
    private int id;
    public Cmake(int id) {
        this.id = id;
        System.out.println("Cmake object: " + id + "is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cmake object: " + id + "is disposed");
    }
}
