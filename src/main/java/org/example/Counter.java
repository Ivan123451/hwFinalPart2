package org.example;

public class Counter implements AutoCloseable {
    private int count = 0;
    private boolean closed = false;

    public void add() {
        if (!closed) {
            count++;
        } else {
            throw new IllegalStateException("Счетчик закрыт.");
        }
    }

    public int getCount() {
        if (!closed) {
            return count;
        } else {
            throw new IllegalStateException("Счетчик закрыт.");
        }
    }

    @Override
    public void close() {
        closed = true;
    }
}

