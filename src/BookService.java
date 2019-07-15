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
}
