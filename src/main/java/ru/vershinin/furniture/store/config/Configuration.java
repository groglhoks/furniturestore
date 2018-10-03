package ru.vershinin.furniture.store.config;

import org.springframework.context.annotation.Bean;
import ru.vershinin.furniture.store.model.MenuItem;

import java.util.ArrayList;
import java.util.List;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    List<MenuItem> menuItems(){
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(MenuItem.builder().name("ABOUT US").link("/about_us").active(false).build());
        menuItems.add(MenuItem.builder().name("FURNITURE").link("/furniture").active(false).build());
        menuItems.add(MenuItem.builder().name("SPECIAL OFFER").link("/special_offer").active(false).build());
        menuItems.add(MenuItem.builder().name("NEWS").link("/news").active(false).build());
        menuItems.add(MenuItem.builder().name("CONTACTS").active(false).link("/contacts").build());

        return menuItems;
    }
}
