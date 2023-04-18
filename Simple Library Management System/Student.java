public class Student {
    private String name;
    private int ID;
    public Book borrowbooks[] = new Book[100];

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        for(int i=0;i<borrowbooks.length;i++){
            borrowbooks[i] = new Book();
        }
    }

    public void display() {
        System.out.println("Student name : " + name + "\n" + "Student ID : " + ID + "\n" + "list of borrow books");
        for (int i = 0; i < borrowbooks.length; i++) {
            if (borrowbooks[i].title != null && borrowbooks[i].numCopies > 0) {
                System.out.println(borrowbooks[i].getTitle() + " ");
            }
        }
    }
    private void copyBook(Book  oldBook, Book newBook){
        oldBook.numCopies= 1;
        oldBook.title=newBook.title;
        oldBook.author=newBook.author;
        oldBook.ISBN=newBook.ISBN;
    }
    public void borrowBook(Book book) {
        int i = 0, flag = 0;
        for (i = 0; i < borrowbooks.length; i++) {
            if (borrowbooks[i].title == book.title) {
                borrowbooks[i].numCopies++;
                flag = 1;
            }
        }
        if (flag == 0) {
            for (i = 0; i < borrowbooks.length; i++) {
                if (borrowbooks[i] == null) {
                    copyBook(borrowbooks[i],book);
                    borrowbooks[i].numCopies = 1;
                }
            }
        }
    }

    public void returnBook(Book book){
        int i = 0, flag = 0;
        for (i = 0; i < borrowbooks.length; i++) {
            if (borrowbooks[i].title == book.title) {
                borrowbooks[i].numCopies--;
                if(borrowbooks[i].numCopies == 0) borrowbooks[i] = null;
                flag = 1;
            }
        }
        if(flag == 0) System.out.println("Students Error : I do not have that book\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public Book[] getBorrowbooks() {
        return borrowbooks;
    }
    public void setBorrowbooks(Book[] borrowbooks) {
        this.borrowbooks = borrowbooks;
    }
}


