// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.Context;

/** Samples for InventoryItems ListByVCenter. */
public final class InventoryItemsListByVCenterSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-01-10-preview/examples/InventoryItems_ListByVCenter.json
     */
    /**
     * Sample code: InventoryItemsListByVCenter.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void inventoryItemsListByVCenter(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.inventoryItems().listByVCenter("testrg", "ContosoVCenter", Context.NONE);
    }
}
