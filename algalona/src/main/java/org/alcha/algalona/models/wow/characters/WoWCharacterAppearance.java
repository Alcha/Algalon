package org.alcha.algalona.models.wow.characters;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * <p>Created by Alcha on 8/1/2017.</p>
 */

public class WoWCharacterAppearance extends WoWCharacterField {
    /** Stores the integer for the face variation of a {@link WoWCharacter} **/
    private int mFaceVariation;

    /** Stores the integer for the skin color of a {@link WoWCharacter} **/
    private int mSkinColor;

    /** Stores the integer for the hair variation of a {@link WoWCharacter} **/
    private int mHairVariation;

    /** Stores the integer for the hair color of a {@link WoWCharacter} **/
    private int mHairColor;

    /** Stores the integer for the feature variation of a {@link WoWCharacter} **/
    private int mFeatureVariation;

    /** Stores the boolean that indicates if a {@link WoWCharacter} has their helmet visible **/
    private boolean mShowHelm;

    /** Stores the boolean that indicates if a {@link WoWCharacter} has their cloak visible **/
    private boolean mShowCloak;

    /** Stores the custom display options for a {@link WoWCharacter} **/
    private int[] mCustomDisplayOptions;

    /**
     * <p>Private constructor for building a {@link WoWCharacterAppearance}. When calling this
     * constructor, {@link #setFieldName(Name)} is called and the value is set to Achievements.</p>
     *
     * <p>Generally, this is called within the {@link #newInstanceFromJson(JsonObject)} method
     * when setting up an object to be returned.</p>
     */
    private WoWCharacterAppearance() {
        setFieldName(Name.Achievements);
    }

    /**
     * <p>Parses the provided {@link JsonObject} to determine if it has the properties available for a
     * {@link WoWCharacterAppearance}. If any of the fields are present, they're extracted and
     * stored in the object before it is returned.</p>
     *
     * @param object JsonObject containing the WoWCharacterAppearance
     *
     * @return a WoWCharacterAppearance object with populated fields
     */
    public static WoWCharacterAppearance newInstanceFromJson(JsonObject object) {
        WoWCharacterAppearance appearance = new WoWCharacterAppearance();

        if (object.has("faceVariation"))
            appearance.setFaceVariation(object.get("faceVariation").getAsInt());

        if (object.has("skinColor"))
            appearance.setSkinColor(object.get("skinColor").getAsInt());

        if (object.has("hairVariation"))
            appearance.setHairVariation(object.get("hairVariation").getAsInt());

        if (object.has("hairColor"))
            appearance.setHairColor(object.get("hairColor").getAsInt());

        if (object.has("featureVariation"))
            appearance.setFeatureVariation(object.get("featureVariation").getAsInt());

        if (object.has("showHelm"))
            appearance.setShowHelm(object.get("showHelm").getAsBoolean());

        if (object.has("showCloak"))
            appearance.setShowCloak(object.get("showCloak").getAsBoolean());

        if (object.has("customDisplayOptions"))
            appearance.setCustomDisplayOptions(parseCustomDisplayOptions(object.getAsJsonArray("customDisplayOptions")));

        return appearance;
    }

    /**
     * <p>Parses the given {@link JsonArray} for the custom display options and stores them in a
     * temp array. When all values have been parsed, the temp array is returned.</p>
     *
     * @param object JsonArray containing the custom display options
     *
     * @return an int array with the custom display options
     */
    private static int[] parseCustomDisplayOptions(JsonArray object) {
        int[] temp = new int[object.size()];

        for (int x = 0; x < temp.length; x++) {
            temp[x] = Integer.parseInt(object.get(x).toString());
        }

        return temp;
    }

    /**
     * Gets currently stored custom display options and returns them as an int array.
     *
     * @return an int array containing the WoWCharacterAppearances custom display options
     */
    public int[] getCustomDisplayOptions() {
        return mCustomDisplayOptions;
    }

    /**
     * <p>Sets the custom display options for the current {@link WoWCharacterAppearance} to the
     * provided values.</p>
     *
     * @param customDisplayOptions an int array containing the custom display options
     */
    void setCustomDisplayOptions(int[] customDisplayOptions) {
        mCustomDisplayOptions = customDisplayOptions;
    }

    public boolean isShowCloak() {
        return mShowCloak;
    }

    void setShowCloak(boolean showCloak) {
        mShowCloak = showCloak;
    }

    public boolean isShowHelm() {
        return mShowHelm;
    }

    void setShowHelm(boolean showHelm) {
        mShowHelm = showHelm;
    }

    public int getFeatureVariation() {
        return mFeatureVariation;
    }

    void setFeatureVariation(int featureVariation) {
        this.mFeatureVariation = featureVariation;
    }

    public int getHairColor() {
        return mHairColor;
    }

    void setHairColor(int hairColor) {
        mHairColor = hairColor;
    }

    public int getHairVariation() {
        return mHairVariation;
    }

    void setHairVariation(int hairVariation) {
        mHairVariation = hairVariation;
    }

    public int getSkinColor() {
        return mSkinColor;
    }

    void setSkinColor(int skinColor) {
        mSkinColor = skinColor;
    }

    public int getFaceVariation() {
        return mFaceVariation;
    }

    void setFaceVariation(int faceVariation) {
        mFaceVariation = faceVariation;
    }
}
