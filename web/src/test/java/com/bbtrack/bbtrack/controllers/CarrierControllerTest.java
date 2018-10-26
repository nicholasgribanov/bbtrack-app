package com.bbtrack.bbtrack.controllers;

import com.bbtrack.bbtrack.model.Carrier;
import com.bbtrack.bbtrack.services.CarrierService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CarrierControllerTest {
    private CarrierController carrierController;
    @Mock
    private CarrierService carrierService;
    @Mock
    private Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        carrierController = new CarrierController(carrierService);
    }

    @Test
    public void listCarriers() {
        Set<Carrier> carrierSet = new HashSet<>();
        carrierSet.add(new Carrier());
        Carrier carrier = new Carrier();
        carrier.setId(2L);
        carrierSet.add(carrier);

        when(carrierService.findAll()).thenReturn(carrierSet);

        String page = carrierController.listCarriers(model);

        assertEquals("carriers/carriersList", page);
        assertEquals(carrierService.findAll().size(), 2);


        verify(model, times(1)).addAttribute("carriers", carrierService.findAll());

    }
}