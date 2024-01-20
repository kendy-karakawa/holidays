package com.holidayzer.api.classes;

import java.util.ArrayList;
import java.util.List;

public class Holiday {
    private String day;

    private String[] holidays = {
        "01-01-2024", 
        "12-02-2024", 
        "13-02-2024", 
        "29-03-2024", 
        "21-04-2024", 
        "01-05-2024", 
        "30-05-2024", 
        "07-09-2024", 
        "12-10-2024",
        "02-11-2024", 
        "15-11-2024",
        "20-11-2024",
        "25-12-2024"
    };
    
    private String[] names = {
        "Confraternização Mundial",
         "Carnaval",
         "Carnaval",
         "Sexta-feira Santa",
         "Tiradentes",
         "Dia do Trabalho",
         "Corpus Christi",
         "Independência do Brasil",
         "Nossa Senhora Aparecida",
         "Finados",
         "Proclamação da República",
         "Dia Nacional de Zumbi e da Consciência Negra",
         "Natal"
        };
    
    public String getDay(){
        return this.day;
    }

    public String checkDay(String day){
        for (int i=0; i<this.holidays.length; i++){
            if(this.holidays[i].equals(day)){
                return "Dia " + day + " é " + names[i] + " !";
            }
        }
        return "Dia " + day + " não é feriado";
    }

    public List<String> getHolidays(){
        List<String> result = new ArrayList<>();
        for (int i = 0; i<this.holidays.length; i++){
			result.add(this.holidays[i] + " =>" + this.names[i]);
		}
        return result;
    }

    public String[] getNames(){
        return this.names;
    }


    
}
