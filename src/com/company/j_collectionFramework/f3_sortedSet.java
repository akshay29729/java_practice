package com.company.j_collectionFramework;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public class f3_sortedSet implements SortedSet{
    public static void main(String[] args) {
        f3_sortedSet f1 = new f3_sortedSet();
        f1.add(1);
        f1.add(32);
        f1.add(23);
        f1.add(30);
        f1.add(20);
        System.out.println(f1.headSet(20));
        System.out.println(f1.tailSet(20));
        System.out.println(f1.first());
        System.out.println(f1.last());
        System.out.println(f1.remove(3));
        System.out.println(f1.isEmpty());
//        System.out.println(f1.comparator());
    }

    @Override
    public Comparator comparator() {
        return this.comparator();
    }

    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        return null;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        return null;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object last() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
