package Books;

public class Book implements Comparable<Book> {
    private String Name;
    private  int Date;
    private String Author;

    Book(){
        Name=null;
        Date=0;
        Author=null;
    }

    public Book(String name, int date, String author) {
        Name = name;
        Date = date;
        Author = author;
    }

    public String getName() {
        return Name;
    }



    public int getDate() {
        return Date;
    }


    public String getAuthor() {
        return Author;
    }



    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Date=" + Date +
                ", Author='" + Author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return o.Date>=Date? -1:0;
    }

    public void setName(Object o) {
    }
}
