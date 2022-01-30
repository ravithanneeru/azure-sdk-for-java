// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.ResourceWithEtag;
import com.azure.resourcemanager.securityinsights.models.Source;
import com.azure.resourcemanager.securityinsights.models.UserInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents a Watchlist in Azure Security Insights. */
@Fluent
public final class WatchlistInner extends ResourceWithEtag {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WatchlistInner.class);

    /*
     * Watchlist properties
     */
    @JsonProperty(value = "properties")
    private WatchlistProperties innerProperties;

    /**
     * Get the innerProperties property: Watchlist properties.
     *
     * @return the innerProperties value.
     */
    private WatchlistProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public WatchlistInner withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the watchlistId property: The id (a Guid) of the watchlist.
     *
     * @return the watchlistId value.
     */
    public String watchlistId() {
        return this.innerProperties() == null ? null : this.innerProperties().watchlistId();
    }

    /**
     * Set the watchlistId property: The id (a Guid) of the watchlist.
     *
     * @param watchlistId the watchlistId value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withWatchlistId(String watchlistId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withWatchlistId(watchlistId);
        return this;
    }

    /**
     * Get the displayName property: The display name of the watchlist.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the watchlist.
     *
     * @param displayName the displayName value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the provider property: The provider of the watchlist.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.innerProperties() == null ? null : this.innerProperties().provider();
    }

    /**
     * Set the provider property: The provider of the watchlist.
     *
     * @param provider the provider value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withProvider(String provider) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withProvider(provider);
        return this;
    }

    /**
     * Get the source property: The source of the watchlist.
     *
     * @return the source value.
     */
    public Source source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: The source of the watchlist.
     *
     * @param source the source value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withSource(Source source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the created property: The time the watchlist was created.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Set the created property: The time the watchlist was created.
     *
     * @param created the created value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withCreated(OffsetDateTime created) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withCreated(created);
        return this;
    }

    /**
     * Get the updated property: The last time the watchlist was updated.
     *
     * @return the updated value.
     */
    public OffsetDateTime updated() {
        return this.innerProperties() == null ? null : this.innerProperties().updated();
    }

    /**
     * Set the updated property: The last time the watchlist was updated.
     *
     * @param updated the updated value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withUpdated(OffsetDateTime updated) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withUpdated(updated);
        return this;
    }

    /**
     * Get the createdBy property: Describes a user that created the watchlist.
     *
     * @return the createdBy value.
     */
    public UserInfo createdBy() {
        return this.innerProperties() == null ? null : this.innerProperties().createdBy();
    }

    /**
     * Set the createdBy property: Describes a user that created the watchlist.
     *
     * @param createdBy the createdBy value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withCreatedBy(UserInfo createdBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withCreatedBy(createdBy);
        return this;
    }

    /**
     * Get the updatedBy property: Describes a user that updated the watchlist.
     *
     * @return the updatedBy value.
     */
    public UserInfo updatedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedBy();
    }

    /**
     * Set the updatedBy property: Describes a user that updated the watchlist.
     *
     * @param updatedBy the updatedBy value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withUpdatedBy(UserInfo updatedBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withUpdatedBy(updatedBy);
        return this;
    }

    /**
     * Get the description property: A description of the watchlist.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the watchlist.
     *
     * @param description the description value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the watchlistType property: The type of the watchlist.
     *
     * @return the watchlistType value.
     */
    public String watchlistType() {
        return this.innerProperties() == null ? null : this.innerProperties().watchlistType();
    }

    /**
     * Set the watchlistType property: The type of the watchlist.
     *
     * @param watchlistType the watchlistType value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withWatchlistType(String watchlistType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withWatchlistType(watchlistType);
        return this;
    }

    /**
     * Get the watchlistAlias property: The alias of the watchlist.
     *
     * @return the watchlistAlias value.
     */
    public String watchlistAlias() {
        return this.innerProperties() == null ? null : this.innerProperties().watchlistAlias();
    }

    /**
     * Set the watchlistAlias property: The alias of the watchlist.
     *
     * @param watchlistAlias the watchlistAlias value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withWatchlistAlias(String watchlistAlias) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withWatchlistAlias(watchlistAlias);
        return this;
    }

    /**
     * Get the isDeleted property: A flag that indicates if the watchlist is deleted or not.
     *
     * @return the isDeleted value.
     */
    public Boolean isDeleted() {
        return this.innerProperties() == null ? null : this.innerProperties().isDeleted();
    }

    /**
     * Set the isDeleted property: A flag that indicates if the watchlist is deleted or not.
     *
     * @param isDeleted the isDeleted value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withIsDeleted(Boolean isDeleted) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withIsDeleted(isDeleted);
        return this;
    }

    /**
     * Get the labels property: List of labels relevant to this watchlist.
     *
     * @return the labels value.
     */
    public List<String> labels() {
        return this.innerProperties() == null ? null : this.innerProperties().labels();
    }

    /**
     * Set the labels property: List of labels relevant to this watchlist.
     *
     * @param labels the labels value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withLabels(List<String> labels) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withLabels(labels);
        return this;
    }

    /**
     * Get the defaultDuration property: The default duration of a watchlist (in ISO 8601 duration format).
     *
     * @return the defaultDuration value.
     */
    public Duration defaultDuration() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultDuration();
    }

    /**
     * Set the defaultDuration property: The default duration of a watchlist (in ISO 8601 duration format).
     *
     * @param defaultDuration the defaultDuration value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withDefaultDuration(Duration defaultDuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withDefaultDuration(defaultDuration);
        return this;
    }

    /**
     * Get the tenantId property: The tenantId where the watchlist belongs to.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenantId where the watchlist belongs to.
     *
     * @param tenantId the tenantId value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the numberOfLinesToSkip property: The number of lines in a csv/tsv content to skip before the header.
     *
     * @return the numberOfLinesToSkip value.
     */
    public Integer numberOfLinesToSkip() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfLinesToSkip();
    }

    /**
     * Set the numberOfLinesToSkip property: The number of lines in a csv/tsv content to skip before the header.
     *
     * @param numberOfLinesToSkip the numberOfLinesToSkip value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withNumberOfLinesToSkip(Integer numberOfLinesToSkip) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withNumberOfLinesToSkip(numberOfLinesToSkip);
        return this;
    }

    /**
     * Get the rawContent property: The raw content that represents to watchlist items to create. In case of csv/tsv
     * content type, it's the content of the file that will parsed by the endpoint.
     *
     * @return the rawContent value.
     */
    public String rawContent() {
        return this.innerProperties() == null ? null : this.innerProperties().rawContent();
    }

    /**
     * Set the rawContent property: The raw content that represents to watchlist items to create. In case of csv/tsv
     * content type, it's the content of the file that will parsed by the endpoint.
     *
     * @param rawContent the rawContent value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withRawContent(String rawContent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withRawContent(rawContent);
        return this;
    }

    /**
     * Get the itemsSearchKey property: The search key is used to optimize query performance when using watchlists for
     * joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then
     * use this field as the key field when joining to other event data by IP address.
     *
     * @return the itemsSearchKey value.
     */
    public String itemsSearchKey() {
        return this.innerProperties() == null ? null : this.innerProperties().itemsSearchKey();
    }

    /**
     * Set the itemsSearchKey property: The search key is used to optimize query performance when using watchlists for
     * joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then
     * use this field as the key field when joining to other event data by IP address.
     *
     * @param itemsSearchKey the itemsSearchKey value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withItemsSearchKey(String itemsSearchKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withItemsSearchKey(itemsSearchKey);
        return this;
    }

    /**
     * Get the contentType property: The content type of the raw content. Example : text/csv or text/tsv.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.innerProperties() == null ? null : this.innerProperties().contentType();
    }

    /**
     * Set the contentType property: The content type of the raw content. Example : text/csv or text/tsv.
     *
     * @param contentType the contentType value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withContentType(String contentType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withContentType(contentType);
        return this;
    }

    /**
     * Get the uploadStatus property: The status of the Watchlist upload : New, InProgress or Complete. Pls note : When
     * a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted.
     *
     * @return the uploadStatus value.
     */
    public String uploadStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().uploadStatus();
    }

    /**
     * Set the uploadStatus property: The status of the Watchlist upload : New, InProgress or Complete. Pls note : When
     * a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted.
     *
     * @param uploadStatus the uploadStatus value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withUploadStatus(String uploadStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withUploadStatus(uploadStatus);
        return this;
    }

    /**
     * Get the watchlistItemsCount property: The number of Watchlist Items in the Watchlist.
     *
     * @return the watchlistItemsCount value.
     */
    public Integer watchlistItemsCount() {
        return this.innerProperties() == null ? null : this.innerProperties().watchlistItemsCount();
    }

    /**
     * Set the watchlistItemsCount property: The number of Watchlist Items in the Watchlist.
     *
     * @param watchlistItemsCount the watchlistItemsCount value to set.
     * @return the WatchlistInner object itself.
     */
    public WatchlistInner withWatchlistItemsCount(Integer watchlistItemsCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WatchlistProperties();
        }
        this.innerProperties().withWatchlistItemsCount(watchlistItemsCount);
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
    }
}