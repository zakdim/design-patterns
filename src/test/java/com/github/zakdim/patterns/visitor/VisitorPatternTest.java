package com.github.zakdim.patterns.visitor;

import com.github.zakdim.patterns.visitor.model.Soldier;
import com.github.zakdim.patterns.visitor.visitors.SergeantVisitor;
import com.github.zakdim.patterns.visitor.visitors.SoldierVisitor;
import com.github.zakdim.patterns.visitor.model.Commander;
import com.github.zakdim.patterns.visitor.model.Sergeant;
import com.github.zakdim.patterns.visitor.visitors.CommanderVisitor;
import org.junit.jupiter.api.Test;

/**
 * Create by dmitri on 2023-03-21.
 */
public class VisitorPatternTest {

    @Test
    void visitUnits() {
        var sergeant1 = new Sergeant("Cedric",
                new Soldier("Salim"), new Soldier("Koffi"), new Soldier("Dmitri"));
        var sergeant2 = new Sergeant("Franck",
                new Soldier("Antoine"), new Soldier("Lucian"), new Soldier("Ousama"));

        var commander = new Commander("Nicolai", sergeant1, sergeant2);

        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}
