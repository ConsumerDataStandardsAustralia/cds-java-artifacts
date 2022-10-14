package au.org.consumerdatastandards.integration.api.banking;

import au.org.consumerdatastandards.client.ApiException;
import au.org.consumerdatastandards.client.ConformanceError;
import au.org.consumerdatastandards.client.api.ProtectedAPI;
import au.org.consumerdatastandards.client.model.banking.BankingAccount;
import au.org.consumerdatastandards.client.model.banking.BankingProductCategory;
import au.org.consumerdatastandards.client.model.banking.ParamAccountOpenStatus;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIds;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIdsData;
import au.org.consumerdatastandards.integration.ProtectedITBase;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static au.org.consumerdatastandards.client.ConformanceError.Type.DATA_NOT_MATCHING_CRITERIA;

public abstract class BankingITBase extends ProtectedITBase {

    public BankingITBase(ProtectedAPI api) throws IOException, ApiException {
        super(api);
    }

    protected void checkProductCategory(BankingProductCategory respProductCategory, BankingProductCategory productCategory, List<ConformanceError> errors) {
        if (productCategory != null && (respProductCategory == null || respProductCategory != productCategory)) {
            errors.add(new ConformanceError().errorType(DATA_NOT_MATCHING_CRITERIA)
                    .errorMessage(String.format(
                            "BankingAccount productCategory %s does not match productCategory query %s",
                            respProductCategory, productCategory)));
        }
    }

    protected void checkOwned(Boolean accountOwned, Boolean isOwned, List<ConformanceError> errors) {
        if (isOwned != null && !isOwned.equals(accountOwned)) {
            errors.add(new ConformanceError().errorType(DATA_NOT_MATCHING_CRITERIA)
                    .errorMessage(String.format(
                            "BankingAccount isOwned %b does not match isOwned query %b",
                            accountOwned, isOwned)));
        }
    }

    protected void checkOpenStatus(BankingAccount.OpenStatus accountOpenStatus, ParamAccountOpenStatus openStatus, List<ConformanceError> errors) {
        if (openStatus != null && openStatus != ParamAccountOpenStatus.ALL &&
                (accountOpenStatus == null || !accountOpenStatus.name().equals(openStatus.name()))) {
            errors.add(new ConformanceError().errorType(DATA_NOT_MATCHING_CRITERIA)
                    .errorMessage(String.format(
                            "BankingAccount openStatus %s does not match openStatus query %s",
                            (accountOpenStatus == null ? null : accountOpenStatus.name()), openStatus)));
        }
    }

    protected RequestAccountIds getRequestAccountIds(String accountIds) {
        RequestAccountIds accIds = new RequestAccountIds();
        RequestAccountIdsData data = new RequestAccountIdsData();
        List<String> idList = Arrays.asList(accountIds.split(" "));
        data.setAccountIds(idList);
        accIds.setData(data);
        return accIds;
    }
}
