package com.example.android.londonguide;

/**
 * Created by hussain.taher on 17.05.2017.
 */

public class Place {

    /**
     * Image resource ID for the place
     */
    private int mImageResourceId;

    /**
     * Title (name) resource ID for the place
     */
    private int mTitleId;

    /**
     * Short description resource ID for the place
     */
    private int mShortDescriptionId;

    /**
     * Location (address) resource ID for the place
     */
    private int mLocationId;

    /**
     * Phone number resource ID for the place
     */
    private int mPhoneNumberId = NO_PHONE_NUMBER;

    /**
     * Average price resource ID for the place
     */
    private int mPriceId;

    /**
     * Rating resource ID for the place
     */
    private int mRatingId;

    /**
     * Constant value that represents no phone numer was provided for this place
     */
    private static final int NO_PHONE_NUMBER = -1;

    /**
     * Create a new Place object.
     *
     * @param ImageResourceId    is theImage resource ID for the place
     * @param TitleId            is the Title (name) resource ID for the place
     * @param ShortDescriptionId is the Short description resource ID for the place
     * @param LocationId         is the Location (address) resource ID for the place
     * @param PhoneNumberId      is the Phone number resource ID for the place
     * @param PriceId            is the Average price resource ID for the place
     * @param RatingId           is the Rating resource ID for the place
     */
    public Place(int ImageResourceId, int TitleId, int ShortDescriptionId, int LocationId,
                 int PhoneNumberId, int PriceId, int RatingId) {
        mImageResourceId = ImageResourceId;
        mTitleId = TitleId;
        mShortDescriptionId = ShortDescriptionId;
        mLocationId = LocationId;
        mPhoneNumberId = PhoneNumberId;
        mPriceId = PriceId;
        mRatingId = RatingId;
    }

    /**
     * Create a new Place object.
     *
     * @param ImageResourceId    is theImage resource ID for the place
     * @param TitleId            is the Title (name) resource ID for the place
     * @param ShortDescriptionId is the Short description resource ID for the place
     * @param LocationId         is the Location (address) resource ID for the place
     * @param PriceId            is the Average price resource ID for the place
     * @param RatingId           is the Rating resource ID for the place
     */
    public Place(int ImageResourceId, int TitleId, int ShortDescriptionId, int LocationId,
                 int PriceId, int RatingId) {
        mImageResourceId = ImageResourceId;
        mTitleId = TitleId;
        mShortDescriptionId = ShortDescriptionId;
        mLocationId = LocationId;
        mPriceId = PriceId;
        mRatingId = RatingId;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the string resource ID for the place name.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for the place short description.
     */
    public int getShortDescriptionId() {
        return mShortDescriptionId;
    }

    /**
     * Get the string resource ID for the place location (address).
     */
    public int getLocationId() {
        return mLocationId;
    }

    /**
     * Get the string resource ID for the place phone number.
     */
    public int getPhoneNumberId() {
        return mPhoneNumberId;
    }

    /**
     * Returns whether or not there short description for this place.
     */
    public boolean hasPhoneNumber() {
        return mPhoneNumberId != NO_PHONE_NUMBER;
    }

    /**
     * Get the string resource ID for the place average price.
     */
    public int getPriceId() {
        return mPriceId;
    }

    /**
     * Get the string resource ID for the place rating.
     */
    public int getRatingId() {
        return mRatingId;
    }
}
