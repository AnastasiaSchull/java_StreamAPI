package com.company.analyzer;
import com.company.models.Projector;
import java.util.Comparator;
import java.util.List;

public class ProjectorAnalyzer {
    private List<Projector> projectors;

    public ProjectorAnalyzer(List<Projector> projectors) {
        this.projectors = projectors;
    }

    public void displayAllProjectors() {
        projectors.forEach(projector -> System.out.println(projector.getName() + ", " + projector.getManufacturer() + ", " +
                projector.getYearOfManufacture() + ", $" + projector.getPrice()));
    }

    public void displayProjectorsByManufacturer(String manufacturer) {
        projectors.stream()
                .filter(projector -> projector.getManufacturer().equalsIgnoreCase(manufacturer))
                .forEach(projector -> System.out.println(projector.getName()));
    }

    public void displayProjectorsFromCurrentYear(int currentYear) {
        projectors.stream()
                .filter(projector -> projector.getYearOfManufacture() == currentYear)
                .forEach(projector -> System.out.println(projector.getName()));
    }

    public void displayProjectorsAbovePrice(double price) {
        projectors.stream()
                .filter(projector -> projector.getPrice() > price)
                .forEach(projector -> System.out.println(projector.getName()));
    }

    public void displayProjectorsSortedByPrice(boolean ascending) {
        projectors.stream()
                .sorted(Comparator.comparing(Projector::getPrice, ascending ? Comparator.naturalOrder() : Comparator.reverseOrder()))
                .forEach(projector -> System.out.println(projector.getName() + ", $" + projector.getPrice()));
    }

    public void displayProjectorsSortedByYear(boolean ascending) {
        projectors.stream()
                .sorted(Comparator.comparing(Projector::getYearOfManufacture, ascending ? Comparator.naturalOrder() : Comparator.reverseOrder()))
                .forEach(projector -> System.out.println(projector.getName() + ", " + projector.getYearOfManufacture()));
    }
}
