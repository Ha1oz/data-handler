package com.haloz.springboot.base;

import org.springframework.beans.factory.annotation.Value;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class NewsletterBase {
    private JedisPool pool;
    public NewsletterBase() {
        try{
            pool = new JedisPool("localhost", 6379);
        } catch (Exception e) {
            e.printStackTrace();
         }
    }
    public String getNewsletter(String key, String field) {
        try(Jedis jedis = pool.getResource()) {
            return jedis.hget(key, field);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
