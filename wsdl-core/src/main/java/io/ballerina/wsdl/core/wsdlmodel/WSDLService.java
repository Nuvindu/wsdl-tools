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

import java.util.List;

public class WSDLService {
    private SOAPVersion soapVersion;
    private String soapServiceUrl;
    private List<WSDLOperation> wsdlOperations;

    public SOAPVersion getSoapVersion() {
        return soapVersion;
    }

    public void setSoapVersion(SOAPVersion soapVersion) {
        this.soapVersion = soapVersion;
    }

    public String getSoapServiceUrl() {
        return soapServiceUrl;
    }

    public void setSoapServiceUrl(String soapServiceUrl) {
        this.soapServiceUrl = soapServiceUrl;
    }

    public List<WSDLOperation> getWSDLOperations() {
        return wsdlOperations;
    }

    public void setWSDLOperations(List<WSDLOperation> wsdlOperations) {
        this.wsdlOperations = wsdlOperations;
    }
}
