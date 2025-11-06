package com.rabbit.jhipster.rhm;

import com.rabbit.jhipster.rhm.config.AsyncSyncConfiguration;
import com.rabbit.jhipster.rhm.config.EmbeddedElasticsearch;
import com.rabbit.jhipster.rhm.config.EmbeddedKafka;
import com.rabbit.jhipster.rhm.config.EmbeddedRedis;
import com.rabbit.jhipster.rhm.config.EmbeddedSQL;
import com.rabbit.jhipster.rhm.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { RabbitHomeManagerApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
