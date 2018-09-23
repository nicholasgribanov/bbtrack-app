package com.bbtrack.bbtrack.bootstrap;

import com.bbtrack.bbtrack.model.Carrier;
import com.bbtrack.bbtrack.model.CustomerLTD;
import com.bbtrack.bbtrack.services.CarrierService;
import com.bbtrack.bbtrack.services.CustomerLDTService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private CustomerLDTService customerLDTService;
    private CarrierService carrierService;

    public DataLoader(CustomerLDTService customerLDTService, CarrierService carrierService) {
        this.customerLDTService = customerLDTService;
        this.carrierService = carrierService;
    }

    @Override
    public void run(String... args) throws Exception {
        CustomerLTD customer1 = new CustomerLTD();
        customer1.setName("OOO TC Alladin");
        customer1.setInn(64223323L);
        customer1.setAdressLtd("Saratov, St. Razina street, 32");
        customer1.setAdressFact("Engels, Bulvar Roz, 35-4");
        customer1.setPhone("542353");
        customerLDTService.save(customer1);

        CustomerLTD customer2 = new CustomerLTD();
        customer2.setName("OOO Severstal");
        customer2.setInn(35000021L);
        customer2.setAdressLtd("Moscow, Red Square, 1");
        customer2.setAdressFact("Cherepovets, Mira, 30");
        customer2.setPhone("555532");
        customerLDTService.save(customer2);

        Carrier carrier1 = new Carrier();
        carrier1.setName("Gurgen");
        carrier1.setAvto("Gazel");
        carrier1.setMaxVolume("30T");
        carrierService.save(carrier1);

        Carrier carrier2 = new Carrier();
        carrier2.setName("Vazgen");
        carrier2.setAvto("Scania");
        carrier2.setMaxVolume("500T");
        carrierService.save(carrier2);

        System.out.println("Loaded data...");

    }
}
