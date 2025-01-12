// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Migration provider specific settings. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = MigrationProviderSpecificSettings.class)
@JsonTypeName("MigrationProviderSpecificSettings")
@JsonSubTypes({@JsonSubTypes.Type(name = "VMwareCbt", value = VMwareCbtMigrationDetails.class)})
@Immutable
public class MigrationProviderSpecificSettings {
    /** Creates an instance of MigrationProviderSpecificSettings class. */
    public MigrationProviderSpecificSettings() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
