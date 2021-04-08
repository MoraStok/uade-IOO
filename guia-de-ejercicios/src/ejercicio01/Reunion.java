package ejercicio01;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reunion {
    private List<Contacto> participantes;
    private String asunto;
    private String lugar;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String ubicacion;
    private String detalle;

    public Reunion() {
        this.participantes = new ArrayList<>();
    }

    public List<Contacto> getParticipantes() {
        return participantes;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void agregarParticipante(Contacto ... participante){
        Collections.addAll(this.participantes, participante);
    }

    public Long duracionEnMinutos(){
        return ChronoUnit.MINUTES.between(this.inicio, this.fin);
    }
}
