// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.Port;
import com.azure.resourcemanager.devtestlabs.models.SubnetSharedPublicIpAddressConfiguration;
import com.azure.resourcemanager.devtestlabs.models.TransportProtocol;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SubnetSharedPublicIpAddressConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubnetSharedPublicIpAddressConfiguration model =
            BinaryData
                .fromString("{\"allowedPorts\":[{\"transportProtocol\":\"Tcp\",\"backendPort\":857144221}]}")
                .toObject(SubnetSharedPublicIpAddressConfiguration.class);
        Assertions.assertEquals(TransportProtocol.TCP, model.allowedPorts().get(0).transportProtocol());
        Assertions.assertEquals(857144221, model.allowedPorts().get(0).backendPort());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubnetSharedPublicIpAddressConfiguration model =
            new SubnetSharedPublicIpAddressConfiguration()
                .withAllowedPorts(
                    Arrays.asList(new Port().withTransportProtocol(TransportProtocol.TCP).withBackendPort(857144221)));
        model = BinaryData.fromObject(model).toObject(SubnetSharedPublicIpAddressConfiguration.class);
        Assertions.assertEquals(TransportProtocol.TCP, model.allowedPorts().get(0).transportProtocol());
        Assertions.assertEquals(857144221, model.allowedPorts().get(0).backendPort());
    }
}
