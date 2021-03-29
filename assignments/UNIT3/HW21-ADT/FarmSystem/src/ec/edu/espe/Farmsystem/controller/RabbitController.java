/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Farmsystem.controller;

import Utils.FileManager;
import ec.edu.espe.Farmsystem.model.Rabbit;

/**
 *
 * @author HP
 */
public class RabbitController {
    public void save (Rabbit rabbit){
        String data = rabbit.getName() + "," + rabbit.getRace()+ "," + rabbit.getColor()+ "," + rabbit.getAge();
    FileManager.save(data, "rabbits");
    }
    public String read (){
        String data;
        data =FileManager.read(" rabbits");
        return data;
    }
    }

