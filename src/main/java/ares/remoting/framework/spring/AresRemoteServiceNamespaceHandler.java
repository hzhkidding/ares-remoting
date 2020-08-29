package ares.remoting.framework.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


public class AresRemoteServiceNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {

        System.out.println("service");
        registerBeanDefinitionParser("service", new ProviderFactoryBeanDefinitionParser());
    }
}
