package com.example.recyclerview_example;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Product> getProducts(){


        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Dell Vostro 3500 Laptop (Core i3 1115G4/4 GB/256 GB/UHD Graphics)", "Φορητός υπολογιστής 15,6 ιντσών με στενό περιθώριο στις δύο πλευρές, μπαταρία ExpressCharge™ και επεξεργαστές Intel® Core™ 11ης γενιάς.", 549.00));
        products.add(new Product(2, "Dell Vostro 3500 + Zone Alarm For Institutions Laptop (Core i3 1115G4/4 GB/256 GB", "Φορητός υπολογιστής με FHD οθόνη 15,6” και στενό περιθώριο στις δύο πλευρές, 11ης γενιάς επεξεργαστή Intel® Core™ i3-1115G4 και μπαταρία τεχνολογίας ExpressCharge™ για γρήγορη φόρτιση!", 559.00));
        products.add(new Product(3, "HP 15s - eq0020nv Laptop (Ryzen 5 3450U/8 GB/256 GB/Radeon Vega 8)", "Iδανικό για εργασία και διασκέδαση, με επεξεργαστή AMD Ryzen™ 5 3450U, 8GB DDR4 RAM, οθόνη 15,6” FHD IPS, NVMe M.2 SSD 256GB, Windows 10 (S) και βάρος μόλις 1,74 κιλά για να το έχεις πάντα μαζί σου!", 569.00));
        products.add(new Product(4, "HP 15 - dw2000nv Laptop (Core i5 1035G1/8 GB/256 GB/GeForce MX130 2 GB)", "Ολοκλήρωσε με σιγουριά τις εργασίες σου με 10ης γενιάς επεξεργαστή Intel® Core™ i5-1035G1, 8GB RAM DDR4, PCIe NVMe M.2 SSD 256GB, NVIDIA® GeForce® MX130 και Windows 10 σε S mode!", 649.00));
        products.add(new Product(5, "Apple MacBook Air Retina MGN63GR/A (Late 2020) S.G. (M1/8 GB/256 GB)", "Σχεδιασμένος αποκλειστικά για τον Mac, ο πανίσχυρος 8πύρηνος επεξεργαστής M1 προσφέρει εντυπωσιακές επιδόσεις και γραφικά, χαμηλότερη κατανάλωση και πρόσβαση σε ένα τεράστιο οικοσύστημα εφαρμογών!", 1179.00));
        products.add(new Product(6, "HP ProBook 650 G8 Laptop (Core i5 1135G7/8 GB/256 GB/Iris Xe Graphics)", "Επαγγελματικό και ανθεκτικό φορητό σύστημα 15” με επεξεργαστή Intel® Core™ i5 11th Gen 1135G7, 8GB RAM DDR4-3200, αποθ. μονάδα NVMe M.2 SSD 256GB και Windows 10 Pro.", 849.00));

        return products;
    }
}
