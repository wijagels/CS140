package lab07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Driver {
    public static void main(String[] args) throws IOException {
        Book2Tester tester = new Book2Tester();
        try (
                FileOutputStream outfile = new FileOutputStream("books.txt", true);
                PrintWriter output = new PrintWriter(outfile)) {
            do {
                Book2 book = tester.getBook();
                String title = book.getTitle();
                title = title.replace('\t', ' ');
                output.println(title + '\t' + book.getPageCount() +
                        '\t' + book.isRequired() + '\t' + book.getBookmark());
                output.flush();
            } while (tester.getMoreBooks());
        }
    }
}
