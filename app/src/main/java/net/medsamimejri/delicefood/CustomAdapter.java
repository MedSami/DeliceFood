package net.medsamimejri.delicefood;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.start;

/**
 * Created by mohamed-sami-mejri on 25/01/17.
 */

public class CustomAdapter extends BaseAdapter {
    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(Main2Activity mainActivity, String[] prgmNameList, int[] prgmImages) {
        // TODO Auto-generated constructor stub
        result=prgmNameList;
        context=mainActivity;
        imageId=prgmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }

    @Override
    public View getView(final int position, final View view, ViewGroup viewGroup) {
        Holder holder=new Holder();
        final View rowView;
        rowView = inflater.inflate(R.layout.layout_ticket, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView7);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView4);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
       /* rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i;
                i = new Intent(, Main3Activity.class);
                context.startActivity(i);

            }
        });*/
        return rowView;
    }
}
