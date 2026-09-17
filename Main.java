public class Main {
    public static void main(String[] args) throws Exception {

        ArvoreBinariaDeBusca<Integer> arvore = new ArvoreBinariaDeBusca<>();

        // Raíz
        arvore.guardeUmItem(60);

        // Nodos da esquerda
        arvore.guardeUmItem(20);
        arvore.guardeUmItem(21);
        arvore.guardeUmItem(18);
        arvore.guardeUmItem(19);
        
        // Nodos da direita
        arvore.guardeUmItem(65);      
        arvore.guardeUmItem(64);
        arvore.guardeUmItem(66);
        arvore.guardeUmItem(63);

        System.out.println(arvore);

        //Verificar a existencia de um item
        System.out.println(arvore.temOItem(70));
    }
}