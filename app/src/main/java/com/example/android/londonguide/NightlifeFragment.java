package com.example.android.londonguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class NightlifeFragment extends Fragment {
    public NightlifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of places information
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.proud_camden, R.string.proud_camden_title,
                R.string.proud_camden_description, R.string.proud_camden_location,
                R.string.proud_camden_phone, R.string.proud_camden_price,
                R.string.proud_camden_rating));

        places.add(new Place(R.drawable.sherlock, R.string.sherlock_title,
                R.string.sherlock_description, R.string.sherlock_location,
                R.string.sherlock_phone, R.string.sherlock_price,
                R.string.sherlock_rating));

        places.add(new Place(R.drawable.mos, R.string.mos_title,
                R.string.mos_description, R.string.mos_location,
                R.string.mos_phone, R.string.mos_price,
                R.string.mos_rating));

        places.add(new Place(R.drawable.roundhouse, R.string.roundhouse_title,
                R.string.roundhouse_description, R.string.roundhouse_location,
                R.string.roundhouse_phone, R.string.roundhouse_price,
                R.string.roundhouse_rating));

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
