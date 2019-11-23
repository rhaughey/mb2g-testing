package guru.springframework;

import org.junit.jupiter.api.Test;

/**
 * Created by rfh on 11/23/2019
 */
public class JavaHelloWorldTest {

    @Test
    public void testGetHello() {
        System.out.println("#####################");
        System.out.println(System.getenv("TEST_HOST"));
    }
}