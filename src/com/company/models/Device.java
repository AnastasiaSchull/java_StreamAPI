package com.company.models;
import com.company.enums.DeviceColor;
import com.company.enums.DeviceType;

public class Device {
    private String name;
    private int yearOfManufacture;
    private double price;
    private DeviceColor color;
    private DeviceType type;

    public Device(String name, int yearOfManufacture, double price, DeviceColor color, DeviceType type) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public void print() {
        System.out.println(
                "Device Name: " + this.name +
                        ", Color: " + this.color.name() +
                        ", Type: " + this.type.name() +
                        ", Year: " + this.yearOfManufacture +
                        ", Price: $" + String.format("%.2f", this.price)
        );
    }

    public String getName() {
        return name;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public DeviceColor getColor() {
        return color;  // возвращает тип DeviceColor
    }

    public DeviceType getType() {
        return type;  // возвращает тип DeviceType
    }
}
