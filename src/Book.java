import java.util.Date;

public class Book {

    private String name;
    private String author;
    private Date giveDay;
    private Date takeDay;
    private boolean status;
    private int count;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getGiveDay() {
        return giveDay;
    }

    public void setGiveDay(Date giveDay) {
        this.giveDay = giveDay;
    }

    public Date getTakeDay() {
        return takeDay;
    }

    public void setTakeDay(Date takeDay) {
        this.takeDay = takeDay;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
