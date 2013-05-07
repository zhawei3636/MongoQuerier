package com.bingdian.mapping;

import com.thoughtworks.xstream.XStream;

/**
 * Created with IntelliJ IDEA.
 * User: zhawei
 * Date: 13-5-6
 * Time: 下午1:38
 * xml 加载
 */
public class XmlLoader {
    private String xmlFileName = "com/bingdian/mapping/document-relation.xml";
    private DocumentRelation documentRelation;
    public void load(){
        XStream xStream = new XStream();
        xStream.alias("collections",DocumentRelation.class);
        xStream.alias("collection", DocumentRelation.Collection.class);
        xStream.alias("relation",DocumentRelation.Relation.class);
        xStream.alias("reference",DocumentRelation.Reference.class);
        DocumentRelation dr = new DocumentRelation();
        documentRelation = (DocumentRelation) xStream.fromXML(xmlFileName,dr);
        System.out.println(documentRelation);
    }

    public DocumentRelation getDocumentRelation() {
        return documentRelation;
    }

    public void setDocumentRelation(DocumentRelation documentRelation) {
        this.documentRelation = documentRelation;
    }
}
