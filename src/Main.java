import java.util.*;

public class Main {
    public static void main(String[] args) {
        segundaLista();
        listaNomes();
    }
    private static void segundaLista() {
        Scanner sc = new Scanner(System.in);
        List<String> listaHomens = new LinkedList<>();
        List<String> listaMulheres = new LinkedList<>();
        String pessoasGeneros = sc.nextLine();
        String[] pessoasGenerosCortes = pessoasGeneros.split(", ");


        for (int i = 0; i < pessoasGenerosCortes.length; i++){
            if (pessoasGenerosCortes[i].endsWith("-h")){
                listaHomens.add(pessoasGenerosCortes[i]);
            } else if (pessoasGenerosCortes[i].endsWith("-m")){
                listaMulheres.add(pessoasGenerosCortes[i]);
            } else {
                break;
            }
        }

        System.out.print("Lista de homens: " + listaHomens);
        System.out.print("\n");
        System.out.print("Lista de mulheres: " + listaMulheres);

    }
    private static void listaNomes() {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String pessoas = sc.nextLine();
        String[] pessoasCorte = pessoas.split(", ");
        lista.addAll(Arrays.asList(pessoasCorte));
        Collections.sort(lista);
        System.out.println(lista);
    }

}