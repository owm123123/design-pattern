package org.example.micropattern.dataengine;


import org.jooq.lambda.tuple.Tuple;

import java.util.List;
import java.util.Map;

/**
 * 1. <TABLE, KEY extends Tuple> :
 *      extends TableBuilder 的 Class 都需要帶入 table 跟 key
 */
public abstract class TableBuilder<TABLE, KEY extends Tuple> implements Builder<TABLE> {
    // 需實作
    protected abstract KEY getKey(TABLE t);

    // 須實作
    protected abstract Map<KEY, TABLE> init();

    @Override
    public List<TABLE> build() {
        Map<KEY, TABLE> map = init();
        return map.values().stream().toList();
    }
}
