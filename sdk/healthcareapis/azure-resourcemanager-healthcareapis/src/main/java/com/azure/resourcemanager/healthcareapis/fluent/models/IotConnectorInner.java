// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.healthcareapis.models.IotEventHubIngestionEndpointConfiguration;
import com.azure.resourcemanager.healthcareapis.models.IotMappingProperties;
import com.azure.resourcemanager.healthcareapis.models.ProvisioningState;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityIdentity;
import com.azure.resourcemanager.healthcareapis.models.TaggedResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** IoT Connector definition. */
@Fluent
public final class IotConnectorInner extends TaggedResource {
    /*
     * IoT Connector configuration.
     */
    @JsonProperty(value = "properties")
    private IotConnectorProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Setting indicating whether the service has a managed identity associated
     * with it.
     */
    @JsonProperty(value = "identity")
    private ServiceManagedIdentityIdentity identity;

    /**
     * Get the innerProperties property: IoT Connector configuration.
     *
     * @return the innerProperties value.
     */
    private IotConnectorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the identity property: Setting indicating whether the service has a managed identity associated with it.
     *
     * @return the identity value.
     */
    public ServiceManagedIdentityIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Setting indicating whether the service has a managed identity associated with it.
     *
     * @param identity the identity value to set.
     * @return the IotConnectorInner object itself.
     */
    public IotConnectorInner withIdentity(ServiceManagedIdentityIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotConnectorInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotConnectorInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotConnectorInner withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the ingestionEndpointConfiguration property: Source configuration.
     *
     * @return the ingestionEndpointConfiguration value.
     */
    public IotEventHubIngestionEndpointConfiguration ingestionEndpointConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().ingestionEndpointConfiguration();
    }

    /**
     * Set the ingestionEndpointConfiguration property: Source configuration.
     *
     * @param ingestionEndpointConfiguration the ingestionEndpointConfiguration value to set.
     * @return the IotConnectorInner object itself.
     */
    public IotConnectorInner withIngestionEndpointConfiguration(
        IotEventHubIngestionEndpointConfiguration ingestionEndpointConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotConnectorProperties();
        }
        this.innerProperties().withIngestionEndpointConfiguration(ingestionEndpointConfiguration);
        return this;
    }

    /**
     * Get the deviceMapping property: Device Mappings.
     *
     * @return the deviceMapping value.
     */
    public IotMappingProperties deviceMapping() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceMapping();
    }

    /**
     * Set the deviceMapping property: Device Mappings.
     *
     * @param deviceMapping the deviceMapping value to set.
     * @return the IotConnectorInner object itself.
     */
    public IotConnectorInner withDeviceMapping(IotMappingProperties deviceMapping) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotConnectorProperties();
        }
        this.innerProperties().withDeviceMapping(deviceMapping);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
