package br.com.ada.projeto.formula1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Formula1 {

    static ArrayList<Piloto> pilotos = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Formula1\\formula1.txt");

        if(Files.notExists(path)) {
            Files.createFile(path);
        }




        var tempoDaPrimeiraVoltaPiloto1 = LocalTime.of(1, 30, 24);
        Piloto piloto1 = new Piloto.PilotoBuilder()
                .numeroCarro(144)
                .tempoPorVolta(tempoDaPrimeiraVoltaPiloto1)
                .nomePiloto("Tatiana")
                .sexo(Sexo.FEMININO)
                .nomeEquipe("Deva")
                .criarPiloto();


        var tempoDaPrimeiraVoltaPiloto2 = LocalTime.of(1, 35, 41);
        Piloto piloto2 = new Piloto.PilotoBuilder()
                .numeroCarro(200)
                .tempoPorVolta(tempoDaPrimeiraVoltaPiloto2)
                .nomePiloto("Hamilton")
                .sexo(Sexo.MASCULINO)
                .nomeEquipe("GoldCar")
                .criarPiloto();

        var tempoDaPrimeiraVoltaPiloto3 = LocalTime.of(1, 39, 23);
        Piloto piloto3 = new Piloto.PilotoBuilder()
                .numeroCarro(102)
                .tempoPorVolta(tempoDaPrimeiraVoltaPiloto3)
                .nomePiloto("Ayrton")
                .sexo(Sexo.MASCULINO)
                .nomeEquipe("BrasilCar")
                .criarPiloto();


        pilotos.add(piloto1);
        pilotos.add(piloto2);
        pilotos.add(piloto3);
        ordenar(pilotos.stream());
        pesquisaPorNome(pilotos.stream());
    }

        private static void ordenar(Stream<Piloto> streamPilotos) {
            System.out.println("\n----Ordenar pelo número do carro----");
            streamPilotos.sorted(Comparator.comparingInt(Piloto::getNumeroCarro))
                    .forEach(System.out::println);
        }

    private static void pesquisaPorNome(Stream<Piloto> streamPilotos) {
        System.out.println("\n----Pesquisa por nome----");
        streamPilotos.filter(item -> item.getNomePiloto().toLowerCase().contains("tatiana"))
                .forEach(System.out::println);
    }

    }

