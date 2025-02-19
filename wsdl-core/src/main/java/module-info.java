/*
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

module io.ballerina.wsdl.core {
    requires io.ballerina.lang;
    requires io.ballerina.parser;
    requires XmlSchema;
    requires io.ballerina.tools.api;
    requires java.xml;
    requires io.ballerina.formatter.core;
    requires wsdl4j;
    requires io.ballerina.xsd.core;

    exports io.ballerina.wsdl.core;
    exports io.ballerina.wsdl.core.generator;
    exports io.ballerina.wsdl.core.diagnostic;
    exports io.ballerina.wsdl.core.handler.model;
}
