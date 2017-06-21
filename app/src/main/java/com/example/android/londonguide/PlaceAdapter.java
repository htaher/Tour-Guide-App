package com.example.android.londonguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hussain.taher on 17.05.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places  is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView attractionImageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        // Display the provided image based on the resource ID
        attractionImageView.setImageResource(currentPlace.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID attraction_name.
        TextView attractionNameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the Title from the Place object and set this text on
        // the Title TextView.
        attractionNameTextView.setText(currentPlace.getTitleId());

        // Find the TextView in the list_item.xml layout with the ID attraction_short_description.
        TextView shortDescriptionTextView = (TextView) listItemView.findViewById(R.id.attraction_short_description);
        // Get the Short description from the Place object and set this text on
        // the Title TextView.
        shortDescriptionTextView.setText(currentPlace.getShortDescriptionId());

        // Find the TextView in the list_item.xml layout with the ID location.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.attraction_location);
        // Get the location from the Place object and set this text on
        // the location TextView.
        locationTextView.setText(currentPlace.getLocationId());

        // Find the TextView in the list_item.xml layout with the ID phone number.
        TextView phoneNumberTextView = (TextView) listItemView.findViewById(R.id.attraction_phone);
        // Find the icon ImageView in the list_item.xml layout with the ID.
        ImageView phoneNumberImageView = (ImageView) listItemView.findViewById(R.id.phone_icon);
        // Check if a phone number is provided for this place or not
        if (currentPlace.hasPhoneNumber()) {
            // If a phone number is available, display the provided phone number based on the resource ID
            phoneNumberTextView.setText(currentPlace.getPhoneNumberId());
            // Make sure the view is visible
            phoneNumberTextView.setVisibility(View.VISIBLE);
            phoneNumberImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the phone number and the icon (set visibility to GONE)
            phoneNumberTextView.setVisibility(View.GONE);
            phoneNumberImageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID price.
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.attraction_price);
        // Get the price from the Place object and set this text on
        // the price TextView.
        priceTextView.setText(currentPlace.getPriceId());

        // Find the TextView in the list_item.xml layout with the ID price.
        TextView ratingTextView = (TextView) listItemView.findViewById(R.id.attraction_rating);
        // Get the price from the Place object and set this text on
        // the price TextView.
        ratingTextView.setText(currentPlace.getRatingId());

        // Return the whole list item layout
        return listItemView;
    }
}
