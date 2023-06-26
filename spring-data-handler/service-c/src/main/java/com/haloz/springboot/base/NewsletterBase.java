package com.haloz.springboot.base;

import org.springframework.beans.factory.annotation.Value;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class NewsletterBase {
    private String name = "receiver";
    private JedisPool pool;
    public NewsletterBase() {
        try{
            pool = new JedisPool("localhost", 6379);
        } catch (Exception e) {
            e.printStackTrace();
         }
    }
    public String getNewsletter(String id) {
        try(Jedis jedis = pool.getResource()) {
            return jedis.hget(name, id);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
