package z.learn;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * https://github.com/redisson/redisson
 */
public class RedissonExample {

    public void example() {

        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        RedissonClient redisson = Redisson.create(config);

        RLock lock = redisson.getLock("myLock");
        lock.lock();
        try {
            System.out.println("Acquired");
        } finally {
            lock.unlock();
        }
    }
}
