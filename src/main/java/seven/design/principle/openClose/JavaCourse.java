package seven.design.principle.openClose;

public class JavaCourse implements Icourse{

    private Long id;

    private String name;

    private Double price;

    public JavaCourse(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
