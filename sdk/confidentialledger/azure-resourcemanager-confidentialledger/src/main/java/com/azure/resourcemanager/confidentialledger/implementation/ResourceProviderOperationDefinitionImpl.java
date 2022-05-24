// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.implementation;

import com.azure.resourcemanager.confidentialledger.fluent.models.ResourceProviderOperationDefinitionInner;
import com.azure.resourcemanager.confidentialledger.models.ResourceProviderOperationDefinition;
import com.azure.resourcemanager.confidentialledger.models.ResourceProviderOperationDisplay;

public final class ResourceProviderOperationDefinitionImpl implements ResourceProviderOperationDefinition {
    private ResourceProviderOperationDefinitionInner innerObject;

    private final com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager;

    ResourceProviderOperationDefinitionImpl(
        ResourceProviderOperationDefinitionInner innerObject,
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public ResourceProviderOperationDisplay display() {
        return this.innerModel().display();
    }

    public ResourceProviderOperationDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager() {
        return this.serviceManager;
    }
}