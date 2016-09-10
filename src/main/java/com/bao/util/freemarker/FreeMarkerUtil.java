package com.bao.util.freemarker;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by bao on 2016/7/9 0009.
 */
public class FreeMarkerUtil extends FreeMarkerView {
    private static final String CONTEXT_PATH = "base";
    private static final String STATIC_RESOURCE = "res";

    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
        model.put(CONTEXT_PATH, request.getContextPath());
        model.put(STATIC_RESOURCE, request.getContextPath()+"/res");
        super.exposeHelpers(model, request);
    }
}
