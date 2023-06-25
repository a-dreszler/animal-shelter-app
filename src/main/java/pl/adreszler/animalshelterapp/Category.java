package pl.adreszler.animalshelterapp;

enum Category {
    CATS("Cats", "Cats"),
    DOGS("Dogs", "Dogs"),
    DIFFERENT("Different", "Different animals");

    private final String nameEn;
    private final String headerEn;

    Category(String nameEn, String headerEn) {
        this.nameEn = nameEn;
        this.headerEn = headerEn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getHeaderEn() {
        return headerEn;
    }
}