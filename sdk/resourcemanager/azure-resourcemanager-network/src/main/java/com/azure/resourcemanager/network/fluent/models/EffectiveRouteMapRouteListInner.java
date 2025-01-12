// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.EffectiveRouteMapRoute;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** EffectiveRouteMapRoute List. */
@Fluent
public final class EffectiveRouteMapRouteListInner {
    /*
     * The list of Effective RouteMap Routes configured on the connection resource.
     */
    @JsonProperty(value = "value")
    private List<EffectiveRouteMapRoute> value;

    /** Creates an instance of EffectiveRouteMapRouteListInner class. */
    public EffectiveRouteMapRouteListInner() {
    }

    /**
     * Get the value property: The list of Effective RouteMap Routes configured on the connection resource.
     *
     * @return the value value.
     */
    public List<EffectiveRouteMapRoute> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Effective RouteMap Routes configured on the connection resource.
     *
     * @param value the value value to set.
     * @return the EffectiveRouteMapRouteListInner object itself.
     */
    public EffectiveRouteMapRouteListInner withValue(List<EffectiveRouteMapRoute> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
