package com.coursera.ita.oo.semana1.test;

import com.coursera.ita.oo.semana1.Compra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {
    @Test
    public void compraAVista(){
        Compra c = new Compra(500);
        assertEquals(1,c.getNumeroParcelas());
        assertEquals(500,c.getValorParcela());
        assertEquals(500,c.getValorTotal());
    }

    @Test
    public void compraAp(){
        Compra c = new Compra(4,250);
        assertEquals(4,c.getNumeroParcelas());
        assertEquals(1000,c.getValorTotal());
        assertEquals(250,c.getValorParcela());
    }
}