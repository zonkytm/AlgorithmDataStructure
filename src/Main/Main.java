package Main;

public class Main {

    public static void main(String[] args) {
        Author author=new Author("John","John@yandex.ru",'m');
        TestAuthor testAuthor=new TestAuthor();
        testAuthor.setAuthorToTest(author);



    }
}
