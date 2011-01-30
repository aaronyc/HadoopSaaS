
package org.me.hadoop.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "HadoopService", targetNamespace = "http://service.hadoop.me.org/", wsdlLocation = "http://localhost:8080/HadoopService/HadoopService?WSDL")
public class HadoopService_Service
    extends Service
{

    private final static URL HADOOPSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.me.hadoop.service.HadoopService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.me.hadoop.service.HadoopService_Service.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/HadoopService/HadoopService?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/HadoopService/HadoopService?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        HADOOPSERVICE_WSDL_LOCATION = url;
    }

    public HadoopService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HadoopService_Service() {
        super(HADOOPSERVICE_WSDL_LOCATION, new QName("http://service.hadoop.me.org/", "HadoopService"));
    }

    /**
     * 
     * @return
     *     returns HadoopService
     */
    @WebEndpoint(name = "HadoopServicePort")
    public HadoopService getHadoopServicePort() {
        return super.getPort(new QName("http://service.hadoop.me.org/", "HadoopServicePort"), HadoopService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HadoopService
     */
    @WebEndpoint(name = "HadoopServicePort")
    public HadoopService getHadoopServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.hadoop.me.org/", "HadoopServicePort"), HadoopService.class, features);
    }

}
