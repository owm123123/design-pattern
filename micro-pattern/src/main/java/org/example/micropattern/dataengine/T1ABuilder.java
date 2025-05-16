package org.example.micropattern.dataengine;

import org.example.micropattern.eneity.eneityA.A1Entity;
import org.example.micropattern.eneity.eneityT.T1Entity;
import org.jooq.lambda.tuple.Tuple;
import org.jooq.lambda.tuple.Tuple1;

import java.util.Map;

public class T1ABuilder
        // 每個 builder 需要實作哪些功能
        extends TableBuilder<T1Entity, Tuple1<Integer>>
        // 定義 需要 微索引 的欄位
        implements T1Builder{
    @Override
    protected Tuple1<Integer> getKey(T1Entity t) {
        return null;
    }

    @Override
    protected Map<Tuple1<Integer>, T1Entity> init() {
        return Map.of();
    }
}
