package Books;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> BookShelf;

    public BookShelf() {
        BookShelf = new ArrayList<Book>(0);
    }

    public BookShelf(int len){
        BookShelf=new ArrayList<Book>(len);
    }

    public void addBook(Book book){
        BookShelf.add(book);
    }

    public Book getMaxDateBook(){
        Book maxBook=new Book();
        for(int i=0;i<BookShelf.size();i++){
            if(maxBook.getDate()<BookShelf.get(i).getDate()){
                maxBook=BookShelf.get(i);
            }
        }
        return maxBook;
    }
    public Book getMinDateBook(){
        Book minBook=new Book();
        minBook.setDate(10000);
        for(int i=0;i<BookShelf.size();i++){
            if(minBook.getDate()>BookShelf.get(i).getDate()){
                minBook=BookShelf.get(i);
            }
        }
        return minBook;
    }

    public void sortBookShelf(){

        for(int left=0;left<BookShelf.size();left++){
            Book value=BookShelf.get(left);
            int i=left-1;
            for(;i>=0;i--){
                if(value.compareTo(BookShelf.get(i))<0){

                    BookShelf.set(i+1,BookShelf.get(i));
                }
                else{break;}
            }
            BookShelf.set(i+1,value);


        }
        System.out.println(BookShelf.toString());
    }


}
