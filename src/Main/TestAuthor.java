package Main;

public class TestAuthor {
    private Author AuthorToTest;

    public void setAuthorToTest(Author authorToTest) {
        AuthorToTest = authorToTest;
        System.out.println(AuthorToTest.getName()+" "+" "+AuthorToTest.getEmail()+" "+AuthorToTest.getGender());
        System.out.println(AuthorToTest.toString());
    }
}
