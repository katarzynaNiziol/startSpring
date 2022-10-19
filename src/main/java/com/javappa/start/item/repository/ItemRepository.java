package com.javappa.start.item.repository;

import com.javappa.start.item.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class ItemRepository {
    protected final Map<Long, Item> map = new HashMap<>();
    protected long counter = 1;

    public Item save(Item entity) {
        setId(entity);
        return entity;
    }

    private Item setId(Item entity) {
        entity.setId(counter);
        map.put(counter, entity);
        counter++;
        return entity;
    }
}
