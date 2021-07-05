package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ReviewTest {
    Review rev;
    Shop testShop;
    @BeforeEach
    public void init() {
        rev = new Review("good" , "user" , 2);
        testShop = new Shop("test" , "test desc" , "$$$");
    }

    @Test
    public void testConstructor () {
       String expectedAuth = "user";
       String expectedBody = "good";
       int expectedStars = 2;
       assertEquals(expectedStars , 2);
        assertEquals(expectedAuth , "user");
        assertEquals(expectedBody , "good");
    }
    @Test
    public void testShopRev() {
        testShop.addReview("test" , "user" , 4);
        assertTrue(testShop.getReviews().size() > 0 , "Return true if a review added to the linked list");
    }
    @Test
    public void testToString() {
        assertNotEquals(null , rev.toString());
    }
}
