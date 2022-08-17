package org.abratuhi;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WordConsumer {
    @Incoming("string-in")
    public void consume(String word) {
        System.out.println(word);
    }
}
