package org.example.micropattern.dataengine;

import org.example.micropattern.eneity.eneityT.T1Entity;
import org.jooq.lambda.tuple.Tuple;
import org.jooq.lambda.tuple.Tuple1;

import java.util.Map;

public class T1BBuilder extends TableBuilder<T1Entity, Tuple1<Integer>> implements T1Builder{
    @Override
    protected Tuple1<Integer> getKey(T1Entity t) {
        return null;
    }

    @Override
    protected Map<Tuple1<Integer>, T1Entity> init() {
        return Map.of();
    }
}
