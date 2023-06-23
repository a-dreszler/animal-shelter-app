package pl.adreszler.animalshelterapp;

class Animal {

    private Integer id;
    private String name;
    private String description;
    private Picture picture;
    private Category category;
    private static final int SHORT_DESC_LENGTH = 50;

    public Animal(Integer id, String name, String description, Picture picture, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.category = category;
    }

    public Animal() {
        this.picture = new Picture();
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

    public Category getCategory() {
        return category;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = Category.fromNameEn(category).orElse(Category.DIFFERENT);
    }

    public String getShortDesc() {
        if (description.length() <= SHORT_DESC_LENGTH) {
            return description;
        }

        return String.valueOf(description.toCharArray(), 0, SHORT_DESC_LENGTH - 3) + "...";
    }
}