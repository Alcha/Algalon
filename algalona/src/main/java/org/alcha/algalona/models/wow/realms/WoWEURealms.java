package org.alcha.algalona.models.wow.realms;

import java.util.Locale;

/**
 * <p>Created by Alcha on 8/8/2017.</p>
 */

public class WoWEURealms extends WoWRealm {
    public enum Name {
        Aegwynn("Aegwynn"),
        Aerie_Peak("Aerie Peak"),
        Agamaggan("Agamaggan"),
        Aggramar("Aggramar"),
        AhnQiraj("Ahn'Qiraj"),
        AlAkir("Al'Akir"),
        Alexstrasza("Alexstrasza"),
        Alleria("Alleria"),
        Alonsus("Alonsus"),
        AmanThul("Aman'Thul"),
        Ambossar("Ambossar"),
        Anachronos("Anachronos"),
        Anetheron("Anetheron"),
        Antonidas("Antonidas"),
        Anubarak("Anub'arak"),
        Arakarahm("Arak-arahm"),
        Arathi("Arathi"),
        Arathor("Arathor"),
        Archimonde("Archimonde"),
        Area_52("Area 52"),
        Argent_Dawn("Argent Dawn"),
        Arthas("Arthas"),
        Arygos("Arygos"),
        Aszune("Aszune"),
        Auchindoun("Auchindoun"),
        AzjolNerub("Azjol-Nerub"),
        Azshara("Azshara"),
        Azuremyst("Azuremyst"),
        Baelgun("Baelgun"),
        Balnazzar("Balnazzar"),
        Blackhand("Blackhand"),
        Blackmoore("Blackmoore"),
        Blackrock("Blackrock"),
        Bladefist("Bladefist"),
        Blades_Edge("Blade's Edge"),
        Bloodfeather("Bloodfeather"),
        Bloodhoof("Bloodhoof"),
        Bloodscalp("Bloodscalp"),
        Blutkessel("Blutkessel"),
        Boulderfist("Boulderfist"),
        Bronze_Dragonflight("Bronze Dragonflight"),
        Bronzebeard("Bronzebeard"),
        Burning_Blade("Burning Blade"),
        Burning_Legion("Burning Legion"),
        Burning_Steppes("Burning Steppes"),
        Chamber_of_Aspects("Chamber of Aspects"),
        Chogall("Cho'gall"),
        Chromaggus("Chromaggus"),
        Colinas_Pardas("Colinas Pardas"),
        Conseil_des_Ombres("Conseil des Ombres"),
        Crushridge("Crushridge"),
        CThun("C'Thun"),
        Culte_de_la_Rive_Noire("Culte de la Rive Noire"),
        Daggerspine("Daggerspine"),
        Dalaran("Dalaran"),
        Dalvengyr("Dalvengyr"),
        Darkmoon_Faire("Darkmoon Faire"),
        Darksorrow("Darksorrow"),
        Darkspear("Darkspear"),
        Das_Konsortium("Das Konsortium"),
        Das_Syndikat("Das Syndikat"),
        Deathwing("Deathwing"),
        Defias_Brotherhood("Defias Brotherhood"),
        Dentarg("Dentarg"),
        Der_abyssische_Rat("Der abyssische Rat"),
        Der_Mithrilorden("Der Mithrilorden"),
        Der_Rat_von_Dalaran("Der Rat von Dalaran"),
        Destromath("Destromath"),
        Dethecus("Dethecus"),
        Die_Aldor("Die Aldor"),
        Die_Arguswacht("Die Arguswacht"),
        Die_ewige_Wacht("Die ewige Wacht"),
        Die_Nachtwache("Die Nachtwache"),
        Die_Silberne_Hand("Die Silberne Hand"),
        Die_Todeskrallen("Die Todeskrallen"),
        Doomhammer("Doomhammer"),
        Draenor("Draenor"),
        Dragonblight("Dragonblight"),
        Dragonmaw("Dragonmaw"),
        Drakthul("Drak'thul"),
        DrekThar("Drek'Thar"),
        Dun_Modr("Dun Modr"),
        Dun_Morogh("Dun Morogh"),
        Dunemaul("Dunemaul"),
        Durotan("Durotan"),
        Earthen_Ring("Earthen Ring"),
        Echsenkessel("Echsenkessel"),
        Eitrigg("Eitrigg"),
        EldreThalas("Eldre'Thalas"),
        Elune("Elune"),
        Emeriss("Emeriss"),
        Eonar("Eonar"),
        Eredar("Eredar"),
        Executus("Executus"),
        Exodar("Exodar"),
        Forscherliga("Forscherliga"),
        Frostmane("Frostmane"),
        Frostmourne("Frostmourne"),
        Frostwhisper("Frostwhisper"),
        Frostwolf("Frostwolf"),
        Garona("Garona"),
        Genjuros("Genjuros"),
        Ghostlands("Ghostlands"),
        Gilneas("Gilneas"),
        Gorgonnash("Gorgonnash"),
        Grim_Batol("Grim Batol"),
        Guldan("Gul'dan"),
        Hakkar("Hakkar"),
        Haomarush("Haomarush"),
        Hellfire("Hellfire"),
        Hellscream("Hellscream"),
        Hyjal("Hyjal"),
        Illidan("Illidan"),
        Jaedenar("Jaedenar"),
        KaelThas("Kael'Thas"),
        Karazhan("Karazhan"),
        Kargath("Kargath"),
        Kazzak("Kazzak"),
        KelThuzad("Kel'Thuzad"),
        Khadgar("Khadgar"),
        Khaz_Modan("Khaz Modan"),
        Khazgoroth("Khaz'goroth"),
        KilJaeden("Kil'Jaeden"),
        Kilrogg("Kilrogg"),
        Kirin_Tor("Kirin Tor"),
        Korgall("Kor'gall"),
        Kragjin("Krag'jin"),
        Krasus("Krasus"),
        Kul_Tiras("Kul Tiras"),
        Kult_der_Verdammten("Kult der Verdammten"),
        Laughing_Skull("Laughing Skull"),
        Les_Clairvoyants("Les Clairvoyants"),
        Les_Sentinelles("Les Sentinelles"),
        Lightbringer("Lightbringer"),
        Lightnings_Blade("Lightning's Blade"),
        Lordaeron("Lordaeron"),
        Los_Errantes("Los Errantes"),
        Lothar("Lothar"),
        Madmortem("Madmortem"),
        Magtheridon("Magtheridon"),
        Malfurion("Malfurion"),
        MalGanis("Mal'Ganis"),
        Malygos("Malygos"),
        Mannoroth("Mannoroth"),
        Mazrigos("Mazrigos"),
        Medivh("Medivh"),
        Minahonda("Minahonda"),
        Moonglade("Moonglade"),
        Mugthol("Mug'thol"),
        Nagrand("Nagrand"),
        Nathrezim("Nathrezim"),
        Naxxramas("Naxxramas"),
        Nazjatar("Nazjatar"),
        Nefarian("Nefarian"),
        Nemesis("Nemesis"),
        Neptulon("Neptulon"),
        Nerathor("Nera'thor"),
        Nerzhul("Ner'zhul"),
        Nethersturm("Nethersturm"),
        Nordrassil("Nordrassil"),
        Norgannon("Norgannon"),
        Nozdormu("Nozdormu"),
        Onyxia("Onyxia"),
        Outland("Outland"),
        Perenolde("Perenolde"),
        Proudmoore("Proudmoore"),
        QuelThalas("Quel'Thalas"),
        Ragnaros("Ragnaros"),
        Rajaxx("Rajaxx"),
        Rashgarroth("Rashgarroth"),
        Ravencrest("Ravencrest"),
        Ravenholdt("Ravenholdt"),
        Rexxar("Rexxar"),
        Runetotem("Runetotem"),
        Sanguino("Sanguino"),
        Sargeras("Sargeras"),
        Saurfang("Saurfang"),
        Scarshield_Legion("Scarshield Legion"),
        Senjin("Sen'jin"),
        Shadowsong("Shadowsong"),
        Shattered_Halls("Shattered Halls"),
        Shattered_Hand("Shattered Hand"),
        Shattrath("Shattrath"),
        Shendralar("Shen'dralar"),
        Silvermoon("Silvermoon"),
        Sinstralis("Sinstralis"),
        Skullcrusher("Skullcrusher"),
        Spinebreaker("Spinebreaker"),
        Sporeggar("Sporeggar"),
        Steamwheedle_Cartel("Steamwheedle Cartel"),
        Stormrage("Stormrage"),
        Stormreaver("Stormreaver"),
        Stormscale("Stormscale"),
        Sunstrider("Sunstrider"),
        Suramar("Suramar"),
        Sylvanas("Sylvanas"),
        Taerar("Taerar"),
        Talnivarr("Talnivarr"),
        V_Mill("Tarren Mill"),
        Teldrassil("Teldrassil"),
        Temple_noir("Temple noir"),
        Terenas("Terenas"),
        Terokkar("Terokkar"),
        Terrordar("Terrordar"),
        The_Maelstrom("The Maelstrom"),
        The_Shatar("The Sha'tar"),
        The_Venture_Co_EU("The Venture Co EU"),
        Theradras("Theradras"),
        Thrall("Thrall"),
        ThrokFeroth("Throk'Feroth"),
        Thunderhorn("Thunderhorn"),
        Tichondrius("Tichondrius"),
        Tirion("Tirion"),
        Todeswache("Todeswache"),
        Trollbane("Trollbane"),
        Turalyon("Turalyon"),
        Twilights_Hammer("Twilight's Hammer"),
        Twisting_Nether("Twisting Nether"),
        Tyrande("Tyrande"),
        Uldaman("Uldaman"),
        Uldum("Uldum"),
        UnGoro("Un'Goro"),
        Varimathras("Varimathras"),
        Vashj("Vashj"),
        Veklor("Vek'lor"),
        Veknilash("Vek'nilash"),
        Voljin("Vol'jin"),
        Wildhammer("Wildhammer"),
        Wrathbringer("Wrathbringer"),
        Xavius("Xavius"),
        Ysera("Ysera"),
        Ysondre("Ysondre"),
        Zenedar("Zenedar"),
        Zirkel_des_Cenarius("Zirkel des Cenarius"),
        Zuljin("Zul'jin"),
        Zuluhed("Zuluhed"),
        Азурегос("Азурегос"),
        Борейская_тундра("Борейская тундра"),
        Вечная_Песня("Вечная Песня"),
        Дракономор("Дракономор"),
        Галакронд("Галакронд"),
        Голдринн("Голдринн"),
        Гордунни("Гордунни"),
        Гром("Гром"),
        Корольлич("Король-лич"),
        Подземье("Подземье"),
        Разувий("Разувий"),
        Ревущий_фьорд("Ревущий фьорд"),
        Свежеватель_Душ("Свежеватель Душ"),
        Седогрив("Седогрив"),
        Страж_Смерти("Страж Смерти"),
        Термоштепсель("Термоштепсель"),
        Ткач_Смерти("Ткач Смерти"),
        Черный_Шрам("Черный Шрам"),
        Ясеневый_лес("Ясеневый лес"),
        Unknown("Unknown");

        public String name;

        Name(String name) {
            this.name = name;
        }

        /**
         * Returns the slug representation of the given {@link WoWUSRealms realm name} to be used in
         * a url request.
         *
         * @return Server name without spaces or apostrophes
         */
        public String getSlug() {
            return this.toString().toLowerCase().replace('_', '-');
        }

        public String getRelativeUrl() {
            if (name.contains("\'")) {
                return name.toLowerCase(Locale.UK).replace("_", "%20");
            } else {
                return this.toString().toLowerCase(Locale.UK).replace("_", "%20");
            }
        }

        public String toString() {
            return name;
        }
    }

    private Name mName;

    /**
     * Attempts to find a matching {@link WoWEURealms} value for the provided realm name. If no match
     * is found, the {@link WoWEURealms.Name#Unknown} realm is returned as opposed to null.
     *
     * @param name
     *
     * @return
     */
    public static WoWEURealms fromString(String name) {
        for (WoWEURealms.Name realm : WoWEURealms.Name.values()) {
            if (realm.name.equalsIgnoreCase(name)) {
                WoWEURealms euRealm = new WoWEURealms();
                euRealm.setName(realm);

                return euRealm;
            }
        }

        return new WoWEURealms();
    }

    public Name getName() {
        return mName;
    }

    public void setName(Name name) {
        mName = name;
    }
}
