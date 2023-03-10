package com.paola.Test;

import com.paola.DAO.OdontoloDAOH2;
import com.paola.Dominio.Odontologo;
import com.paola.SERVICE.OdontologoService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OdontologoTest {

    private OdontologoService odontologoService = new OdontologoService(new OdontoloDAOH2());

    @Test
    public void buscar(){
        Odontologo odontologo = new Odontologo(1, "Camargo","paola", 12312);
        odontologoService.guardar(odontologo);

        assertTrue(odontologoService.guardar(odontologo) == odontologo);
    }
}
