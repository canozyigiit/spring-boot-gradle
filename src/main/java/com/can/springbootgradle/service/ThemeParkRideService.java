package com.can.springbootgradle.service;

import com.can.springbootgradle.model.ThemeParkRide;

public interface ThemeParkRideService {

    ThemeParkRide createRide(ThemeParkRide themeParkRide);

    Iterable<ThemeParkRide> getRides();

    ThemeParkRide getRide(long id);
}
