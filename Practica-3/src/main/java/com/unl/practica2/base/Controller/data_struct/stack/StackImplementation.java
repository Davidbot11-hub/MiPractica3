package com.unl.practica2.base.Controller.data_struct.stack;

import com.unl.practica2.base.Controller.data_struct.list.LinkedList;

public class StackImplementation<E> extends LinkedList<E> {
    private Integer top;

    public Integer getTop() {
        return this.top;
    }

    public StackImplementation(Integer top){
        this.top = top;
    }

    protected Boolean isFullStack() {
        return getLength() >  this.top ;
    }

    protected void push(E info) throws Exception {
        if(!isFullStack()) {
            add(info, 0);
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack full");
        }
    }
    protected E pop() throws Exception {       
        return deleteFirst();
        
    }
}

