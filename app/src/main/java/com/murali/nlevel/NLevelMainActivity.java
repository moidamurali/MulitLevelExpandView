package com.murali.nlevel;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.murali.multilevel.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class NLevelMainActivity extends AppCompatActivity {

    List<NLevelItem> list;
    ListView listView;

    int[] colors = {Color.BLUE, Color.RED, Color.MAGENTA, Color.GRAY, Color.GREEN, Color.YELLOW};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nlevel_activity_main);

        NLevelExpandableListView();

    }

    private void NLevelExpandableListView(){

        listView = (ListView) findViewById(R.id.listView1);
        list = new ArrayList<NLevelItem>();
        final LayoutInflater inflater = LayoutInflater.from(this);
        nestedLoop(Constants.newJsonStringList, null, inflater, 0);
        //nestedLoop(Constants.OldJsonStringList, null, inflater, 0);

        NLevelAdapter adapter = new NLevelAdapter(list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                ((NLevelAdapter)listView.getAdapter()).toggle(arg2);
                ((NLevelAdapter)listView.getAdapter()).getFilter().filter();
            }
        });

    }

    private void nestedLoop(String levelList, NLevelItem nLevelItem, final LayoutInflater inflater, int level){

        try{

            JSONObject mainObject = new JSONObject(levelList);
            JSONObject productsObject = mainObject.getJSONObject("products");
            JSONArray facetsArray = productsObject.getJSONArray("facets");
            for(int val=0;val<facetsArray.length();val++){
                JSONArray categoriesObject = facetsArray.getJSONObject(0).getJSONArray("elements");
                for(int info =0; info<categoriesObject.length();info++){

                    JSONObject mobj = categoriesObject.getJSONObject(info);
                    int childrenSize = mobj.getJSONArray("children").length();
                    String text = mobj.getString("text");
                    String count =  mobj.getString("count");
                    NLevelItem Parent = itemView(val, text + "("+ count + ")", nLevelItem, inflater, level, !(childrenSize>0));
                    list.add(Parent);

                    if(childrenSize>0){
                        nestedLoop(mobj.getJSONArray("children").toString(), Parent, inflater, level+1);
                    }

                }
                return;
            }


         /*   JSONArray jsonArrayStringList = new JSONArray(levelList);
            int length = jsonArrayStringList.length();

            for (int i=0; i<length; i++){
                JSONObject itemObject = jsonArrayStringList.getJSONObject(i);
                int childrenSize = itemObject.getJSONArray("children").length();
                NLevelItem Parent = itemView(i, itemObject.getString("title"), nLevelItem, inflater, level, !(childrenSize>0));
                list.add(Parent);

                if(childrenSize>0){
                    nestedLoop(itemObject.getJSONArray("children").toString(), Parent, inflater, level+1);
                }
            }*/

        }catch (Exception e){

        }

    }

    private NLevelItem itemView(int itemRow, final String Title, NLevelItem nLevelItem, final LayoutInflater inflater, final int level, final boolean isLast){

        NLevelItem superChild = new NLevelItem(new SomeObject(Title), nLevelItem, new NLevelView() {
            @Override
            public View getView(NLevelItem item) {
                View view = inflater.inflate(R.layout.list_item, null);
                TextView tv = (TextView) view.findViewById(R.id.textView);
                String name = (String) ((SomeObject) item.getWrappedObject()).getName();
                tv.setText(name);

                tv.setBackgroundColor(colors[level]);

                ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) tv.getLayoutParams();
                mlp.setMargins(level*50, 5, 5, 5);

                if(isLast){
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(NLevelMainActivity.this, "Clicked on: "+Title, Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                return view;
            }
        });

        return superChild;
    }

}
