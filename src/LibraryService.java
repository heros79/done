import java.util.Date;

public interface LibraryService {

    int OPEN_HOUR = 9;
    int CLOSE_HOUR = 18;
    boolean checkOpenOrClose(Date date);
    void addBook(Book book);
}
