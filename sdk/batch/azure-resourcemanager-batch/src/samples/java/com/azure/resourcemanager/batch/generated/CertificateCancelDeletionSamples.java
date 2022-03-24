// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.Context;

/** Samples for Certificate CancelDeletion. */
public final class CertificateCancelDeletionSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-01-01/examples/CertificateCancelDeletion.json
     */
    /**
     * Sample code: CertificateCancelDeletion.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void certificateCancelDeletion(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .certificates()
            .cancelDeletionWithResponse(
                "default-azurebatch-japaneast",
                "sampleacct",
                "sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e",
                Context.NONE);
    }
}