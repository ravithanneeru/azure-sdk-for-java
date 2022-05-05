// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.RoleAssignmentScheduleInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoleAssignmentSchedulesClient. */
public interface RoleAssignmentSchedulesClient {
    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleAssignmentScheduleInner>> getWithResponseAsync(String scope, String roleAssignmentScheduleName);

    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleAssignmentScheduleInner> getAsync(String scope, String roleAssignmentScheduleName);

    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleAssignmentScheduleInner get(String scope, String roleAssignmentScheduleName);

    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleAssignmentScheduleInner> getWithResponse(
        String scope, String roleAssignmentScheduleName, Context context);

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role assignment
     *     schedules for the current user. Use $filter=asTarget() to return all role assignment schedules created for
     *     the current user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleAssignmentScheduleInner> listForScopeAsync(String scope, String filter);

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleAssignmentScheduleInner> listForScopeAsync(String scope);

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleAssignmentScheduleInner> listForScope(String scope);

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role assignment
     *     schedules for the current user. Use $filter=asTarget() to return all role assignment schedules created for
     *     the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleAssignmentScheduleInner> listForScope(String scope, String filter, Context context);
}