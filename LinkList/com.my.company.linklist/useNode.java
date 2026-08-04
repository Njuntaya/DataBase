package com.my.company.linklist;

public class useNode {
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node Travel;

        n1.info = 1;
        n2.info = 2;
        n3.info = 3;
        n4.info = 4;

        n1.link = n2;
        n2.link = n3;
        n3.link = n4;
        Travel = n1;

        while (Travel != null) {
            System.out.println(Travel.info);
            Travel = Travel.link;
        }
    }
}
