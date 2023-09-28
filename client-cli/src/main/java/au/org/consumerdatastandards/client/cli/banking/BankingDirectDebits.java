/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.cli.banking;

import au.org.consumerdatastandards.client.ApiResponse;
import au.org.consumerdatastandards.client.ConformanceError;
import au.org.consumerdatastandards.client.api.banking.BankingDirectDebitsAPI;
import au.org.consumerdatastandards.client.cli.ApiCliBase;
import au.org.consumerdatastandards.client.cli.support.JsonPrinter;
import au.org.consumerdatastandards.client.model.banking.BankingProductCategory;
import au.org.consumerdatastandards.client.model.banking.ParamAccountOpenStatus;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIds;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIdsData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingDirectDebitAuthorisationList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
@ShellCommandGroup("BankingDirectDebits")
public class BankingDirectDebits extends ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingDirectDebits.class);

    private final BankingDirectDebitsAPI api = new BankingDirectDebitsAPI();

    @ShellMethod("List direct debits")
    public String listDirectDebits(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String accountId,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize) throws Exception {

        LOGGER.info("List direct debits CLI initiated with accountId: {}, page: {}, page-size: {}",
            accountId,
            page,
            pageSize);

        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingDirectDebitAuthorisationList> response = api.listDirectDebitsWithHttpInfo(accountId, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listDirectDebitsCall(accountId, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Obtain balances for multiple, filtered accounts")
    public String listDirectDebitsBulk(@ShellOption(defaultValue = "false") boolean check,
                                   @ShellOption(defaultValue = ShellOption.NULL) Boolean isOwned,
                                   @ShellOption(defaultValue = ShellOption.NULL) ParamAccountOpenStatus openStatus,
                                   @ShellOption(defaultValue = ShellOption.NULL) Integer page,
                                   @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
                                   @ShellOption(defaultValue = ShellOption.NULL) BankingProductCategory productCategory) throws Exception {
        LOGGER.info("List direct debits bulk CLI initiated with is-owned: {}, open-status: {}, page: {}, page-size: {}, product-category: {}",
            isOwned,
            openStatus,
            page,
            pageSize,
            productCategory);

        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingDirectDebitAuthorisationList> response =
            api.listDirectDebitsBulkWithHttpInfo(productCategory, openStatus, isOwned, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listDirectDebitsBulkCall(productCategory, openStatus, isOwned, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("List direct debits specific accounts")
    public String listDirectDebitsSpecificAccounts(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) List<String> accountIds,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize) throws Exception {

        LOGGER.info("List direct debits specific accounts CLI initiated with accountIds: {}, page: {}, page-size: {}",
            accountIds,
            page,
            pageSize);

        api.setApiClient(clientFactory.create(true, check));
        RequestAccountIdsData data = new RequestAccountIdsData();
        data.setAccountIds(accountIds);
        RequestAccountIds requestAccountIds = new RequestAccountIds();
        requestAccountIds.setData(data);
        ApiResponse<ResponseBankingDirectDebitAuthorisationList> response =
            api.listDirectDebitsSpecificAccountsWithHttpInfo(requestAccountIds, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listDirectDebitsSpecificAccountsCall(requestAccountIds, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }
}
