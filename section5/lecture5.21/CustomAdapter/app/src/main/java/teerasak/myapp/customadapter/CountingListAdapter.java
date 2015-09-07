package teerasak.myapp.customadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Teera on 9/7/2015.
 */
public class CountingListAdapter extends BaseAdapter {
    private static final int MAX_COUNT = 36;
    private LayoutInflater mInflater;

    public CountingListAdapter(LayoutInflater layoutInflater) {
        mInflater = layoutInflater;
    }


    @Override
    public int getCount() {
        return MAX_COUNT;
    }

    @Override
    public Object getItem(int position) {
        if (position > (MAX_COUNT/2)) {
            return position + " down the list.";
        }
        else {
            return "This is item : " + position;
        }
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = mInflater.inflate(R.layout.list_item, viewGroup, false);
        }
        ImageView image = (ImageView) view.findViewById(R.id.ivIcon);
        image.setImageResource(position % 2 == 0 ? R.drawable.ic_call : R.drawable.ic_chat);
        TextView textView = (TextView) view.findViewById(R.id.tvItem);
        textView.setText(String.valueOf(position));
        return view;
    }
}
