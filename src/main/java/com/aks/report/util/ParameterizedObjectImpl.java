package com.aks.report.util;

import com.aks.report.model.response.ParameterizedObject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParameterizedObjectImpl implements ParameterizedObject {
    private static final long serialVersionUID = -6710148550268243212L;

    protected Map<String, Object> parameters = new HashMap<String, Object>();

    @Override
    public Map<String, Object> getParameterMap() {
        return parameters;
    }

    @Override
    public Object getParameter(String parameterName) {
        return parameters.get(parameterName);
    }

    @Override
    public void setParameter(String parameterName, Object value) {
        parameters.put(parameterName, value);
    }

    @Override
    public Set<String> getParameterNames() {
        return Collections.unmodifiableSet(parameters.keySet());
    };
}
