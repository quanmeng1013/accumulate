package com.fierceq.test;

import com.fierceq.initializer.SimpleXstreamInitializer;
import com.fierceq.pojo.ContactDetails;
import com.fierceq.pojo.Customer;
import com.fierceq.utilty.SimpleDataGeneration;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class XStreamJsonHierarchicalIntegrationTest {
    private Customer customer = null;
    private String dataJson = null;
    private XStream xstream = null;

    @Before
    public void dataSetup() {
        SimpleXstreamInitializer simpleXstreamInitializer = new SimpleXstreamInitializer();
        xstream = simpleXstreamInitializer.getXstreamJsonHierarchicalInstance();
        xstream.processAnnotations(Customer.class);
    }

    //@Test
    public void convertObjectToJson() {
        customer = SimpleDataGeneration.generateData();
        xstream.alias("customer", Customer.class);
        xstream.alias("contactDetails", ContactDetails.class);
        xstream.aliasField("fn", Customer.class, "firstName");
        dataJson = xstream.toXML(customer);
        System.out.println(dataJson);
        Assert.assertNotNull(dataJson);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void convertJsonToObject() {
        customer = SimpleDataGeneration.generateData();
        dataJson = xstream.toXML(customer);
        customer = (Customer) xstream.fromXML(dataJson);
        System.out.println(customer);
        Assert.assertNotNull(customer);
    }
}
