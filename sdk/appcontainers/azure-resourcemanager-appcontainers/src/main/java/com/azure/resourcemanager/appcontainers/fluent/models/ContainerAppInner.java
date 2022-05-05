// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.appcontainers.models.Configuration;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProvisioningState;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appcontainers.models.Template;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Container App. */
@Fluent
public final class ContainerAppInner extends Resource {
    /*
     * managed identities for the Container App to interact with other Azure
     * services without maintaining any secrets or credentials in code.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * ContainerApp resource specific properties
     */
    @JsonProperty(value = "properties")
    private ContainerAppProperties innerProperties;

    /**
     * Get the identity property: managed identities for the Container App to interact with other Azure services without
     * maintaining any secrets or credentials in code.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: managed identities for the Container App to interact with other Azure services without
     * maintaining any secrets or credentials in code.
     *
     * @param identity the identity value to set.
     * @return the ContainerAppInner object itself.
     */
    public ContainerAppInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: ContainerApp resource specific properties.
     *
     * @return the innerProperties value.
     */
    private ContainerAppProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerAppInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerAppInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Container App.
     *
     * @return the provisioningState value.
     */
    public ContainerAppProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the managedEnvironmentId property: Resource ID of the Container App's environment.
     *
     * @return the managedEnvironmentId value.
     */
    public String managedEnvironmentId() {
        return this.innerProperties() == null ? null : this.innerProperties().managedEnvironmentId();
    }

    /**
     * Set the managedEnvironmentId property: Resource ID of the Container App's environment.
     *
     * @param managedEnvironmentId the managedEnvironmentId value to set.
     * @return the ContainerAppInner object itself.
     */
    public ContainerAppInner withManagedEnvironmentId(String managedEnvironmentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerAppProperties();
        }
        this.innerProperties().withManagedEnvironmentId(managedEnvironmentId);
        return this;
    }

    /**
     * Get the latestRevisionName property: Name of the latest revision of the Container App.
     *
     * @return the latestRevisionName value.
     */
    public String latestRevisionName() {
        return this.innerProperties() == null ? null : this.innerProperties().latestRevisionName();
    }

    /**
     * Get the latestRevisionFqdn property: Fully Qualified Domain Name of the latest revision of the Container App.
     *
     * @return the latestRevisionFqdn value.
     */
    public String latestRevisionFqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().latestRevisionFqdn();
    }

    /**
     * Get the customDomainVerificationId property: Id used to verify domain name ownership.
     *
     * @return the customDomainVerificationId value.
     */
    public String customDomainVerificationId() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomainVerificationId();
    }

    /**
     * Get the configuration property: Non versioned Container App configuration properties.
     *
     * @return the configuration value.
     */
    public Configuration configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().configuration();
    }

    /**
     * Set the configuration property: Non versioned Container App configuration properties.
     *
     * @param configuration the configuration value to set.
     * @return the ContainerAppInner object itself.
     */
    public ContainerAppInner withConfiguration(Configuration configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerAppProperties();
        }
        this.innerProperties().withConfiguration(configuration);
        return this;
    }

    /**
     * Get the template property: Container App versioned application definition.
     *
     * @return the template value.
     */
    public Template template() {
        return this.innerProperties() == null ? null : this.innerProperties().template();
    }

    /**
     * Set the template property: Container App versioned application definition.
     *
     * @param template the template value to set.
     * @return the ContainerAppInner object itself.
     */
    public ContainerAppInner withTemplate(Template template) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerAppProperties();
        }
        this.innerProperties().withTemplate(template);
        return this;
    }

    /**
     * Get the outboundIpAddresses property: Outbound IP Addresses for container app.
     *
     * @return the outboundIpAddresses value.
     */
    public List<String> outboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().outboundIpAddresses();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}