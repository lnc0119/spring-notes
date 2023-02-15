package com.ll.resttemplate.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ll.resttemplate.objectmapper.ResultList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaipeiShopData {

    @JsonProperty("result")
    ResultList resultList;
}

