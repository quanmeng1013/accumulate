package com.fierceq.pojo.test;
import com.fierceq.initializer.SimpleXstreamInitializer;
import com.fierceq.pojo.Customer;
import com.fierceq.utilty.SimpleDataGeneration;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
public class XmlToObjectIntegrationTest {
    private XStream xstream = null;

    @Before
    public void dataSetup() {
        SimpleXstreamInitializer simpleXstreamInitializer = new SimpleXstreamInitializer();
        xstream = simpleXstreamInitializer.getXstreamInstance();
    }

   // @Test
    public void convertXmlToObjectFromFile() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        FileReader reader = new FileReader(classLoader
                .getResource("data-file.xml")
                .getFile());
        Customer customer = (Customer) xstream.fromXML(reader);
        Assert.assertNotNull(customer);
    }

    @Test
    public void convertXmlToObjectFromString() {
        Customer customer = SimpleDataGeneration.generateData();
        String dataXml = xstream.toXML(customer);
        Customer convertedCustomer = (Customer) xstream.fromXML(dataXml);
        Assert.assertNotNull(convertedCustomer);
    }

}
