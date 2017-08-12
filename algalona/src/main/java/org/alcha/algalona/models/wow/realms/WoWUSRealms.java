package org.alcha.algalona.models.wow.realms;

import java.util.Locale;

/**
 * <p>Created by Alcha on 8/4/2017.</p>
 * Enum that represents a given realm in WoW. All servers as of the date of file creation are added
 * and the names have had apostrophe's removed, while spaces have been replaced with underscores.
 * <br/><br/>
 * If you use the {@link #getSlug()} method, it will return the server name in slug form for use as
 * a url.
 */

public enum WoWUSRealms implements WoWRealm {
    Aegwynn("Aegwynn"),
    Aerie_Peak("Aerie Peak"),
    Agamaggan("Agamaggan"),
    Aggramar("Aggramar"),
    Akama("Akama"),
    Alexstrasza("Alextrasza"),
    Alleria("Alleria"),
    Altar_of_Storms("Altar of Storms"),
    Alterac_Mountains("Alterac Mountains"),
    AmanThul("Aman'Thul"),
    Andorhal("Andorhal"),
    Anetheron("Anetheron"),
    Antonidas("Antonidas"),
    Anubarak("Anub'arak"),
    Anvilmar("Anvilmar"),
    Arathor("Arathor"),
    Archimonde("Archimonde"),
    Area_52("Area 52"),
    Argent_Dawn("Argent Dawn"),
    Arthas("Arthas"),
    Arygos("Arygos"),
    Auchindoun("Auchindoun"),
    Azgalor("Azgalor"),
    AzjolNerub("Azjol-Nerub"),
    Azralon("Azralon"),
    Azshara("Azshara"),
    Azuremyst("Azuremyst"),
    Baelgun("Baelgun"),
    Balnazzar("Balnazzar"),
    Barthilas("Barthilas"),
    Black_Dragonflight("Black Dragonflight"),
    Blackhand("Blackhand"),
    Blackrock("Blackrock"),
    Blackwater_Raiders("Blackwater Raiders"),
    Blackwing_Lair("Blackwing Lair"),
    Blades_Edge("Blade's Edge"),
    Bladefist("Bladefist"),
    Bleeding_Hollow("Bleeding Hollow"),
    Blood_Furnace("Blood Furnace"),
    Bloodhoof("Bloodhoof"),
    Bloodscalp("Bloodscalp"),
    Bonechewer("Bonechewer"),
    Borean_Tundra("Borean Tundra"),
    Boulderfist("Boulderfist"),
    Bronzebeard("Bronzebeard"),
    Burning_Blade("Burning Blade"),
    Burning_Legion("Burning Legion"),
    Caelestrasz("Caelestrasz"),
    Cairne("Cairne"),
    Cenarion_Circle("Cenarion Circle"),
    Cenarius("Cenarius"),
    Chogall("Cho'gall"),
    Chromaggus("Chromaggus"),
    Coilfang("Coilfang"),
    Crushridge("Crushridge"),
    Daggerspine("Daggerspine"),
    Dalaran("Dalaran"),
    Dalvengyr("Dalvengyr"),
    Dark_Iron("Dark Iron"),
    Darkspear("Darkspear"),
    Darrowmere("Darrowmere"),
    DathRemar("Dath'Remar"),
    Dawnbringer("Dawnbringer"),
    Deathwing("Deathwing"),
    Demon_Soul("Demon Soul"),
    Dentarg("Dentarg"),
    Destromath("Destromath"),
    Dethecus("Dethecus"),
    Detheroc("Detheroc"),
    Doomhammer("Doomhammer"),
    Draenor("Draenor"),
    Dragonblight("Dragonblight"),
    Dragonmaw("Dragonmaw"),
    DrakTharon("Drak'Tharon"),
    Drakthul("Drak'thul"),
    Draka("Draka"),
    Drakkari("Drakkari"),
    Dreadmaul("Dreadmaul"),
    Drenden("Drenden"),
    Dunemaul("Dunemaul"),
    Durotan("Durotan"),
    Duskwood("Duskwood"),
    Earthen_Ring("Earthen Ring"),
    Echo_Isles("Echo Isles"),
    Eitrigg("Eitrigg"),
    EldreThalas("Eldre'Thalas"),
    Elune("Elune"),
    Emerald_Dream("Emerald Dream"),
    Eonar("Eonar"),
    Eredar("Eredar"),
    Executus("Executus"),
    Exodar("Exodar"),
    Farstriders("Farstriders"),
    Feathermoon("Feathermoon"),
    Fenris("Fenris"),
    Firetree("Firetree"),
    Fizzcrank("Fizzcrank"),
    Frostmane("Frostmane"),
    Frostmourne("Frostmourne"),
    Frostwolf("Frostwolf"),
    Galakrond("Galakrond"),
    Gallywix("Gallywix"),
    Garithos("Garithos"),
    Garona("Garona"),
    Garrosh("Garrosh"),
    Ghostlands("Ghostlands"),
    Gilneas("Gilneas"),
    Gnomeregan("Gnomeregan"),
    Goldrinn("Goldrinn"),
    Gorefiend("Gorefiend"),
    Gorgonnash("Gorgonnash"),
    Greymane("Greymane"),
    Grizzly_Hills("Grizzly Hills"),
    Guldan("Gul'dan"),
    Gundrak("Gundrak"),
    Gurubashi("Gurubashi"),
    Hakkar("Hakkar"),
    Haomarush("Haomarush"),
    Hellscream("Hellscream"),
    Hydraxis("Hydraxis"),
    Hyjal("Hyjal"),
    Icecrown("Icecrown"),
    Illidan("Illidan"),
    Jaedenar("Jaedenar"),
    JubeiThos("Jubei'Thos"),
    Kaelthas("Kael'thas"),
    Kalecgos("Kalecgos"),
    Kargath("Kargath"),
    KelThuzad("Kel'Thuzad"),
    Khadgar("Khadgar"),
    Khaz_Modan("Khaz Modan"),
    Khazgoroth("Khaz'goroth"),
    Kiljaeden("Kil'jaeden"),
    Kilrogg("Kilrogg"),
    Kirin_Tor("Kirin Tor"),
    Korgath("Korgath"),
    Korialstrasz("Korialstrasz"),
    Kul_Tiras("Kul Tiras"),
    Laughing_Skull("Laughing Skull"),
    Lethon("Lethon"),
    Lightbringer("Lightbringer"),
    Lightnings_Blade("Lightning's Blade"),
    Lightninghoof("Lightninghoof"),
    Llane("Llane"),
    Lothar("Lothar"),
    Madoran("Madoran"),
    Maelstrom("Maelstrom"),
    Magtheridon("Magtheridon"),
    Maiev("Maiev"),
    MalGanis("Mal'Ganis"),
    Malfurion("Malfurion"),
    Malorne("Malorne"),
    Malygos("Malygos"),
    Mannoroth("Mannoroth"),
    Medivh("Medivh"),
    Misha("Misha"),
    MokNathal("Mok'Nathal"),
    Moon_Guard("Moon Guard"),
    Moonrunner("Moonrunner"),
    Mugthol("Mug'thol"),
    Muradin("Muradin"),
    Nagrand("Nagrand"),
    Nathrezim("Nathrezim"),
    Nazgrel("Nazgrel"),
    Nazjatar("Nazjatar"),
    Nemesis("Nemesis"),
    Nerzhul("Ner'zhul"),
    Nesingwary("Nesingwary"),
    Nordrassil("Nordrassil"),
    Norgannon("Norgannon"),
    Onyxia("Onyxia"),
    Perenolde("Perenolde"),
    Proudmoore("Proudmoore"),
    QuelThalas("Quel'Thalas"),
    Queldorei("Quel'dorei"),
    Ragnaros("Ragnaros"),
    Ravencrest("Ravencrest"),
    Ravenholdt("Ravenholdt"),
    Rexxar("Rexxar"),
    Rivendare("Rivendare"),
    Runetotem("Runetotem"),
    Sargeras("Sargeras"),
    Saurfang("Saurfang"),
    Scarlet_Crusade("Scarlet Crusade"),
    Scilla("Scilla"),
    Senjin("Sen'jin"),
    Sentinels("Sentinels"),
    Shadow_Council("Shadow Council"),
    Shadowmoon("Shadowmoon"),
    Shadowsong("Shadowsong"),
    Shandris("Shandris"),
    Shattered_Halls("Shattered Halls"),
    Shattered_Hand("Shattered Hand"),
    Shuhalo("Shu'halo"),
    Silver_Hand("Silver Hand"),
    Silvermoon("Silvermoon"),
    Sisters_of_Elune("Sisters of Elune"),
    Skullcrusher("Skullcrusher"),
    Skywall("Skywall"),
    Smolderthorn("Smolderthorn"),
    Spinebreaker("Spinebreaker"),
    Spirestone("Spirestone"),
    Staghelm("Staghelm"),
    Steamwheedle_Cartel("Steamwheedle Cartel"),
    Stonemaul("Stonemaul"),
    Stormrage("Stormrage"),
    Stormreaver("Stormreaver"),
    Stormscale("Stormscale"),
    Suramar("Suramar"),
    Tanaris("Tanaris"),
    Terenas("Terenas"),
    Terokkar("Terokkar"),
    Thaurissan("Thaurissan"),
    The_Forgotten_Coast("The Forgotten Coast"),
    The_Scryers("The Scryers"),
    The_Underbog("The Underbog"),
    The_Venture_Co("The Venture Co"),
    Thorium_Brotherhood("Thorium Brotherhood"),
    Thrall("Thrall"),
    Thunderhorn("Thunderhorn"),
    Thunderlord("Thunderlord"),
    Tichondrius("Tichondrius"),
    Tol_Barad("Tol Barad"),
    Tortheldrin("Tortheldrin"),
    Trollbane("Trollbane"),
    Turalyon("Turalyon"),
    Twisting_Nether("Twisting Nether"),
    Uldaman("Uldaman"),
    Uldum("Uldum"),
    Undermine("Undermine"),
    Ursin("Ursin"),
    Uther("Uther"),
    Vashj("Vashj"),
    Veknilash("Vek'nilash"),
    Velen("Velen"),
    Warsong("Warsong"),
    Whisperwind("Whisperwind"),
    Wildhammer("Wildhammer"),
    Windrunner("Windrunner"),
    Winterhoof("Winterhoof"),
    Wyrmrest_Accord("Wyrmrest Accord"),
    Ysera("Ysera"),
    Ysondre("Ysondre"),
    Zangarmarsh("Zangarmarsh"),
    Zuljin("Zul'jin"),
    Zuluhed("Zuluhed"),
    Unknown("Unknown");
    private String name;

    WoWUSRealms(String name) {
        this.name = name;
    }

    /**
     * Attempts to find a matching {@link WoWUSRealms} value for the provided realm name. If no match
     * is found, the {@link WoWUSRealms#Unknown} realm is returned as opposed to null.
     *
     * @param name
     *
     * @return
     */
    public static WoWUSRealms fromString(String name) {
        for (WoWUSRealms realm : WoWUSRealms.values()) {
            if (realm.name.equalsIgnoreCase(name)) {
                return realm;
            }
        }

        return Unknown;
    }

    /**
     * Returns the slug representation of the given {@link WoWUSRealms realm name} to be used in
     * a url request.
     *
     * @return Server name without spaces or apostrophes
     */
    @Override
    public String getSlug() {
        return this.toString().toLowerCase().replace('_', '-');
    }

    @Override
    public String getRelativeUrl() {
        if (name.contains("\'")) {
            return name.toLowerCase(Locale.US).replace("_", "%20");
        } else {
            return this.toString().toLowerCase(Locale.US).replace("_", "%20");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
