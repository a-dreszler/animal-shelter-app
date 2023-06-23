package pl.adreszler.animalshelterapp;

class Picture {

    private String filePath;
    private String alt;

    public Picture(String filePath, String alt) {
        this.filePath = filePath;
        this.alt = alt;
    }

    public Picture() {
    }

    public String getFilePath() {
        return filePath;
    }

    public String getAlt() {
        return alt;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
