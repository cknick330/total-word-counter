package com.example.totalWordCounter;

/**
 * Maps the incoming request that is expected.
 *
 * id - An integer, used to identify a request.
 * message - A string, containing words that may be summed.
 */
public class requestBody {

    private int id;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}