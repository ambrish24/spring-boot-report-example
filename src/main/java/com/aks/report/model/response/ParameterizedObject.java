package com.aks.report.model.response;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public interface ParameterizedObject extends Serializable {

    /**
     * Returns the map of parameters
     *
     * @return
     */
    public Map<String, Object> getParameterMap();

    /**
     * Returns parameter by name
     *
     * @param parameterName
     * @return
     */
    public Object getParameter(String parameterName);

    /**
     * Sets parameter with given name
     *
     * @param parameterName
     * @param value
     */
    public void setParameter(String parameterName, Object value);

    /**
     * Returns all parameter names upper cased
     *
     * @return
     */
    public Collection<String> getParameterNames();
}
