package com.ll.resttemplate.objectmapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
//忽略掉 Json字串多出來的key
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {

    Integer _id;

    @JsonProperty("_importdate")
    UnitImportDate unitImportDate;

    @JsonProperty("序號")
    String id;
    @JsonProperty("商圈")
    String shopArea;
    @JsonProperty("區")
    String state;
    @JsonProperty("標籤")
    String tag;
    @JsonProperty("組織名稱")
    String organizeName;
    @JsonProperty("坐落位置")
    String location;
    @JsonProperty("鄰近捷運")
    String mrt;
    @JsonProperty("商圈類型")
    String shopType;
    @JsonProperty("說明")
    String directions;



}
