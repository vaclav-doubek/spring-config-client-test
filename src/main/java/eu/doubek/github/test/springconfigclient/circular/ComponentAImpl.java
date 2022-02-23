package eu.doubek.github.test.springconfigclient.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("componentA")
public class ComponentAImpl implements ComponentA {

    @Autowired
    private ComponentB componentB;

}
