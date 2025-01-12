// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.AdditionalFeaturesServerConfigurations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AdditionalFeaturesServerConfigurationsTests {
    @Test
    public void testDeserialize() {
        AdditionalFeaturesServerConfigurations model =
            BinaryData
                .fromString("{\"isRServicesEnabled\":false}")
                .toObject(AdditionalFeaturesServerConfigurations.class);
        Assertions.assertEquals(false, model.isRServicesEnabled());
    }

    @Test
    public void testSerialize() {
        AdditionalFeaturesServerConfigurations model =
            new AdditionalFeaturesServerConfigurations().withIsRServicesEnabled(false);
        model = BinaryData.fromObject(model).toObject(AdditionalFeaturesServerConfigurations.class);
        Assertions.assertEquals(false, model.isRServicesEnabled());
    }
}
