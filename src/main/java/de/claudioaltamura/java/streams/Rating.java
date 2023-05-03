package de.claudioaltamura.java.streams;

import java.util.List;

public record Rating(List<Review> reviews) {

    public double computeRating() {
        double totalPoints =
                reviews.stream().map(Review::points).reduce(0, Integer::sum);
        return totalPoints / reviews.size();
    }
}
