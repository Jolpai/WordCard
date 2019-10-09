package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.ProxyUtils;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class WordRealmProxy extends com.jolpai.wordkeeper.model.entity.Word
    implements RealmObjectProxy, WordRealmProxyInterface {

    static final class WordColumnInfo extends ColumnInfo {
        long idIndex;
        long wordIndex;
        long meaningIndex;
        long voiceIdOneIndex;
        long voiceIdTwoIndex;
        long ImageIdIndex;
        long createDateIndex;
        long editDateIndex;
        long statusIndex;

        WordColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Word");
            this.idIndex = addColumnDetails("id", objectSchemaInfo);
            this.wordIndex = addColumnDetails("word", objectSchemaInfo);
            this.meaningIndex = addColumnDetails("meaning", objectSchemaInfo);
            this.voiceIdOneIndex = addColumnDetails("voiceIdOne", objectSchemaInfo);
            this.voiceIdTwoIndex = addColumnDetails("voiceIdTwo", objectSchemaInfo);
            this.ImageIdIndex = addColumnDetails("ImageId", objectSchemaInfo);
            this.createDateIndex = addColumnDetails("createDate", objectSchemaInfo);
            this.editDateIndex = addColumnDetails("editDate", objectSchemaInfo);
            this.statusIndex = addColumnDetails("status", objectSchemaInfo);
        }

        WordColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WordColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WordColumnInfo src = (WordColumnInfo) rawSrc;
            final WordColumnInfo dst = (WordColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.wordIndex = src.wordIndex;
            dst.meaningIndex = src.meaningIndex;
            dst.voiceIdOneIndex = src.voiceIdOneIndex;
            dst.voiceIdTwoIndex = src.voiceIdTwoIndex;
            dst.ImageIdIndex = src.ImageIdIndex;
            dst.createDateIndex = src.createDateIndex;
            dst.editDateIndex = src.editDateIndex;
            dst.statusIndex = src.statusIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(9);
        fieldNames.add("id");
        fieldNames.add("word");
        fieldNames.add("meaning");
        fieldNames.add("voiceIdOne");
        fieldNames.add("voiceIdTwo");
        fieldNames.add("ImageId");
        fieldNames.add("createDate");
        fieldNames.add("editDate");
        fieldNames.add("status");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private WordColumnInfo columnInfo;
    private ProxyState<com.jolpai.wordkeeper.model.entity.Word> proxyState;

    WordRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WordColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.jolpai.wordkeeper.model.entity.Word>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$word() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.wordIndex);
    }

    @Override
    public void realmSet$word(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.wordIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.wordIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.wordIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.wordIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$meaning() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.meaningIndex);
    }

    @Override
    public void realmSet$meaning(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.meaningIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.meaningIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.meaningIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.meaningIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$voiceIdOne() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.voiceIdOneIndex);
    }

    @Override
    public void realmSet$voiceIdOne(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.voiceIdOneIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.voiceIdOneIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.voiceIdOneIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.voiceIdOneIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$voiceIdTwo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.voiceIdTwoIndex);
    }

    @Override
    public void realmSet$voiceIdTwo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.voiceIdTwoIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.voiceIdTwoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.voiceIdTwoIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.voiceIdTwoIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$ImageId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ImageIdIndex);
    }

    @Override
    public void realmSet$ImageId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ImageIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.ImageIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ImageIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ImageIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$createDate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.createDateIndex);
    }

    @Override
    public void realmSet$createDate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.createDateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.createDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.createDateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.createDateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$editDate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.editDateIndex);
    }

    @Override
    public void realmSet$editDate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.editDateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.editDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.editDateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.editDateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIndex);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Word", 9, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("word", RealmFieldType.STRING, !Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("meaning", RealmFieldType.STRING, !Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("voiceIdOne", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("voiceIdTwo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("ImageId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("createDate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("editDate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WordColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new WordColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Word";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.jolpai.wordkeeper.model.entity.Word createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.jolpai.wordkeeper.model.entity.Word obj = null;
        if (update) {
            Table table = realm.getTable(com.jolpai.wordkeeper.model.entity.Word.class);
            WordColumnInfo columnInfo = (WordColumnInfo) realm.getSchema().getColumnInfo(com.jolpai.wordkeeper.model.entity.Word.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.jolpai.wordkeeper.model.entity.Word.class), false, Collections.<String> emptyList());
                    obj = new io.realm.WordRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.WordRealmProxy) realm.createObjectInternal(com.jolpai.wordkeeper.model.entity.Word.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.WordRealmProxy) realm.createObjectInternal(com.jolpai.wordkeeper.model.entity.Word.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final WordRealmProxyInterface objProxy = (WordRealmProxyInterface) obj;
        if (json.has("word")) {
            if (json.isNull("word")) {
                objProxy.realmSet$word(null);
            } else {
                objProxy.realmSet$word((String) json.getString("word"));
            }
        }
        if (json.has("meaning")) {
            if (json.isNull("meaning")) {
                objProxy.realmSet$meaning(null);
            } else {
                objProxy.realmSet$meaning((String) json.getString("meaning"));
            }
        }
        if (json.has("voiceIdOne")) {
            if (json.isNull("voiceIdOne")) {
                objProxy.realmSet$voiceIdOne(null);
            } else {
                objProxy.realmSet$voiceIdOne((String) json.getString("voiceIdOne"));
            }
        }
        if (json.has("voiceIdTwo")) {
            if (json.isNull("voiceIdTwo")) {
                objProxy.realmSet$voiceIdTwo(null);
            } else {
                objProxy.realmSet$voiceIdTwo((String) json.getString("voiceIdTwo"));
            }
        }
        if (json.has("ImageId")) {
            if (json.isNull("ImageId")) {
                objProxy.realmSet$ImageId(null);
            } else {
                objProxy.realmSet$ImageId((String) json.getString("ImageId"));
            }
        }
        if (json.has("createDate")) {
            if (json.isNull("createDate")) {
                objProxy.realmSet$createDate(null);
            } else {
                objProxy.realmSet$createDate((String) json.getString("createDate"));
            }
        }
        if (json.has("editDate")) {
            if (json.isNull("editDate")) {
                objProxy.realmSet$editDate(null);
            } else {
                objProxy.realmSet$editDate((String) json.getString("editDate"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.jolpai.wordkeeper.model.entity.Word createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.jolpai.wordkeeper.model.entity.Word obj = new com.jolpai.wordkeeper.model.entity.Word();
        final WordRealmProxyInterface objProxy = (WordRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("word")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$word((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$word(null);
                }
            } else if (name.equals("meaning")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$meaning((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$meaning(null);
                }
            } else if (name.equals("voiceIdOne")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$voiceIdOne((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$voiceIdOne(null);
                }
            } else if (name.equals("voiceIdTwo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$voiceIdTwo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$voiceIdTwo(null);
                }
            } else if (name.equals("ImageId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ImageId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ImageId(null);
                }
            } else if (name.equals("createDate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$createDate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$createDate(null);
                }
            } else if (name.equals("editDate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$editDate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$editDate(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.jolpai.wordkeeper.model.entity.Word copyOrUpdate(Realm realm, com.jolpai.wordkeeper.model.entity.Word object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.jolpai.wordkeeper.model.entity.Word) cachedRealmObject;
        }

        com.jolpai.wordkeeper.model.entity.Word realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.jolpai.wordkeeper.model.entity.Word.class);
            WordColumnInfo columnInfo = (WordColumnInfo) realm.getSchema().getColumnInfo(com.jolpai.wordkeeper.model.entity.Word.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.jolpai.wordkeeper.model.entity.Word.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.WordRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.jolpai.wordkeeper.model.entity.Word copy(Realm realm, com.jolpai.wordkeeper.model.entity.Word newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.jolpai.wordkeeper.model.entity.Word) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.jolpai.wordkeeper.model.entity.Word realmObject = realm.createObjectInternal(com.jolpai.wordkeeper.model.entity.Word.class, ((WordRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        WordRealmProxyInterface realmObjectSource = (WordRealmProxyInterface) newObject;
        WordRealmProxyInterface realmObjectCopy = (WordRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$word(realmObjectSource.realmGet$word());
        realmObjectCopy.realmSet$meaning(realmObjectSource.realmGet$meaning());
        realmObjectCopy.realmSet$voiceIdOne(realmObjectSource.realmGet$voiceIdOne());
        realmObjectCopy.realmSet$voiceIdTwo(realmObjectSource.realmGet$voiceIdTwo());
        realmObjectCopy.realmSet$ImageId(realmObjectSource.realmGet$ImageId());
        realmObjectCopy.realmSet$createDate(realmObjectSource.realmGet$createDate());
        realmObjectCopy.realmSet$editDate(realmObjectSource.realmGet$editDate());
        realmObjectCopy.realmSet$status(realmObjectSource.realmGet$status());
        return realmObject;
    }

    public static long insert(Realm realm, com.jolpai.wordkeeper.model.entity.Word object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.jolpai.wordkeeper.model.entity.Word.class);
        long tableNativePtr = table.getNativePtr();
        WordColumnInfo columnInfo = (WordColumnInfo) realm.getSchema().getColumnInfo(com.jolpai.wordkeeper.model.entity.Word.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((WordRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$word = ((WordRealmProxyInterface) object).realmGet$word();
        if (realmGet$word != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.wordIndex, rowIndex, realmGet$word, false);
        }
        String realmGet$meaning = ((WordRealmProxyInterface) object).realmGet$meaning();
        if (realmGet$meaning != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.meaningIndex, rowIndex, realmGet$meaning, false);
        }
        String realmGet$voiceIdOne = ((WordRealmProxyInterface) object).realmGet$voiceIdOne();
        if (realmGet$voiceIdOne != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.voiceIdOneIndex, rowIndex, realmGet$voiceIdOne, false);
        }
        String realmGet$voiceIdTwo = ((WordRealmProxyInterface) object).realmGet$voiceIdTwo();
        if (realmGet$voiceIdTwo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.voiceIdTwoIndex, rowIndex, realmGet$voiceIdTwo, false);
        }
        String realmGet$ImageId = ((WordRealmProxyInterface) object).realmGet$ImageId();
        if (realmGet$ImageId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ImageIdIndex, rowIndex, realmGet$ImageId, false);
        }
        String realmGet$createDate = ((WordRealmProxyInterface) object).realmGet$createDate();
        if (realmGet$createDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createDateIndex, rowIndex, realmGet$createDate, false);
        }
        String realmGet$editDate = ((WordRealmProxyInterface) object).realmGet$editDate();
        if (realmGet$editDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.editDateIndex, rowIndex, realmGet$editDate, false);
        }
        String realmGet$status = ((WordRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.jolpai.wordkeeper.model.entity.Word.class);
        long tableNativePtr = table.getNativePtr();
        WordColumnInfo columnInfo = (WordColumnInfo) realm.getSchema().getColumnInfo(com.jolpai.wordkeeper.model.entity.Word.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.jolpai.wordkeeper.model.entity.Word object = null;
        while (objects.hasNext()) {
            object = (com.jolpai.wordkeeper.model.entity.Word) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((WordRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$word = ((WordRealmProxyInterface) object).realmGet$word();
            if (realmGet$word != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.wordIndex, rowIndex, realmGet$word, false);
            }
            String realmGet$meaning = ((WordRealmProxyInterface) object).realmGet$meaning();
            if (realmGet$meaning != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.meaningIndex, rowIndex, realmGet$meaning, false);
            }
            String realmGet$voiceIdOne = ((WordRealmProxyInterface) object).realmGet$voiceIdOne();
            if (realmGet$voiceIdOne != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.voiceIdOneIndex, rowIndex, realmGet$voiceIdOne, false);
            }
            String realmGet$voiceIdTwo = ((WordRealmProxyInterface) object).realmGet$voiceIdTwo();
            if (realmGet$voiceIdTwo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.voiceIdTwoIndex, rowIndex, realmGet$voiceIdTwo, false);
            }
            String realmGet$ImageId = ((WordRealmProxyInterface) object).realmGet$ImageId();
            if (realmGet$ImageId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ImageIdIndex, rowIndex, realmGet$ImageId, false);
            }
            String realmGet$createDate = ((WordRealmProxyInterface) object).realmGet$createDate();
            if (realmGet$createDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.createDateIndex, rowIndex, realmGet$createDate, false);
            }
            String realmGet$editDate = ((WordRealmProxyInterface) object).realmGet$editDate();
            if (realmGet$editDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.editDateIndex, rowIndex, realmGet$editDate, false);
            }
            String realmGet$status = ((WordRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.jolpai.wordkeeper.model.entity.Word object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.jolpai.wordkeeper.model.entity.Word.class);
        long tableNativePtr = table.getNativePtr();
        WordColumnInfo columnInfo = (WordColumnInfo) realm.getSchema().getColumnInfo(com.jolpai.wordkeeper.model.entity.Word.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((WordRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$word = ((WordRealmProxyInterface) object).realmGet$word();
        if (realmGet$word != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.wordIndex, rowIndex, realmGet$word, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.wordIndex, rowIndex, false);
        }
        String realmGet$meaning = ((WordRealmProxyInterface) object).realmGet$meaning();
        if (realmGet$meaning != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.meaningIndex, rowIndex, realmGet$meaning, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.meaningIndex, rowIndex, false);
        }
        String realmGet$voiceIdOne = ((WordRealmProxyInterface) object).realmGet$voiceIdOne();
        if (realmGet$voiceIdOne != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.voiceIdOneIndex, rowIndex, realmGet$voiceIdOne, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.voiceIdOneIndex, rowIndex, false);
        }
        String realmGet$voiceIdTwo = ((WordRealmProxyInterface) object).realmGet$voiceIdTwo();
        if (realmGet$voiceIdTwo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.voiceIdTwoIndex, rowIndex, realmGet$voiceIdTwo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.voiceIdTwoIndex, rowIndex, false);
        }
        String realmGet$ImageId = ((WordRealmProxyInterface) object).realmGet$ImageId();
        if (realmGet$ImageId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ImageIdIndex, rowIndex, realmGet$ImageId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ImageIdIndex, rowIndex, false);
        }
        String realmGet$createDate = ((WordRealmProxyInterface) object).realmGet$createDate();
        if (realmGet$createDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createDateIndex, rowIndex, realmGet$createDate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.createDateIndex, rowIndex, false);
        }
        String realmGet$editDate = ((WordRealmProxyInterface) object).realmGet$editDate();
        if (realmGet$editDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.editDateIndex, rowIndex, realmGet$editDate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.editDateIndex, rowIndex, false);
        }
        String realmGet$status = ((WordRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.jolpai.wordkeeper.model.entity.Word.class);
        long tableNativePtr = table.getNativePtr();
        WordColumnInfo columnInfo = (WordColumnInfo) realm.getSchema().getColumnInfo(com.jolpai.wordkeeper.model.entity.Word.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.jolpai.wordkeeper.model.entity.Word object = null;
        while (objects.hasNext()) {
            object = (com.jolpai.wordkeeper.model.entity.Word) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((WordRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((WordRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$word = ((WordRealmProxyInterface) object).realmGet$word();
            if (realmGet$word != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.wordIndex, rowIndex, realmGet$word, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.wordIndex, rowIndex, false);
            }
            String realmGet$meaning = ((WordRealmProxyInterface) object).realmGet$meaning();
            if (realmGet$meaning != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.meaningIndex, rowIndex, realmGet$meaning, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.meaningIndex, rowIndex, false);
            }
            String realmGet$voiceIdOne = ((WordRealmProxyInterface) object).realmGet$voiceIdOne();
            if (realmGet$voiceIdOne != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.voiceIdOneIndex, rowIndex, realmGet$voiceIdOne, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.voiceIdOneIndex, rowIndex, false);
            }
            String realmGet$voiceIdTwo = ((WordRealmProxyInterface) object).realmGet$voiceIdTwo();
            if (realmGet$voiceIdTwo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.voiceIdTwoIndex, rowIndex, realmGet$voiceIdTwo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.voiceIdTwoIndex, rowIndex, false);
            }
            String realmGet$ImageId = ((WordRealmProxyInterface) object).realmGet$ImageId();
            if (realmGet$ImageId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ImageIdIndex, rowIndex, realmGet$ImageId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ImageIdIndex, rowIndex, false);
            }
            String realmGet$createDate = ((WordRealmProxyInterface) object).realmGet$createDate();
            if (realmGet$createDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.createDateIndex, rowIndex, realmGet$createDate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.createDateIndex, rowIndex, false);
            }
            String realmGet$editDate = ((WordRealmProxyInterface) object).realmGet$editDate();
            if (realmGet$editDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.editDateIndex, rowIndex, realmGet$editDate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.editDateIndex, rowIndex, false);
            }
            String realmGet$status = ((WordRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
            }
        }
    }

    public static com.jolpai.wordkeeper.model.entity.Word createDetachedCopy(com.jolpai.wordkeeper.model.entity.Word realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.jolpai.wordkeeper.model.entity.Word unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.jolpai.wordkeeper.model.entity.Word();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.jolpai.wordkeeper.model.entity.Word) cachedObject.object;
            }
            unmanagedObject = (com.jolpai.wordkeeper.model.entity.Word) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        WordRealmProxyInterface unmanagedCopy = (WordRealmProxyInterface) unmanagedObject;
        WordRealmProxyInterface realmSource = (WordRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$word(realmSource.realmGet$word());
        unmanagedCopy.realmSet$meaning(realmSource.realmGet$meaning());
        unmanagedCopy.realmSet$voiceIdOne(realmSource.realmGet$voiceIdOne());
        unmanagedCopy.realmSet$voiceIdTwo(realmSource.realmGet$voiceIdTwo());
        unmanagedCopy.realmSet$ImageId(realmSource.realmGet$ImageId());
        unmanagedCopy.realmSet$createDate(realmSource.realmGet$createDate());
        unmanagedCopy.realmSet$editDate(realmSource.realmGet$editDate());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());

        return unmanagedObject;
    }

    static com.jolpai.wordkeeper.model.entity.Word update(Realm realm, com.jolpai.wordkeeper.model.entity.Word realmObject, com.jolpai.wordkeeper.model.entity.Word newObject, Map<RealmModel, RealmObjectProxy> cache) {
        WordRealmProxyInterface realmObjectTarget = (WordRealmProxyInterface) realmObject;
        WordRealmProxyInterface realmObjectSource = (WordRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$word(realmObjectSource.realmGet$word());
        realmObjectTarget.realmSet$meaning(realmObjectSource.realmGet$meaning());
        realmObjectTarget.realmSet$voiceIdOne(realmObjectSource.realmGet$voiceIdOne());
        realmObjectTarget.realmSet$voiceIdTwo(realmObjectSource.realmGet$voiceIdTwo());
        realmObjectTarget.realmSet$ImageId(realmObjectSource.realmGet$ImageId());
        realmObjectTarget.realmSet$createDate(realmObjectSource.realmGet$createDate());
        realmObjectTarget.realmSet$editDate(realmObjectSource.realmGet$editDate());
        realmObjectTarget.realmSet$status(realmObjectSource.realmGet$status());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Word = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{word:");
        stringBuilder.append(realmGet$word() != null ? realmGet$word() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{meaning:");
        stringBuilder.append(realmGet$meaning() != null ? realmGet$meaning() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{voiceIdOne:");
        stringBuilder.append(realmGet$voiceIdOne() != null ? realmGet$voiceIdOne() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{voiceIdTwo:");
        stringBuilder.append(realmGet$voiceIdTwo() != null ? realmGet$voiceIdTwo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ImageId:");
        stringBuilder.append(realmGet$ImageId() != null ? realmGet$ImageId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{createDate:");
        stringBuilder.append(realmGet$createDate() != null ? realmGet$createDate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{editDate:");
        stringBuilder.append(realmGet$editDate() != null ? realmGet$editDate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordRealmProxy aWord = (WordRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aWord.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWord.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aWord.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
