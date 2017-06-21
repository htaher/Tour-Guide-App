package com.example.android.londonguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of places information
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.hunterian_museum, R.string.hunterian_museum_title,
                R.string.hunterian_museum_description, R.string.hunterian_museum_location,
                R.string.hunterian_museum_phone, R.string.hunterian_museum_price,
                R.string.hunterian_museum_rating));

        places.add(new Place(R.drawable.british_museum, R.string.british_museum_title,
                R.string.british_museum_description, R.string.british_museum_location,
                R.string.british_museum_phone, R.string.british_museum_price,
                R.string.british_museum_rating));

        places.add(new Place(R.drawable.nh_museum, R.string.nh_museum_title,
                R.string.nh_museum_description, R.string.nh_museum_location,
                R.string.nh_museum_phone, R.string.nh_museum_price,
                R.string.nh_museum_rating));

        places.add(new Place(R.drawable.tate_modern, R.string.tate_modern_title,
                R.string.tate_modern_description, R.string.tate_modern_location,
                R.string.tate_modern_phone, R.string.tate_modern_price,
                R.string.tate_modern_rating));

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
