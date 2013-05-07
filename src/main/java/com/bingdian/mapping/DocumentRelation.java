package com.bingdian.mapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhawei
 * Date: 13-5-7
 * Time: 上午10:51
 * xml 映射对象
 */
public class DocumentRelation {
    private List<Collection> collections;

    public class Collection{
        private List<Relation> relations;

        public List<Relation> getRelations() {
            return relations;
        }

        public void setRelations(List<Relation> relations) {
            this.relations = relations;
        }
    }

    public class Relation{
        public String key;
        public Reference reference;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Reference getReference() {
            return reference;
        }

        public void setReference(Reference reference) {
            this.reference = reference;
        }
    }

    public class Reference{
        private String  type;
        private String value;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    @Override
    public String toString(){
        return String .valueOf(collections.size());
    }
}
