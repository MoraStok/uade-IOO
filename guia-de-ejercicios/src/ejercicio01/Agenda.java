package ejercicio01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
    private List<Reunion> reuniones;

    public Agenda(){
        this.reuniones = new ArrayList<>();
    }

    public List<Reunion> getReuniones() {
        return reuniones;
    }

    public void agregarReunion(Reunion ... reunion) {
        Collections.addAll(this.reuniones, reunion);
    }

    public void eliminarReunion(Reunion reunion) {
        if(this.reuniones.contains(reunion)){
            this.reuniones.remove(reunion);
        }else {
            System.out.println("La reunion no existe");
        }
    }

    public void modificarReunion(Reunion reunion){
        this.reuniones.set(this.reuniones.indexOf(reunion), reunion);
    }

    public List<Reunion> consultarReunionesEnUnaFecha(LocalDate fecha){
        return this.reuniones.stream().filter(r -> (r.getInicio().toLocalDate().equals(fecha))).collect(Collectors.toList());
    }

    public Boolean validarHorario(LocalDateTime fechaYhora){
        return true;
    }
}
