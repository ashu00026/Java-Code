package org.example.OCP;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
