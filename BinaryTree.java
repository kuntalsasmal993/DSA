import java.util.*;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binary_tree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
                Node newNode = new Node(nodes[index]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
        }
    }

    //preorder traversal = root ---> left----> right
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);

    }
    // inorder traversal = left subtree ---> root ---> right subtree
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    // postorder traverse = left subtree--> right subtree--> root
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
    //level order == BFS
    public static void levelorder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currentNode = q.remove();
             if(currentNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
             }else{
                System.out.print(currentNode.data+" ");
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }if(currentNode.right != null){
                    q.add(currentNode.right);
                }
             }
        }
         
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};// tree node info in preorder sequence. -1 = NULL;
    
        
        Binary_tree tree = new Binary_tree();
        Node root = tree.buildTree(nodes);

        System.out.println("root node is: "+root.data);
        // preorder(root);
        // inorder(root);
        //postorder(root);
        levelorder(root);
    }
}
