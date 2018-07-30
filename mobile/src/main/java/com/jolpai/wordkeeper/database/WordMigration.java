package com.jolpai.wordkeeper.database;

import io.realm.DynamicRealm;
import io.realm.RealmMigration;

/**
 * Created by Tanim reja on 7/28/2018.
 */

public class WordMigration implements RealmMigration {
    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {


        /*RealmSchema schema = realm.getSchema();


        if (oldVersion == 0) {
            schema.create("Word")
                    .addField("name", String.class)
                    .addField("age", int.class);
            oldVersion++;
        }

        if (oldVersion == 1) {
            schema.get("Word")
                    .addField("id", long.class, FieldAttribute.PRIMARY_KEY)
                    .addRealmObjectField("favoriteDog", schema.get("Dog"))
                    .addRealmListField("dogs", schema.get("Dog"));
            oldVersion++;
        }*/
    }
}
