package pl.adreszler.animalshelterapp;

enum Category {
    ALL("All"),
    CATS("Cats"),
    DOGS("Dogs"),
    DIFFERENT("Different");

    private final String categoryNameEn;

    Category(String categoryNameEn) {
        this.categoryNameEn = categoryNameEn;
    }
}
