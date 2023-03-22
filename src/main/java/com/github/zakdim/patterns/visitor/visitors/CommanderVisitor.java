package com.github.zakdim.patterns.visitor.visitors;

import com.github.zakdim.patterns.visitor.model.Commander;
import lombok.extern.slf4j.Slf4j;

/**
 * Create by dmitri on 2023-03-21.
 */
@Slf4j
public class CommanderVisitor extends AbstractUnitVisitor {

    @Override
    public void visit(Commander commander) {
        log.info("Good to see you {}", commander);
    }
}
