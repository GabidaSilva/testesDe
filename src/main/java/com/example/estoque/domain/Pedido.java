package com.example.estoque.domain;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pedido implements List<ItemPedido> {

    List<ItemPedido> itens;

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
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
    public Iterator<ItemPedido> iterator() {
        return null;
    }
    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
    @Override
    public boolean add(ItemPedido itemPedido) {
        return false;
    }
    @Override
    public boolean remove(Object o) {
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }
    @Override
    public boolean addAll(Collection<? extends ItemPedido> c) {
        return false;
    }
    @Override
    public boolean addAll(int index, Collection<? extends ItemPedido> c) {
        return false;
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
    @Override
    public void clear() {

    }
    @Override
    public ItemPedido get(int index) {
        return null;
    }
    @Override
    public ItemPedido set(int index, ItemPedido element) {
        return null;
    }
    @Override
    public void add(int index, ItemPedido element) {

    }
    @Override
    public ItemPedido remove(int index) {
        return null;
    }
    @Override
    public int indexOf(Object o) {
        return 0;
    }
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
    @Override
    public ListIterator<ItemPedido> listIterator() {
        return null;
    }
    @Override
    public ListIterator<ItemPedido> listIterator(int index) {
        return null;
    }
    @Override
    public List<ItemPedido> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
