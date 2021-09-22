public enum Alcohol {
    //TODO: drink borovicka again
    BOROVICKA("Borovička"),
    GIN("Gin"),
    BEER("Söröcske"),
    TATRA52("Tatra Tea 52%"),
    TATRA72("Tatra Tea 72%"),
    PINKGIN("Pink Gin"),
    HAZI("Házi pálinka");

    public final String name;

    private Alcohol(String name) {
        this.name = name;
    }
}
