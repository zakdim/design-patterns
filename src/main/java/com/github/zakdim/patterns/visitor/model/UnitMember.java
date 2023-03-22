package com.github.zakdim.patterns.visitor.model;

import com.github.zakdim.patterns.visitor.visitors.UnitVisitor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * Create by dmitri on 2023-03-21.
 */

@Setter
@Getter
public abstract class UnitMember {

    private String name;

    private final UnitMember[] subordinates;

    public UnitMember(String name, UnitMember... subordinates) {
        this.name = name;
        this.subordinates = subordinates;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(subordinates).forEach(sub -> sub.accept(visitor));
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getClass().getSimpleName(), getName());
    }
}
