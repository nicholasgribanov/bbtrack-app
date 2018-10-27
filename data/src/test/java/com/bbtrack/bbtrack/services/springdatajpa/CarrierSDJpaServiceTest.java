package com.bbtrack.bbtrack.services.springdatajpa;

import com.bbtrack.bbtrack.model.Carrier;
import com.bbtrack.bbtrack.repositories.CarrierRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CarrierSDJpaServiceTest {
    private CarrierSDJpaService carrierSDJpaService;
    @Mock
    private CarrierRepository carrierRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        carrierSDJpaService = new CarrierSDJpaService(carrierRepository);
    }

    @Test
    public void findAll() {
        Set<Carrier> carriers = new HashSet<>();
        carriers.add(new Carrier());

        when(carrierRepository.findAll()).thenReturn(carriers);

        Set<Carrier> testCarriers = carrierSDJpaService.findAll();

        assertEquals(testCarriers.size(), carriers.size());
        verify(carrierRepository, times(1)).findAll();
    }

    @Test
    public void findById() {
        Carrier carrier = new Carrier();
        carrier.setId(1L);

        when(carrierRepository.findById(1L)).thenReturn(Optional.of(carrier));

        Carrier carrier1 = carrierSDJpaService.findById(1L);
        Carrier carrier2 = carrierSDJpaService.findById(22L);

        assertEquals(carrier, carrier1);
        assertNull(carrier2);

        verify(carrierRepository, times(1)).findById(1L);
        verify(carrierRepository, times(1)).findById(22L);

    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void deleteById() {
    }
}