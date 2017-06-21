package com.example.android.londonguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightseeingFragment extends Fragment {

    public SightseeingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of places information
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.millennium_bridge, R.string.millennium_title,
                R.string.millennium_description, R.string.millennium_location,
                R.string.millennium_price, R.string.millennium_rating));

        places.add(new Place(R.drawable.big_ben, R.string.big_ben_title,
                R.string.big_ben_description, R.string.big_ben_location,
                R.string.big_ben_price, R.string.big_ben_rating));

        places.add(new Place(R.drawable.winter_wonderland, R.string.winter_wonderland_title,
                R.string.winter_wonderland_description, R.string.winter_wonderland_location,
                R.string.winter_wonderland_phone, R.string.winter_wonderland_price,
                R.string.winter_wonderland_rating));

        places.add(new Place(R.drawable.london_eye, R.string.london_eye_title,
                R.string.london_eye_description, R.string.london_eye_location,
                R.string.london_eye_phone, R.string.london_eye_price,
                R.string.london_eye_rating));

        places.add(new Place(R.drawable.trafalgar_square, R.string.trafalgar_square_title,
                R.string.trafalgar_square_description, R.string.trafalgar_square_location,
                R.string.trafalgar_square_price, R.string.trafalgar_square_rating));

        places.add(new Place(R.drawable.piccadilly_circus, R.string.piccadilly_circus_title,
                R.string.piccadilly_circus_description, R.string.piccadilly_circus_location,
                R.string.piccadilly_circus_price, R.string.piccadilly_circus_rating));

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
