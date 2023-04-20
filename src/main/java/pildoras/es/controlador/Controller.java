package pildoras.es.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pildoras.es.controlador.entity.Runner;
import pildoras.es.dao.DAO;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/runnersURL")
public class Controller {

/*****************************************************************************/

    @Autowired
    private DAO daoClient;

/*****************************************************************************/

    @RequestMapping("/runnersListURL")
    public String showRunnerListMethod (Model theModel){

        // obtener los clientes desde el DAO

        List<Runner> runnersList = daoClient.getRunnerList();

        // agregar los clientes al modelo

        theModel.addAttribute("runnersAttribute", runnersList);

        return "runners_list_page";
    }

/*****************************************************************************/

/*****************************************************************************/

/*****************************************************************************/

/*****************************************************************************/




}
