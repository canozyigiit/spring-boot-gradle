package com.can.springbootgradle.service;

import com.can.springbootgradle.model.ThemeParkRide;
import com.can.springbootgradle.repository.ThemeParkRideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
@RequiredArgsConstructor
public class ThemeParkRideImpl implements ThemeParkRideService{
    private final ThemeParkRideRepository themeParkRideRepository;

    @Override
    public ThemeParkRide createRide(ThemeParkRide themeParkRide) {
        return themeParkRideRepository.save(themeParkRide);
    }

    @Override
    public Iterable<ThemeParkRide> getRides() {
        return themeParkRideRepository.findAll();
    }

    @Override
    public ThemeParkRide getRide(long id) {
        return themeParkRideRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Invalid ride id %s", id)));
    }
}
