package com.example.khalid.profileapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GridViewAdapter extends BaseAdapter{
    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public GridViewAdapter(Context c, String[] osNameList, int[] osImages) {
        // TODO Auto-generated constructor stub
        result=osNameList;
        context=c;
        imageId=osImages;
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
        TextView os_text;
        ImageView os_img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.sample_gridlayout, null);
        holder.os_text =(TextView) rowView.findViewById(R.id.os_texts);
        holder.os_img =(ImageView) rowView.findViewById(R.id.os_images);

        holder.os_text.setText(result[position]);
        holder.os_img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new OnClickListener() {
            double years;
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (result[position]){
                    case "Java": years = 8;
                        break;
                    case "Python": years = 6;
                        break;
                    case "C": years = 6;
                        break;
                    case "Embedded": years = 6;
                        break;
                    case "C++": years = 6;
                        break;
                    case "XML": years = 0.25;
                        break;
                    case "JavaScript": years = 1;
                        break;
                    case "IAM": years = 1;
                        break;
                    case "SQL": years = 7;
                        break;
                    case "Automation": years = 3;
                        break;
                }
                Toast.makeText(context, result[position]+" Experience: "+years+ " years", Toast.LENGTH_SHORT).show();
            }
        });

        return rowView;
    }
}
