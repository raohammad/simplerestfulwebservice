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

@WebService(endpointInterface ="com.flexilogix.Calculate",
serviceName = "Calculate",
portName = "CalculatePort")
public class CalculateImpl implements Calculate {

    @Override
    public double Power(double a, double b){
        double result = 1;
        for(int i=0; i<b; i++){
            result = result * a;
        }
        return result;
    }
    
    @Override
    public double Square(double a){
        return a*a;
    }
}
