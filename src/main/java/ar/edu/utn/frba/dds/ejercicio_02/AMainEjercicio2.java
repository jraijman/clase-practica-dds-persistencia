package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.Repositorio;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;
import ar.edu.utn.frba.dds.ejercicio_02.personajes.Ladron;
import ar.edu.utn.frba.dds.ejercicio_02.personajes.Mago;
import com.mysql.cj.xdevapi.Warning;
import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;




public class AMainEjercicio2 implements WithSimplePersistenceUnit {

  private Repositorio repositorio;

  public static  void main(String[] args) {
    AMainEjercicio2 instance = new AMainEjercicio2();
    instance.repositorio = new Repositorio();
    instance.test();


  }

  public void test(){
    Arco arco = new Arco();
    Espada espada = new Espada();
    Escudo escudo = new Escudo();

    Mago maBorda = new Mago();
    maBorda.setNivelDeMagia(10);
    maBorda.setTieneAlas(true);
    maBorda.setEstamina(500);
    maBorda.setPuntosDeVida(100000);
    maBorda.agregarElemento(escudo);
    maBorda.agregarElemento(espada);
    maBorda.agregarElemento(arco);

    Ladron ladrILLA = new Ladron();
    ladrILLA.setNivelSiniestro(10);
    ladrILLA.setEstamina(5);
    ladrILLA.setTieneNavaja(false);
    ladrILLA.setPuntosDeVida(-5);
    ladrILLA.agregarElemento(escudo);
    ladrILLA.agregarElemento(espada);

    Jugador nachoBorda = new Jugador();
    nachoBorda.setApellido("Borda");
    nachoBorda.setNombre("Nacho");
    nachoBorda.setPersonaje(maBorda);

    Jugador nachoVilla = new Jugador();
    nachoVilla.setApellido("Villa");
    nachoVilla.setNombre("Nacho");
    nachoVilla.setPersonaje(ladrILLA);

   this.repositorio.guardar(nachoBorda);
   this.repositorio.guardar(nachoVilla);

  }

}
