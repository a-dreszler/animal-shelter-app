package pl.adreszler.animalshelterapp;

class Picture {

    private final String fileName;
    private final String alt;

    public Picture(String fileName, String alt) {
        this.fileName = fileName;
        this.alt = alt;
    }

    public String getFileName() {
        return fileName;
    }

    public String getAlt() {
        return alt;
    }
}
