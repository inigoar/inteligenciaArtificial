package metro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaParadas {

    private HashMap<String,Estacion> LYamanote, LChuo, LSobu;

    public ListaParadas() {

        LYamanote = new HashMap<String, Estacion>();
        LChuo = new HashMap<String,Estacion>();
        LSobu = new HashMap<String,Estacion>();


        /*Linea Yamanote*/

        LYamanote.put("Shinjuku",new Estacion(1,"Shinjuku","Shin-Okubo",1,"Yoyogi",1,2,"35 41 25.0 N","139 42 2.0 E"));
        LYamanote.put("Yoyogi", new Estacion(1,"Yoyogi","Shinjuku",1,"Harajuku",1,3,"35 40 19.0 N","139 41 52.0 E"));
        LYamanote.put("Harajuku",new Estacion(1,"Harajuku","Yoyogi",1,"Shibuya",1,0,"35 40 6.0 N","139 42 19.0 E"));
        LYamanote.put("Shibuya",new Estacion(1,"Shibuya","Harajuku",1,"Ebisu",1,0,"35 39 31.0 N","139 42 5.0 E"));
        LYamanote.put("Ebisu", new Estacion(1,"Ebisu","Shibuya",1,"Meguro",1,0,"35 38 47.0 N","139 42 36.0 E"));
        LYamanote.put("Meguro",new Estacion(1,"Meguro","Ebisu",1,"Gotanda",1,0,"35 37 16.0 N","139 41 16.0 E"));
        LYamanote.put("Gotanda",new Estacion(1,"Gotanda","Meguro",1,"Osaki",1,0,"35 37 33.0 N","139 43 25.0 E"));
        LYamanote.put("Osaki",new Estacion(1,"Osaki","Gotanda",1,"Shinagawa",1,0,"35 25 60.0 N","139 37 59.0 E"));
        LYamanote.put("Shinagawa",new Estacion(1,"Shinagawa","Osaki",1,"Tamachi",1,0,"35 37 41.0 N","139 44 20.0 E"));
        LYamanote.put("Tamachi",new Estacion(1,"Tamachi","Shinagawa",1,"Hamamatsucho",1,0,"35 38 44.0 N","139 44 51.0 E"));
        LYamanote.put("Hamamatsucho",new Estacion(1,"Hamamatsucho","Tamachi",1,"Shimbashi",1,0,"35 39 18.0 N","139 45 25.0 E"));
        LYamanote.put("Shimbashi",new Estacion(1,"Shimbashi","Hamamatsucho",1,"Yurakucho",1,0,"35 39 55.0 N","139 45 35.0 E"));
        LYamanote.put("Yurakucho",new Estacion(1,"Yurakucho","Shimbashi",1,"Tokyo",1,0,"35 40 30.0 N","139 45 44.0 E"));
        LYamanote.put("Tokyo",new Estacion(1,"Tokyo","Yurakucho",1,"Kanda",1,2,"35 41 22.0 N","139 41 31.0 E"));
        LYamanote.put("Kanda",new Estacion(1,"Kanda","Tokyo",1,"Akihabara",1,0,"35 41 42.0 N","139 47 17.0 E"));
        LYamanote.put("Akihabara",new Estacion(1,"Akihabara","Kanda",1,"Okachimachi",1,3,"35 41 55.0 N","139 46 27.0 E"));
        LYamanote.put("Okachimachi",new Estacion(1,"Okachimachi","Akihabara",1,"Ueno",1,0,"35 42 25.0 N","139 46 28.0 E"));
        LYamanote.put("Ueno",new Estacion(1,"Ueno","Okachimachi",1,"Uguisudani",1,0,"35 42 42.0 N","139 46 39.0 E"));
        LYamanote.put("Uguisudani",new Estacion(1,"Uguisudani","Ueno",1,"Nippori",1,0,"35 43 42.0 N","139 46 44.0 E"));
        LYamanote.put("Nippori",new Estacion(1,"Nippori","Uguisudani",1,"Nishi-Nippori",1,0,"35 43 44.0 N","139 46 16.0 E"));
        LYamanote.put("Nishi-Nippori",new Estacion(1,"Nishi-Nippori","Nippori",1,"Tabata",1,0,"35 44 37.0 N","139 43 44.0 E"));
        LYamanote.put("Tabata",new Estacion(1,"Tabata","Nishi-Nippori",1,"Komagome",1,0,"35 44 14.0 N","139 45 42.0 E"));
        LYamanote.put("Komagome",new Estacion(1,"Komagome","Tabata",1,"Sugamo",1,0,"35 44 56.0 N","139 46 11.0 E"));
        LYamanote.put("Sugamo",new Estacion(1,"Sugamo","Komagome",1,"Otsuka",1,0,"35 44 37.0 N","139 43 44.0 E"));
        LYamanote.put("Otsuka",new Estacion(1,"Otsuka","Sugamo",1,"Ikebukuru",1,0,"35 43 53.0 N","139 43 43.0 E"));
        LYamanote.put("Ikebukuru",new Estacion(1,"Ikebukuru","Otsuka",1,"Mejiro",1,0,"35 43 49.0 N","139 42 41.0 E"));
        LYamanote.put("Mejiro",new Estacion(1,"Mejiro","Ikebukuru",1,"Takadanobaba",1,0,"35 43 16.0 N","139 42 25.0 E"));
        LYamanote.put("Takadanobaba",new Estacion(1,"Takadanobaba","Mejiro",1,"Shin-Okubo",1,0,"35 42 43.0 N","139 43 8.0 E"));
        LYamanote.put("Shin-Okubo",new Estacion(1,"Shin-Okubo","Takadanobaba",1,"Shinjuku",1,0,"35 42 04.0 N","139 42 00.0 E"));


        /*Linea Chuo*/

        LChuo.put("Shinjuku", new Estacion(2,"Shinjuku","Suidobashi/Ochanomizu",12,null,0,1,"35 41 25.0 N","139 42 02.0 E"));
        LChuo.put("Suidobashi/Ochanomizu",new Estacion(2,"Suidobashi/Ochanomizu","Shinjuku",12,"Tokyo",10,3,"35 42 12.0 N","139 45 18.0 E"));
        LChuo.put("Tokyo",new Estacion(2,"Tokyo","Suidobashi/Ochanomizu",10,null,1,1,"35 41 22.0 N","139 41 31.0 E"));


        /*Linea Subo*/

        LSobu.put("Shinjuku", new Estacion(3,"Shinjuku","Yoyogi",3,null,0,2,"35 41 25.0 N","139 42 02.0 E"));
        LSobu.put("Yoyogi",new Estacion(3,"Yoyogi","Shinjuku",3,"Sendagaya",1,1,"35 40 19.0 N","139 41 52 E"));
        LSobu.put("Sendagaya",new Estacion(3,"Sendagaya","Yoyogi",1,"Shinanomachi",3,0,"35 40 52.0 N","139 42 40.0 E"));
        LSobu.put("Shinanomachi",new Estacion(3,"Shinanomachi","Sendagaya",3,"Yotsuya",1,0,"35 40 48.0 N","139 43 11.0 E"));
        LSobu.put("Yotsuya",new Estacion(3,"Yotsuya","Shinanomachi",1,"Lichigaya",1,0,"35 41 09.0 N","139 43 50.0 E"));
        LSobu.put("Lichigaya",new Estacion(3,"Lichigaya","Yotsuya",1,"Lidabashi",2,0,"35 41 28.0 N","139 44 07.0 E"));
        LSobu.put("Lidabashi",new Estacion(3,"Lidabashi","Lichigaya",2,"Suidobashi/Ochanomizu",1,0,"35 42 07.0 N","139 44 42.0 E"));
        LSobu.put("Suidobashi/Ochanomizu",new Estacion(3,"Suidobashi/Ochanomizu","Lidabashi",1,"Akihabara",2,2,"35 42 12.0 N","139 45 18.0 E"));
        LSobu.put("Akihabara",new Estacion(3,"Akihabara","Suidobashi/Ochanomizu",2,null,1,1,"35 41 55.0 N","139 46 27.0 E"));



    }

    public List<String> estacionesOrdenadas(){
        List<String> toReturn = new ArrayList<String>();
        @SuppressWarnings("unchecked")
        HashMap<String,Estacion>[] hashMap = new HashMap[3];
        hashMap = getLineas();
        for(int i=0; i<3 ; i++){
            for(Map.Entry<String,Estacion> entry : hashMap[i].entrySet()){
                if(!toReturn.contains(entry.getValue().getNombre()))
                    toReturn.add(entry.getValue().getNombre());
            }
        }
        Collections.sort(toReturn);

        return toReturn;
    }

    public Estacion getEstacion(String origen){
        @SuppressWarnings("unchecked")
        HashMap<String,Estacion>[] hashMap = new HashMap[3];
        hashMap = this.getLineas();
        for(int i=0; i<3 ; i++){
            if (hashMap[i].containsKey(origen))
                return hashMap[i].get(origen);
        }
        return null;

    }

    public HashMap<String,Estacion>[] getLineas(){
        @SuppressWarnings("unchecked")
        HashMap<String,Estacion>[] hashMap = new HashMap[3];
        hashMap[0] = this.LYamanote;
        hashMap[1] = this.LChuo;
        hashMap[2] = this.LSobu;
        //hashMap[3] = this.CambioLinea;

        return hashMap;
    }


}
