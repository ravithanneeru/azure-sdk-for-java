// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sqlvirtualmachine.models.AgConfiguration;
import com.azure.resourcemanager.sqlvirtualmachine.models.LoadBalancerConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of an availability group listener. */
@Fluent
public final class AvailabilityGroupListenerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilityGroupListenerProperties.class);

    /*
     * Provisioning state to track the async operation status.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Name of the availability group.
     */
    @JsonProperty(value = "availabilityGroupName")
    private String availabilityGroupName;

    /*
     * List of load balancer configurations for an availability group listener.
     */
    @JsonProperty(value = "loadBalancerConfigurations")
    private List<LoadBalancerConfiguration> loadBalancerConfigurations;

    /*
     * Create a default availability group if it does not exist.
     */
    @JsonProperty(value = "createDefaultAvailabilityGroupIfNotExist")
    private Boolean createDefaultAvailabilityGroupIfNotExist;

    /*
     * Listener port.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * Availability Group configuration.
     */
    @JsonProperty(value = "availabilityGroupConfiguration")
    private AgConfiguration availabilityGroupConfiguration;

    /**
     * Get the provisioningState property: Provisioning state to track the async operation status.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the availabilityGroupName property: Name of the availability group.
     *
     * @return the availabilityGroupName value.
     */
    public String availabilityGroupName() {
        return this.availabilityGroupName;
    }

    /**
     * Set the availabilityGroupName property: Name of the availability group.
     *
     * @param availabilityGroupName the availabilityGroupName value to set.
     * @return the AvailabilityGroupListenerProperties object itself.
     */
    public AvailabilityGroupListenerProperties withAvailabilityGroupName(String availabilityGroupName) {
        this.availabilityGroupName = availabilityGroupName;
        return this;
    }

    /**
     * Get the loadBalancerConfigurations property: List of load balancer configurations for an availability group
     * listener.
     *
     * @return the loadBalancerConfigurations value.
     */
    public List<LoadBalancerConfiguration> loadBalancerConfigurations() {
        return this.loadBalancerConfigurations;
    }

    /**
     * Set the loadBalancerConfigurations property: List of load balancer configurations for an availability group
     * listener.
     *
     * @param loadBalancerConfigurations the loadBalancerConfigurations value to set.
     * @return the AvailabilityGroupListenerProperties object itself.
     */
    public AvailabilityGroupListenerProperties withLoadBalancerConfigurations(
        List<LoadBalancerConfiguration> loadBalancerConfigurations) {
        this.loadBalancerConfigurations = loadBalancerConfigurations;
        return this;
    }

    /**
     * Get the createDefaultAvailabilityGroupIfNotExist property: Create a default availability group if it does not
     * exist.
     *
     * @return the createDefaultAvailabilityGroupIfNotExist value.
     */
    public Boolean createDefaultAvailabilityGroupIfNotExist() {
        return this.createDefaultAvailabilityGroupIfNotExist;
    }

    /**
     * Set the createDefaultAvailabilityGroupIfNotExist property: Create a default availability group if it does not
     * exist.
     *
     * @param createDefaultAvailabilityGroupIfNotExist the createDefaultAvailabilityGroupIfNotExist value to set.
     * @return the AvailabilityGroupListenerProperties object itself.
     */
    public AvailabilityGroupListenerProperties withCreateDefaultAvailabilityGroupIfNotExist(
        Boolean createDefaultAvailabilityGroupIfNotExist) {
        this.createDefaultAvailabilityGroupIfNotExist = createDefaultAvailabilityGroupIfNotExist;
        return this;
    }

    /**
     * Get the port property: Listener port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Listener port.
     *
     * @param port the port value to set.
     * @return the AvailabilityGroupListenerProperties object itself.
     */
    public AvailabilityGroupListenerProperties withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the availabilityGroupConfiguration property: Availability Group configuration.
     *
     * @return the availabilityGroupConfiguration value.
     */
    public AgConfiguration availabilityGroupConfiguration() {
        return this.availabilityGroupConfiguration;
    }

    /**
     * Set the availabilityGroupConfiguration property: Availability Group configuration.
     *
     * @param availabilityGroupConfiguration the availabilityGroupConfiguration value to set.
     * @return the AvailabilityGroupListenerProperties object itself.
     */
    public AvailabilityGroupListenerProperties withAvailabilityGroupConfiguration(
        AgConfiguration availabilityGroupConfiguration) {
        this.availabilityGroupConfiguration = availabilityGroupConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (loadBalancerConfigurations() != null) {
            loadBalancerConfigurations().forEach(e -> e.validate());
        }
        if (availabilityGroupConfiguration() != null) {
            availabilityGroupConfiguration().validate();
        }
    }
}