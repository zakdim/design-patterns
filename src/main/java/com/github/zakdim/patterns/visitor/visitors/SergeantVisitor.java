package com.github.zakdim.patterns.visitor.visitors;

import com.github.zakdim.patterns.visitor.model.Sergeant;
import lombok.extern.slf4j.Slf4j;

/**
 * Create by dmitri on 2023-03-21.
 */
@Slf4j
public class SergeantVisitor extends AbstractUnitVisitor {

    @Override
    public void visit(Sergeant sergeant) {
        log.info("Hello {}", sergeant);
    }
}
