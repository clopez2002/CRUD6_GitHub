package pildoras.es.controlador;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/runnersURL")
public class Controller {

/*****************************************************************************/

    @RequestMapping("/runnersListURL")
    public String showRunnerListMethod (Model theModel){

        return "runners_list_page";
    }

/*****************************************************************************/

/*****************************************************************************/

/*****************************************************************************/

/*****************************************************************************/




}
