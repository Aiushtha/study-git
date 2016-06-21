package a.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lin on 16/6/21.
 */
public class TestFragment extends Fragment {

    public TestFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ListView listView=new ListView(inflater.getContext());
        List<String> users = new ArrayList<String>();
        users.add("1");
        users.add("2");
        users.add("1");
        users.add("2");
        users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");  users.add("1");
        users.add("2");

        ArrayAdapter adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,users);
        listView.setAdapter(adapter);
        return listView;
    }
}
