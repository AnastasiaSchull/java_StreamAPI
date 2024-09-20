package com.company.analyzer;
import com.company.models.Device;
import java.util.List;

public class DeviceAnalyzer {
    private List<Device> devices;

    public DeviceAnalyzer(List<Device> devices) {
        this.devices = devices;
    }

    public void displayAllDevices() {
        System.out.println("All devices:");
        devices.forEach(device -> System.out.println(device.getName()));
    }

    public void displayDevicesByYear(int year) {
        System.out.println("Devices made in " + year + ":");
        devices.stream()
                .filter(device -> device.getYearOfManufacture() == year)
                .forEach(device -> System.out.println(device.getName()));
    }

    public void displayDevicesByPrice(double price) {
        System.out.println("Devices more expensive than $" + price + ":");
        devices.stream()
                .filter(device -> device.getPrice() > price)
                .forEach(device -> System.out.println(device.getName()));
    }

public void displayDevicesByType(String type) {
    System.out.println("Devices of type " + type + ":");
    devices.stream()
            .filter(device -> device.getType().name().equalsIgnoreCase(type))
            .forEach(device -> System.out.println(device.getName()));
}

    public void displayDevicesByYearRange(int startYear, int endYear) {
        System.out.println("Devices made between " + startYear + " and " + endYear + ":");
        devices.stream()
                .filter(device -> device.getYearOfManufacture() >= startYear && device.getYearOfManufacture() <= endYear)
                .forEach(device -> System.out.println(device.getName()));
    }

    public void displayDevicesByColor(String color) {
        System.out.println("Devices of color " + color + ":");
        devices.stream()
                .filter(device -> device.getColor().name().equalsIgnoreCase(color))
                .forEach(device -> System.out.println(device.getName()));
    }

}
