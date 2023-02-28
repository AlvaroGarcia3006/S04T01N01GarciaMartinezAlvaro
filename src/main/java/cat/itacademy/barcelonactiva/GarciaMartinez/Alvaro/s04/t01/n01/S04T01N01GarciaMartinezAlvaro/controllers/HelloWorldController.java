package cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t01.n01.S04T01N01GarciaMartinezAlvaro.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, "+nombre+". Estás ejecutando un proyecto Maven";
    }

    @GetMapping("/HelloWorld2/{nombre}")
    public String saluda2(@PathVariable(value = "nombre", required = false) String nombre) {
        if (nombre == null) {
            return "Hola. Estás ejecutando un proyecto Maven";
        } else {
            return "Hola, "+nombre+". Estás ejecutando un proyecto Maven";
        }
    }
}
