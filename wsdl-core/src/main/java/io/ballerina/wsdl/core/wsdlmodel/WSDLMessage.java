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

package io.ballerina.wsdl.core.wsdlmodel;

import java.util.ArrayList;
import java.util.List;

public class WSDLMessage {
    String name;
    List<WSDLPart> parts;

    public WSDLMessage(String name) {
        this.name = name;
        this.parts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WSDLPart> getParts() {
        return parts;
    }

    public void setParts(List<WSDLPart> parts) {
        this.parts = parts;
    }

    public void addPart(WSDLPart part) {
        this.parts.add(part);
    }
}
