package com.company.factory;
import com.company.models.Projector;
import java.util.List;

public class ProjectorFactory {
    public static List<Projector> createProjectors() {
        return List.of(
                new Projector("Epson AS-123", 2021, 550.00, "Epson"),
                new Projector("BenQ ZX1234", 2024, 700.00, "BenQ"),
                new Projector("LG QW123", 2022, 450.00, "LG"),
                new Projector("Sony QWE-1234", 2021, 2000.00, "Sony"),
                new Projector("Optoma ZXC", 2023, 1300.00, "Optoma")
        );
    }
}
