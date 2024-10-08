package de.claudioaltamura.java.streams;

import org.junit.jupiter.api.Test;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class CollectStreamTest {

	private final List<Review> reviews = List.of(new Review(3, "not bad"), new Review(4, "good"), new Review(5, "very good"));

	@Test
	void shouldCollectReviews() {
		var filtered =
				reviews
						.stream()
						.filter(r -> r.review().contains("good"))
						.collect(Collectors.toList());

		assertEquals(List.of(new Review(4, "good"), new Review(5, "very good")), filtered);
	}

	@Test
	void shouldCollectGoodAndVeryGoodReviews() {
		var goodAndVeryGoodReviews =
				reviews
						.stream()
						.collect(Collectors.groupingBy(r -> r.points() > 3)).get(Boolean.TRUE);

		assertEquals(List.of(new Review(4, "good"), new Review(5, "very good")), goodAndVeryGoodReviews);
	}

	@Test
	void shouldCollectAverageRating() {
		var avgRating =
				reviews
						.stream()
						.collect(Collectors.averagingDouble(Review::points));

		assertEquals(4.0D, avgRating);
	}

	@Test
	void shouldCollectAverageStatistics() {
		var avgRating =
				reviews
						.stream()
						.collect(Collectors.summarizingInt(Review::points));
		assertEquals(new IntSummaryStatistics(3,3,5, 12).toString(), avgRating.toString());
	}

	@Test
	void shouldMapAllReviews() {
		Map<Integer, String> reviewMap = reviews.stream().collect(Collectors.toMap(Review::points, Review::review, (r1, r2) -> r1 + ";" + r2));
		Map<Integer, String> expectedMap = Map.of(3, "not bad", 4, "good", 5, "very good");

		assertEquals(expectedMap,reviewMap);
	}

	@Test
	void shouldUseStringJoiner() {
		Collector<Review, StringJoiner, String> reviewCollector =
				Collector.of(
						() -> new StringJoiner(" | "),          // supplier
						(j, r) -> j.add(r.review()),  // accumulator
                        StringJoiner::merge,               // combiner
						StringJoiner::toString);                // finisher

		assertEquals("not bad | good | very good", reviews.stream().collect(reviewCollector));
	}
}