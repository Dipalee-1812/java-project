package com.salon.cusalon.services;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salon.cusalon.entity.Salon;
import com.salon.cusalon.repository.SalonRepository;

@Service
public class SalonService {
    
    // private Map<Integer,Salon> salonMap = new HashMap<>();
    // AtomicInteger atomic =new AtomicInteger();

    @Autowired
    private SalonRepository salonRepository;

    public Iterable<Salon> getAll()
    {
        return this.salonRepository.findAll();
    }

    public void addSalon(Salon newSalon)
    {
        this.salonRepository.save(newSalon);
    }

    public void deleteSalon(Integer id)
    {
        this.salonRepository.deleteById(id);
    }

    public Salon searchSalon(Integer id)
    {
        return this.salonRepository.findById(id).get();
    }

    public void updateSalon(Salon salon)
    {
        this.salonRepository.save(salon);
    }

   

    

	


}
