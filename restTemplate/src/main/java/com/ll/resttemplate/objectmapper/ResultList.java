package com.ll.resttemplate.objectmapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ll.resttemplate.objectmapper.Results;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class ResultList {
    @JsonProperty("limit")
    Integer limitData;
    Integer offset;
    Integer count;
    String sort;

    List<Results> results;
}
