public class Main {
    public static void main(String[] args) throws Exception {

        ArvoreBinariaDeBusca<Integer> arvore = new ArvoreBinariaDeBusca<>();

        arvore.guardeUmItem(60);
        arvore.guardeUmItem(65);
        arvore.guardeUmItem(6);

        System.out.println(arvore);
    }
}