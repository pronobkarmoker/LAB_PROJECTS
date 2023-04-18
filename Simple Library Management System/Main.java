public class Main {
    public static void main(String[] args) {
        Book Books[];
        Books = new Book[50];
        Student student[];
        student = new Student[10];
        for(int i=0;i<50;i++){
            Books[i] = new Book(null,null,null,0);
        }
        Books[0] = new Book("To Kill", "Harper", "9780061120084", 5);
        Books[1] =new Book("1984", "George ", "9780451524935", 3);
        Books[2] =new Book("Pride", " Austen", "9780486284736", 7);
        Books[3] = new Book("The Catcher", "Salinger", "9780316769488", 4);
        Books[4] =new Book("The Great", "shuvo", "9780743273565", 6);
        Books[5] = new Book("Animal ", "Orwell", "9780452284241", 2);

        student[0] = new Student("shuvo", 1001);
        student[1] = new Student("kobir", 1002);
        student[3] = new Student("rabby", 1003);

        Book book = new Book("comedy","kobi","9933223455222",33);
        Student studentadd = new Student("kobi",2233);
        Library lib = new Library(Books,student);
        lib.addBook(book); // add divine comedy to the library
        lib.addStudent(studentadd); // add studentadd to the library
        lib.borrowBook("The great",student[1]); //issues this bool to Mary and reduces its number
        lib.displayBooks();
        lib.returnBook("The great",student[1]);
        lib.returnBook("ddd",student[1]);
        lib.displayBooks();
    }
}

