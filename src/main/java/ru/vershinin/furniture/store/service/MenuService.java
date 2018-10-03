package ru.vershinin.furniture.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vershinin.furniture.store.model.MenuItem;

import java.util.List;

@Component
public class MenuService {

    @Autowired
    private List<MenuItem> menuItems;

    public List<MenuItem> getMenuListWithActiveElement(String name) throws Exception {
        int itemsFound = 0;

        for (MenuItem element: menuItems) {
            element.setActive(false);
            if (element.getName().equals(name)) {
                element.setActive(true);
                itemsFound++;
            }
        }

        if (itemsFound == 0) {
            throw new Exception("Element not found.");
        }

        if (itemsFound > 1) {
            throw new Exception("Found more then one element.");
        }

        return menuItems;
    }
}
