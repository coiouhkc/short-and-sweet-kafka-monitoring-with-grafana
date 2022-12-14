package org.abratuhi;

import io.smallrye.mutiny.Multi;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import java.time.Duration;

@ApplicationScoped
public class WordProducer {
    @Outgoing("string-out")
    public Multi<String> generate() {
        return Multi.createFrom()
                .ticks().every(Duration.ofSeconds(5L))
                .map(i -> "word" + i);
    }
}
