package ares.remoting.framework.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


public class AresRemoteReferenceNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {

        System.out.println("reference");
        registerBeanDefinitionParser("reference", new RevokerFactoryBeanDefinitionParser());
    }
}
