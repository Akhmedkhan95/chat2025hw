package ru.otus.chat;

import java.io.IOException;

public class ClientApplication {
    public static void main(String[] args) {
        //доработка
        try {
            new Client();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}