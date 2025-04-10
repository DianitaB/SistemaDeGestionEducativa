package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Rol;
import ec.edu.ups.poo.enums.TipoDireccion;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {
        Institucion institucion001 = new Institucion(
                1,
                "Universidad Nacional De Loja");
        institucion001.getSedes().add("Sede Loja");
        institucion001.addDireccion(
                TipoDireccion.INSTITUCION,
                "Av.Pio Jaramillo Alvarado",
                "110103",
                "Loja",
                "Loja",
                "Ecuador");

        Institucion institucion002 = new Institucion(
                2,
                "University of Connecticut");
        institucion002.getSedes().add("Storrs");
        institucion002.addDireccion(
                TipoDireccion.INSTITUCION,
                "Glenbrook Road, " +
                        "Storrs,CT",
                "241",
                "Stors",
                "Connecticut"
                , "USA");

        Estudiante estudiante = new Estudiante(
                "0107271108",
                "Danny",
                "Burhuan",
                "0979844701",
                "dannyburhuan@gmail.com",
                "Ingenieria Automotriz");

        Docente docente = new Docente(
                "0203456609",
                "Maria",
                "Hernandez",
                "0994664467",
                "mari87hern@gmail.com",
                Arrays.asList("Ingeniero/a Electrica"),
                Arrays.asList("Algebra Lineal"));

        Administrativo administrativo = new Administrativo(
                "0107453308",
                "Juan",
                "Gomez",
                "0995772289",
                "juanito097he@gmail.com",
                Arrays.asList("Rector"),
                Arrays.asList("Supervisor"));

        Visitante visitante = new Visitante(
                "0357830274",
                "Estela",
                "Campoverde",
                "0223445587",
                "estelis34acm@gmail.com",
                "Visita Tecnia",
                new GregorianCalendar(2023, 03, 21),
                new GregorianCalendar(2023, 03, 22));

        Asignacion asignacion001 = new Asignacion(
                estudiante,
                new GregorianCalendar(2024, 06, 10),
                Rol.ESTUDIANTE);
        institucion001.getAsignaciones().add(asignacion001);

        Asignacion asignacion002 = new Asignacion(
                docente,
                new GregorianCalendar(2024, 11, 12),
                Rol.DOCENTE);
        institucion001.getAsignaciones().add(asignacion002);

        Asignacion asignacion003 = new Asignacion(
                administrativo,
                new GregorianCalendar(2025, 02, 12),
                Rol.ADMINISTRTIVO);
        institucion002.getAsignaciones().add(asignacion003);

        Asignacion asignacion004 = new Asignacion(
                visitante,
                new GregorianCalendar(2025, 01, 02),
                Rol.VISITANTE);
        institucion002.getAsignaciones().add(asignacion004);

        System.out.println("------ INSTITUCIÓN 1 ------");
        System.out.println("Nombre: " + institucion001.getNombre());
        System.out.println("Sedes: " + institucion001.getSedes());
        System.out.println("Direccion: " + institucion001.getDireccion());

        System.out.println("----- Estudiantes -----");
        System.out.println(estudiante.getNombre() + estudiante.getApellido());
        System.out.println("Carrera: " + estudiante.getCarrera());

        System.out.println("----- Docentes -----");
        System.out.println(docente.getNombre() + docente.getApellido());
        System.out.println("Títulos: " + docente.getTituloAcademico());
        System.out.println("Area de Especialización: " + docente.getAreaDeEspecializacion());

        System.out.println("----- Asignaciones -----");
        System.out.println(asignacion001);
        System.out.println(asignacion002);

        System.out.println("----- INSTITUCION 2 -----");
        System.out.println(asignacion003);
        System.out.println(asignacion004);
    }
}
