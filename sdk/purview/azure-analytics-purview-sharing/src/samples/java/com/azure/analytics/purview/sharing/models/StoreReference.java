// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A Store Reference for an artifact or sink. */
@Fluent
public final class StoreReference {
    /*
     * Reference name for resource associated with the sink or artifact.
     */
    @JsonProperty(value = "referenceName")
    private String referenceName;

    /*
     * Defines the type of resource being shared
     */
    @JsonProperty(value = "type")
    private ReferenceNameType type;

    /** Creates an instance of StoreReference class. */
    public StoreReference() {}

    /**
     * Get the referenceName property: Reference name for resource associated with the sink or artifact.
     *
     * @return the referenceName value.
     */
    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference name for resource associated with the sink or artifact.
     *
     * @param referenceName the referenceName value to set.
     * @return the StoreReference object itself.
     */
    public StoreReference setReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the type property: Defines the type of resource being shared.
     *
     * @return the type value.
     */
    public ReferenceNameType getType() {
        return this.type;
    }

    /**
     * Set the type property: Defines the type of resource being shared.
     *
     * @param type the type value to set.
     * @return the StoreReference object itself.
     */
    public StoreReference setType(ReferenceNameType type) {
        this.type = type;
        return this;
    }
}
