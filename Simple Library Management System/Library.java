public class Library {
    private Book books[] = new Book[150];
    private Student student[] = new Student[100];
    public Library(Book[] books, Student[] student) {
        this.books = books;
        this.student = student;
    }
    public void displayBooks(){
        for(int i=0;i<books.length;i++){
            if(books[i].title!=null) {
                books[i].display();
            }
        }
    }
    private Book findBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle()== title) {
                return books[i];
            }
        }
        return null;
    }
    public void borrowBook(String title, Student student) {
        Book book = findBook(title);
        if (book != null && book.numCopies !=0 ) {
            book.borrow();
            student.borrowBook(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void addStudent(Student newStudent){
        for(int i=0;i<student.length;i++){
            if(student[i]==null) {
                student[i]= newStudent;
            }
        }
    }

    public void addBook(Book newBook){
        Book book = findBook(newBook.title);
        if(book != null) {
            book.numCopies++;
        }
        else{
            for(int i=0;i<books.length;i++){
                if(books[i].title==null) {
                    books[i]= newBook;
                    break;
                }
            }
        }
    }
    public void returnBook(String title , Student student){
        Book book = findBook(title);
        if (book != null) {
            book.returnBook();
            student.returnBook(book);
        }
        else {
            System.out.println("Library Error : the Book have not been issued \n\n");
        }
    }
}

