/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.api.banking;

import au.org.consumerdatastandards.client.ApiCallback;
import au.org.consumerdatastandards.client.ApiException;
import au.org.consumerdatastandards.client.ApiResponse;
import au.org.consumerdatastandards.client.Pair;
import au.org.consumerdatastandards.client.api.ReturnTypeResolver;
import au.org.consumerdatastandards.client.api.UnprotectedAPI;
import au.org.consumerdatastandards.client.model.banking.BankingProduct;
import au.org.consumerdatastandards.client.model.banking.BankingProductCategory;
import au.org.consumerdatastandards.client.model.banking.BankingProductDetailV1;
import au.org.consumerdatastandards.client.model.banking.BankingProductDetailV2;
import au.org.consumerdatastandards.client.model.banking.BankingProductDetailV3;
import au.org.consumerdatastandards.client.model.banking.BankingProductDetailV4;
import au.org.consumerdatastandards.client.model.banking.BankingProductV1;
import au.org.consumerdatastandards.client.model.banking.BankingProductV2;
import au.org.consumerdatastandards.client.model.banking.BankingProductV4;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingProductById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingProductList;
import com.google.gson.reflect.TypeToken;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingProductsAPI extends UnprotectedAPI {

    public enum ParamEffective {
        CURRENT,
        FUTURE,
        ALL
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingProductsAPI.class);

    /**
     * Build call for getProductDetail
     * @param productId ID of the specific product requested (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getProductDetailCall(String productId, final ApiCallback _callback) throws ApiException {

        return getProductDetailCall(productId, 1, _callback);
    }

    /**
     * Build call for getProductDetail
     * @param productId ID of the specific product requested (required)
     * @param _callback Callback for upload/download progress
     * @param version endpoint version
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getProductDetailCall(String productId, Integer version, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/products/{productId}"
            .replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId));

        LOGGER.trace("Building Call for getProductDetail with path: {}, productId: {}",
            path,
            productId);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        headerParams.put("x-v", "" + version);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProductDetailValidateBeforeCall(String productId, Integer version, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling getProductDetail(Async)");
        }

        return getProductDetailCall(productId, version, _callback);
    }

    /**
     * Get Product Detail
     * Obtain detailed information on a single product offered openly to the market.
     * @param productId ID of the specific product requested (required)
     * @return ResponseBankingProductById
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public ResponseBankingProductById getProductDetail(String productId) throws ApiException {

        return getProductDetail(productId, 1);
    }

    /**
     * Get Product Detail
     * Obtain detailed information on a single product offered openly to the market.
     * @param productId ID of the specific product requested (required)
     * @param version endpoint version
     * @return ResponseBankingProductById
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public ResponseBankingProductById getProductDetail(String productId, Integer version) throws ApiException {

        LOGGER.trace("getProductDetail with productId: {}, version: {}",
            productId, version);

        ApiResponse<ResponseBankingProductById> resp = getProductDetailWithHttpInfo(productId, version);
        return resp.getBody();
    }

    /**
     * Get Product Detail
     * Obtain detailed information on a single product offered openly to the market.
     * @param productId ID of the specific product requested (required)
     * @return ApiResponse&lt;ResponseBankingProductById&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public ApiResponse<ResponseBankingProductById> getProductDetailWithHttpInfo(String productId) throws ApiException {
        return getProductDetailWithHttpInfo(productId, 1);
    }

    /**
     * Get Product Detail
     * Obtain detailed information on a single product offered openly to the market.
     * @param productId ID of the specific product requested (required)
     * @param version endpoint version
     * @return ApiResponse&lt;ResponseBankingProductById&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public ApiResponse<ResponseBankingProductById> getProductDetailWithHttpInfo(String productId, Integer version) throws ApiException {
        okhttp3.Call call = getProductDetailValidateBeforeCall(productId, version, null);
        try {
            Response response = call.execute();
            Type returnType = new GetProductDetailReturnTypeResolver().resolve(response);
            return apiClient.handle(response, returnType);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Get Product Detail (asynchronously)
     * Obtain detailed information on a single product offered openly to the market.
     * @param productId ID of the specific product requested (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getProductDetailAsync(String productId, final ApiCallback<ResponseBankingProductById> _callback) throws ApiException {

        return getProductDetailAsync(productId, 1, _callback);
    }

    /**
     * Get Product Detail (asynchronously)
     * Obtain detailed information on a single product offered openly to the market.
     * @param productId ID of the specific product requested (required)
     * @param _callback The callback to be executed when the API call finishes
     * @param version endpoint version
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getProductDetailAsync(String productId, Integer version, final ApiCallback<ResponseBankingProductById> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getProductDetail with productId: {}, version: {}",
            productId, version);

        okhttp3.Call call = getProductDetailValidateBeforeCall(productId, version, _callback);
        apiClient.executeAsync(call, _callback, new GetProductDetailReturnTypeResolver());
        return call;
    }

    /**
     * Build call for listProducts
     * @param effective Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields. Valid values are ‘CURRENT’, ‘FUTURE’ and ‘ALL’. If absent defaults to 'CURRENT' (optional, default to CURRENT)
     * @param updatedSince Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)
     * @param brand Filter results based on a specific brand (optional)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param version endpoint version
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call listProductsCall(ParamEffective effective, OffsetDateTime updatedSince, String brand, BankingProductCategory productCategory, Integer version, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/products";

        LOGGER.trace("Building Call for listProducts with path: {}, effective: {}, updated-since: {}, brand: {}, product-category: {}, page: {}, page-size: {}",
            path,
            effective,
            updatedSince,
            brand,
            productCategory,
            page,
            pageSize);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        addQueryParam(queryParams, "effective", effective);
        addQueryParam(queryParams, "updated-since", updatedSince);
        addQueryParam(queryParams, "brand", brand);
        addQueryParam(queryParams, "product-category", productCategory);
        addQueryParam(queryParams, "page", page);
        addQueryParam(queryParams, "page-size", pageSize);
        Map<String, String> headerParams = new HashMap<>();
        headerParams.put("x-v", "" + version);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listProductsValidateBeforeCall(ParamEffective effective, OffsetDateTime updatedSince, String brand, BankingProductCategory productCategory, Integer version, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {


        return listProductsCall(effective, updatedSince, brand, productCategory, version, page, pageSize, _callback);
    }

    /**
     * Get Products
     * Obtain a list of products that are currently openly offered to the market  Note that the results returned by this end point are expected to be ordered in descending order according to lastUpdated  ### Conventions In the product reference payloads there are a number of recurring conventions that are explained here, in one place.  #### Arrays Of Features  In the product detail payload there are a number of arrays articulating generic features, constraints, prices, etc. The intent of these arrays is as follows:  - Each element in an array has the same structure so that clients can reliably interpret the payloads - Each element as a type element that is an enumeration of the specific aspect of a product being described, such as types of fees. - Each element has a field name additionalValue.  This is a generic field with contents that will vary based on the type of object being described. The contents of this field for the ADDITIONAL_CARDS feature is the number of cards allowed while the contents of this field for the MAX_LIMIT constraint would be the maximum credit limit allowed for the product. - An element in these arrays of the same type may appear more than once. For instance, a product may offer two separate loyalty programs that the customer can select from. A fixed term mortgage may have different rates for different term lengths. - An element in these arrays may contain an additionalInfo and additionalInfoUri field. The additionalInfo field is used to provide displayable text clarifying the purpose of the element in some way when the product is presented to a customer. The additionalInfoUri provides a link to externally hosted information specifically relevant to that feature of the product. - Depending on the type of data being represented there may be additional specific fields.  #### URIs To More Information  As the complexities and nuances of a financial product can not easily be fully expressed in a data structure without a high degree of complexity it is necessary to provide additional reference information that a potential customer can access so that they are fully informed of the features and implications of the product. The payloads for product reference therefore contain numerous fields that are provided to allow the product holder to describe the product more fully using a web page hosted on their online channels.  These URIs do not need to all link to different pages. If desired, they can all link to a single hosted page and use difference HTML anchors to focus on a specific topic such as eligibility or fees.  #### Linkage To Accounts From the moment that a customer applies for a product and an account is created the account and the product that spawned it will diverge.  Rates and features of the product may change and a discount may be negotiated for the account.  For this reason, while productCategory is a common field between accounts and products, there is no specific ID that can be used to link an account to a product within the regime.  Similarly, many of the fields and objects in the product payload will appear in the account detail payload but the structures and semantics are not identical as one refers to a product that can potentially be originated and one refers to an account that actually has been instantiated and created along with the associated decisions inherent in that process.  #### Dates It is expected that data consumers needing this data will call relatively frequently to ensure the data they have is representative of the current offering from a bank.  To minimise the volume and frequency of these calls the ability to set a lastUpdated field with the date and time of the last update to this product is included.  A call for a list of products can then be filtered to only return products that have been updated since the last time that data was obtained using the updated-since query parameter.  In addition, the concept of effective date and time has also been included.  This allows for a product to be marked for obsolescence, or introduction, from a certain time without the need for an update to show that a product has been changed.  The inclusion of these dates also removes the need to represent deleted products in the payload.  Products that are no long offered can be marked not effective for a few weeks before they are then removed from the product set as an option entirely.
     * @param <T> Concrete class for <code>BankingProduct</code>
     * @param effective Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields. Valid values are ‘CURRENT’, ‘FUTURE’ and ‘ALL’. If absent defaults to 'CURRENT' (optional, default to CURRENT)
     * @param updatedSince Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)
     * @param brand Filter results based on a specific brand (optional)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param version endpoint version
     * @return ResponseBankingProductList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public <T extends BankingProduct> ResponseBankingProductList<T> listProducts(ParamEffective effective, OffsetDateTime updatedSince, String brand, BankingProductCategory productCategory, Integer version, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("listProducts with effective: {}, updated-since: {}, brand: {}, product-category: {}, page: {}, page-size: {}, version: {}",
            effective,
            updatedSince,
            brand,
            productCategory,
            page,
            pageSize,
            version);

        ApiResponse<ResponseBankingProductList<T>> resp = listProductsWithHttpInfo(effective, updatedSince, brand, productCategory, version,  page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Products
     * Obtain a list of products that are currently openly offered to the market  Note that the results returned by this end point are expected to be ordered in descending order according to lastUpdated  ### Conventions In the product reference payloads there are a number of recurring conventions that are explained here, in one place.  #### Arrays Of Features  In the product detail payload there are a number of arrays articulating generic features, constraints, prices, etc. The intent of these arrays is as follows:  - Each element in an array has the same structure so that clients can reliably interpret the payloads - Each element as a type element that is an enumeration of the specific aspect of a product being described, such as types of fees. - Each element has a field name additionalValue.  This is a generic field with contents that will vary based on the type of object being described. The contents of this field for the ADDITIONAL_CARDS feature is the number of cards allowed while the contents of this field for the MAX_LIMIT constraint would be the maximum credit limit allowed for the product. - An element in these arrays of the same type may appear more than once. For instance, a product may offer two separate loyalty programs that the customer can select from. A fixed term mortgage may have different rates for different term lengths. - An element in these arrays may contain an additionalInfo and additionalInfoUri field. The additionalInfo field is used to provide displayable text clarifying the purpose of the element in some way when the product is presented to a customer. The additionalInfoUri provides a link to externally hosted information specifically relevant to that feature of the product. - Depending on the type of data being represented there may be additional specific fields.  #### URIs To More Information  As the complexities and nuances of a financial product can not easily be fully expressed in a data structure without a high degree of complexity it is necessary to provide additional reference information that a potential customer can access so that they are fully informed of the features and implications of the product. The payloads for product reference therefore contain numerous fields that are provided to allow the product holder to describe the product more fully using a web page hosted on their online channels.  These URIs do not need to all link to different pages. If desired, they can all link to a single hosted page and use difference HTML anchors to focus on a specific topic such as eligibility or fees.  #### Linkage To Accounts From the moment that a customer applies for a product and an account is created the account and the product that spawned it will diverge.  Rates and features of the product may change and a discount may be negotiated for the account.  For this reason, while productCategory is a common field between accounts and products, there is no specific ID that can be used to link an account to a product within the regime.  Similarly, many of the fields and objects in the product payload will appear in the account detail payload but the structures and semantics are not identical as one refers to a product that can potentially be originated and one refers to an account that actually has been instantiated and created along with the associated decisions inherent in that process.  #### Dates It is expected that data consumers needing this data will call relatively frequently to ensure the data they have is representative of the current offering from a bank.  To minimise the volume and frequency of these calls the ability to set a lastUpdated field with the date and time of the last update to this product is included.  A call for a list of products can then be filtered to only return products that have been updated since the last time that data was obtained using the updated-since query parameter.  In addition, the concept of effective date and time has also been included.  This allows for a product to be marked for obsolescence, or introduction, from a certain time without the need for an update to show that a product has been changed.  The inclusion of these dates also removes the need to represent deleted products in the payload.  Products that are no long offered can be marked not effective for a few weeks before they are then removed from the product set as an option entirely.
     * @param effective Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields. Valid values are ‘CURRENT’, ‘FUTURE’ and ‘ALL’. If absent defaults to 'CURRENT' (optional, default to CURRENT)
     * @param updatedSince Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)
     * @param brand Filter results based on a specific brand (optional)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingProductList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public ResponseBankingProductList listProducts(ParamEffective effective, OffsetDateTime updatedSince, String brand, BankingProductCategory productCategory, Integer page, Integer pageSize) throws ApiException {

        return listProducts(effective, updatedSince, brand, productCategory, 1, page, pageSize);
    }


    /**
     * Get Products
     * Obtain a list of products that are currently openly offered to the market  Note that the results returned by this end point are expected to be ordered in descending order according to lastUpdated  ### Conventions In the product reference payloads there are a number of recurring conventions that are explained here, in one place.  #### Arrays Of Features  In the product detail payload there are a number of arrays articulating generic features, constraints, prices, etc. The intent of these arrays is as follows:  - Each element in an array has the same structure so that clients can reliably interpret the payloads - Each element as a type element that is an enumeration of the specific aspect of a product being described, such as types of fees. - Each element has a field name additionalValue.  This is a generic field with contents that will vary based on the type of object being described. The contents of this field for the ADDITIONAL_CARDS feature is the number of cards allowed while the contents of this field for the MAX_LIMIT constraint would be the maximum credit limit allowed for the product. - An element in these arrays of the same type may appear more than once. For instance, a product may offer two separate loyalty programs that the customer can select from. A fixed term mortgage may have different rates for different term lengths. - An element in these arrays may contain an additionalInfo and additionalInfoUri field. The additionalInfo field is used to provide displayable text clarifying the purpose of the element in some way when the product is presented to a customer. The additionalInfoUri provides a link to externally hosted information specifically relevant to that feature of the product. - Depending on the type of data being represented there may be additional specific fields.  #### URIs To More Information  As the complexities and nuances of a financial product can not easily be fully expressed in a data structure without a high degree of complexity it is necessary to provide additional reference information that a potential customer can access so that they are fully informed of the features and implications of the product. The payloads for product reference therefore contain numerous fields that are provided to allow the product holder to describe the product more fully using a web page hosted on their online channels.  These URIs do not need to all link to different pages. If desired, they can all link to a single hosted page and use difference HTML anchors to focus on a specific topic such as eligibility or fees.  #### Linkage To Accounts From the moment that a customer applies for a product and an account is created the account and the product that spawned it will diverge.  Rates and features of the product may change and a discount may be negotiated for the account.  For this reason, while productCategory is a common field between accounts and products, there is no specific ID that can be used to link an account to a product within the regime.  Similarly, many of the fields and objects in the product payload will appear in the account detail payload but the structures and semantics are not identical as one refers to a product that can potentially be originated and one refers to an account that actually has been instantiated and created along with the associated decisions inherent in that process.  #### Dates It is expected that data consumers needing this data will call relatively frequently to ensure the data they have is representative of the current offering from a bank.  To minimise the volume and frequency of these calls the ability to set a lastUpdated field with the date and time of the last update to this product is included.  A call for a list of products can then be filtered to only return products that have been updated since the last time that data was obtained using the updated-since query parameter.  In addition, the concept of effective date and time has also been included.  This allows for a product to be marked for obsolescence, or introduction, from a certain time without the need for an update to show that a product has been changed.  The inclusion of these dates also removes the need to represent deleted products in the payload.  Products that are no long offered can be marked not effective for a few weeks before they are then removed from the product set as an option entirely.
     * @param <T> Concrete class for <code>BankingProduct</code>
     * @param effective Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields. Valid values are ‘CURRENT’, ‘FUTURE’ and ‘ALL’. If absent defaults to 'CURRENT' (optional, default to CURRENT)
     * @param updatedSince Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)
     * @param brand Filter results based on a specific brand (optional)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingProductList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public <T extends BankingProduct> ApiResponse<ResponseBankingProductList<T>> listProductsWithHttpInfo(ParamEffective effective, OffsetDateTime updatedSince, String brand, BankingProductCategory productCategory, Integer page, Integer pageSize) throws ApiException {
        return listProductsWithHttpInfo(effective, updatedSince, brand, productCategory, 1, page, pageSize);
    }

    /**
     * Get Products
     * Obtain a list of products that are currently openly offered to the market  Note that the results returned by this end point are expected to be ordered in descending order according to lastUpdated  ### Conventions In the product reference payloads there are a number of recurring conventions that are explained here, in one place.  #### Arrays Of Features  In the product detail payload there are a number of arrays articulating generic features, constraints, prices, etc. The intent of these arrays is as follows:  - Each element in an array has the same structure so that clients can reliably interpret the payloads - Each element as a type element that is an enumeration of the specific aspect of a product being described, such as types of fees. - Each element has a field name additionalValue.  This is a generic field with contents that will vary based on the type of object being described. The contents of this field for the ADDITIONAL_CARDS feature is the number of cards allowed while the contents of this field for the MAX_LIMIT constraint would be the maximum credit limit allowed for the product. - An element in these arrays of the same type may appear more than once. For instance, a product may offer two separate loyalty programs that the customer can select from. A fixed term mortgage may have different rates for different term lengths. - An element in these arrays may contain an additionalInfo and additionalInfoUri field. The additionalInfo field is used to provide displayable text clarifying the purpose of the element in some way when the product is presented to a customer. The additionalInfoUri provides a link to externally hosted information specifically relevant to that feature of the product. - Depending on the type of data being represented there may be additional specific fields.  #### URIs To More Information  As the complexities and nuances of a financial product can not easily be fully expressed in a data structure without a high degree of complexity it is necessary to provide additional reference information that a potential customer can access so that they are fully informed of the features and implications of the product. The payloads for product reference therefore contain numerous fields that are provided to allow the product holder to describe the product more fully using a web page hosted on their online channels.  These URIs do not need to all link to different pages. If desired, they can all link to a single hosted page and use difference HTML anchors to focus on a specific topic such as eligibility or fees.  #### Linkage To Accounts From the moment that a customer applies for a product and an account is created the account and the product that spawned it will diverge.  Rates and features of the product may change and a discount may be negotiated for the account.  For this reason, while productCategory is a common field between accounts and products, there is no specific ID that can be used to link an account to a product within the regime.  Similarly, many of the fields and objects in the product payload will appear in the account detail payload but the structures and semantics are not identical as one refers to a product that can potentially be originated and one refers to an account that actually has been instantiated and created along with the associated decisions inherent in that process.  #### Dates It is expected that data consumers needing this data will call relatively frequently to ensure the data they have is representative of the current offering from a bank.  To minimise the volume and frequency of these calls the ability to set a lastUpdated field with the date and time of the last update to this product is included.  A call for a list of products can then be filtered to only return products that have been updated since the last time that data was obtained using the updated-since query parameter.  In addition, the concept of effective date and time has also been included.  This allows for a product to be marked for obsolescence, or introduction, from a certain time without the need for an update to show that a product has been changed.  The inclusion of these dates also removes the need to represent deleted products in the payload.  Products that are no long offered can be marked not effective for a few weeks before they are then removed from the product set as an option entirely.
     * @param <T> Concrete class for <code>BankingProduct</code>
     * @param effective Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields. Valid values are ‘CURRENT’, ‘FUTURE’ and ‘ALL’. If absent defaults to 'CURRENT' (optional, default to CURRENT)
     * @param updatedSince Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)
     * @param brand Filter results based on a specific brand (optional)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param version endpoint version
     * @return ApiResponse&lt;ResponseBankingProductList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public <T extends BankingProduct> ApiResponse<ResponseBankingProductList<T>> listProductsWithHttpInfo(ParamEffective effective, OffsetDateTime updatedSince, String brand, BankingProductCategory productCategory, Integer version, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = listProductsValidateBeforeCall(effective, updatedSince, brand, productCategory, version, page, pageSize, null);
        try {
            Response response = call.execute();
            Type returnType = new ListProductsReturnTypeResolver().resolve(response);
            return apiClient.handle(response, returnType);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Get Products (asynchronously)
     * Obtain a list of products that are currently openly offered to the market  Note that the results returned by this end point are expected to be ordered in descending order according to lastUpdated  ### Conventions In the product reference payloads there are a number of recurring conventions that are explained here, in one place.  #### Arrays Of Features  In the product detail payload there are a number of arrays articulating generic features, constraints, prices, etc. The intent of these arrays is as follows:  - Each element in an array has the same structure so that clients can reliably interpret the payloads - Each element as a type element that is an enumeration of the specific aspect of a product being described, such as types of fees. - Each element has a field name additionalValue.  This is a generic field with contents that will vary based on the type of object being described. The contents of this field for the ADDITIONAL_CARDS feature is the number of cards allowed while the contents of this field for the MAX_LIMIT constraint would be the maximum credit limit allowed for the product. - An element in these arrays of the same type may appear more than once. For instance, a product may offer two separate loyalty programs that the customer can select from. A fixed term mortgage may have different rates for different term lengths. - An element in these arrays may contain an additionalInfo and additionalInfoUri field. The additionalInfo field is used to provide displayable text clarifying the purpose of the element in some way when the product is presented to a customer. The additionalInfoUri provides a link to externally hosted information specifically relevant to that feature of the product. - Depending on the type of data being represented there may be additional specific fields.  #### URIs To More Information  As the complexities and nuances of a financial product can not easily be fully expressed in a data structure without a high degree of complexity it is necessary to provide additional reference information that a potential customer can access so that they are fully informed of the features and implications of the product. The payloads for product reference therefore contain numerous fields that are provided to allow the product holder to describe the product more fully using a web page hosted on their online channels.  These URIs do not need to all link to different pages. If desired, they can all link to a single hosted page and use difference HTML anchors to focus on a specific topic such as eligibility or fees.  #### Linkage To Accounts From the moment that a customer applies for a product and an account is created the account and the product that spawned it will diverge.  Rates and features of the product may change and a discount may be negotiated for the account.  For this reason, while productCategory is a common field between accounts and products, there is no specific ID that can be used to link an account to a product within the regime.  Similarly, many of the fields and objects in the product payload will appear in the account detail payload but the structures and semantics are not identical as one refers to a product that can potentially be originated and one refers to an account that actually has been instantiated and created along with the associated decisions inherent in that process.  #### Dates It is expected that data consumers needing this data will call relatively frequently to ensure the data they have is representative of the current offering from a bank.  To minimise the volume and frequency of these calls the ability to set a lastUpdated field with the date and time of the last update to this product is included.  A call for a list of products can then be filtered to only return products that have been updated since the last time that data was obtained using the updated-since query parameter.  In addition, the concept of effective date and time has also been included.  This allows for a product to be marked for obsolescence, or introduction, from a certain time without the need for an update to show that a product has been changed.  The inclusion of these dates also removes the need to represent deleted products in the payload.  Products that are no long offered can be marked not effective for a few weeks before they are then removed from the product set as an option entirely.
     * @param effective Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields. Valid values are ‘CURRENT’, ‘FUTURE’ and ‘ALL’. If absent defaults to 'CURRENT' (optional, default to CURRENT)
     * @param updatedSince Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)
     * @param brand Filter results based on a specific brand (optional)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call listProductsAsync(ParamEffective effective, OffsetDateTime updatedSince, String brand, BankingProductCategory productCategory, Integer page, Integer pageSize, final ApiCallback<ResponseBankingProductList> _callback) throws ApiException {

        return listProductsAsync(effective, updatedSince, brand, productCategory, 1, page, pageSize, _callback);
    }

    /**
     * Get Products (asynchronously)
     * Obtain a list of products that are currently openly offered to the market  Note that the results returned by this end point are expected to be ordered in descending order according to lastUpdated  ### Conventions In the product reference payloads there are a number of recurring conventions that are explained here, in one place.  #### Arrays Of Features  In the product detail payload there are a number of arrays articulating generic features, constraints, prices, etc. The intent of these arrays is as follows:  - Each element in an array has the same structure so that clients can reliably interpret the payloads - Each element as a type element that is an enumeration of the specific aspect of a product being described, such as types of fees. - Each element has a field name additionalValue.  This is a generic field with contents that will vary based on the type of object being described. The contents of this field for the ADDITIONAL_CARDS feature is the number of cards allowed while the contents of this field for the MAX_LIMIT constraint would be the maximum credit limit allowed for the product. - An element in these arrays of the same type may appear more than once. For instance, a product may offer two separate loyalty programs that the customer can select from. A fixed term mortgage may have different rates for different term lengths. - An element in these arrays may contain an additionalInfo and additionalInfoUri field. The additionalInfo field is used to provide displayable text clarifying the purpose of the element in some way when the product is presented to a customer. The additionalInfoUri provides a link to externally hosted information specifically relevant to that feature of the product. - Depending on the type of data being represented there may be additional specific fields.  #### URIs To More Information  As the complexities and nuances of a financial product can not easily be fully expressed in a data structure without a high degree of complexity it is necessary to provide additional reference information that a potential customer can access so that they are fully informed of the features and implications of the product. The payloads for product reference therefore contain numerous fields that are provided to allow the product holder to describe the product more fully using a web page hosted on their online channels.  These URIs do not need to all link to different pages. If desired, they can all link to a single hosted page and use difference HTML anchors to focus on a specific topic such as eligibility or fees.  #### Linkage To Accounts From the moment that a customer applies for a product and an account is created the account and the product that spawned it will diverge.  Rates and features of the product may change and a discount may be negotiated for the account.  For this reason, while productCategory is a common field between accounts and products, there is no specific ID that can be used to link an account to a product within the regime.  Similarly, many of the fields and objects in the product payload will appear in the account detail payload but the structures and semantics are not identical as one refers to a product that can potentially be originated and one refers to an account that actually has been instantiated and created along with the associated decisions inherent in that process.  #### Dates It is expected that data consumers needing this data will call relatively frequently to ensure the data they have is representative of the current offering from a bank.  To minimise the volume and frequency of these calls the ability to set a lastUpdated field with the date and time of the last update to this product is included.  A call for a list of products can then be filtered to only return products that have been updated since the last time that data was obtained using the updated-since query parameter.  In addition, the concept of effective date and time has also been included.  This allows for a product to be marked for obsolescence, or introduction, from a certain time without the need for an update to show that a product has been changed.  The inclusion of these dates also removes the need to represent deleted products in the payload.  Products that are no long offered can be marked not effective for a few weeks before they are then removed from the product set as an option entirely.
     * @param effective Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields. Valid values are ‘CURRENT’, ‘FUTURE’ and ‘ALL’. If absent defaults to 'CURRENT' (optional, default to CURRENT)
     * @param updatedSince Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)
     * @param brand Filter results based on a specific brand (optional)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param _callback The callback to be executed when the API call finishes
     * @param version endpoint version
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call listProductsAsync(ParamEffective effective, OffsetDateTime updatedSince, String brand, BankingProductCategory productCategory, Integer version, Integer page, Integer pageSize, final ApiCallback<ResponseBankingProductList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously listProducts with effective: {}, updated-since: {}, brand: {}, product-category: {}, page: {}, page-size: {}",
            effective,
            updatedSince,
            brand,
            productCategory,
            page,
            pageSize);

        okhttp3.Call call = listProductsValidateBeforeCall(effective, updatedSince, brand, productCategory, version, page, pageSize, _callback);
        apiClient.executeAsync(call, _callback, new ListProductsReturnTypeResolver());
        return call;
    }

    private class ListProductsReturnTypeResolver implements ReturnTypeResolver {
        @Override
        public Type resolve(Response response) {
            if (!response.isSuccessful()) {
                return null;
            }
            String version = response.header("x-v");
            switch (Integer.parseInt(version)) {
                case 2:
                case 3:
                    return new TypeToken<ResponseBankingProductList<BankingProductV2>>(){}.getType();
                case 4:
                    return new TypeToken<ResponseBankingProductList<BankingProductV4>>(){}.getType();
                default:
                    return new TypeToken<ResponseBankingProductList<BankingProductV1>>(){}.getType();
            }
        }
    }

    private static class GetProductDetailReturnTypeResolver implements ReturnTypeResolver {
        @Override
        public Type resolve(Response response) {
            String version = response.header("x-v");
            switch (Integer.parseInt(version)) {
                case 2:
                    return new TypeToken<ResponseBankingProductById<BankingProductDetailV2>>(){}.getType();
                case 3:
                    return new TypeToken<ResponseBankingProductById<BankingProductDetailV3>>(){}.getType();
                case 4:
                    return new TypeToken<ResponseBankingProductById<BankingProductDetailV4>>(){}.getType();
                default:
                    return new TypeToken<ResponseBankingProductById<BankingProductDetailV1>>(){}.getType();
            }
        }
    }
}
