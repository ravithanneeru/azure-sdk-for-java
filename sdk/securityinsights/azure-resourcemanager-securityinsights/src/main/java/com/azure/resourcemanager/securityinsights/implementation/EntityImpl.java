// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.models.Entity;

public final class EntityImpl implements Entity {
    private EntityInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    EntityImpl(
        EntityInner innerObject, com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public EntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}