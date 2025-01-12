package com.giffing.bucket4j.spring.boot.starter.config.cache;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.giffing.bucket4j.spring.boot.starter.config.cache.hazelcast.HazelcastBucket4jCacheConfiguration;
import com.giffing.bucket4j.spring.boot.starter.config.cache.jcache.InfinispanJCacheBucket4jConfiguration;
import com.giffing.bucket4j.spring.boot.starter.config.cache.jcache.JCacheBucket4jConfiguration;
import com.giffing.bucket4j.spring.boot.starter.config.cache.redis.jedis.JedisBucket4jConfiguration;
import com.giffing.bucket4j.spring.boot.starter.config.cache.redis.lettuce.LettuceBucket4jConfiguration;
import com.giffing.bucket4j.spring.boot.starter.config.cache.redis.redisson.RedissonBucket4jConfiguration;
import com.giffing.bucket4j.spring.boot.starter.config.cache.redis.springdata.RedisSpringDataBucket4jConfiguration;

@Configuration
@AutoConfigureAfter(CacheAutoConfiguration.class)
@Import(value = {
        JCacheBucket4jConfiguration.class,
        InfinispanJCacheBucket4jConfiguration.class,
        HazelcastBucket4jCacheConfiguration.class,
        JedisBucket4jConfiguration.class,
        LettuceBucket4jConfiguration.class,
        RedissonBucket4jConfiguration.class,
        RedisSpringDataBucket4jConfiguration.class
})
public class Bucket4jCacheConfiguration {
}
