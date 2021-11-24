import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinsTest extends TestCase {

    @Test
    public void testBinsConstructor() {
        Bins bins = new Bins(2, 12);
        int length = bins.getSums().length;
        Assert.assertEquals(13, length);
    }

}