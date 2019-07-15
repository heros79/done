import java.util.Scanner;

public class MainService {

    Scanner scanner = new Scanner(System.in);
    private Menu menu = new Menu();
    private Library library = new Library();
    private LibraryService libraryService = new LibraryServiceImpl(library);
    private BookService bookService = new BookService();
    private void addNewBook(){
        System.out.println("Enter Book Name");
        Book book = new Book(scanner.nextLine());
        bookService.addBook(book);
        bookService.checkBookCount();
        libraryService.addBook(book);
        menu.choiceAdminMenu();
        scanner.nextInt();

    }
    private void deleteBook(){

    }
    public void Start() {
   /*     while (true) {
            menu.choiceMainMenu();

            if (scanner.nextInt() == 2) {
                menu.choiceAdminMenu();
                if (scanner.nextInt() == 1) {
                    addNewBook();
                    if (scanner.nextInt()!=1){
                        continue;
                    }
                }
                if (scanner.nextInt() == 2) {
                    deleteBook();



                }
                if (scanner.nextInt() == 3) {
                    menu.choiceAdminMenu();
                }
            }
        }*/

        while (true) {
            menu.choiceMainMenu();

            switch (scanner.nextInt()) {
                case 1: {
                    while (true) {
                        menu.choiceAdminMenu();
                        switch (scanner.nextInt()) {
                            case 1: {

                            }
                            case 2: {

                            }
                            case 3:{
                                break;
                            }
                            default:{

                            }
                        }
                    }
                }
                case 2: {

                }
                case 3: {
                   break;
                }
                default: {
                }
            }
        }
    }
}
