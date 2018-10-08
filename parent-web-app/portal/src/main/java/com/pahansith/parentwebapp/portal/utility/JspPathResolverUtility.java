package com.pahansith.parentwebapp.portal.utility;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.nio.file.Paths;

public class JspPathResolverUtility {

    private static final String ALTERNATIVE_JSP_PATH_PREFIX = "/WEB-INF/app";
    private static final String DEFAULT_JSP_PATH_PREFIX = "/WEB-INF/default";


    public static final String HEADER_JSP = "header";


    public static void setJspPathToContext(HttpServletRequest req, String fileName){
        if (hasAlternativeFile(req, fileName)) {
            req.getServletContext().setAttribute(HEADER_JSP,ALTERNATIVE_JSP_PATH_PREFIX.concat("/").concat(fileName));
        }else{
            req.getServletContext().setAttribute(HEADER_JSP,DEFAULT_JSP_PATH_PREFIX.concat("/").concat(fileName));
        }
    }


    private static boolean hasAlternativeFile(HttpServletRequest req, String fileName) {
        InputStream input = req.getServletContext().getResourceAsStream(
                Paths.get(ALTERNATIVE_JSP_PATH_PREFIX.concat("/").concat(fileName)).toString());

        return input != null;
    }
}
