package net.medsamimejri.delicefood;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mohamed-sami-mejri on 27/01/17.
 */

public class CustomAdapter2 extends BaseAdapter {
    String [] result;
    String [] result1;
    Context context;
    int [] imageId;

    private static LayoutInflater inflater=null;
    public CustomAdapter2(Main3Activity mainActivity, String[] prgmNameList, int[] prgmImages, String[] prgmPrixList) {
        // TODO Auto-generated constructor stub
        result=prgmNameList;
        result1=prgmPrixList;
        context=mainActivity;
        imageId=prgmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;

    }

    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    public class Holder
    {
        TextView tvn,tvp;
        ImageView img;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        CustomAdapter2.Holder holder=new CustomAdapter2.Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.layout_ticket2, null);
        holder.tvn=(TextView) rowView.findViewById(R.id.txtnom);
        holder.tvp=(TextView) rowView.findViewById(R.id.txtprix);
        holder.img=(ImageView) rowView.findViewById(R.id.imgfood);
        holder.tvn.setText(result[position]);
        holder.tvp.setText(result1[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setBackgroundColor(Color.CYAN);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}
