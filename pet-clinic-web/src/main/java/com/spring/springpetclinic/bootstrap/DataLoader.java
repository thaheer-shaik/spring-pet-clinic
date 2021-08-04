package com.spring.springpetclinic.bootstrap;

import com.spring.springpetclinic.model.Owner;
import com.spring.springpetclinic.model.Vet;
import com.spring.springpetclinic.services.OwnerService;
import com.spring.springpetclinic.services.VetService;
import com.spring.springpetclinic.services.map.OwnerServiceMap;
import com.spring.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner
{
    private OwnerService ownerService;
    private VetService vetService;

    public DataLoader()
    {
        ownerService=new OwnerServiceMap();
        vetService=new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception
    {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
