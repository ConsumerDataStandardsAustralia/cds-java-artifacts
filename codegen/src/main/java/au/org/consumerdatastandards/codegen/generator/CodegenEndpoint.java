package au.org.consumerdatastandards.codegen.generator;

import com.google.common.base.CaseFormat;

public class CodegenEndpoint {

    private String defaultResponseTypeName;

    public void setDefaultResponse(String name) {
        defaultResponseTypeName = name;
    }

    public String getDefaultResponse() {
        return defaultResponseTypeName;
    }

    public String convertToHyphenated(String camelCaseInput) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, camelCaseInput);
    }
}
