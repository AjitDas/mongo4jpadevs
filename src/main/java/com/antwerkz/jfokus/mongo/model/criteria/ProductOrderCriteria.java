package com.antwerkz.jfokus.mongo.model.criteria;

import com.antwerkz.critter.TypeSafeFieldEnd;
import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Criteria;
import com.google.code.morphia.query.CriteriaContainer;
import com.google.code.morphia.query.Query;
import org.bson.types.ObjectId;

public class ProductOrderCriteria {
  private Query<com.antwerkz.jfokus.mongo.model.ProductOrder> query;

  public Query<com.antwerkz.jfokus.mongo.model.ProductOrder> query() {
    return query;
  }

  public ProductOrderCriteria(Datastore ds) {
    query = ds.find(com.antwerkz.jfokus.mongo.model.ProductOrder.class);
  }

  public CriteriaContainer or(Criteria... criteria) {
    return query.or(criteria);
  }

  public CriteriaContainer and(Criteria... criteria) {
    return query.and(criteria);
  }

  public TypeSafeFieldEnd<? extends CriteriaContainer, com.antwerkz.jfokus.mongo.model.ProductOrder, java.lang.Boolean> fulfilled() {
    return new TypeSafeFieldEnd<>(query, query.criteria("fulfilled"));
  }

  public TypeSafeFieldEnd<? extends CriteriaContainer, com.antwerkz.jfokus.mongo.model.ProductOrder, org.bson.types.ObjectId> id() {
    return new TypeSafeFieldEnd<>(query, query.criteria("id"));
  }

  public TypeSafeFieldEnd<? extends CriteriaContainer, com.antwerkz.jfokus.mongo.model.ProductOrder, java.util.Date> orderDate() {
    return new TypeSafeFieldEnd<>(query, query.criteria("orderDate"));
  }

  public TypeSafeFieldEnd<? extends CriteriaContainer, com.antwerkz.jfokus.mongo.model.ProductOrder, java.util.List<com.antwerkz.jfokus.mongo.model.Product>> products() {
    return new TypeSafeFieldEnd<>(query, query.criteria("products"));
  }

  public TypeSafeFieldEnd<? extends CriteriaContainer, com.antwerkz.jfokus.mongo.model.ProductOrder, java.lang.Integer> size() {
    return new TypeSafeFieldEnd<>(query, query.criteria("size"));
  }

  public TypeSafeFieldEnd<? extends CriteriaContainer, com.antwerkz.jfokus.mongo.model.ProductOrder, java.lang.Double> total() {
    return new TypeSafeFieldEnd<>(query, query.criteria("total"));
  }

  public TypeSafeFieldEnd<? extends CriteriaContainer, com.antwerkz.jfokus.mongo.model.ProductOrder, org.bson.types.ObjectId> userId() {
    return new TypeSafeFieldEnd<>(query, query.criteria("userId"));
  }
}
