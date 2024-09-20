package com.company.factory;
import com.company.enums.DeviceColor;
import com.company.enums.DeviceType;
import com.company.models.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeviceFactory {
    private static final Random random = new Random();

    public static List<Device> createRandomDevices(int numberOfDevices) {
        List<Device> devices = new ArrayList<>();
        for (int i = 0; i < numberOfDevices; i++) {
            DeviceType type = randomType();
            String model = randomModel(type);  // модель из enum
            int year = randomYear();
            double price = randomPrice();
            DeviceColor color = randomColor();
            devices.add(new Device(model, year, price, color, type));  //  модель будет как имя
        }
        return devices;
    }

    private static String randomModel(DeviceType type) {
        List<String> models = type.getModels();
        return models.get(random.nextInt(models.size()));
    }

    private static int randomYear() {
        return 2015 + random.nextInt(10);  // от 2015 до 2025
    }

    private static double randomPrice() {
        return 100 + random.nextDouble() * 2400;  // цены от 100 до 2500
    }

    private static DeviceColor randomColor() {
        DeviceColor[] colors = DeviceColor.values();
        return colors[random.nextInt(colors.length)];
    }

    private static DeviceType randomType() {
        DeviceType[] types = DeviceType.values();
        return types[random.nextInt(types.length)];
    }
}
