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

        // Exibindo informações dos nós
        System.out.println(A.getdata() + " isRoot? " + A.isRoot()); 
        System.out.println(F.getdata() + " isLeaf? " + F.isLeaf());
        System.out.println(B.getdata() + " degree: " + B.getDegree());
        System.out.println(E.getdata() + " level: " + E.getLevel());
        System.out.println(C.getdata() + " height: " + C.getHeight());

        // Exibindo informações da árvore
        System.out.println("Tree is empty? " + tree.isEmpty());
        System.out.println("Tree degree: " + tree.getDegree());  
        System.out.println("Tree height: " + tree.getHeight());

        System.out.print("In-order traversal: ");
        tree.inOrderTraversal();
        
        System.out.print("\nPre-order traversal: ");
        tree.preOrderTraversal();
        
        System.out.print("\nPost-order traversal: ");
        tree.postOrderTraversal();
    }

}