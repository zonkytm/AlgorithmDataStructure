package test;

import Ball.Ball;
import junit.framework.TestCase;
import org.junit.jupiter.api.*;

public class TestBall  {
    private Ball ball;
    private double  x;
    private double y;
    @BeforeEach
    protected void setUp(){
        ball=new Ball();

    }
    @RepeatedTest(5)
    public void TestSetXY(){
        x= Math.random();
        y=Math.random();
        ball.setX(x);
        ball.setY(y);

        Assertions.assertEquals(x,ball.getX());
        Assertions.assertEquals(y,ball.getY());
    }

    @AfterEach
    @Test
    public void TestToString(){
        Assertions.assertNotNull(ball.toString());
    }





}
