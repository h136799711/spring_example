package com.hebidu.example.test1;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import org.springframework.util.StringUtils;

public class CmsPropertyNamingStrategy extends PropertyNamingStrategy {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5849045537453221193L;

    @Override
    public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
        return withoutStrikethroughName(defaultName);
    }

    @Override
    public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return withoutStrikethroughName(defaultName);
    }

    @Override
    public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return withoutStrikethroughName(defaultName);
    }

    @Override
    public String nameForConstructorParameter(MapperConfig<?> config, AnnotatedParameter ctorParam,
                                              String defaultName) {
        return withoutStrikethroughName(defaultName);
    }

    private String withoutStrikethroughName(String name) {
        return withoutUnderscoreName(name);
//        String result = name;
//
//        if (StringUtils.isEmpty(name)) {
//            result = "";
//        }
//        if(name != null && name.toLowerCase().contains("lipage")) {
//            System.out.println();
//        }
//
//        if (name.contains("-")) {
//            result = name.replaceAll("-", "");
//        }
//
//
//        return result.substring(0, 1).toLowerCase() + result.substring(1);
    }

    private String withoutUnderscoreName(String name) {
        if (StringUtils.isEmpty(name)) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(name.substring(0, 1).toLowerCase());
        boolean underscore = false;
        for (int i = 1; i < name.length(); ++i) {
            String s = name.substring(i, i + 1);
            if ("_".equals(s)) {
                underscore = true;
                continue;
            } else {
                if (underscore) s = s.toUpperCase();
                underscore = false;
            }
            result.append(s);
        }
        return result.toString();
    }
}
