package clases;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

    private int ancho;
    private int alto;
    private Punto centro;
    private int color;

    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
        this.centro = new Punto();
        this.color = 0;
    }

    public Rectangulo(int ancho, int alto, Punto centro, int color) {
        this.ancho = ancho;
        this.alto = alto;
        this.centro = centro;
        this.color = color;
    }

    public Rectangulo(Rectangulo rectangulo) {
        this.ancho = rectangulo.ancho;
        this.alto = rectangulo.alto;
        this.centro = new Punto(rectangulo.centro);
        this.color = rectangulo.color;
    }


    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void mostrarDatos() {
        Pantalla.escribirString("Rectángulo:");
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Ancho: " + ancho);
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Alto: " + alto);
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Centro: ");
        Pantalla.escribirSaltoLinea();
        centro.mostrarDatos();
        Pantalla.escribirString("Color: " + color);
        Pantalla.escribirSaltoLinea();
    }

    public void cambiarDatos() {

        Pantalla.escribirString("Ingrese nuevo ancho (actual: " + ancho + ") o presione Enter para mantener: ");
        Pantalla.escribirSaltoLinea();
        String nuevoAncho = Teclado.leerString();
        if (!nuevoAncho.isEmpty()) {
            this.ancho = Integer.parseInt(nuevoAncho);
        }

        Pantalla.escribirString("Ingrese nuevo alto (actual: " + alto + ") o presione Enter para mantener: ");
        Pantalla.escribirSaltoLinea();
        String nuevoAlto = Teclado.leerString();
        if (!nuevoAlto.isEmpty()) {
            this.alto = Integer.parseInt(nuevoAlto);
        }

        Pantalla.escribirString("Cambiar datos del centro:");
        centro.cambiarDatos();

        Pantalla.escribirString("Ingrese nuevo color (actual: " + color + ") o presione Enter para mantener: ");
        Pantalla.escribirSaltoLinea();
        String nuevoColor = Teclado.leerString();
        if (!nuevoColor.isEmpty()) {
            this.color = Integer.parseInt(nuevoColor);
        }

        Pantalla.escribirString("Datos actualizados:");
        Pantalla.escribirSaltoLinea();
        mostrarDatos();
    }
}
