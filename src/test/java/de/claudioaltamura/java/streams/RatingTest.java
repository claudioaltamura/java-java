package de.claudioaltamura.java.streams;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RatingTest {

    @Test
    @DisplayName("rating")
    void shouldComputeRating() {
        var reviews = List.of(new Review(3, "not bad"), new Review(4, "good"));
        var rating = new Rating(reviews);

        assertThat(rating.computeRating()).isEqualTo(3.5D);
    }

}