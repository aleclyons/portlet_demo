/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.com.redbarn.liferay.spring.mvc.portlet;

import org.springframework.stereotype.Component;

/**
 *
 * @author alec
 */
@Component
public class MyBean {
        
    public String getMessage() {
        return "This is a message";
    }
}
