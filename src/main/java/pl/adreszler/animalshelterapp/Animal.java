package pl.adreszler.animalshelterapp;

class Animal {

    private final Integer id;
    private final String name;
    private final String description;
    private final Picture picture;
    private static final int SHORT_DESC_LENGTH = 50;

    public Animal(Integer id, String name, String description, Picture picture) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Picture getPicture() {
        return picture;
    }

    public String getShortDesc() {
        if (description.length() <= SHORT_DESC_LENGTH) {
            return description;
        }

        return String.valueOf(description.toCharArray(), 0, SHORT_DESC_LENGTH - 3) + "...";
    }
}