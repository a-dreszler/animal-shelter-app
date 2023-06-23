package pl.adreszler.animalshelterapp;

class Picture {

    private String fileName;
    private String alt;

    public Picture(String fileName, String alt) {
        this.fileName = fileName;
        this.alt = alt;
    }

    public Picture() {
    }

    public String getFileName() {
        return fileName;
    }

    public String getAlt() {
        return alt;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
