package com.example.android.londonguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of places information
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.fishers, R.string.fishers_title,
                R.string.fishers_description, R.string.fishers_location,
                R.string.fishers_phone, R.string.fishers_price,
                R.string.fishers_rating));

        places.add(new Place(R.drawable.clink, R.string.clink_title,
                R.string.clink_description, R.string.clink_location,
                R.string.clink_phone, R.string.clink_price,
                R.string.clink_rating));

        places.add(new Place(R.drawable.sitara, R.string.sitara_title,
                R.string.sitara_description, R.string.sitara_location,
                R.string.sitara_phone, R.string.sitara_price,
                R.string.sitara_rating));

        places.add(new Place(R.drawable.comedor, R.string.comedor_title,
                R.string.comedor_description, R.string.comedor_location,
                R.string.comedor_phone, R.string.comedor_price,
                R.string.comedor_rating));

        places.add(new Place(R.drawable.oro, R.string.oro_title,
                R.string.oro_description, R.string.oro_location,
                R.string.oro_phone, R.string.oro_price,
                R.string.oro_rating));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // guide_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
