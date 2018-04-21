package net.medsamimejri.delicefood;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    ListView lv;
    Context context;
    int s;
    LesPizzas lesPizzas=new LesPizzas();
    LesPizzasBaguettes lesPizzasBaguettes=new LesPizzasBaguettes();
    Boisons boisons=new Boisons();
    Cornets cornets=new Cornets();
    Hamburgers hamburgers=new Hamburgers();
    Lasagne lasagne=new Lasagne();
    LesCalzones lesCalzones=new LesCalzones();
    Ma9loub ma9loub=new Ma9loub();
    MenuEnfant menuEnfant=new MenuEnfant();
    Ojjas ojjas=new Ojjas();
    Omlettes omlettes=new Omlettes();
    Paninis paninis=new Paninis();
    Plats plats=new Plats();
    Portion portion=new Portion();
    Sandwitches sandwitches=new Sandwitches();
    Spaghetties spaghetties=new Spaghetties();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle = getIntent().getExtras();
         s=bundle.getInt("position");
        context=this;
        if(s==0){
        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter2(this, lesPizzas.prgmNameList,lesPizzas.prgmImages,lesPizzas.prgmPrixList));
        Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
         }
        if(s==1){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, lesPizzasBaguettes.prgmNameList,lesPizzasBaguettes.prgmImages,lesPizzasBaguettes.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==2){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, lesCalzones.prgmNameList,lesCalzones.prgmImages,lesCalzones.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==3){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, sandwitches.prgmNameList,sandwitches.prgmImages,sandwitches.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==4){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, ma9loub.prgmNameList,ma9loub.prgmImages,ma9loub.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==5){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, spaghetties.prgmNameList,spaghetties.prgmImages,spaghetties.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==6){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, omlettes.prgmNameList,omlettes.prgmImages,omlettes.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==7){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, ojjas.prgmNameList,ojjas.prgmImages,ojjas.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==8){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, plats.prgmNameList,plats.prgmImages,plats.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==9){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, paninis.prgmNameList,paninis.prgmImages,paninis.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==10){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, cornets.prgmNameList,cornets.prgmImages,cornets.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==11){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, lasagne.prgmNameList,lasagne.prgmImages,lasagne.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==12){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, hamburgers.prgmNameList,hamburgers.prgmImages,hamburgers.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==13){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, menuEnfant.prgmNameList,menuEnfant.prgmImages,menuEnfant.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==14){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, portion.prgmNameList,portion.prgmImages,portion.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }
        if(s==15){
            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter2(this, boisons.prgmNameList,boisons.prgmImages,boisons.prgmPrixList));
            Toast.makeText(Main3Activity.this,""+s,Toast.LENGTH_LONG).show();
        }


    }
}
