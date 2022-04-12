// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.azurestackhci.fluent.models.ExtensionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Extensions in HCI cluster. */
@Immutable
public final class ExtensionList {
    /*
     * List of Extensions in HCI cluster.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExtensionInner> value;

    /*
     * Link to the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of Extensions in HCI cluster.
     *
     * @return the value value.
     */
    public List<ExtensionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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