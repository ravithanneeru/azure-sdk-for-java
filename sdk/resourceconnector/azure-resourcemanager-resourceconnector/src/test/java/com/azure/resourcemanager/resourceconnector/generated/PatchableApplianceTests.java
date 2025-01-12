// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourceconnector.models.PatchableAppliance;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PatchableApplianceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchableAppliance model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"gaudcc\":\"fwvuk\",\"kryhtnapczwlokj\":\"nhsjcnyej\",\"jnchgej\":\"emkkvnipjox\"}}")
                .toObject(PatchableAppliance.class);
        Assertions.assertEquals("fwvuk", model.tags().get("gaudcc"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchableAppliance model =
            new PatchableAppliance()
                .withTags(mapOf("gaudcc", "fwvuk", "kryhtnapczwlokj", "nhsjcnyej", "jnchgej", "emkkvnipjox"));
        model = BinaryData.fromObject(model).toObject(PatchableAppliance.class);
        Assertions.assertEquals("fwvuk", model.tags().get("gaudcc"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
