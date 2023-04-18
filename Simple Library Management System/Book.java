public class Book {
    String title, author, ISBN;
    int numCopies;
    public Book(String title, String author, String ISBN, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numCopies = numCopies;
    }

    public Book() {
        this.title = null ;
    }

    public void borrow(){
        if(numCopies > 0){
            this.numCopies--;
        }
        else {
            System.out.println("Error: Book not available for borrowing");
        }
    }
    public void returnBook(){
        this.numCopies++;
    }
    public void display(){
        System.out.println("Title : " + title + "\n"+"Author : " +author+"\n"+"ISBN : " + ISBN +"\n"+"Number of copies available :" + numCopies +"\n");
    }
    public String getTitle() {
        return title;
    }
}


