package net.medsamimejri.delicefood;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.image0,R.drawable.image1,R.drawable.image2,R.drawable.image3,
            R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,
            R.drawable.image9,R.drawable.image10,R.drawable.image11,R.drawable.image12,R.drawable.image13,R.drawable.image14,
            R.drawable.image15};
    public static String [] prgmNameList={"Les Pizzas","Les Pizzas Baguette","Les Calzones","Les Sandwitchs","Ma9loub",
            "Les Spaghettis","Les Omlettes","Les Ojjas","Les Plats","Les Paninis","Les Cornets","Lasagne","Les Hamburgers"
    ,"Menu Enfant","Portion","Boissons"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);

                intent.putExtra("position",i);

                context.startActivity(intent);
                //Toast.makeText(Main2Activity.this,""+i,Toast.LENGTH_LONG).show();

            }
        });

    }
}
