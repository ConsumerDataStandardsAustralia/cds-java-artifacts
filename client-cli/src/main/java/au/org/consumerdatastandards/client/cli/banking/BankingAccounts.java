/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.cli.banking;

import au.org.consumerdatastandards.client.ApiResponse;
import au.org.consumerdatastandards.client.ConformanceError;
import au.org.consumerdatastandards.client.api.banking.BankingAccountsAPI;
import au.org.consumerdatastandards.client.cli.ApiCliBase;
import au.org.consumerdatastandards.client.cli.support.JsonPrinter;
import au.org.consumerdatastandards.client.model.banking.BankingAccount;
import au.org.consumerdatastandards.client.model.banking.BankingProductCategory;
import au.org.consumerdatastandards.client.model.banking.ParamAccountOpenStatus;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIds;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIdsData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountsBalanceById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountsBalanceList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingTransactionById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingTransactionList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.time.OffsetDateTime;
import java.util.List;

@ShellComponent
@ShellCommandGroup("BankingAccounts")
public class BankingAccounts extends ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingAccounts.class);

    private final BankingAccountsAPI api = new BankingAccountsAPI();

    @ShellMethod("Get account detail")
    public String getAccountDetail(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String accountId,
        @ShellOption(defaultValue = "1") Integer version) throws Exception {

        LOGGER.info("Get account detail CLI initiated with accountId: {}, version: {}",
            accountId, version);

        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingAccountById> response = api.getAccountDetailWithHttpInfo(accountId, version);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getAccountDetailCall(accountId, version, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Get transaction detail")
    public String getTransactionDetail(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String accountId,
        @ShellOption(defaultValue = ShellOption.NULL) String transactionId) throws Exception {

        LOGGER.info("Get transaction detail CLI initiated with accountId: {}, transactionId: {}",
            accountId,
            transactionId);

        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingTransactionById> response = api.getTransactionDetailWithHttpInfo(accountId, transactionId);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getTransactionDetailCall(accountId, transactionId, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Get transactions")
    public String getTransactions(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String accountId,
        @ShellOption(defaultValue = ShellOption.NULL) String maxAmount,
        @ShellOption(defaultValue = ShellOption.NULL) String minAmount,
        @ShellOption(defaultValue = ShellOption.NULL) OffsetDateTime newestTime,
        @ShellOption(defaultValue = ShellOption.NULL) OffsetDateTime oldestTime,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
        @ShellOption(defaultValue = ShellOption.NULL) String text) throws Exception {

        LOGGER.info("Get transactions CLI initiated with accountId: {}, max-amount: {}, min-amount: {}, newest-time: {}, oldest-time: {}, page: {}, page-size: {}, text: {}",
            accountId,
            maxAmount,
            minAmount,
            newestTime,
            oldestTime,
            page,
            pageSize,
            text);


        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingTransactionList> response =
            api.getTransactionsWithHttpInfo(accountId, oldestTime, newestTime, minAmount, maxAmount, text, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getTransactionsCall(accountId, oldestTime, newestTime, minAmount, maxAmount, text, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("List accounts")
    public String listAccounts(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) Boolean isOwned,
        @ShellOption(defaultValue = ShellOption.NULL) ParamAccountOpenStatus openStatus,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
        @ShellOption(defaultValue = ShellOption.NULL) BankingProductCategory productCategory,
        @ShellOption(defaultValue = "1") Integer version) throws Exception {

        LOGGER.info("List accounts CLI initiated with is-owned: {}, open-status: {}, page: {}, page-size: {}, product-category: {}, version: {}",
            isOwned,
            openStatus,
            page,
            pageSize,
            productCategory,
            version);


        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingAccountList<BankingAccount>> response = api.listAccountsWithHttpInfo(productCategory, openStatus, isOwned, version, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listAccountsCall(productCategory, openStatus, isOwned, version, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Get balance")
    public String getBalance(@ShellOption(defaultValue = "false") boolean check,
                             @ShellOption(defaultValue = ShellOption.NULL) String accountId) throws Exception {

        LOGGER.info("List balance CLI initiated with accountId: {}",
            accountId);

        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingAccountsBalanceById> response = api.getBalanceWithHttpInfo(accountId);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getBalanceCall(accountId, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Obtain balances for multiple, filtered accounts")
    public String listBalancesBulk(@ShellOption(defaultValue = "false") boolean check,
                                   @ShellOption(defaultValue = ShellOption.NULL) Boolean isOwned,
                                   @ShellOption(defaultValue = ShellOption.NULL) ParamAccountOpenStatus openStatus,
                                   @ShellOption(defaultValue = ShellOption.NULL) Integer page,
                                   @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
                                   @ShellOption(defaultValue = ShellOption.NULL) BankingProductCategory productCategory) throws Exception {
        LOGGER.info("List balances bulk CLI initiated with is-owned: {}, open-status: {}, page: {}, page-size: {}, product-category: {}",
            isOwned,
            openStatus,
            page,
            pageSize,
            productCategory);

        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingAccountsBalanceList> response =
            api.listBalancesBulkWithHttpInfo(productCategory, openStatus, isOwned, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listBalancesBulkCall(productCategory, openStatus, isOwned, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("List balances specific accounts")
    public String listBalancesSpecificAccounts(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) List<String> accountIds,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize) throws Exception {

        LOGGER.info("List balances specific accounts CLI initiated with accountIds: {}, page: {}, page-size: {}",
            accountIds,
            page,
            pageSize);

        api.setApiClient(clientFactory.create(true, check));
        RequestAccountIdsData data = new RequestAccountIdsData();
        data.setAccountIds(accountIds);
        RequestAccountIds requestAccountIds = new RequestAccountIds();
        requestAccountIds.setData(data);
        ApiResponse<ResponseBankingAccountsBalanceList> response = api.listBalancesSpecificAccountsWithHttpInfo(requestAccountIds, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listBalancesSpecificAccountsCall(requestAccountIds, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }
}
