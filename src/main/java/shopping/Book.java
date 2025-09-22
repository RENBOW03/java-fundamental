package shopping;

public class Book {
    private int id;
    private String name;
    private int isbn;

    public Book() {
    }

    public Book(int id, String name, int isbn) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
