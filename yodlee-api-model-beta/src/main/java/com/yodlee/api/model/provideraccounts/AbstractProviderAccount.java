/**
 * Copyright (c) 2019 Yodlee, Inc. All Rights Reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for license information.
 */
package com.yodlee.api.model.provideraccounts;

import java.util.Collections;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yodlee.api.model.AbstractModelComponent;
import com.yodlee.api.model.AccountDataset;
import com.yodlee.api.model.enums.AggregationSource;
import com.yodlee.api.model.enums.OpenBankingMigrationStatusType;
import com.yodlee.api.model.provideraccounts.enums.ProviderAccountStatus;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractProviderAccount extends AbstractModelComponent {

	@ApiModelProperty(readOnly = true,
					  value = "Unique identifier for the provider account resource. This is created during account addition."//
							  + "<br><br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET providerAccounts</li>"//
							  + "<li>POST providerAccounts</li>"//
							  + "<li>PUT providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET dataExtracts/userData</li>"//
							  + "</ul>")
	@JsonProperty("id")
	protected Long id;

	@ApiModelProperty(readOnly = true,
					  value = "The source through which the providerAccount is added in the system."//
							  + "<br><br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET providerAccounts</li>"//
							  + "<li>POST providerAccounts</li>"//
							  + "<li>PUT providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET dataExtracts/userData</li>"//
							  + "</ul>"//
							  + "<b>Applicable Values</b><br>"//
	)
	@JsonProperty("aggregationSource")
	protected AggregationSource aggregationSource;

	@ApiModelProperty(readOnly = true,
					  value = "Unique identifier for the provider resource. This denotes the provider for which the provider account id is generated by the user."//
							  + "<br><br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET providerAccounts</li>"//
							  + "<li>POST providerAccounts</li>"//
							  + "<li>PUT providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET dataExtracts/userData</li>"//
							  + "</ul>")
	@JsonProperty("providerId")
	protected Long providerId;

	@ApiModelProperty(readOnly = true,
					  value = "Indicates whether account is a manual or aggregated provider account."//
							  + "<br><br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET providerAccounts</li>"//
							  + "<li>POST providerAccounts</li>"//
							  + "<li>PUT providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET dataExtracts/userData</li>"//
							  + "</ul>")
	@JsonProperty("isManual")
	protected Boolean isManual;

	@ApiModelProperty(readOnly = true,
					  value = "Unique id generated to indicate the request."//
							  + "<br><br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET providerAccounts</li>"//
							  + "<li>POST providerAccounts</li>"//
							  + "<li>PUT providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET providerAccounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("requestId")
	protected String requestId;

	@ApiModelProperty(readOnly = true,
					  value = "The status of last update attempted for the account. "//
							  + "<br><br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET providerAccounts</li>"//
							  + "<li>POST providerAccounts</li>"//
							  + "<li>PUT providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET dataExtracts/userData</li>"//
							  + "</ul>"//
							  + "<b>Applicable Values</b><br>"//
	)
	@JsonProperty("status")
	protected ProviderAccountStatus status;

	@ApiModelProperty(readOnly = true,
					  value = "Logical grouping of dataset attributes into datasets such as Basic Aggregation Data, Account Profile and Documents."//
							  + "<br><br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET providerAccounts</li>"//
							  + "<li>POST providerAccounts</li>"//
							  + "<li>PUT providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET providerAccounts/{providerAccountId}</li>"//
							  + "<li>GET dataExtracts/userData</li>"//
							  + "</ul>")
	@JsonProperty("dataset")
	protected List<AccountDataset> datasets;

	@ApiModelProperty(readOnly = true,
					  value = "Indicate when the providerAccount is last updated successfully." + "<br><br>"//
							  + "<b>Account Type</b>: Aggregated<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET dataExtracts/userData</li>"//
							  + "</ul>")
	@JsonProperty("lastUpdated")
	protected String lastUpdated;

	/**
	 * The source through which the providerAccount is added in the system. <br>
	 * <br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET providerAccounts</li>
	 * <li>POST providerAccounts</li>
	 * <li>PUT providerAccounts/{providerAccountId}</li>
	 * <li>GET providerAccounts/{providerAccountId}</li>
	 * </ul>
	 * <b>Applicable Values</b><br>
	 * 
	 * @return aggregationSource
	 */
	public AggregationSource getAggregationSource() {
		return aggregationSource;
	}

	/**
	 * Logical grouping of dataset attributes into datasets such as Basic Aggregation Data, Account Profile and
	 * Documents. <br>
	 * <br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET providerAccounts</li>
	 * <li>POST providerAccounts</li>
	 * <li>PUT providerAccounts/{providerAccountId}</li>
	 * <li>GET providerAccounts/{providerAccountId}</li>
	 * </ul>
	 * 
	 * @return dataset
	 */
	@JsonProperty("dataset")
	public List<AccountDataset> getDataset() {
		return datasets == null ? null : Collections.unmodifiableList(datasets);
	}

	/**
	 * Unique identifier for the provider account resource. This is created during account addition. <br>
	 * <br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET providerAccounts</li>
	 * <li>POST providerAccounts</li>
	 * <li>PUT providerAccounts/{providerAccountId}</li>
	 * <li>GET providerAccounts/{providerAccountId}</li>
	 * </ul>
	 * 
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Unique identifier for the provider resource. This denotes the provider for which the provider account id is
	 * generated by the user. <br>
	 * <br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET providerAccounts</li>
	 * <li>POST providerAccounts</li>
	 * <li>PUT providerAccounts/{providerAccountId}</li>
	 * <li>GET providerAccounts/{providerAccountId}</li>
	 * </ul>
	 * 
	 * @return providerId
	 */
	public Long getProviderId() {
		return providerId;
	}

	/**
	 * Indicates whether account is a manual or aggregated provider account. <br>
	 * <br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET providerAccounts</li>
	 * <li>POST providerAccounts</li>
	 * <li>PUT providerAccounts/{providerAccountId}</li>
	 * <li>GET providerAccounts/{providerAccountId}</li>
	 * </ul>
	 * 
	 * @return isManual
	 */
	public Boolean getIsManual() {
		return isManual;
	}

	/**
	 * Unique id generated to indicate the request. <br>
	 * <br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET providerAccounts</li>
	 * <li>POST providerAccounts</li>
	 * <li>PUT providerAccounts/{providerAccountId}</li>
	 * <li>GET providerAccounts/{providerAccountId}</li>
	 * </ul>
	 * 
	 * @return requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * The status of last update attempted for the account. <br>
	 * <br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET providerAccounts</li>
	 * <li>POST providerAccounts</li>
	 * <li>PUT providerAccounts/{providerAccountId}</li>
	 * <li>GET providerAccounts/{providerAccountId}</li>
	 * </ul>
	 * <b>Applicable Values</b><br>
	 * 
	 * @return status
	 */
	public ProviderAccountStatus getStatus() {
		return status;
	}

	/**
	 * Indicate when the providerAccount is last updated successfully. <br>
	 * <br>
	 * <b>Account Type</b>: Aggregated<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET dataExtracts/userData</li>
	 * </ul>
	 * 
	 * @return lastUpdated
	 */
	public String getLastUpdated() {
		return lastUpdated;
	}
	
	@ApiModelProperty(readOnly = true,
			  value = "Indicates the migration status of the provider account from screen-scraping provider to the Open Banking provider. "//
					  + "<br><br>"//
					  + "<b>Endpoints</b>:"//
					  + "<ul>"//
					  + "<li>GET providerAccounts</li>"//
					  + "<li>GET providerAccounts/{providerAccountId}</li>"
					  + "<li>PUT providerAccounts/{providerAccountId}</li>"
					  + "<li>GET dataExtracts/userData</li>"//
					  + "</ul>")
	@JsonProperty("oauthMigrationStatus")
	protected OpenBankingMigrationStatusType openBankingMigrationStatusType;

	/**
	 * Indicates the migration status of the provider account from screen-scraping provider to the Open Banking provider. <br>
	 * <br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET providerAccounts</li>
	 * <li>GET providerAccounts/{providerAccountId}</li>
	 * <li>PUT providerAccounts/{providerAccountId}</li>
	 * <li>GET dataExtracts/userData</li>
	 * </ul>
	 * 
	 * @return OpenBankingMigrationStatusType
	 */
	@JsonProperty("oauthMigrationStatus")
	public OpenBankingMigrationStatusType getOpenBankingMigrationStatusType() {
		return openBankingMigrationStatusType;
	}
}