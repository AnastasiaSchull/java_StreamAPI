package com.company.enums;
import java.util.List;

public enum DeviceType {
    SMARTPHONE(List.of("iPhone 12", "Huawei P20 Pro", "Samsung Galaxy 123", "Google Pixel 5", "OnePlus 9")),
    TELEVISION(List.of("Samsung QLED", "LG OLED", "Sony Bravia", "Panasonic TX", "TCL 6-Series")),
    LAPTOP(List.of("Dell XPS 15", "Apple MacBook", "HP Spectre x360", "Lenovo ThinkPad X1", "Asus ZenBook 123")),
    APPLIANCE(List.of("Dyson Vacuum", "Samsung Refrigerator", "LG Washer", "Whirlpool Dishwasher", "Bosch Oven")),
    WEARABLE(List.of("Apple Watch", "Samsung Gear", "Fitbit Versa", "Garmin Fenix", "Huawei Watch"));

    private final List<String> models;

    DeviceType(List<String> models) {
        this.models = models;
    }

    public List<String> getModels() {
        return models;
    }
}
