package org.qist.webservice.cxfclient.config;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.qist.webservice.cxfclient.generated.cxf.HumanPortType;
import org.qist.webservice.cxfclient.generated.cxf.HumanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CXFClientConfig {



    /**
     *  以接口代理方式进行调用 AuthorPortType接口
     */
    @Bean("cxfProxy")
    public HumanPortType createAuthorPortTypeProxy() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(HumanPortType.class);
        factory.setAddress(WsConst.SERVICE_ADDRESS);

        // 添加日志输出
        System.out.println("WS-URL: " + factory.getWsdlLocation());
        System.out.println("Service Name: " + factory.getServiceName());
        System.out.println("Endpoint Name: " + factory.getEndpointName());

        return (HumanPortType) factory.create();

        // JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        // factory.setServiceClass(AuthorPortType.class);
        // factory.setWsdlLocation(WsConst.SERVICE_ADDRESS);
        // factory.setServiceName( new QName(WsConst.NAMESPACE_URI, "authorService"));
        // factory.setEndpointName(new QName(WsConst.NAMESPACE_URI, "AuthorServiceImplPort"));
        // return (AuthorPortType) factory.create();


    }

    /**
     * 采用动态工厂方式 不需要指定服务接口
     */
    @Bean
    public Client createDynamicClient() {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient(WsConst.SERVICE_ADDRESS);
        return client;
    }



    /**
     * 2. 直接调用
     */
    @Bean("jdkProxy")
    public HumanPortType createJdkService() {
        HumanService authorService = new HumanService();
        return authorService.getHumanServiceImplPort();
    }






}
