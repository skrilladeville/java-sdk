/**
 * Copyright (c) 2019 Yodlee, Inc. All Rights Reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for license information.
 */
package com.yodlee.api.model.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.yodlee.api.model.AbstractModelComponent;
import com.yodlee.api.model.Money;
import com.yodlee.api.model.enums.Container;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"CONTAINER", "lastUpdated", "id", "accountName", "accountNumber", "accountType", "providerId",
		"providerName", "providerAccountId", "availableBalance", "balance", "currentBalance"})
public class AssociatedAccount extends AbstractModelComponent {

	@ApiModelProperty(readOnly = true,
					  value = "The type of service. E.g., Bank, Credit Card, Investment, Insurance, etc.<br><br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Applicable containers</b>: All containers<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("CONTAINER")
	private Container container;

	@ApiModelProperty(readOnly = true,
					  value = "The primary key of the provider account resource."//
							  + "<br><br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Applicable containers</b>: All containers<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("providerAccountId")
	private Long providerAccountId;

	@ApiModelProperty(readOnly = true,
					  value = "The account name as it appears at the site.<br>"//
							  + "(The POST accounts service response return this field as name)<br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Applicable containers</b>: All containers<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("accountName")
	private String accountName;

	@ApiModelProperty(readOnly = true,
					  value = "The account number as it appears on the site. (The POST accounts service response return this field as number)<br>"
							  + "<b>Additional Details</b>:<b> Bank/ Loan/ Insurance/ Investment</b>:<br>"
							  + " The account number for the bank account as it appears at the site.<br>"
							  + "<b>Credit Card</b>: The account number of the card account as it appears at the site,<br>"
							  + "i.e., the card number.The account number can be full or partial based on how it is displayed in the account summary page of the site."
							  + "In most cases, the site does not display the full account number in the account summary page "
							  + "and additional navigation is required to aggregate it.<br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Applicable containers</b>: All containers<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("accountNumber")
	private String accountNumber;

	@ApiModelProperty(readOnly = true,
					  value = "The total account value. " + "<br><b>Additional Details:</b>"
							  + "<br><b>Bank:</b> available balance or current balance."
							  + "<br><b>Credit Card:</b> running Balance."
							  + "<br><b>Investment:</b> The total balance of all the investment account, as it appears on the FI site."
							  + "<br><b>Insurance:</b> CashValue or amountDue" + "<br><b>Loan:</b> principalBalance<br>"
							  + "<b>Applicable containers</b>: bank, creditCard, investment, insurance, loan, otherAssets, otherLiabilities, realEstate<br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("balance")
	private Money balance;

	@ApiModelProperty(readOnly = true,
					  value = "The primary key of the account resource and the unique identifier for the account.<br><br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Applicable containers</b>: All containers<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("id")
	private Long id;

	@ApiModelProperty(readOnly = true,
					  value = "Identifier of the provider site. The primary key of provider resource. "//
							  + "<br><br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Applicable containers</b>: All containers<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("providerId")
	private String providerId;

	@ApiModelProperty(readOnly = true,
					  value = "Service provider or institution name where the account originates. This belongs to the provider resource."//
							  + "<br><br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Applicable containers</b>: All containers<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("providerName")
	private String providerName;

	@ApiModelProperty(readOnly = true,
					  value = "The balance in the account that is available for spending. "
							  + "For checking accounts with overdraft, available balance may include "
							  + "overdraft amount, if end site adds overdraft balance to available balance.<br>"//
							  + "<b>Applicable containers</b>: bank, investment<br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("availableBalance")
	private Money availableBalance;

	@ApiModelProperty(readOnly = true,
					  value = "The balance in the account that is available at the beginning of the "
							  + "business day; it is equal to the ledger balance of the account.<br><br>"//
							  + "<b>Applicable containers</b>: bank<br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("currentBalance")
	private Money currentBalance;

	@ApiModelProperty(readOnly = true,
					  value = "The type of account that is aggregated, i.e., savings, checking, credit card, charge, HELOC, etc. "
							  + "The account type is derived based on the attributes of the account. " //
							  + "<br><b>Valid Values:</b>"//
							  + "<br><b>Aggregated Account Type</b>"//
							  + "<br><b>bank</b>"//
							  + "<ul>"//
							  + "<li>CHECKING</li>"//
							  + "<li>SAVINGS</li>"//
							  + "<li>CD</li>"//
							  + "<li>PPF</li>"//
							  + "<li>RECURRING_DEPOSIT</li>"//
							  + "<li>FSA</li>"//
							  + "<li>MONEY_MARKET</li>"//
							  + "<li>IRA</li>"//
							  + "<li>PREPAID</li>"//
							  + "</ul>"//
							  + "<b>creditCard</b>"//
							  + "<ul>"//
							  + "<li>OTHER</li>"//
							  + "<li>CREDIT</li>"//
							  + "<li>STORE</li>"//
							  + "<li>CHARGE</li>"//
							  + "<li>OTHER</li>"//
							  + "</ul>"//
							  + "<b>investment (SN 1.0)</b>"//
							  + "<ul>" + "<li>BROKERAGE_MARGIN</li>"//
							  + "<li>HSA</li>"//
							  + "<li>IRA</li>"//
							  + "<li>BROKERAGE_CASH</li>"//
							  + "<li>401K</li>"//
							  + "<li>403B</li>"//
							  + "<li>TRUST</li>"//
							  + "<li>ANNUITY</li>"//
							  + "<li>SIMPLE</li>"//
							  + "<li>CUSTODIAL</li>"//
							  + "<li>BROKERAGE_CASH_OPTION</li>"//
							  + "<li>BROKERAGE_MARGIN_OPTION</li>"//
							  + "<li>INDIVIDUAL</li>"//
							  + "<li>CORPORATE</li>"//
							  + "<li>JTTIC</li>"//
							  + "<li>JTWROS</li>"//
							  + "<li>COMMUNITY_PROPERTY</li>"//
							  + "<li>JOINT_BY_ENTIRETY</li>"//
							  + "<li>CONSERVATORSHIP</li>"//
							  + "<li>ROTH</li>"//
							  + "<li>ROTH_CONVERSION</li>"//
							  + "<li>ROLLOVER</li>"//
							  + "<li>EDUCATIONAL</li>"//
							  + "<li>529_PLAN</li>"//
							  + "<li>457_DEFERRED_COMPENSATION</li>"//
							  + "<li>401A</li>"//
							  + "<li>PSP</li>"//
							  + "<li>MPP</li>"//
							  + "<li>STOCK_BASKET</li>"//
							  + "<li>LIVING_TRUST</li>"//
							  + "<li>REVOCABLE_TRUST</li>"//
							  + "<li>IRREVOCABLE_TRUST</li>"//
							  + "<li>CHARITABLE_REMAINDER</li>"//
							  + "<li>CHARITABLE_LEAD</li>"//
							  + "<li>CHARITABLE_GIFT_ACCOUNT</li>"//
							  + "<li>SEP</li>"//
							  + "<li>UTMA</li>"//
							  + "<li>UGMA</li>"//
							  + "<li>ESOPP</li>"//
							  + "<li>ADMINISTRATOR</li>"//
							  + "<li>EXECUTOR</li>"//
							  + "<li>PARTNERSHIP</li>"//
							  + "<li>SOLE_PROPRIETORSHIP</li>"//
							  + "<li>CHURCH</li>"//
							  + "<li>INVESTMENT_CLUB</li>"//
							  + "<li>RESTRICTED_STOCK_AWARD</li>"//
							  + "<li>CMA</li>"//
							  + "<li>EMPLOYEE_STOCK_PURCHASE_PLAN</li>"//
							  + "<li>PERFORMANCE_PLAN</li>"//
							  + "<li>BROKERAGE_LINK_ACCOUNT</li>"//
							  + "<li>MONEY_MARKET</li>"//
							  + "<li>SUPER_ANNUATION</li>"//
							  + "<li>REGISTERED_RETIREMENT_SAVINGS_PLAN</li>"//
							  + "<li>SPOUSAL_RETIREMENT_SAVINGS_PLAN</li>"//
							  + "<li>DEFERRED_PROFIT_SHARING_PLAN</li>"//
							  + "<li>NON_REGISTERED_SAVINGS_PLAN</li>"//
							  + "<li>REGISTERED_EDUCATION_SAVINGS_PLAN</li>"//
							  + "<li>GROUP_RETIREMENT_SAVINGS_PLAN</li>"//
							  + "<li>LOCKED_IN_RETIREMENT_SAVINGS_PLAN</li>"//
							  + "<li>RESTRICTED_LOCKED_IN_SAVINGS_PLAN</li>"//
							  + "<li>LOCKED_IN_RETIREMENT_ACCOUNT</li>"//
							  + "<li>REGISTERED_PENSION_PLAN</li>"//
							  + "<li>TAX_FREE_SAVINGS_ACCOUNT</li>"//
							  + "<li>LIFE_INCOME_FUND</li>"//
							  + "<li>REGISTERED_RETIREMENT_INCOME_FUND</li>"//
							  + "<li>SPOUSAL_RETIREMENT_INCOME_FUND</li>"//
							  + "<li>LOCKED_IN_REGISTERED_INVESTMENT_FUND</li>"//
							  + "<li>PRESCRIBED_REGISTERED_RETIREMENT_INCOME_FUND</li>"//
							  + "<li>GUARANTEED_INVESTMENT_CERTIFICATES</li>"//
							  + "<li>REGISTERED_DISABILITY_SAVINGS_PLAN</li>"//
							  + "<li>OTHER</li>"//
							  + "</ul>"//
							  + "<b>investment (SN 2.0)</b>"//
							  + "<ul>"//
							  + "<li>BROKERAGE_CASH</li>"//
							  + "<li>BROKERAGE_MARGIN</li>"//
							  + "<li>INDIVIDUAL_RETIREMENT_ACCOUNT_IRA</li>"//
							  + "<li>EMPLOYEE_RETIREMENT_ACCOUNT_401K</li>"//
							  + "<li>EMPLOYEE_RETIREMENT_SAVINGS_PLAN_403B</li>"//
							  + "<li>TRUST</li>"//
							  + "<li>ANNUITY</li>"//
							  + "<li>SIMPLE_IRA</li>"//
							  + "<li>CUSTODIAL_ACCOUNT</li>"//
							  + "<li>BROKERAGE_CASH_OPTION</li>"//
							  + "<li>BROKERAGE_MARGIN_OPTION</li>"//
							  + "<li>INDIVIDUAL</li>"//
							  + "<li>CORPORATE_INVESTMENT_ACCOUNT</li>"//
							  + "<li>JOINT_TENANTS_TENANCY_IN_COMMON_JTIC</li>"//
							  + "<li>JOINT_TENANTS_WITH_RIGHTS_OF_SURVIVORSHIP_JTWROS</li>"//
							  + "<li>JOINT_TENANTS_COMMUNITY_PROPERTY</li>"//
							  + "<li>JOINT_TENANTS_TENANTS_BY_ENTIRETY</li>"//
							  + "<li>CONSERVATOR</li>"//
							  + "<li>ROTH_IRA</li>"//
							  + "<li>ROTH_CONVERSION</li>"//
							  + "<li>ROLLOVER_IRA</li>"//
							  + "<li>EDUCATIONAL</li>"//
							  + "<li>EDUCATIONAL_SAVINGS_PLAN_529</li>"//
							  + "<li>DEFERRED_COMPENSATION_PLAN_457</li>"//
							  + "<li>MONEY_PURCHASE_RETIREMENT_PLAN_401A</li>"//
							  + "<li>PROFIT_SHARING_PLAN</li>"//
							  + "<li>MONEY_PURCHASE_PLAN</li>"//
							  + "<li>STOCK_BASKET_ACCOUNT</li>"//
							  + "<li>LIVING_TRUST</li>"//
							  + "<li>REVOCABLE_TRUST</li>"//
							  + "<li>IRREVOCABLE_TRUST</li>"//
							  + "<li>CHARITABLE_REMAINDER_TRUST</li>"//
							  + "<li>CHARITABLE_LEAD_TRUST</li>"//
							  + "<li>CHARITABLE_GIFT_ACCOUNT</li>"//
							  + "<li>SEP_IRA</li>"//
							  + "<li>UNIFORM_TRANSFER_TO_MINORS_ACT_UTMA</li>"//
							  + "<li>UNIFORM_GIFT_TO_MINORS_ACT_UGMA</li>"//
							  + "<li>EMPLOYEE_STOCK_OWNERSHIP_PLAN_ESOP</li>"//
							  + "<li>ADMINISTRATOR</li>"//
							  + "<li>EXECUTOR</li>"//
							  + "<li>PARTNERSHIP</li>"//
							  + "<li>PROPRIETORSHIP</li>"//
							  + "<li>CHURCH_ACCOUNT</li>"//
							  + "<li>INVESTMENT_CLUB</li>"//
							  + "<li>RESTRICTED_STOCK_AWARD</li>"//
							  + "<li>CASH_MANAGEMENT_ACCOUNT</li>"//
							  + "<li>EMPLOYEE_STOCK_PURCHASE_PLAN_ESPP</li>"//
							  + "<li>PERFORMANCE_PLAN</li>"//
							  + "<li>BROKERAGE_LINK_ACCOUNT</li>"//
							  + "<li>MONEY_MARKET_ACCOUNT</li>"//
							  + "<li>SUPERANNUATION</li>"//
							  + "<li>REGISTERED_RETIREMENT_SAVINGS_PLAN_RRSP</li>"//
							  + "<li>SPOUSAL_RETIREMENT_SAVINGS_PLAN_SRSP</li>"//
							  + "<li>DEFERRED_PROFIT_SHARING_PLAN_DPSP</li>"//
							  + "<li>NON_REGISTERED_SAVINGS_PLAN_NRSP</li>"//
							  + "<li>REGISTERED_EDUCATION_SAVINGS_PLAN_RESP</li>"//
							  + "<li>GROUP_RETIREMENT_SAVINGS_PLAN_GRSP</li>"//
							  + "<li>LOCKED_IN_RETIREMENT_SAVINGS_PLAN_LRSP</li>"//
							  + "<li>RESTRICTED_LOCKED_IN_SAVINGS_PLAN_RLSP</li>"//
							  + "<li>LOCKED_IN_RETIREMENT_ACCOUNT_LIRA</li>"//
							  + "<li>REGISTERED_PENSION_PLAN_RPP</li>"//
							  + "<li>TAX_FREE_SAVINGS_ACCOUNT_TFSA</li>"//
							  + "<li>LIFE_INCOME_FUND_LIF</li>"//
							  + "<li>REGISTERED_RETIREMENT_INCOME_FUND_RIF</li>"//
							  + "<li>SPOUSAL_RETIREMENT_INCOME_FUND_SRIF</li>"//
							  + "<li>LOCKED_IN_REGISTERED_INVESTMENT_FUND_LRIF</li>"//
							  + "<li>PRESCRIBED_REGISTERED_RETIREMENT_INCOME_FUND_PRIF</li>"//
							  + "<li>GUARANTEED_INVESTMENT_CERTIFICATES_GIC</li>"//
							  + "<li>REGISTERED_DISABILITY_SAVINGS_PLAN_RDSP</li>"//
							  + "<li>DEFINED_CONTRIBUTION_PLAN</li>"//
							  + "<li>DEFINED_BENEFIT_PLAN</li>"//
							  + "<li>EMPLOYEE_STOCK_OPTION_PLAN</li>"//
							  + "<li>NONQUALIFIED_DEFERRED_COMPENSATION_PLAN_409A</li>"//
							  + "<li>KEOGH_PLAN</li>"//
							  + "<li>EMPLOYEE_RETIREMENT_ACCOUNT_ROTH_401K</li>"//
							  + "<li>DEFERRED_CONTINGENT_CAPITAL_PLAN_DCCP</li>"//
							  + "<li>EMPLOYEE_BENEFIT_PLAN</li>"//
							  + "<li>EMPLOYEE_SAVINGS_PLAN</li>"//
							  + "<li>HEALTH_SAVINGS_ACCOUNT_HSA</li>"//
							  + "<li>COVERDELL_EDUCATION_SAVINGS_ACCOUNT_ESA</li>"//
							  + "<li>TESTAMENTARY_TRUST</li>"//
							  + "<li>ESTATE</li>"//
							  + "<li>GRANTOR_RETAINED_ANNUITY_TRUST_GRAT</li>"//
							  + "<li>ADVISORY_ACCOUNT</li>"//
							  + "<li>NON_PROFIT_ORGANIZATION_501C</li>"//
							  + "<li>HEALTH_REIMBURSEMENT_ARRANGEMENT_HRA</li>"//
							  + "<li>INDIVIDUAL_SAVINGS_ACCOUNT_ISA</li>"//
							  + "<li>CASH_ISA</li>"//
							  + "<li>STOCKS_AND_SHARES_ISA</li>"//
							  + "<li>INNOVATIVE_FINANCE_ISA</li>"//
							  + "<li>JUNIOR_ISA</li>"//
							  + "<li>EMPLOYEES_PROVIDENT_FUND_ORGANIZATION_EPFO</li>"//
							  + "<li>PUBLIC_PROVIDENT_FUND_PPF</li>"//
							  + "<li>EMPLOYEES_PENSION_SCHEME_EPS</li>"//
							  + "<li>NATIONAL_PENSION_SYSTEM_NPS</li>"//
							  + "<li>INDEXED_ANNUITY</li>"//
							  + "<li>ANNUITIZED_ANNUITY</li>"//
							  + "<li>VARIABLE_ANNUITY</li>"//
							  + "<li>ROTH_403B</li>"//
							  + "<li>SPOUSAL_IRA</li>"//
							  + "<li>SPOUSAL_ROTH_IRA</li>"//
							  + "<li>SARSEP_IRA</li>"//
							  + "<li>SUBSTANTIALLY_EQUAL_PERIODIC_PAYMENTS_SEPP</li>"//
							  + "<li>OFFSHORE_TRUST</li>"//
							  + "<li>IRREVOCABLE_LIFE_INSURANCE_TRUST</li>"//
							  + "<li>INTERNATIONAL_TRUST</li>"//
							  + "<li>LIFE_INTEREST_TRUST</li>"//
							  + "<li>EMPLOYEE_BENEFIT_TRUST</li>"//
							  + "<li>PRECIOUS_METAL_ACCOUNT</li>"//
							  + "<li>INVESTMENT_LOAN_ACCOUNT</li>"//
							  + "<li>GRANTOR_RETAINED_INCOME_TRUST</li>"//
							  + "<li>PENSION_PLAN</li>"//
							  + "<li>OTHER</li>"//
							  + "</ul>"//
							  + "<b>loan</b>"//
							  + "<ul>"//
							  + "<li>MORTGAGE</li>"//
							  + "<li>INSTALLMENT_LOAN</li>"//
							  + "<li>PERSONAL_LOAN</li>"//
							  + "<li>HOME_EQUITY_LINE_OF_CREDIT</li>"//
							  + "<li>LINE_OF_CREDIT</li>"//
							  + "<li>AUTO_LOAN</li>"//
							  + "<li>STUDENT_LOAN</li>"//
							  + "<li>HOME_LOAN</li>"//
							  + "</ul>"//
							  + "<b>insurance</b>"//
							  + "<ul>"//
							  + "<li>AUTO_INSURANCE</li>"//
							  + "<li>HEALTH_INSURANCE</li>"//
							  + "<li>HOME_INSURANCE</li>"//
							  + "<li>LIFE_INSURANCE</li>"//
							  + "<li>ANNUITY</li>"//
							  + "<li>TRAVEL_INSURANCE</li>"//
							  + "<li>INSURANCE</li>"//
							  + "</ul>"//
							  + "<b>realEstate</b>"//
							  + "<ul> " + "<li>REAL_ESTATE</li>"//
							  + "</ul>"//
							  + "<b>reward</b>"//
							  + "<ul>"//
							  + "<li>REWARD_POINTS</li>"//
							  + "</ul>"//
							  + "<b>Manual Account Type</b><br>"//
							  + "<b>bank</b>"//
							  + "<ul>"//
							  + "<li>CHECKING</li>"//
							  + "<li>SAVINGS</li>"//
							  + "<li>CD</li>"//
							  + "<li>PREPAID</li>"//
							  + "</ul>"//
							  + "<b>credit</b>"//
							  + "<ul>  " + "<li>CREDIT</li>"//
							  + "</ul>"//
							  + "<b>loan</b>"//
							  + "<ul>  " + "<li>PERSONAL_LOAN</li>"//
							  + "<li>HOME_LOAN</li>"//
							  + "</ul>"//
							  + "<b>insurance</b>"//
							  + "<ul>"//
							  + "<li>INSURANCE</li>"//
							  + "<li>ANNUITY</li>"//
							  + "</ul>"//
							  + "<b>investment</b>"//
							  + "<ul>"//
							  + "<li>BROKERAGE_CASH</li>"//
							  + "</ul>"//
							  + "<br><br>"//
							  + "<b>Applicable containers</b>: bank<br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("accountType")
	private String accountType;

	@ApiModelProperty(readOnly = true,
					  value = "The date time the account information was last retrieved from the provider site and updated in the Yodlee system.<br>"//
							  + "<b>Applicable containers</b>: bank<br>"//
							  + "<b>Associated Accounts<br>"//
							  + "<b>Endpoints</b>:"//
							  + "<ul>"//
							  + "<li>GET Associated Accounts/{providerAccountId}</li>"//
							  + "</ul>")
	@JsonProperty("lastUpdated")
	private String lastUpdated;

	/**
	 * The type of service. E.g., Bank, Credit Card, Investment, Insurance, etc.<br>
	 * <br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 * <b>Applicable Values</b><br>
	 *
	 * @return CONTAINER
	 */
	@JsonProperty("CONTAINER")
	public Container getContainer() {
		return container;
	}

	/**
	 * The primary key of the provider account resource. <br>
	 * <br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return providerAccountId
	 */
	public Long getProviderAccountId() {
		return providerAccountId;
	}

	/**
	 * The account number as it appears on the site. (The POST accounts service response return this field as
	 * number)<br>
	 * <b>Additional Details</b>:<b> Bank/ Loan/ Insurance/ Investment</b>:<br>
	 * The account number for the bank account as it appears at the site.<br>
	 * <b>Credit Card</b>: The account number of the card account as it appears at the site,<br>
	 * i.e., the card number.The account number can be full or partial based on how it is displayed in the account
	 * summary page of the site. In most cases, the site does not display the full account number in the account summary
	 * page and additional navigation is required to aggregate it.<br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 * 
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * The total account value. * <br>
	 * <b>Additional Details:</b> <br>
	 * <b>Bank:</b> available balance or current balance. <br>
	 * <b>Credit Card:</b> running Balance. <br>
	 * <b>Investment:</b> The total balance of all the investment account, as it appears on the FI site. <br>
	 * <b>Insurance:</b> CashValue or amountDue * <br>
	 * <b>Loan:</b> principalBalance <br>
	 * <b>Applicable containers</b>: bank, creditCard, investment, insurance, loan, otherAssets, otherLiabilities,
	 * realEstate<br>
	 * <b>Associated Accounts</b><br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return balance
	 */
	public Money getBalance() {
		return balance;
	}

	/**
	 * The primary key of the account resource and the unique identifier for the account.<br>
	 * <br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * The date time the account information was last retrieved from the provider site and updated in the Yodlee
	 * system.<br>
	 * <br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return lastUpdated
	 */
	public String getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * Service provider or institution name where the account originates. This belongs to the provider resource. <br>
	 * <br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return providerName
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * Identifier of the provider site. The primary key of provider resource. <br>
	 * <br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return providerId
	 */
	public String getProviderId() {
		return providerId;
	}

	/**
	 * The balance in the account that is available for spending. For checking accounts with overdraft, available
	 * balance may include overdraft amount, if end site adds overdraft balance to available balance.<br>
	 * <b>Applicable containers</b>: bank, investment<br>
	 * <b>Associated Accounts</b><br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 * 
	 * @return availableBalance
	 */
	public Money getAvailableBalance() {
		return availableBalance;
	}

	/**
	 * The balance in the account that is available at the beginning of the business day; it is equal to the ledger
	 * balance of the account.<br>
	 * <br>
	 * <b>Applicable containers</b>: bank<br>
	 * <b>Associated Accounts</b><br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return currentBalance
	 */
	public Money getCurrentBalance() {
		return currentBalance;
	}

	/**
	 * The type of account that is aggregated, i.e., savings, checking, credit card, charge, HELOC, etc. The account
	 * type is derived based on the attributes of the account. <br>
	 * <b>Valid Values:</b> <br>
	 * <b>Aggregated Account Type</b> <br>
	 * <b>bank</b>
	 * <ul>
	 * <li>CHECKING</li>
	 * <li>SAVINGS</li>
	 * <li>CD</li>
	 * <li>PPF</li>
	 * <li>RECURRING_DEPOSIT</li>
	 * <li>FSA</li>
	 * <li>MONEY_MARKET</li>
	 * <li>IRA</li>
	 * <li>PREPAID</li>
	 * </ul>
	 * <b>creditCard</b>
	 * <ul>
	 * <li>OTHER</li>
	 * <li>CREDIT</li>
	 * <li>STORE</li>
	 * <li>CHARGE</li>
	 * <li>OTHER</li>
	 * </ul>
	 * <b>investment (SN 1.0)</b>
	 * <ul>
	 *
	 * <li>BROKERAGE_MARGIN</li>
	 * <li>HSA</li>
	 * <li>IRA</li>
	 * <li>BROKERAGE_CASH</li>
	 * <li>401K</li>
	 * <li>403B</li>
	 * <li>TRUST</li>
	 * <li>ANNUITY</li>
	 * <li>SIMPLE</li>
	 * <li>CUSTODIAL</li>
	 * <li>BROKERAGE_CASH_OPTION</li>
	 * <li>BROKERAGE_MARGIN_OPTION</li>
	 * <li>INDIVIDUAL</li>
	 * <li>CORPORATE</li>
	 * <li>JTTIC</li>
	 * <li>JTWROS</li>
	 * <li>COMMUNITY_PROPERTY</li>
	 * <li>JOINT_BY_ENTIRETY</li>
	 * <li>CONSERVATORSHIP</li>
	 * <li>ROTH</li>
	 * <li>ROTH_CONVERSION</li>
	 * <li>ROLLOVER</li>
	 * <li>EDUCATIONAL</li>
	 * <li>529_PLAN</li>
	 * <li>457_DEFERRED_COMPENSATION</li>
	 * <li>401A</li>
	 * <li>PSP</li>
	 * <li>MPP</li>
	 * <li>STOCK_BASKET</li>
	 * <li>LIVING_TRUST</li>
	 * <li>REVOCABLE_TRUST</li>
	 * <li>IRREVOCABLE_TRUST</li>
	 * <li>CHARITABLE_REMAINDER</li>
	 * <li>CHARITABLE_LEAD</li>
	 * <li>CHARITABLE_GIFT_ACCOUNT</li>
	 * <li>SEP</li>
	 * <li>UTMA</li>
	 * <li>UGMA</li>
	 * <li>ESOPP</li>
	 * <li>ADMINISTRATOR</li>
	 * <li>EXECUTOR</li>
	 * <li>PARTNERSHIP</li>
	 * <li>SOLE_PROPRIETORSHIP</li>
	 * <li>CHURCH</li>
	 * <li>INVESTMENT_CLUB</li>
	 * <li>RESTRICTED_STOCK_AWARD</li>
	 * <li>CMA</li>
	 * <li>EMPLOYEE_STOCK_PURCHASE_PLAN</li>
	 * <li>PERFORMANCE_PLAN</li>
	 * <li>BROKERAGE_LINK_ACCOUNT</li>
	 * <li>MONEY_MARKET</li>
	 * <li>SUPER_ANNUATION</li>
	 * <li>REGISTERED_RETIREMENT_SAVINGS_PLAN</li>
	 * <li>SPOUSAL_RETIREMENT_SAVINGS_PLAN</li>
	 * <li>DEFERRED_PROFIT_SHARING_PLAN</li>
	 * <li>NON_REGISTERED_SAVINGS_PLAN</li>
	 * <li>REGISTERED_EDUCATION_SAVINGS_PLAN</li>
	 * <li>GROUP_RETIREMENT_SAVINGS_PLAN</li>
	 * <li>LOCKED_IN_RETIREMENT_SAVINGS_PLAN</li>
	 * <li>RESTRICTED_LOCKED_IN_SAVINGS_PLAN</li>
	 * <li>LOCKED_IN_RETIREMENT_ACCOUNT</li>
	 * <li>REGISTERED_PENSION_PLAN</li>
	 * <li>TAX_FREE_SAVINGS_ACCOUNT</li>
	 * <li>LIFE_INCOME_FUND</li>
	 * <li>REGISTERED_RETIREMENT_INCOME_FUND</li>
	 * <li>SPOUSAL_RETIREMENT_INCOME_FUND</li>
	 * <li>LOCKED_IN_REGISTERED_INVESTMENT_FUND</li>
	 * <li>PRESCRIBED_REGISTERED_RETIREMENT_INCOME_FUND</li>
	 * <li>GUARANTEED_INVESTMENT_CERTIFICATES</li>
	 * <li>REGISTERED_DISABILITY_SAVINGS_PLAN</li>
	 * <li>OTHER</li>
	 * </ul>
	 * <b>investment (SN 2.0)</b>
	 * <ul>
	 * <li>BROKERAGE_CASH</li>
	 * <li>BROKERAGE_MARGIN</li>
	 * <li>INDIVIDUAL_RETIREMENT_ACCOUNT_IRA</li>
	 * <li>EMPLOYEE_RETIREMENT_ACCOUNT_401K</li>
	 * <li>EMPLOYEE_RETIREMENT_SAVINGS_PLAN_403B</li>
	 * <li>TRUST</li>
	 * <li>ANNUITY</li>
	 * <li>SIMPLE_IRA</li>
	 * <li>CUSTODIAL_ACCOUNT</li>
	 * <li>BROKERAGE_CASH_OPTION</li>
	 * <li>BROKERAGE_MARGIN_OPTION</li>
	 * <li>INDIVIDUAL</li>
	 * <li>CORPORATE_INVESTMENT_ACCOUNT</li>
	 * <li>JOINT_TENANTS_TENANCY_IN_COMMON_JTIC</li>
	 * <li>JOINT_TENANTS_WITH_RIGHTS_OF_SURVIVORSHIP_JTWROS</li>
	 * <li>JOINT_TENANTS_COMMUNITY_PROPERTY</li>
	 * <li>JOINT_TENANTS_TENANTS_BY_ENTIRETY</li>
	 * <li>CONSERVATOR</li>
	 * <li>ROTH_IRA</li>
	 * <li>ROTH_CONVERSION</li>
	 * <li>ROLLOVER_IRA</li>
	 * <li>EDUCATIONAL</li>
	 * <li>EDUCATIONAL_SAVINGS_PLAN_529</li>
	 * <li>DEFERRED_COMPENSATION_PLAN_457</li>
	 * <li>MONEY_PURCHASE_RETIREMENT_PLAN_401A</li>
	 * <li>PROFIT_SHARING_PLAN</li>
	 * <li>MONEY_PURCHASE_PLAN</li>
	 * <li>STOCK_BASKET_ACCOUNT</li>
	 * <li>LIVING_TRUST</li>
	 * <li>REVOCABLE_TRUST</li>
	 * <li>IRREVOCABLE_TRUST</li>
	 * <li>CHARITABLE_REMAINDER_TRUST</li>
	 * <li>CHARITABLE_LEAD_TRUST</li>
	 * <li>CHARITABLE_GIFT_ACCOUNT</li>
	 * <li>SEP_IRA</li>
	 * <li>UNIFORM_TRANSFER_TO_MINORS_ACT_UTMA</li>
	 * <li>UNIFORM_GIFT_TO_MINORS_ACT_UGMA</li>
	 * <li>EMPLOYEE_STOCK_OWNERSHIP_PLAN_ESOP</li>
	 * <li>ADMINISTRATOR</li>
	 * <li>EXECUTOR</li>
	 * <li>PARTNERSHIP</li>
	 * <li>PROPRIETORSHIP</li>
	 * <li>CHURCH_ACCOUNT</li>
	 * <li>INVESTMENT_CLUB</li>
	 * <li>RESTRICTED_STOCK_AWARD</li>
	 * <li>CASH_MANAGEMENT_ACCOUNT</li>
	 * <li>EMPLOYEE_STOCK_PURCHASE_PLAN_ESPP</li>
	 * <li>PERFORMANCE_PLAN</li>
	 * <li>BROKERAGE_LINK_ACCOUNT</li>
	 * <li>MONEY_MARKET_ACCOUNT</li>
	 * <li>SUPERANNUATION</li>
	 * <li>REGISTERED_RETIREMENT_SAVINGS_PLAN_RRSP</li>
	 * <li>SPOUSAL_RETIREMENT_SAVINGS_PLAN_SRSP</li>
	 * <li>DEFERRED_PROFIT_SHARING_PLAN_DPSP</li>
	 * <li>NON_REGISTERED_SAVINGS_PLAN_NRSP</li>
	 * <li>REGISTERED_EDUCATION_SAVINGS_PLAN_RESP</li>
	 * <li>GROUP_RETIREMENT_SAVINGS_PLAN_GRSP</li>
	 * <li>LOCKED_IN_RETIREMENT_SAVINGS_PLAN_LRSP</li>
	 * <li>RESTRICTED_LOCKED_IN_SAVINGS_PLAN_RLSP</li>
	 * <li>LOCKED_IN_RETIREMENT_ACCOUNT_LIRA</li>
	 * <li>REGISTERED_PENSION_PLAN_RPP</li>
	 * <li>TAX_FREE_SAVINGS_ACCOUNT_TFSA</li>
	 * <li>LIFE_INCOME_FUND_LIF</li>
	 * <li>REGISTERED_RETIREMENT_INCOME_FUND_RIF</li>
	 * <li>SPOUSAL_RETIREMENT_INCOME_FUND_SRIF</li>
	 * <li>LOCKED_IN_REGISTERED_INVESTMENT_FUND_LRIF</li>
	 * <li>PRESCRIBED_REGISTERED_RETIREMENT_INCOME_FUND_PRIF</li>
	 * <li>GUARANTEED_INVESTMENT_CERTIFICATES_GIC</li>
	 * <li>REGISTERED_DISABILITY_SAVINGS_PLAN_RDSP</li>
	 * <li>DEFINED_CONTRIBUTION_PLAN</li>
	 * <li>DEFINED_BENEFIT_PLAN</li>
	 * <li>EMPLOYEE_STOCK_OPTION_PLAN</li>
	 * <li>NONQUALIFIED_DEFERRED_COMPENSATION_PLAN_409A</li>
	 * <li>KEOGH_PLAN</li>
	 * <li>EMPLOYEE_RETIREMENT_ACCOUNT_ROTH_401K</li>
	 * <li>DEFERRED_CONTINGENT_CAPITAL_PLAN_DCCP</li>
	 * <li>EMPLOYEE_BENEFIT_PLAN</li>
	 * <li>EMPLOYEE_SAVINGS_PLAN</li>
	 * <li>HEALTH_SAVINGS_ACCOUNT_HSA</li>
	 * <li>COVERDELL_EDUCATION_SAVINGS_ACCOUNT_ESA</li>
	 * <li>TESTAMENTARY_TRUST</li>
	 * <li>ESTATE</li>
	 * <li>GRANTOR_RETAINED_ANNUITY_TRUST_GRAT</li>
	 * <li>ADVISORY_ACCOUNT</li>
	 * <li>NON_PROFIT_ORGANIZATION_501C</li>
	 * <li>HEALTH_REIMBURSEMENT_ARRANGEMENT_HRA</li>
	 * <li>INDIVIDUAL_SAVINGS_ACCOUNT_ISA</li>
	 * <li>CASH_ISA</li>
	 * <li>STOCKS_AND_SHARES_ISA</li>
	 * <li>INNOVATIVE_FINANCE_ISA</li>
	 * <li>JUNIOR_ISA</li>
	 * <li>EMPLOYEES_PROVIDENT_FUND_ORGANIZATION_EPFO</li>
	 * <li>PUBLIC_PROVIDENT_FUND_PPF</li>
	 * <li>EMPLOYEES_PENSION_SCHEME_EPS</li>
	 * <li>NATIONAL_PENSION_SYSTEM_NPS</li>
	 * <li>INDEXED_ANNUITY</li>
	 * <li>ANNUITIZED_ANNUITY</li>
	 * <li>VARIABLE_ANNUITY</li>
	 * <li>ROTH_403B</li>
	 * <li>SPOUSAL_IRA</li>
	 * <li>SPOUSAL_ROTH_IRA</li>
	 * <li>SARSEP_IRA</li>
	 * <li>SUBSTANTIALLY_EQUAL_PERIODIC_PAYMENTS_SEPP</li>
	 * <li>OFFSHORE_TRUST</li>
	 * <li>IRREVOCABLE_LIFE_INSURANCE_TRUST</li>
	 * <li>INTERNATIONAL_TRUST</li>
	 * <li>LIFE_INTEREST_TRUST</li>
	 * <li>EMPLOYEE_BENEFIT_TRUST</li>
	 * <li>PRECIOUS_METAL_ACCOUNT</li>
	 * <li>INVESTMENT_LOAN_ACCOUNT</li>
	 * <li>GRANTOR_RETAINED_INCOME_TRUST</li>
	 * <li>PENSION_PLAN</li>
	 * <li>OTHER</li>
	 * </ul>
	 * <b>loan</b>
	 * <ul>
	 * <li>MORTGAGE</li>
	 * <li>INSTALLMENT_LOAN</li>
	 * <li>PERSONAL_LOAN</li>
	 * <li>HOME_EQUITY_LINE_OF_CREDIT</li>
	 * <li>LINE_OF_CREDIT</li>
	 * <li>AUTO_LOAN</li>
	 * <li>STUDENT_LOAN</li>
	 * <li>HOME_LOAN</li>
	 * </ul>
	 * <b>insurance</b>
	 * <ul>
	 * <li>AUTO_INSURANCE</li>
	 * <li>HEALTH_INSURANCE</li>
	 * <li>HOME_INSURANCE</li>
	 * <li>LIFE_INSURANCE</li>
	 * <li>ANNUITY</li>
	 * <li>TRAVEL_INSURANCE</li>
	 * <li>INSURANCE</li>
	 * </ul>
	 * <b>realEstate</b>
	 * <ul>
	 *
	 * <li>REAL_ESTATE</li>
	 * </ul>
	 * <b>reward</b>
	 * <ul>
	 * <li>REWARD_POINTS</li>
	 * </ul>
	 * <b>Manual Account Type</b><br>
	 * <b>bank</b>
	 * <ul>
	 * <li>CHECKING</li>
	 * <li>SAVINGS</li>
	 * <li>CD</li>
	 * <li>PREPAID</li>
	 * </ul>
	 * <b>credit</b>
	 * <ul>
	 *
	 * <li>CREDIT</li>
	 * </ul>
	 * <b>loan</b>
	 * <ul>
	 *
	 * <li>PERSONAL_LOAN</li>
	 * <li>HOME_LOAN</li>
	 * </ul>
	 * <b>insurance</b>
	 * <ul>
	 * <li>INSURANCE</li>
	 * <li>ANNUITY</li>
	 * </ul>
	 * <b>investment</b>
	 * <ul>
	 * <li>BROKERAGE_CASH</li>
	 * </ul>
	 * <br>
	 * <br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * The account name as it appears at the site.<br>
	 * (The POST accounts service response return this field as name)<br>
	 * <b>Associated Accounts</b><br>
	 * <b>Applicable containers</b>: All containers<br>
	 * <b>Endpoints</b>:
	 * <ul>
	 * <li>GET Associated Accounts/{providerAccountId}</li>
	 * </ul>
	 *
	 * @return accountName
	 */
	public String getAccountName() {
		return accountName;
	}
}
