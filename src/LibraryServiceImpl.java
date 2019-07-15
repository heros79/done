import java.util.Date;
import java.util.List;

public class LibraryServiceImpl implements LibraryService{

    Library library;

    public LibraryServiceImpl(Library library) {
        this.library = library;
    }

    public boolean checkOpenOrClose(Date date) {
        checkOpenOrClose(date);
        return library.isOpen();
    }

    private void cahngeOpenOrCloseStatus(Date date) {
        if (date.getHours() > OPEN_HOUR && date.getHours() < CLOSE_HOUR) {
            library.setOpen(true);
        }
    }

    public void addBook(Book book) {

        List<Book> list = library.getBookList();
        list.add(book);
        library.setBookList(list);
    }



}
