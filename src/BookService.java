public class BookService {

    private boolean[] checkBook;
    private Book book;

    public BookService() {
        this.checkBook = new boolean[10];
        for (int i = 0; i < 10; i ++) {
            checkBook[i] = false;
        }
    }

    public void addBook(Book book) {
        this.book = book;
        for (int i = 0; i < 10; i ++) {
            if (!checkBook[i]) {
                checkBook[i] = true;
                break;
            }
        }
    }

    public  void checkBookCount() {
        book.setCount(hashvel());
    }

    private int hashvel() {
        int count = 0;
        for (int i = 0; i < 10; i ++) {
            if (checkBook[i]) {
                count++;
            }
        }
        return count;
    }
    public void deleteBook(Book book){
        this.book = book;
        int count = book.getCount();
        if (count > 0)
        book.setCount(count - 1);
        for (int i = checkBook.length - 1; i >= 0; i--) {
            if (checkBook[i]) {
                checkBook[i] = false;
                break;
            }
        }
    }
}
