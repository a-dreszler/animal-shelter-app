package pl.adreszler.animalshelterapp;

class Animal {

    private Integer id;
    private String name;
    private String description;

    public Animal(Integer id, String name, String description) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
