package com.designpattern.Iterator;

public class ConcreteIterator implements Iterator {

	private int current = 0;
    private ConcreteAggregate aggregate;
    
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        current++;
        if (current < aggregate.size()) {
            return aggregate.get(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return (current >= aggregate.size()) ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }

}
