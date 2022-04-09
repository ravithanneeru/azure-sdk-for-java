// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureadexternalidentities.generated;

/** Samples for GuestUsages Create. */
public final class GuestUsagesCreateSamples {
    /*
     * x-ms-original-file: specification/cpim/resource-manager/Microsoft.AzureActiveDirectory/stable/2021-04-01/examples/GuestUsagesCreate.json
     */
    /**
     * Sample code: GuestUsages_Create.
     *
     * @param manager Entry point to ExternalIdentitiesConfigurationManager.
     */
    public static void guestUsagesCreate(
        com.azure.resourcemanager.azureadexternalidentities.ExternalIdentitiesConfigurationManager manager) {
        manager
            .guestUsages()
            .define("contoso.onmicrosoft.com")
            .withRegion("United States")
            .withExistingResourceGroup("contosoResourceGroup")
            .withTenantId("c963dd1a-9174-4c23-8bae-733d7f955492")
            .create();
    }
}