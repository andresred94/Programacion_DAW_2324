package probandoTreeMap;

public class MyObject {
	private int id;
    private String name;

    public MyObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyObject{id=" + id + ", name='" + name + "'}";
    }
}
