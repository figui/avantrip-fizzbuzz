package com.avantrip.fizzbuzz.decorator;

import java.util.List;

/**
 * Su responsabilidad es de ejecutar los decoradores configurados de forma ordenada
 */
public class Decorator implements Component {

    private List<Component> components;

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public void process(StringBuffer sb, Integer n) {
        for(Component component : components) {
            component.process(sb, n);
        }
    }
}
