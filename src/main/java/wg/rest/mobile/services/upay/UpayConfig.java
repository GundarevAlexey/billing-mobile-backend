package wg.rest.mobile.services.upay;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class UpayConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPaths("com.apus.st");
        return marshaller;
    }

    @Bean
    public UpayClient upayClient(Jaxb2Marshaller marshaller) {
        UpayClient client = new UpayClient();
        client.setDefaultUri(UpayConst.WSDL_URL);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}