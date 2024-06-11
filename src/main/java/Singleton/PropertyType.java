package Singleton;

public enum PropertyType {
    DB_CONNECTION("sample.db.connection"),

    DB_KEY("sample.db.key"),
    API_TOKEN("sample.API.token"),
    API_NAME("sample.API.name");

    private String info;

    PropertyType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
