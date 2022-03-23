package com.dnu.springbootlearn_4.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Created by lgx on 2022/3/18.
 */
@Data
@Component
@Validated
@ConfigurationProperties("family")
public class Family {
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}
