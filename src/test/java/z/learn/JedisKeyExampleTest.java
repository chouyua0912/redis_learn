package z.learn;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import redis.clients.jedis.Jedis;

/**
 * JedisKeyExample Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Aug 12, 2018</pre>
 */
public class JedisKeyExampleTest {

    @Before
    public void before() throws Exception {
        jedis = new Jedis("localhost");
    }

    /**
     * Method: showExampleUsage(Jedis jedis)
     */
    @Test
    public void testShowExampleUsage() throws Exception {
        example.showKey(jedis);
    }

    private Jedis jedis;
    private JedisKeyExample example = new JedisKeyExample();
} 
