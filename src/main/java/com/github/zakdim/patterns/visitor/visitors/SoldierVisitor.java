package com.github.zakdim.patterns.visitor.visitors;

import com.github.zakdim.patterns.visitor.model.Soldier;
import lombok.extern.slf4j.Slf4j;

/**
 * Create by dmitri on 2023-03-21.
 */
@Slf4j
public class SoldierVisitor extends AbstractUnitVisitor {

    @Override
    public void visit(Soldier soldier) {
        log.info("Greetings {}", soldier);
    }
}
