/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.cloudcommerceprocurement.v1.model;

/**
 * Represents a procured product of a customer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Commerce Partner Procurement API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Entitlement extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The resource name of the account that this entitlement is based on, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String account;

  /**
   * Output only. The creation timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The custom properties that were collected from the user to create this
   * entitlement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> inputProperties;

  /**
   * Provider-supplied message that is displayed to the end user. Currently this is used to
   * communicate progress and ETA for provisioning. This field can be updated only when a user is
   * waiting for an action from the provider, i.e. entitlement state is
   * EntitlementState.ENTITLEMENT_ACTIVATION_REQUESTED or
   * EntitlementState.ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL.
   *
   * This field is cleared automatically when the enitlement state changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageToUser;

  /**
   * Output only. The resource name of the entitlement. Entitlement names have the form
   * `entitlements/{entitlement_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The identifier of the pending new plan. Required if the product has plans and the
   * entitlement has a pending plan change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newPendingPlan;

  /**
   * Output only. The identifier of the plan that was procured. Required if the product has plans.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String plan;

  /**
   * Output only. The identifier of the product that was procured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String product;

  /**
   * Output only. The identifier of the service provider that this entitlement was created against.
   * Each service provider is assigned a unique provider value when they onboard with Cloud Commerce
   * platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provider;

  /**
   * Output only. The state of the entitlement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The last update timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The consumerId to use when reporting usage through the Service Control API. See
   * the consumerId field at [Reporting Metrics](https://cloud.google.com/service-control/reporting-
   * metrics) for more details.
   *
   * This field is present only if the product has usage-based billing configured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String usageReportingId;

  /**
   * Output only. The resource name of the account that this entitlement is based on, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccount() {
    return account;
  }

  /**
   * Output only. The resource name of the account that this entitlement is based on, if any.
   * @param account account or {@code null} for none
   */
  public Entitlement setAccount(java.lang.String account) {
    this.account = account;
    return this;
  }

  /**
   * Output only. The creation timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public Entitlement setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The custom properties that were collected from the user to create this
   * entitlement.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getInputProperties() {
    return inputProperties;
  }

  /**
   * Output only. The custom properties that were collected from the user to create this
   * entitlement.
   * @param inputProperties inputProperties or {@code null} for none
   */
  public Entitlement setInputProperties(java.util.Map<String, java.lang.Object> inputProperties) {
    this.inputProperties = inputProperties;
    return this;
  }

  /**
   * Provider-supplied message that is displayed to the end user. Currently this is used to
   * communicate progress and ETA for provisioning. This field can be updated only when a user is
   * waiting for an action from the provider, i.e. entitlement state is
   * EntitlementState.ENTITLEMENT_ACTIVATION_REQUESTED or
   * EntitlementState.ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL.
   *
   * This field is cleared automatically when the enitlement state changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageToUser() {
    return messageToUser;
  }

  /**
   * Provider-supplied message that is displayed to the end user. Currently this is used to
   * communicate progress and ETA for provisioning. This field can be updated only when a user is
   * waiting for an action from the provider, i.e. entitlement state is
   * EntitlementState.ENTITLEMENT_ACTIVATION_REQUESTED or
   * EntitlementState.ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL.
   *
   * This field is cleared automatically when the enitlement state changes.
   * @param messageToUser messageToUser or {@code null} for none
   */
  public Entitlement setMessageToUser(java.lang.String messageToUser) {
    this.messageToUser = messageToUser;
    return this;
  }

  /**
   * Output only. The resource name of the entitlement. Entitlement names have the form
   * `entitlements/{entitlement_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the entitlement. Entitlement names have the form
   * `entitlements/{entitlement_id}`.
   * @param name name or {@code null} for none
   */
  public Entitlement setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The identifier of the pending new plan. Required if the product has plans and the
   * entitlement has a pending plan change.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewPendingPlan() {
    return newPendingPlan;
  }

  /**
   * Output only. The identifier of the pending new plan. Required if the product has plans and the
   * entitlement has a pending plan change.
   * @param newPendingPlan newPendingPlan or {@code null} for none
   */
  public Entitlement setNewPendingPlan(java.lang.String newPendingPlan) {
    this.newPendingPlan = newPendingPlan;
    return this;
  }

  /**
   * Output only. The identifier of the plan that was procured. Required if the product has plans.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlan() {
    return plan;
  }

  /**
   * Output only. The identifier of the plan that was procured. Required if the product has plans.
   * @param plan plan or {@code null} for none
   */
  public Entitlement setPlan(java.lang.String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Output only. The identifier of the product that was procured.
   * @return value or {@code null} for none
   */
  public java.lang.String getProduct() {
    return product;
  }

  /**
   * Output only. The identifier of the product that was procured.
   * @param product product or {@code null} for none
   */
  public Entitlement setProduct(java.lang.String product) {
    this.product = product;
    return this;
  }

  /**
   * Output only. The identifier of the service provider that this entitlement was created against.
   * Each service provider is assigned a unique provider value when they onboard with Cloud Commerce
   * platform.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvider() {
    return provider;
  }

  /**
   * Output only. The identifier of the service provider that this entitlement was created against.
   * Each service provider is assigned a unique provider value when they onboard with Cloud Commerce
   * platform.
   * @param provider provider or {@code null} for none
   */
  public Entitlement setProvider(java.lang.String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Output only. The state of the entitlement.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the entitlement.
   * @param state state or {@code null} for none
   */
  public Entitlement setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The last update timestamp.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last update timestamp.
   * @param updateTime updateTime or {@code null} for none
   */
  public Entitlement setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. The consumerId to use when reporting usage through the Service Control API. See
   * the consumerId field at [Reporting Metrics](https://cloud.google.com/service-control/reporting-
   * metrics) for more details.
   *
   * This field is present only if the product has usage-based billing configured.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsageReportingId() {
    return usageReportingId;
  }

  /**
   * Output only. The consumerId to use when reporting usage through the Service Control API. See
   * the consumerId field at [Reporting Metrics](https://cloud.google.com/service-control/reporting-
   * metrics) for more details.
   *
   * This field is present only if the product has usage-based billing configured.
   * @param usageReportingId usageReportingId or {@code null} for none
   */
  public Entitlement setUsageReportingId(java.lang.String usageReportingId) {
    this.usageReportingId = usageReportingId;
    return this;
  }

  @Override
  public Entitlement set(String fieldName, Object value) {
    return (Entitlement) super.set(fieldName, value);
  }

  @Override
  public Entitlement clone() {
    return (Entitlement) super.clone();
  }

}