/*
 *  Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com)
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.ballerina.wsdl.core.recordgenerator.ballerinair;

import java.util.ArrayList;
import java.util.List;

public class BasicField implements Field {
    private String name;
    private String type;
    private boolean required;
    private boolean nullable;
    private String defaultValue;
    private boolean array;
    private boolean isAttributeField;
    private List<FieldConstraint> constraints;
    private List<XMLNSAttribute> xmlnsAttributes;

    public BasicField(String name, String type) {
        this.name = name;
        this.type = type;
        this.required = true;
        this.nullable = false;
        this.array = false;
        this.isAttributeField = false;
        this.constraints = new ArrayList<>();
        this.xmlnsAttributes = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @Override
    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public boolean isArray() {
        return array;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setArray(boolean array) {
        this.array = array;
    }

    public List<FieldConstraint> getConstraints() {
        return constraints;
    }

    public boolean isAttributeField() {
        return isAttributeField;
    }

    public void setAttributeField(boolean attributeField) {
        isAttributeField = attributeField;
    }

    public void setConstraints(List<FieldConstraint> constraints) {
        this.constraints = constraints;
    }

    public void addConstraint(FieldConstraint constraint) {
        this.constraints.add(constraint);
    }

    public List<XMLNSAttribute> getXmlnsAttributes() {
        return xmlnsAttributes;
    }

    public void setXmlnsAttributes(List<XMLNSAttribute> xmlnsAttributes) {
        this.xmlnsAttributes = xmlnsAttributes;
    }

    public void addXmlnsAttribute(XMLNSAttribute xmlnsAttribute) {
        this.xmlnsAttributes.add(xmlnsAttribute);
    }
}
