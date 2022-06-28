package com.Practica01.service;

import com.Practica01.dao.EstadoDao;
import com.Practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImp implements EstadoService {

    @Autowired
    private EstadoDao estadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstados() {
       return (List<Estado>) estadoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.delete(estado);
    }

    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getN_estado()).orElse(null);
    }

}
