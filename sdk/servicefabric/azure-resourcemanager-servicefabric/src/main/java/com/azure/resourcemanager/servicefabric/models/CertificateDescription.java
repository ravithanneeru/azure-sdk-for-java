// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the certificate details. */
@Fluent
public final class CertificateDescription {
    /*
     * Thumbprint of the primary certificate.
     */
    @JsonProperty(value = "thumbprint", required = true)
    private String thumbprint;

    /*
     * Thumbprint of the secondary certificate.
     */
    @JsonProperty(value = "thumbprintSecondary")
    private String thumbprintSecondary;

    /*
     * The local certificate store location.
     */
    @JsonProperty(value = "x509StoreName")
    private StoreName x509StoreName;

    /** Creates an instance of CertificateDescription class. */
    public CertificateDescription() {
    }

    /**
     * Get the thumbprint property: Thumbprint of the primary certificate.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Thumbprint of the primary certificate.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateDescription object itself.
     */
    public CertificateDescription withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the thumbprintSecondary property: Thumbprint of the secondary certificate.
     *
     * @return the thumbprintSecondary value.
     */
    public String thumbprintSecondary() {
        return this.thumbprintSecondary;
    }

    /**
     * Set the thumbprintSecondary property: Thumbprint of the secondary certificate.
     *
     * @param thumbprintSecondary the thumbprintSecondary value to set.
     * @return the CertificateDescription object itself.
     */
    public CertificateDescription withThumbprintSecondary(String thumbprintSecondary) {
        this.thumbprintSecondary = thumbprintSecondary;
        return this;
    }

    /**
     * Get the x509StoreName property: The local certificate store location.
     *
     * @return the x509StoreName value.
     */
    public StoreName x509StoreName() {
        return this.x509StoreName;
    }

    /**
     * Set the x509StoreName property: The local certificate store location.
     *
     * @param x509StoreName the x509StoreName value to set.
     * @return the CertificateDescription object itself.
     */
    public CertificateDescription withX509StoreName(StoreName x509StoreName) {
        this.x509StoreName = x509StoreName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (thumbprint() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property thumbprint in model CertificateDescription"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CertificateDescription.class);
}
