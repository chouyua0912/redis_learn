package z.learn;

import redis.clients.jedis.Jedis;

import java.util.Date;

public class JedisKeyExample {

    public void showKey(Jedis jedis) {
        jedis.set(key, new Date().toString());

        String value = jedis.get(key);
        System.out.println(key + " : " + value);
    }

    private static final String key = "JedisKeyExample:key";
}
