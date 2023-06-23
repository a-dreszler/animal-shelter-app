package pl.adreszler.animalshelterapp;

enum Category {
    CATS("Cats"),
    DOGS("Dogs"),
    DIFFERENT("Different");

    private final String categoryNameEn;

    Category(String categoryNameEn) {
        this.categoryNameEn = categoryNameEn;
    }

    public String getCategoryNameEn() {
        return categoryNameEn;
    }
}
