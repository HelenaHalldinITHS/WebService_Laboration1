package org.example.provider;

import org.example.converter.KiloConverter;

public class KiloToStoneConverter implements KiloConverter {
    @Override
    public double convert(double kg) {
        return kg *  0.15747;
    }
}
