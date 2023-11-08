package interfacesFuncionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Transformador {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("pamela");
        nombres.add("mauro");
        nombres.add("gabriela");
        nombres.add("leandro");
        nombres.add("laura");

        System.out.printf("LISTA NOMBRES: %n");
        nombres.forEach(System.out::println);

        List<String> nombresEnMayusculas = aplicarALista(nombres, (s) -> s.toUpperCase());

        System.out.printf("%nLISTA NOMBRES TRANSFORMADA A MAYÚSCULAS:%n");
        nombresEnMayusculas.forEach(System.out::println);
    }

    public static List<String> aplicarALista(List<String> elementos, Function<String, String> function) {
        List<String> resultado = new ArrayList<>();

        for (String elemento : elementos) {
            resultado.add(function.apply(elemento));
        }

        return resultado;
    }
}