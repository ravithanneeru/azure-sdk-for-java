// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.DataConnectorRequirementsStateInner;
import com.azure.resourcemanager.securityinsights.models.DataConnectorsCheckRequirements;

/**
 * An instance of this class provides access to all the operations defined in
 * DataConnectorsCheckRequirementsOperationsClient.
 */
public interface DataConnectorsCheckRequirementsOperationsClient {
    /**
     * Get requirements state for a data connector type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataConnectorsCheckRequirements The parameters for requirements check message.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return requirements state for a data connector type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataConnectorRequirementsStateInner post(
        String resourceGroupName,
        String workspaceName,
        DataConnectorsCheckRequirements dataConnectorsCheckRequirements);

    /**
     * Get requirements state for a data connector type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataConnectorsCheckRequirements The parameters for requirements check message.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return requirements state for a data connector type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataConnectorRequirementsStateInner> postWithResponse(
        String resourceGroupName,
        String workspaceName,
        DataConnectorsCheckRequirements dataConnectorsCheckRequirements,
        Context context);
}