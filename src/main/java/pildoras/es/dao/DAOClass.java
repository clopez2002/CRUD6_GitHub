package pildoras.es.dao;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pildoras.es.controlador.entity.Runner;

import java.util.List;

@Repository// Spring reconoce esto como un BEAM
public class DAOClass implements DAO{

// esta clase se encarfa de implementar los metodos del DAO y obtener la info de la la BBDD

/*****************************************************************************/

    @Autowired          // esta anotacion nos permite hacer la inyeccion de dependencias
    private SessionFactory sessionFactory; // se tiene que llamara tal cual lo indica el archivo xml de configuracion


/*****************************************************************************/

    @Override
    @Transactional
    public List<Runner> getRunnerList() {

        // obtener la sesion

        Session mySession = sessionFactory.getCurrentSession();

        // crear la consulta (Qwery)

        Query<Runner> myQuery = mySession.createQuery("from Runner", Runner.class );

        // ejecutar la qwery y devolver resultados

        List<Runner> runnersList = myQuery.getResultList();

        return runnersList;
    }

/*****************************************************************************/

    @Override
    @Transactional
    public void insertRunner(Runner theRunner) {

        // obtener la sesion

        Session mySession = sessionFactory.getCurrentSession();

        // insertar el runner

        mySession.save(theRunner);


    }

/*****************************************************************************/

    @Override
    @Transactional
    public Runner getOneRunner(int id) {

        // obtener la sesion

        Session mySession = sessionFactory.getCurrentSession();

        // obtener la informacoin del cliente

        Runner theRunner = mySession.get(Runner.class, id);


        return theRunner;
    }

/*****************************************************************************/

/*****************************************************************************/

/*****************************************************************************/


}
