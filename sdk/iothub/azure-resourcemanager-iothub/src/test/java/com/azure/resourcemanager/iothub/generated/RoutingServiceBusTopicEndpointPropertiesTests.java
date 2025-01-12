// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.AuthenticationType;
import com.azure.resourcemanager.iothub.models.ManagedIdentity;
import com.azure.resourcemanager.iothub.models.RoutingServiceBusTopicEndpointProperties;
import org.junit.jupiter.api.Assertions;

public final class RoutingServiceBusTopicEndpointPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutingServiceBusTopicEndpointProperties model =
            BinaryData
                .fromString(
                    "{\"id\":\"kdvjsll\",\"connectionString\":\"vvdfwatkpnpul\",\"endpointUri\":\"xbczwtruwiqz\",\"entityPath\":\"j\",\"authenticationType\":\"keyBased\",\"identity\":{\"userAssignedIdentity\":\"yokacspkw\"},\"name\":\"hzdobpxjmflbvvnc\",\"subscriptionId\":\"kcciwwzjuqkhr\",\"resourceGroup\":\"jiwkuofoskghsau\"}")
                .toObject(RoutingServiceBusTopicEndpointProperties.class);
        Assertions.assertEquals("kdvjsll", model.id());
        Assertions.assertEquals("vvdfwatkpnpul", model.connectionString());
        Assertions.assertEquals("xbczwtruwiqz", model.endpointUri());
        Assertions.assertEquals("j", model.entityPath());
        Assertions.assertEquals(AuthenticationType.KEY_BASED, model.authenticationType());
        Assertions.assertEquals("yokacspkw", model.identity().userAssignedIdentity());
        Assertions.assertEquals("hzdobpxjmflbvvnc", model.name());
        Assertions.assertEquals("kcciwwzjuqkhr", model.subscriptionId());
        Assertions.assertEquals("jiwkuofoskghsau", model.resourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutingServiceBusTopicEndpointProperties model =
            new RoutingServiceBusTopicEndpointProperties()
                .withId("kdvjsll")
                .withConnectionString("vvdfwatkpnpul")
                .withEndpointUri("xbczwtruwiqz")
                .withEntityPath("j")
                .withAuthenticationType(AuthenticationType.KEY_BASED)
                .withIdentity(new ManagedIdentity().withUserAssignedIdentity("yokacspkw"))
                .withName("hzdobpxjmflbvvnc")
                .withSubscriptionId("kcciwwzjuqkhr")
                .withResourceGroup("jiwkuofoskghsau");
        model = BinaryData.fromObject(model).toObject(RoutingServiceBusTopicEndpointProperties.class);
        Assertions.assertEquals("kdvjsll", model.id());
        Assertions.assertEquals("vvdfwatkpnpul", model.connectionString());
        Assertions.assertEquals("xbczwtruwiqz", model.endpointUri());
        Assertions.assertEquals("j", model.entityPath());
        Assertions.assertEquals(AuthenticationType.KEY_BASED, model.authenticationType());
        Assertions.assertEquals("yokacspkw", model.identity().userAssignedIdentity());
        Assertions.assertEquals("hzdobpxjmflbvvnc", model.name());
        Assertions.assertEquals("kcciwwzjuqkhr", model.subscriptionId());
        Assertions.assertEquals("jiwkuofoskghsau", model.resourceGroup());
    }
}
