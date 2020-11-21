package booklending;

public class Books {

    private int bookCategory;
    private int bookCode;
    private String name;

    public Books() {

    }

    public Books(int bookCategory, int bookCode, String name) {
        this.bookCategory = bookCategory;
        this.bookCode = bookCode;
        this.name = name;
    }

    public Books(int bookCode, String name) {
        this.bookCode = bookCode;
        this.name = name;
    }

    public Books(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setBookCategory(int bookCategory) {
        this.bookCategory = bookCategory;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookCategory() {
        return bookCategory;
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public void displayBooks() {
        System.out.println("Book Category : " + this.bookCategory);
        System.out.println("Book Code : " + this.bookCode);
        System.out.println("Book Name : " + this.name);
    }

    @Override
    public String toString() {
        return "BOOK { " + "Category = " + bookCategory + ", Code = " + bookCode + ", Name = " + name + " }";
    }

}
