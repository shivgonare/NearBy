package com.example.demo.service;

import com.example.demo.entity.Restarunt;
import com.example.demo.repository.RestaruntRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaruntService {

    private final RestaruntRepository repository;

    public RestaruntService(RestaruntRepository repository) {
        this.repository = repository;
    }

    public List<Restarunt> getAllRestaurants() {
        return repository.findAll();
    }

    public Optional<Restarunt> getRestaurantById(Long id) {
        return repository.findById(id);
    }

    public Restarunt saveRestaurant(Restarunt restarunt) {
        return repository.save(restarunt);
    }

    public void deleteRestaurant(Long id) {
        repository.deleteById(id);
    }
}
