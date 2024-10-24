package com.example.adapterdesignpattern;

public class AdapterDesignPattern {
    public static void main(String[] args) {


        //PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("Im bit tired to write an Assignment.");

    }
}
