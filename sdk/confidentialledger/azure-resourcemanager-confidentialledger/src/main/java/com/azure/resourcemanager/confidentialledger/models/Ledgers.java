// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Ledgers. */
public interface Ledgers {
    /**
     * Retrieves the properties of a Confidential Ledger.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ledgerName Name of the Confidential Ledger.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return confidential Ledger.
     */
    ConfidentialLedger getByResourceGroup(String resourceGroupName, String ledgerName);

    /**
     * Retrieves the properties of a Confidential Ledger.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ledgerName Name of the Confidential Ledger.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return confidential Ledger along with {@link Response}.
     */
    Response<ConfidentialLedger> getByResourceGroupWithResponse(
        String resourceGroupName, String ledgerName, Context context);

    /**
     * Deletes an existing Confidential Ledger.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ledgerName Name of the Confidential Ledger.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String ledgerName);

    /**
     * Deletes an existing Confidential Ledger.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ledgerName Name of the Confidential Ledger.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ledgerName, Context context);

    /**
     * Retrieves the properties of all Confidential Ledgers.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Confidential Ledgers and a possible link for next set as paginated
     *     response with {@link PagedIterable}.
     */
    PagedIterable<ConfidentialLedger> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieves the properties of all Confidential Ledgers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param filter The filter to apply on the list operation. eg. $filter=ledgerType eq 'Public'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Confidential Ledgers and a possible link for next set as paginated
     *     response with {@link PagedIterable}.
     */
    PagedIterable<ConfidentialLedger> listByResourceGroup(String resourceGroupName, String filter, Context context);

    /**
     * Retrieves the properties of all Confidential Ledgers.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Confidential Ledgers and a possible link for next set as paginated
     *     response with {@link PagedIterable}.
     */
    PagedIterable<ConfidentialLedger> list();

    /**
     * Retrieves the properties of all Confidential Ledgers.
     *
     * @param filter The filter to apply on the list operation. eg. $filter=ledgerType eq 'Public'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Confidential Ledgers and a possible link for next set as paginated
     *     response with {@link PagedIterable}.
     */
    PagedIterable<ConfidentialLedger> list(String filter, Context context);

    /**
     * Retrieves the properties of a Confidential Ledger.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return confidential Ledger along with {@link Response}.
     */
    ConfidentialLedger getById(String id);

    /**
     * Retrieves the properties of a Confidential Ledger.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return confidential Ledger along with {@link Response}.
     */
    Response<ConfidentialLedger> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Confidential Ledger.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing Confidential Ledger.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ConfidentialLedger resource.
     *
     * @param name resource name.
     * @return the first stage of the new ConfidentialLedger definition.
     */
    ConfidentialLedger.DefinitionStages.Blank define(String name);
}