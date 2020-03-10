package com.example.ase;

public class NotFoundException extends Exception {

    private String message;

    public NotFoundException(String message){
        this.message = message;
        System.out.println("NotFoundException::" +message);
    }
}
