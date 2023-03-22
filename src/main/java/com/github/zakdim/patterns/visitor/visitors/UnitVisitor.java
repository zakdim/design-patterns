package com.github.zakdim.patterns.visitor.visitors;

import com.github.zakdim.patterns.visitor.model.Commander;
import com.github.zakdim.patterns.visitor.model.Sergeant;
import com.github.zakdim.patterns.visitor.model.Soldier;

public interface UnitVisitor {

    void visit(Soldier soldier);
    void visit(Sergeant sergeant);
    void visit(Commander commander);
}
