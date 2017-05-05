package ca.cu_dev.sanalysis.core

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication

/**
 * Created by a-cusick on 2017-05-05.
 */
class TwitterIngestor implements CommandLineRunner {
    static void main(String[] args) throws Exception {
        SpringApplication.run(TwitterIngestor.class, args);
    }

    @Override
    void run(String... args) throws Exception {
        println 'Yo yo'
    }
}
