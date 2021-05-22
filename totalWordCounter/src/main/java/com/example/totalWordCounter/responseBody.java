package com.example.totalWordCounter;

/**
 * Maps the outgoing response that is expected.
 *
 * count - An integer, used to identify total number of cumulative words recieved.
 */
public class responseBody {

    private static int count;

    public responseBody(){
        this.count = 0;
    }

    public responseBody(int count)
    {
        setCount(count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}