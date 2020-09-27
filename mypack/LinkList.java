package mypack;

public class LinkList {

    public Node head;
    public int totalNodeNumber;
    // -- Insert at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = null;
        } else {
            // If head = Node1 -> Node1.next = Node2
            // We need to find the last node
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = newNode;
            newNode.next = null;
        }
        updateTotalNodeNumber();
    }
    public int getData(int index) {
        if (index >= 0 && index < totalNodeNumber) {
            Node n = head;
            int check = 0;
            while (check < index) {
                n = n.next;
                check++;
            }
            int nodeData = n.data;
            return nodeData;
        } 
        throw new ArithmeticException("The number you input is out of index");
    }
    public void deleteNode(int index) {
        if (index == totalNodeNumber - 1) {
            getNodeFromIndex(index, "previous").next = null;
        } else if (index >= 0 && index < totalNodeNumber) {
            if (index == 0) {
                head = head.next;
            } else {
                Node n = head;
                int check = 0;
                Node beforeNode = null;
                while (check < index) {
                    if (check == index - 1) {
                        beforeNode = n;
                    }
                    n = n.next;
                    check++;
                }
                // Node gonnaDeleteNode = n;
                Node afterNode = n.next;
                beforeNode.next = afterNode;
            }

        } else {
            System.out.println("It out of index");
        }
        updateTotalNodeNumber();
    }
    public Node getNodeFromIndex(int index, String mode) {
        Node n = head;
        int check = 0;
        Node beforeNode = null;
        while (check < index) {
            if (check == index - 1) {
                beforeNode = n;
            }
            n = n.next;
            check++;
        }
        if (mode == "exactly") {
            return n;
        } else if (mode == "previous") {
            return beforeNode;
        } else {
            return n.next;
        }
    }
    public void insertNodeAt(Node nodeGonnaAdd, int position) {
        if (position > 0 && position < totalNodeNumber) {
            // Node newNode = new Node(nodeGonnaAdd.data);
            Node nodeAtDesirePosition = getNodeFromIndex(position, "exactly");
            Node previousNodeAtDesirePosition = getNodeFromIndex(position, "previous");
            previousNodeAtDesirePosition.next = nodeGonnaAdd;
            nodeGonnaAdd.next = nodeAtDesirePosition;
        } 
        if (position == 0) {
            // Node newNode = new Node(nodeGonnaAdd.data);
            nodeGonnaAdd.next = getNodeFromIndex(0, "exactly");
            head = nodeGonnaAdd;
            // newNode.next = getNodeFromIndex(1, "exactly");
            // System.out.println("hello");
        }
        updateTotalNodeNumber();

    }
    public void insertDataAt(int position, int data) {
        Node newNode = new Node(data);
        if (position > 0 && position < totalNodeNumber) {
            Node nodeAtDesirePosition = getNodeFromIndex(position, "exactly");
            Node previousNodeAtDesirePosition = getNodeFromIndex(position, "previous");
            previousNodeAtDesirePosition.next = newNode;
            newNode.next = nodeAtDesirePosition;
        } 
        if (position == 0) {
            newNode.next = getNodeFromIndex(0, "exactly");
            head = newNode;
            // newNode.next = getNodeFromIndex(1, "exactly");
            // System.out.println("hello");
        }
        updateTotalNodeNumber();
    }
    
    public int totalNode() {
        Node n = head;
        int check = 0;
        while (n.next != null) {
            n = n.next;
            check++;
        }
        check++;
        totalNodeNumber = check;
        return check;
    }
    public void updateTotalNodeNumber() {
        totalNodeNumber = totalNode();
    }
}