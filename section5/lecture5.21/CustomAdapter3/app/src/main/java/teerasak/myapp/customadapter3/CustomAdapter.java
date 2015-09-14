package teerasak.myapp.customadapter3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Teera on 9/14/2015.
 */
public class CustomAdapter extends BaseAdapter {
    final int MAX_COUNT = 20;
    LayoutInflater mInflater;

    public CustomAdapter(LayoutInflater inflater) {
        mInflater = inflater;
    }

    @Override
    public int getCount() {
        return MAX_COUNT;
    }

    @Override
    public Object getItem(int position) {
        if (position > (MAX_COUNT / 2)) {
            return position + " down the list.";
        } else {
            return "This is item " + position;
        }

    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = mInflater.inflate(R.layout.custom_adapter_row, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.ivCustomeAdapterRow);
        imageView.setImageResource(position % 2 == 0 ?
                R.drawable.ic_action : android.R.drawable.sym_action_call);
        TextView textView = (TextView) view.findViewById(R.id.tvCustomAdapterRow);
        textView.setText(String.valueOf(position + 1));
        return view;
    }
}

