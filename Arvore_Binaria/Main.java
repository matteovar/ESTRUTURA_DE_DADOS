package Arvore_Binaria;

public class Main {

    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree(null);

        Node A = new Node("A"); 
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");

        A.setleft(B);
        A.setright(C);
        B.setleft(D);
        C.setleft(E);
        C.setright(F);

        tree.setroot(A);
    
        System.out.println(A.getdata() + " É raiz? " + A.isRoot()); 
        System.out.println(F.getdata() + " É folha? " + F.isLeaf());
        System.out.println(B.getdata() + " Grau: " + B.getDegree());
        System.out.println(E.getdata() + " Nivel: " + E.getLevel());
        System.out.println(C.getdata() + " Altura: " + C.getHeight());

        System.out.println("Arvore vazia? " + tree.isEmpty());
        System.out.println("Grau da arvore: " + tree.getDegree());  
        System.out.println("Tamanho da arvore: " + tree.getHeight());

        System.out.print("Percurso em ordem: ");
        tree.inOrderTraversal();
        
        System.out.print("\nPercurso em pré-oredem: ");
        tree.preOrderTraversal();
        
        System.out.print("\nPercurso pós-ordem: ");
        tree.postOrderTraversal();
        System.out.println("\n");
    }

}