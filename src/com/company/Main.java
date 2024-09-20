package com.company;
import com.company.analyzer.DeviceAnalyzer;
import com.company.analyzer.NumberAnalyzer;
import com.company.analyzer.ProductAnalyzer;
import com.company.analyzer.ProjectorAnalyzer;
import com.company.enums.ProductCategory;
import com.company.factory.DeviceFactory;
import com.company.factory.NumberFactory;
import com.company.factory.ProductFactory;
import com.company.factory.ProjectorFactory;
import com.company.models.Device;
import com.company.models.Product;
import com.company.models.Projector;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = NumberFactory.generateRandomNumbers(50, -1000, 1000);
        System.out.println("Generated Numbers: " + numbers);

        NumberAnalyzer analyzer1 = new NumberAnalyzer(numbers);
        System.out.println("Positive numbers: " + analyzer1.countPositiveNumbers());
        System.out.println("Negative numbers: " + analyzer1.countNegativeNumbers());
        System.out.println("Two-digit numbers: " + analyzer1.countTwoDigitNumbers());
        System.out.println("Mirror numbers: " + analyzer1.countMirrorNumbers());
        System.out.println("-".repeat(50));

        Map<ProductCategory, List<Product>> productMap = ProductFactory.generateProducts();
        ProductAnalyzer analyzer2 = new ProductAnalyzer(productMap);
        analyzer2.displayAllProducts();
        analyzer2.displayShortNamedProducts();

        // запрос продукта у пользователя и подсчет встречаемости
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a product name to count: ");
        String productName = scanner.nextLine();
        analyzer2.countProductOccurrences(productName);

        // запрос буквы и отображение продуктов, начинающихся с этой буквы
        System.out.print("Enter a starting letter: ");
        char startLetter = scanner.nextLine().charAt(0);
        analyzer2.displayProductsStartingWith(startLetter);
        // все молочные продукты
        analyzer2.displayDairyProducts();
        System.out.println("-".repeat(50));

        List<Device> devices = DeviceFactory.createRandomDevices(10);

        for (Device device : devices) {
            device.print();
        }

        DeviceAnalyzer analyzer3 = new DeviceAnalyzer(devices);

        analyzer3.displayAllDevices();
        analyzer3.displayDevicesByColor("Black");
        analyzer3.displayDevicesByYear(2020);
        analyzer3.displayDevicesByPrice(1000);
        analyzer3.displayDevicesByType("Laptop");
        analyzer3.displayDevicesByYearRange(2018, 2021);
        System.out.println("-".repeat(50));

        List<Projector> projectors = ProjectorFactory.createProjectors();
        ProjectorAnalyzer analyzer4 = new ProjectorAnalyzer(projectors);

        System.out.println("All Projectors:");
        analyzer4.displayAllProjectors();

        System.out.println("\nProjectors by Manufacturer 'Sony':");
        analyzer4.displayProjectorsByManufacturer("Sony");

        int currentYear = 2024;
        System.out.println("\nProjectors from Year " + currentYear + ":");
        analyzer4.displayProjectorsFromCurrentYear(currentYear);

        System.out.println("\nProjectors more expensive than $1000:");
        analyzer4.displayProjectorsAbovePrice(1000);

        System.out.println("\nProjectors Sorted by Price Ascending:");
        analyzer4.displayProjectorsSortedByPrice(true);

        System.out.println("\nProjectors Sorted by Price Descending:");
        analyzer4.displayProjectorsSortedByPrice(false);

        System.out.println("\nProjectors Sorted by Year Ascending:");
        analyzer4.displayProjectorsSortedByYear(true);

        System.out.println("\nProjectors Sorted by Year Descending:");
        analyzer4.displayProjectorsSortedByYear(false);
    }
}


