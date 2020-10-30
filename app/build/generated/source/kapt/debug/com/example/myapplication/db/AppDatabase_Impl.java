package com.example.myapplication.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CorridasDiaModelDao _corridasDiaModelDao;

  private volatile TipoPasajeModelDao _tipoPasajeModelDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CorridasDiaModel` (`PK` INTEGER NOT NULL, `PK_LINEA` INTEGER NOT NULL, `LINEA` TEXT NOT NULL, `PK_ROL` INTEGER NOT NULL, `PK_CORRIDA` TEXT NOT NULL, `CORRIDA` INTEGER NOT NULL, `NO_CORRIDA` INTEGER NOT NULL, `CORRIDA_DESCRIPCION` TEXT NOT NULL, `PK_AUTOBUS` INTEGER NOT NULL, `AUTOBUS` TEXT NOT NULL, `TIPO_PK` INTEGER NOT NULL, `PK_ORIGEN` INTEGER NOT NULL, `ORIGEN` TEXT NOT NULL, `SALIDA` TEXT NOT NULL, `PK_DESTINO` INTEGER NOT NULL, `DESTINO` TEXT NOT NULL, `LLEGADA` TEXT NOT NULL, `ESCALA` TEXT NOT NULL, `FECHA` TEXT NOT NULL, `PK_RUTA` INTEGER NOT NULL, `RUTA` TEXT NOT NULL, `PK_CORRIDA_RUTA` INTEGER NOT NULL, `BLOQUEADO` TEXT NOT NULL, `GUIA` TEXT NOT NULL, `COMPLETO` TEXT NOT NULL, `PK_ORIGEN_COMPLETO` INTEGER NOT NULL, `ORIGEN_COMPLETO` TEXT NOT NULL, `SALIDA_COMPLETO` TEXT NOT NULL, `SALIDA_C` TEXT NOT NULL, `PK_DESTINO_COMPLETO` INTEGER NOT NULL, `DESTINO_COMPLETO` TEXT NOT NULL, `LLEGADA_COMPLETO` TEXT NOT NULL, `LLEGADA_C` TEXT NOT NULL, `FECHA_C` TEXT NOT NULL, `FECHA_M` TEXT NOT NULL, `USUARIO` TEXT NOT NULL, `PK_CHOFER` INTEGER NOT NULL, `NOMBRE` TEXT NOT NULL, `APELLIDOS` TEXT NOT NULL, `PISOS` TEXT NOT NULL, `TIEMPO` TEXT NOT NULL, `PRECIO` REAL NOT NULL, PRIMARY KEY(`PK`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TipoPasajeModel` (`PKI` INTEGER NOT NULL, `PASAJE` TEXT NOT NULL, `PKLINEA` INTEGER NOT NULL, `PORCENTAJE` REAL NOT NULL, `BORRADO` INTEGER NOT NULL, `ACTIVO` INTEGER NOT NULL, `USUARIO_M` TEXT NOT NULL, `PERMITIDOS` INTEGER NOT NULL, `COLOR` TEXT NOT NULL, PRIMARY KEY(`PKI`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3e4ea249fd2c6c295bf036d618af1b22')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `CorridasDiaModel`");
        _db.execSQL("DROP TABLE IF EXISTS `TipoPasajeModel`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCorridasDiaModel = new HashMap<String, TableInfo.Column>(42);
        _columnsCorridasDiaModel.put("PK", new TableInfo.Column("PK", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_LINEA", new TableInfo.Column("PK_LINEA", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("LINEA", new TableInfo.Column("LINEA", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_ROL", new TableInfo.Column("PK_ROL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_CORRIDA", new TableInfo.Column("PK_CORRIDA", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("CORRIDA", new TableInfo.Column("CORRIDA", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("NO_CORRIDA", new TableInfo.Column("NO_CORRIDA", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("CORRIDA_DESCRIPCION", new TableInfo.Column("CORRIDA_DESCRIPCION", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_AUTOBUS", new TableInfo.Column("PK_AUTOBUS", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("AUTOBUS", new TableInfo.Column("AUTOBUS", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("TIPO_PK", new TableInfo.Column("TIPO_PK", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_ORIGEN", new TableInfo.Column("PK_ORIGEN", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("ORIGEN", new TableInfo.Column("ORIGEN", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("SALIDA", new TableInfo.Column("SALIDA", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_DESTINO", new TableInfo.Column("PK_DESTINO", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("DESTINO", new TableInfo.Column("DESTINO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("LLEGADA", new TableInfo.Column("LLEGADA", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("ESCALA", new TableInfo.Column("ESCALA", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("FECHA", new TableInfo.Column("FECHA", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_RUTA", new TableInfo.Column("PK_RUTA", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("RUTA", new TableInfo.Column("RUTA", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_CORRIDA_RUTA", new TableInfo.Column("PK_CORRIDA_RUTA", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("BLOQUEADO", new TableInfo.Column("BLOQUEADO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("GUIA", new TableInfo.Column("GUIA", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("COMPLETO", new TableInfo.Column("COMPLETO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_ORIGEN_COMPLETO", new TableInfo.Column("PK_ORIGEN_COMPLETO", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("ORIGEN_COMPLETO", new TableInfo.Column("ORIGEN_COMPLETO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("SALIDA_COMPLETO", new TableInfo.Column("SALIDA_COMPLETO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("SALIDA_C", new TableInfo.Column("SALIDA_C", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_DESTINO_COMPLETO", new TableInfo.Column("PK_DESTINO_COMPLETO", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("DESTINO_COMPLETO", new TableInfo.Column("DESTINO_COMPLETO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("LLEGADA_COMPLETO", new TableInfo.Column("LLEGADA_COMPLETO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("LLEGADA_C", new TableInfo.Column("LLEGADA_C", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("FECHA_C", new TableInfo.Column("FECHA_C", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("FECHA_M", new TableInfo.Column("FECHA_M", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("USUARIO", new TableInfo.Column("USUARIO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PK_CHOFER", new TableInfo.Column("PK_CHOFER", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("NOMBRE", new TableInfo.Column("NOMBRE", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("APELLIDOS", new TableInfo.Column("APELLIDOS", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PISOS", new TableInfo.Column("PISOS", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("TIEMPO", new TableInfo.Column("TIEMPO", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorridasDiaModel.put("PRECIO", new TableInfo.Column("PRECIO", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCorridasDiaModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCorridasDiaModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCorridasDiaModel = new TableInfo("CorridasDiaModel", _columnsCorridasDiaModel, _foreignKeysCorridasDiaModel, _indicesCorridasDiaModel);
        final TableInfo _existingCorridasDiaModel = TableInfo.read(_db, "CorridasDiaModel");
        if (! _infoCorridasDiaModel.equals(_existingCorridasDiaModel)) {
          return new RoomOpenHelper.ValidationResult(false, "CorridasDiaModel(com.example.myapplication.CorridasDiaModel).\n"
                  + " Expected:\n" + _infoCorridasDiaModel + "\n"
                  + " Found:\n" + _existingCorridasDiaModel);
        }
        final HashMap<String, TableInfo.Column> _columnsTipoPasajeModel = new HashMap<String, TableInfo.Column>(9);
        _columnsTipoPasajeModel.put("PKI", new TableInfo.Column("PKI", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTipoPasajeModel.put("PASAJE", new TableInfo.Column("PASAJE", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTipoPasajeModel.put("PKLINEA", new TableInfo.Column("PKLINEA", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTipoPasajeModel.put("PORCENTAJE", new TableInfo.Column("PORCENTAJE", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTipoPasajeModel.put("BORRADO", new TableInfo.Column("BORRADO", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTipoPasajeModel.put("ACTIVO", new TableInfo.Column("ACTIVO", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTipoPasajeModel.put("USUARIO_M", new TableInfo.Column("USUARIO_M", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTipoPasajeModel.put("PERMITIDOS", new TableInfo.Column("PERMITIDOS", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTipoPasajeModel.put("COLOR", new TableInfo.Column("COLOR", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTipoPasajeModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTipoPasajeModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTipoPasajeModel = new TableInfo("TipoPasajeModel", _columnsTipoPasajeModel, _foreignKeysTipoPasajeModel, _indicesTipoPasajeModel);
        final TableInfo _existingTipoPasajeModel = TableInfo.read(_db, "TipoPasajeModel");
        if (! _infoTipoPasajeModel.equals(_existingTipoPasajeModel)) {
          return new RoomOpenHelper.ValidationResult(false, "TipoPasajeModel(com.example.myapplication.models.TipoPasajeModel).\n"
                  + " Expected:\n" + _infoTipoPasajeModel + "\n"
                  + " Found:\n" + _existingTipoPasajeModel);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3e4ea249fd2c6c295bf036d618af1b22", "1ac173f529335323295adbd107174380");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "CorridasDiaModel","TipoPasajeModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `CorridasDiaModel`");
      _db.execSQL("DELETE FROM `TipoPasajeModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CorridasDiaModelDao CorridasDiaModelDao() {
    if (_corridasDiaModelDao != null) {
      return _corridasDiaModelDao;
    } else {
      synchronized(this) {
        if(_corridasDiaModelDao == null) {
          _corridasDiaModelDao = new CorridasDiaModelDao_Impl(this);
        }
        return _corridasDiaModelDao;
      }
    }
  }

  @Override
  public TipoPasajeModelDao TipoPasajeModelDao() {
    if (_tipoPasajeModelDao != null) {
      return _tipoPasajeModelDao;
    } else {
      synchronized(this) {
        if(_tipoPasajeModelDao == null) {
          _tipoPasajeModelDao = new TipoPasajeModelDao_Impl(this);
        }
        return _tipoPasajeModelDao;
      }
    }
  }
}
