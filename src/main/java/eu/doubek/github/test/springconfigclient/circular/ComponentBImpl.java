package eu.doubek.github.test.springconfigclient.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("componentB")
public class ComponentBImpl implements ComponentB {

    @Autowired
    private ComponentA componentA;

}
