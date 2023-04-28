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

    @RequestMapping("/insertRunnerURL")
    public String showInsertRunnerForm (Model theModel){

        // Bind de datos de los clientes

        Runner theRunner = new Runner();

        theModel.addAttribute("runnersAttributeToInsert", theRunner);

        return "insert_runners_page"; // este es el archivo JSP que debe devolver
    }

/*****************************************************************************/

    @PostMapping("/InsertRunnerInsert")
    public String insertRunnerMethod (@ModelAttribute("runnersAttributeToInsert") Runner theRunner){

        // insertar runner en la BBDD

        daoClient.insertRunner (theRunner);

        return "redirect:/runnersURL/runnersListURL";
    }

/*****************************************************************************/

    @GetMapping("/showUpdateURL")
    public String showUpdateRunnerForm (@RequestParam("runnerIDParam") int id, Model theModel){

        // obtener runner cuyo parametro es el id que le pasamos

        Runner theRunner = daoClient.getOneRunner(id);

        // establecer el runner como atributo del modelo

        theModel.addAttribute("runnerAttributeToUpdate", theRunner);

        // enviarlo al formuario

        return "update_runners_page";
    }

/*****************************************************************************/

    @GetMapping("/showDeleteURL")
    public String showDeleteRunnerForm (@RequestParam("runnerIDParam") int id) {

        // eliminar cliente

        daoClient.deleteRunner (id);

        // redireccionamos a la lista de runners

        return "redirect:/runnersURL/runnersListURL";
    }


/*****************************************************************************/

/*****************************************************************************/




}
