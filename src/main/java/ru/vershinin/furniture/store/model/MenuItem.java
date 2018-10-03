package ru.vershinin.furniture.store.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuItem {
    private String name;
    private String link;
    private Boolean active;

}
