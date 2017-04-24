/*

WebServices Project Developed by; 
Hammad Aslam Khan
ADEO2  2016/17
EISTI Cergy, France

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flexilogix;

import javax.jws.WebService;

/**
 *
 * @author hammadakhan
 */
@WebService(name = "Calculate", targetNamespace =
"http://com.flexilogix")
public interface Calculate {

    public double Power(double a, double b);
    public double Square(double a);

}
