package org.example.l;

public class Bitki implements Canlı {
    @Override
    public String yemekYeyir() {
        return "Bitki yemək yeyir";
    }

    @Override
    public String nefesAlır() {
        return "Bitki nəfəs alır";
    }

    public String çiçəkAçır() {
        return "Bitki çiçək açır";
    }
}
