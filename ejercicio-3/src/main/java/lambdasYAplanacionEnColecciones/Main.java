package lambdasYAplanacionEnColecciones;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("pamela");
        nombres.add("mauro");
        nombres.add("gabriela");
        nombres.add("leandro");
        nombres.add("laura");

        System.out.printf("LISTA NOMBRES: %n");
        nombres.forEach(System.out::println);

        List<String> nombresEnMayusculas = obtenerEnMayuscula(nombres);

        System.out.printf("%nLISTA NOMBRES TRANSFORMADA A MAYÚSCULAS:%n");
        nombresEnMayusculas.forEach(System.out::println);

        String nombresDeLongitudMayor = obtenerElementosDeLongitudMayor(nombres, 5);

        System.out.printf("%nLISTA NOMBRES TRANSFORMADA A STRING CON CARACTER DELIMITANTE:%n%s%n", nombresDeLongitudMayor);
    }

    public static List<String> obtenerEnMayuscula(List<String> elementos) {
        return elementos.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static String obtenerElementosDeLongitudMayor(List<String> lista, int n) {
        List<String> listaFiltrada = lista.stream().filter(elemento -> elemento.length() > n).collect(Collectors.toList());

        return listaFiltrada.stream().collect(Collectors.joining(", "));
    }
}