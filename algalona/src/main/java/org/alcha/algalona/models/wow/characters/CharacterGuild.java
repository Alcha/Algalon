package org.alcha.algalona.models.wow.characters;

import com.google.gson.JsonObject;

import org.alcha.algalona.models.wow.guilds.Guild;

/**
 * <p>Created by Alcha on 8/4/2017.</p>
 * <p>Stores the information related to the guild that a {@link Character WoWCharacters} is
 * in.</p>
 */
public class CharacterGuild extends CharacterField {
    private static final String LOG_TAG = "CharacterGuild";
    private Guild mGuild;

    public CharacterGuild() {
        setFieldName(Name.Guild);
    }

    @Override
    public String toString() {
        return "Name = " + mGuild.getName() +
                ";Realm = " + mGuild.getRealm() +
                ";Battlegroup = " + mGuild.getBattleGroup() +
                ";AchievementPoints = " + mGuild.getAchievementPoints() + ";";
    }

    public static CharacterGuild newInstanceFromJson(JsonObject jsonObject) {
        CharacterGuild characterGuild = new CharacterGuild();
        characterGuild.setGuild(Guild.newInstanceFromJson(jsonObject));
        return characterGuild;
    }

    public Guild getGuild() {
        return mGuild;
    }

    public void setGuild(Guild guild) {
        mGuild = guild;
    }
}
