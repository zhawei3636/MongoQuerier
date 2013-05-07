package com.bingdian.mapping;

import junit.framework.Test;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: zhawei
 * Date: 13-5-7
 * Time: 下午1:20
 *
 */

public class XmlLoaderTest extends TestCase{

    public void testLoadXml(){
        XmlLoader loader = new XmlLoader();
        loader.load();
        assertNotNull(loader.getDocumentRelation());
    }


}
