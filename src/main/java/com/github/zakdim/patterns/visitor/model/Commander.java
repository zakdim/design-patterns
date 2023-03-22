package com.github.zakdim.patterns.visitor.model;

import com.github.zakdim.patterns.visitor.visitors.UnitVisitor;

/**
 * Create by dmitri on 2023-03-21.
 */
public class Commander extends UnitMember {

    public Commander(String name, UnitMember... subordinates) {
        super(name, subordinates);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }
}
