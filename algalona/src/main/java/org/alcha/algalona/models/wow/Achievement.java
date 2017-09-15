package org.alcha.algalona.models.wow;

import android.support.annotation.NonNull;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Created by Alcha on 8/1/2017.</p>
 *
 * <p>Stores all information related to an Achievement in WoW. Contains the
 * {@link #newInstanceFromJson(JsonObject)} method to parse a response from
 * <code>/wow/achievement/:id</code> into a usable {@link Achievement} object.</p>
 */
public class Achievement implements Comparable<Achievement> {
    private static final String LOG_TAG = "Achievement";
    private int mId;
    private String mTitle;
    private int mPoints;
    private String mDescription;
    private String mReward;
    private List<RewardItem> mRewardItems;
    private String mIcon;
    private List<Criteria> mCriteria;
    private boolean mAccountWide;
    private Faction mFaction;

    public Achievement() {

    }

    @Override
    public String toString() {
        return "id = " + mId + ";" +
                "title = " + mTitle + ";" +
                "points = " + mPoints + ";\n" +
                "description = " + mDescription + ";" +
                "reward = " + mReward + "; " +
                "icon = " + mIcon + ";\n" +
                "criteria.size() = " + mCriteria.size() + ";" +
                "accountWide = " + mAccountWide + ";" +
                "faction = " + mFaction.toString() + ";";
    }

    @Override
    public int compareTo(@NonNull Achievement achievement) {
        if (achievement.getId() > mId) return 1;
        else if (achievement.getId() < mId) return -1;
        else return 0;
    }

    /**
     * <p>Accepts a {@link JsonObject} that is the response from <code>/wow/achievement/:id</code> and
     * populates the available fields.</p>
     *
     * @param json <code>/wow/achievement/:id</code> response
     */
    public static Achievement newInstanceFromJson(JsonObject json) {
        Achievement achievement = new Achievement();

        if (json.has("id"))
            achievement.setId(json.get("id").getAsInt());
        else achievement.setId(-1);

        if (json.has("title"))
            achievement.setTitle(json.get("title").getAsString());
        else achievement.setTitle("");

        if (json.has("points"))
            achievement.setPoints(json.get("points").getAsInt());
        else achievement.setPoints(-1);

        if (json.has("description"))
            achievement.setDescription(json.get("description").getAsString());
        else achievement.setDescription("");

        if (json.has("reward"))
            achievement.setReward(json.get("reward").getAsString());
        else achievement.setReward("");

        if (json.has("rewardItems"))
            achievement.setRewardItems(RewardItem.parseRewardItems(json.getAsJsonArray("rewardItems")));
        else achievement.setRewardItems(new ArrayList<RewardItem>());

        if (json.has("icon"))
            achievement.setIcon(json.get("icon").getAsString());
        else achievement.setIcon("");

        if (json.has("criteria"))
            achievement.setCriteria(Criteria.parseJsonArray(json.getAsJsonArray("criteria")));
        else achievement.setCriteria(new ArrayList<Criteria>());

        if (json.has("accountWide"))
            achievement.setAccountWide(json.get("accountWide").getAsBoolean());
        else achievement.setAccountWide(false);

        if (json.has("factionId"))
            achievement.setFaction(json.get("factionId").getAsInt());
        else achievement.setFaction(-1);

        return achievement;
    }

    /**
     * <p>Returns the description of the current {@link Achievement} as specified by the
     * Battle.net API.</p>
     *
     * @return the description of the current Achievement
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * <p>Sets the description for the current {@link Achievement}, however it is package private
     * to prevent users from corrupting an objects state or inserting invalid information.</p>
     *
     * @param description String of the description for the Achievement
     */
    public void setDescription(String description) {
        mDescription = description;
    }

    /**
     * <p>Returns the ID of the current {@link Achievement} as specified by the Battle.net
     * API.</p>
     *
     * @return the id of the current Achievement
     */
    public int getId() {
        return mId;
    }

    /**
     * <p>Sets the ID of the current {@link Achievement}, however it is package private to
     * prevent users from corrupt the object state or inserting invalid information.</p>
     *
     * @param id int of the Achievement ID
     */
    public void setId(int id) {
        mId = id;
    }

    /**
     * <p>Returns the title of the current {@link Achievement} as specified by the Battle.net
     * API.</p>
     *
     * @return the title of the current Achievement
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * <p>Sets the title of the current {@link Achievement}, and it is package private to prevent
     * users from corrupting the object state or inserting invalid information.</p>
     *
     * @param title String of the Achievement title
     */
    public void setTitle(String title) {
        mTitle = title;
    }

    /**
     * <p>Returns the amount of points received for the current {@link Achievement} as specified
     * by the Battle.net API.</p>
     *
     * @return the achievement points of the current Achievement
     */
    public int getPoints() {
        return mPoints;
    }

    public void setPoints(int points) {
        mPoints = points;
    }

    /**
     * <p>Returns the reward of the current {@link Achievement} as specified by the Battle.net
     * API.</p>
     *
     * <p><b>NOTE: I believe this is generally used as a reward title that is displayed in the
     * achievement whereas the {@link #getRewardItems()} method has more information about the
     * individual rewards retrieved.</b></p>
     *
     * @return the reward of the current Achievement
     */
    public String getReward() {
        return mReward;
    }

    public void setReward(String reward) {
        mReward = reward;
    }

    /**
     * <p>Returns the {@link RewardItem} of the current {@link Achievement} as an array.</p>
     *
     * @return the RewardItem[] of the current Achievement
     */
    public List<RewardItem> getRewardItems() {
        return mRewardItems;
    }

    public void setRewardItems(List<RewardItem> rewardItems) {
        mRewardItems = rewardItems;
    }

    /**
     * <p>Returns the {@link Criteria} of the current {@link Achievement} as an
     * array.</p>
     *
     * @return the Criteria[] of the current Achievement
     */
    public List<Criteria> getCriteria() {
        return mCriteria;
    }

    public void setCriteria(List<Criteria> criteria) {
        mCriteria = criteria;
    }

    /**
     * <p>Returns true or false if the current {@link Achievement} is account wide as specified
     * by the Battle.net API.</p>
     *
     * @return the account wide boolean of the current Achievement
     */
    public boolean isAccountWide() {
        return mAccountWide;
    }

    public void setAccountWide(boolean accountWide) {
        mAccountWide = accountWide;
    }

    /**
     * <p>Returns the {@link Faction} of the current {@link Achievement} as specified by the
     * Battle.net API.</p>
     *
     * <p><b>NOTE: The Battle.net API returns the faction as an int, 0, 1, or 2. This is converted
     * to the Faction enum as it's more useful than a simple int.</b></p>
     *
     * @return the faction  of the current Achievement
     */
    public Faction getFaction() {
        return mFaction;
    }

    public void setFaction(int factionId) {
        mFaction = Faction.fromId(factionId);
    }

    /**
     * <p>Returns the icon of the current {@link Achievement} as specified by the Battle.net
     * API.</p>
     *
     * @return the icon of the current Achievement
     */
    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }
}
