package com.spring.springpetclinic.bootstrap;

import com.spring.springpetclinic.model.Owner;
import com.spring.springpetclinic.model.Vet;
import com.spring.springpetclinic.services.OwnerService;
import com.spring.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService)
    {
        this.ownerService = ownerService;

        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setId(1L);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setId(2L);
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Shaik");
        owner3.setLastName("Thaheer");
        owner3.setId(3L);
        ownerService.save(owner3);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.setId(1l);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.setId(2l);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
