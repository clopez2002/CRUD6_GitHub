package pildoras.es.dao;

import pildoras.es.controlador.entity.Runner;

import java.util.List;

public interface DAO {

    public List<Runner> getRunnerList ();

    void insertRunner(Runner theRunner);

    Runner getOneRunner(int id);

    void deleteRunner(int id);
}
