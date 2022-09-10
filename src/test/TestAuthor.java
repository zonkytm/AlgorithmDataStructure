package test;


import Main.Author;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestAuthor extends TestCase {
    private Author author;

    @BeforeEach
    protected void setUp() throws Exception {
        author=new Author();
        author.setEmail("_@gmail.com");
        author.setName("name");
        author.setGender('m');

    }
    @Test
    public void TestName() {
        Assertions.assertEquals("name",author.getName());
    }

    @Test
    public void TestEmail(){
        Assertions.assertEquals("_@gmail.com",author.getEmail());
    }

    @Test
    public void TestGender() {
        Assert.assertEquals('m',author.getGender());
    }
    @Test
    public  void TestNameNotNull(){
        Assertions.assertNotNull(author.getName());
    }
    @Test
    public  void TestEmailNotNull(){
        Assertions.assertNotNull(author.getEmail());
    }
    @Test
    public  void TestGenderNotNull(){
        Assertions.assertNotNull(author.getGender());
    }


}
