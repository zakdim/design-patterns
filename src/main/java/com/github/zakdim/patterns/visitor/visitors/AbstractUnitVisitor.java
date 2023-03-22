package com.github.zakdim.patterns.visitor.visitors;

import com.github.zakdim.patterns.visitor.model.Sergeant;
import com.github.zakdim.patterns.visitor.model.Soldier;
import com.github.zakdim.patterns.visitor.model.Commander;

/**
 * Create by dmitri on 2023-03-21.
 */
public class AbstractUnitVisitor implements UnitVisitor {
    @Override
    public void visit(Soldier soldier) {
        // Do nothing
    }

    @Override
    public void visit(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visit(Commander commander) {
        // Do nothing
    }
}
