package pl.adreszler.animalshelterapp;

import java.util.Optional;

enum Category {
    CATS("Cats", "Cats"),
    DOGS("Dogs", "Dogs"),
    DIFFERENT("Different", "Different animals");

    private final String categoryNameEn;
    private final String headerEn;

    Category(String categoryNameEn, String headerEn) {
        this.categoryNameEn = categoryNameEn;
        this.headerEn = headerEn;
    }

    public String getCategoryNameEn() {
        return categoryNameEn;
    }

    public String getHeaderEn() {
        return headerEn;
    }

    public static Optional<Category> fromNameEn(String categoryNameEn) {
        for (Category value : values()) {
            if (value.categoryNameEn.equals(categoryNameEn)) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }
}
