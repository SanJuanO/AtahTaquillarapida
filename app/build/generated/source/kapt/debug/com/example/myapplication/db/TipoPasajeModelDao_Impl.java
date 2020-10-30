package com.example.myapplication.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.myapplication.models.TipoPasajeModel;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TipoPasajeModelDao_Impl implements TipoPasajeModelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TipoPasajeModel> __insertionAdapterOfTipoPasajeModel;

  private final EntityDeletionOrUpdateAdapter<TipoPasajeModel> __deletionAdapterOfTipoPasajeModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTipoPasajeModel;

  public TipoPasajeModelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTipoPasajeModel = new EntityInsertionAdapter<TipoPasajeModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TipoPasajeModel` (`PKI`,`PASAJE`,`PKLINEA`,`PORCENTAJE`,`BORRADO`,`ACTIVO`,`USUARIO_M`,`PERMITIDOS`,`COLOR`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TipoPasajeModel value) {
        stmt.bindLong(1, value.getPKI());
        if (value.getPASAJE() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPASAJE());
        }
        stmt.bindLong(3, value.getPKLINEA());
        stmt.bindDouble(4, value.getPORCENTAJE());
        final int _tmp;
        _tmp = value.getBORRADO() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final int _tmp_1;
        _tmp_1 = value.getACTIVO() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        if (value.getUSUARIO_M() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUSUARIO_M());
        }
        stmt.bindLong(8, value.getPERMITIDOS());
        if (value.getCOLOR() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCOLOR());
        }
      }
    };
    this.__deletionAdapterOfTipoPasajeModel = new EntityDeletionOrUpdateAdapter<TipoPasajeModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TipoPasajeModel` WHERE `PKI` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TipoPasajeModel value) {
        stmt.bindLong(1, value.getPKI());
      }
    };
    this.__preparedStmtOfDeleteAllTipoPasajeModel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TipoPasajeModel";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<TipoPasajeModel> tipoPasajeModelList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTipoPasajeModel.insert(tipoPasajeModelList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final TipoPasajeModel tipoPasajeModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTipoPasajeModel.handle(tipoPasajeModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllTipoPasajeModel() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTipoPasajeModel.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllTipoPasajeModel.release(_stmt);
    }
  }

  @Override
  public List<TipoPasajeModel> getAll() {
    final String _sql = "SELECT * FROM TipoPasajeModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPKI = CursorUtil.getColumnIndexOrThrow(_cursor, "PKI");
      final int _cursorIndexOfPASAJE = CursorUtil.getColumnIndexOrThrow(_cursor, "PASAJE");
      final int _cursorIndexOfPKLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "PKLINEA");
      final int _cursorIndexOfPORCENTAJE = CursorUtil.getColumnIndexOrThrow(_cursor, "PORCENTAJE");
      final int _cursorIndexOfBORRADO = CursorUtil.getColumnIndexOrThrow(_cursor, "BORRADO");
      final int _cursorIndexOfACTIVO = CursorUtil.getColumnIndexOrThrow(_cursor, "ACTIVO");
      final int _cursorIndexOfUSUARIOM = CursorUtil.getColumnIndexOrThrow(_cursor, "USUARIO_M");
      final int _cursorIndexOfPERMITIDOS = CursorUtil.getColumnIndexOrThrow(_cursor, "PERMITIDOS");
      final int _cursorIndexOfCOLOR = CursorUtil.getColumnIndexOrThrow(_cursor, "COLOR");
      final List<TipoPasajeModel> _result = new ArrayList<TipoPasajeModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TipoPasajeModel _item;
        _item = new TipoPasajeModel();
        final int _tmpPKI;
        _tmpPKI = _cursor.getInt(_cursorIndexOfPKI);
        _item.setPKI(_tmpPKI);
        final String _tmpPASAJE;
        _tmpPASAJE = _cursor.getString(_cursorIndexOfPASAJE);
        _item.setPASAJE(_tmpPASAJE);
        final int _tmpPKLINEA;
        _tmpPKLINEA = _cursor.getInt(_cursorIndexOfPKLINEA);
        _item.setPKLINEA(_tmpPKLINEA);
        final double _tmpPORCENTAJE;
        _tmpPORCENTAJE = _cursor.getDouble(_cursorIndexOfPORCENTAJE);
        _item.setPORCENTAJE(_tmpPORCENTAJE);
        final boolean _tmpBORRADO;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfBORRADO);
        _tmpBORRADO = _tmp != 0;
        _item.setBORRADO(_tmpBORRADO);
        final boolean _tmpACTIVO;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfACTIVO);
        _tmpACTIVO = _tmp_1 != 0;
        _item.setACTIVO(_tmpACTIVO);
        final String _tmpUSUARIO_M;
        _tmpUSUARIO_M = _cursor.getString(_cursorIndexOfUSUARIOM);
        _item.setUSUARIO_M(_tmpUSUARIO_M);
        final int _tmpPERMITIDOS;
        _tmpPERMITIDOS = _cursor.getInt(_cursorIndexOfPERMITIDOS);
        _item.setPERMITIDOS(_tmpPERMITIDOS);
        final String _tmpCOLOR;
        _tmpCOLOR = _cursor.getString(_cursorIndexOfCOLOR);
        _item.setCOLOR(_tmpCOLOR);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TipoPasajeModel> loadAllByIds(final int[] Pks) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT ");
    _stringBuilder.append("*");
    _stringBuilder.append(" FROM TipoPasajeModel WHERE PKI IN (");
    final int _inputSize = Pks.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int _item : Pks) {
      _statement.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPKI = CursorUtil.getColumnIndexOrThrow(_cursor, "PKI");
      final int _cursorIndexOfPASAJE = CursorUtil.getColumnIndexOrThrow(_cursor, "PASAJE");
      final int _cursorIndexOfPKLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "PKLINEA");
      final int _cursorIndexOfPORCENTAJE = CursorUtil.getColumnIndexOrThrow(_cursor, "PORCENTAJE");
      final int _cursorIndexOfBORRADO = CursorUtil.getColumnIndexOrThrow(_cursor, "BORRADO");
      final int _cursorIndexOfACTIVO = CursorUtil.getColumnIndexOrThrow(_cursor, "ACTIVO");
      final int _cursorIndexOfUSUARIOM = CursorUtil.getColumnIndexOrThrow(_cursor, "USUARIO_M");
      final int _cursorIndexOfPERMITIDOS = CursorUtil.getColumnIndexOrThrow(_cursor, "PERMITIDOS");
      final int _cursorIndexOfCOLOR = CursorUtil.getColumnIndexOrThrow(_cursor, "COLOR");
      final List<TipoPasajeModel> _result = new ArrayList<TipoPasajeModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TipoPasajeModel _item_1;
        _item_1 = new TipoPasajeModel();
        final int _tmpPKI;
        _tmpPKI = _cursor.getInt(_cursorIndexOfPKI);
        _item_1.setPKI(_tmpPKI);
        final String _tmpPASAJE;
        _tmpPASAJE = _cursor.getString(_cursorIndexOfPASAJE);
        _item_1.setPASAJE(_tmpPASAJE);
        final int _tmpPKLINEA;
        _tmpPKLINEA = _cursor.getInt(_cursorIndexOfPKLINEA);
        _item_1.setPKLINEA(_tmpPKLINEA);
        final double _tmpPORCENTAJE;
        _tmpPORCENTAJE = _cursor.getDouble(_cursorIndexOfPORCENTAJE);
        _item_1.setPORCENTAJE(_tmpPORCENTAJE);
        final boolean _tmpBORRADO;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfBORRADO);
        _tmpBORRADO = _tmp != 0;
        _item_1.setBORRADO(_tmpBORRADO);
        final boolean _tmpACTIVO;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfACTIVO);
        _tmpACTIVO = _tmp_1 != 0;
        _item_1.setACTIVO(_tmpACTIVO);
        final String _tmpUSUARIO_M;
        _tmpUSUARIO_M = _cursor.getString(_cursorIndexOfUSUARIOM);
        _item_1.setUSUARIO_M(_tmpUSUARIO_M);
        final int _tmpPERMITIDOS;
        _tmpPERMITIDOS = _cursor.getInt(_cursorIndexOfPERMITIDOS);
        _item_1.setPERMITIDOS(_tmpPERMITIDOS);
        final String _tmpCOLOR;
        _tmpCOLOR = _cursor.getString(_cursorIndexOfCOLOR);
        _item_1.setCOLOR(_tmpCOLOR);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TipoPasajeModel> loadAllByPkLinea(final int pklinea) {
    final String _sql = "SELECT * FROM TipoPasajeModel WHERE PKLINEA = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pklinea);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPKI = CursorUtil.getColumnIndexOrThrow(_cursor, "PKI");
      final int _cursorIndexOfPASAJE = CursorUtil.getColumnIndexOrThrow(_cursor, "PASAJE");
      final int _cursorIndexOfPKLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "PKLINEA");
      final int _cursorIndexOfPORCENTAJE = CursorUtil.getColumnIndexOrThrow(_cursor, "PORCENTAJE");
      final int _cursorIndexOfBORRADO = CursorUtil.getColumnIndexOrThrow(_cursor, "BORRADO");
      final int _cursorIndexOfACTIVO = CursorUtil.getColumnIndexOrThrow(_cursor, "ACTIVO");
      final int _cursorIndexOfUSUARIOM = CursorUtil.getColumnIndexOrThrow(_cursor, "USUARIO_M");
      final int _cursorIndexOfPERMITIDOS = CursorUtil.getColumnIndexOrThrow(_cursor, "PERMITIDOS");
      final int _cursorIndexOfCOLOR = CursorUtil.getColumnIndexOrThrow(_cursor, "COLOR");
      final List<TipoPasajeModel> _result = new ArrayList<TipoPasajeModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TipoPasajeModel _item;
        _item = new TipoPasajeModel();
        final int _tmpPKI;
        _tmpPKI = _cursor.getInt(_cursorIndexOfPKI);
        _item.setPKI(_tmpPKI);
        final String _tmpPASAJE;
        _tmpPASAJE = _cursor.getString(_cursorIndexOfPASAJE);
        _item.setPASAJE(_tmpPASAJE);
        final int _tmpPKLINEA;
        _tmpPKLINEA = _cursor.getInt(_cursorIndexOfPKLINEA);
        _item.setPKLINEA(_tmpPKLINEA);
        final double _tmpPORCENTAJE;
        _tmpPORCENTAJE = _cursor.getDouble(_cursorIndexOfPORCENTAJE);
        _item.setPORCENTAJE(_tmpPORCENTAJE);
        final boolean _tmpBORRADO;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfBORRADO);
        _tmpBORRADO = _tmp != 0;
        _item.setBORRADO(_tmpBORRADO);
        final boolean _tmpACTIVO;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfACTIVO);
        _tmpACTIVO = _tmp_1 != 0;
        _item.setACTIVO(_tmpACTIVO);
        final String _tmpUSUARIO_M;
        _tmpUSUARIO_M = _cursor.getString(_cursorIndexOfUSUARIOM);
        _item.setUSUARIO_M(_tmpUSUARIO_M);
        final int _tmpPERMITIDOS;
        _tmpPERMITIDOS = _cursor.getInt(_cursorIndexOfPERMITIDOS);
        _item.setPERMITIDOS(_tmpPERMITIDOS);
        final String _tmpCOLOR;
        _tmpCOLOR = _cursor.getString(_cursorIndexOfCOLOR);
        _item.setCOLOR(_tmpCOLOR);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
