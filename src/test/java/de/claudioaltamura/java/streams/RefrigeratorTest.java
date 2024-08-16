package de.claudioaltamura.java.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import static org.junit.jupiter.api.Assertions.*;

class RefrigeratorTest {

    @Test
    void shouldReturnSoftdrinks() {
        Collector<Softdrink, StringJoiner, String> softdrinkCollector =
                Collector.of(
                        () -> new StringJoiner(", "),          // supplier
                        (j, s) -> j.add(s.name()),  // accumulator
                        StringJoiner::merge,               // combiner
                        StringJoiner::toString);                // finisher


        var refrigerator1 = new Refrigerator();
        refrigerator1.addSoftdrink(new Softdrink("Cola"));
        refrigerator1.addSoftdrink(new Softdrink("Fanta"));

        var refrigerator2 = new Refrigerator();
        refrigerator2.addSoftdrink(new Softdrink("Water"));
        refrigerator2.addSoftdrink(new Softdrink("Orange Juice"));

        List<Refrigerator> refs = List.of(refrigerator1, refrigerator2);

        assertEquals("Cola, Fanta, Water, Orange Juice", refs.stream().flatMap(r->r.getSoftdrinks().stream()).collect(softdrinkCollector));
    }


}