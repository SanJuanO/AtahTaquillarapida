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
import com.example.myapplication.CorridasDiaModel;
import com.example.myapplication.models.DestinosModel;
import com.example.myapplication.models.HorariosModel;
import com.example.myapplication.models.LineasModel;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CorridasDiaModelDao_Impl implements CorridasDiaModelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CorridasDiaModel> __insertionAdapterOfCorridasDiaModel;

  private final EntityDeletionOrUpdateAdapter<CorridasDiaModel> __deletionAdapterOfCorridasDiaModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCorridas;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCorridaGuiaGenerada;

  public CorridasDiaModelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCorridasDiaModel = new EntityInsertionAdapter<CorridasDiaModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CorridasDiaModel` (`PK`,`PK_LINEA`,`LINEA`,`PK_ROL`,`PK_CORRIDA`,`CORRIDA`,`NO_CORRIDA`,`CORRIDA_DESCRIPCION`,`PK_AUTOBUS`,`AUTOBUS`,`TIPO_PK`,`PK_ORIGEN`,`ORIGEN`,`SALIDA`,`PK_DESTINO`,`DESTINO`,`LLEGADA`,`ESCALA`,`FECHA`,`PK_RUTA`,`RUTA`,`PK_CORRIDA_RUTA`,`BLOQUEADO`,`GUIA`,`COMPLETO`,`PK_ORIGEN_COMPLETO`,`ORIGEN_COMPLETO`,`SALIDA_COMPLETO`,`SALIDA_C`,`PK_DESTINO_COMPLETO`,`DESTINO_COMPLETO`,`LLEGADA_COMPLETO`,`LLEGADA_C`,`FECHA_C`,`FECHA_M`,`USUARIO`,`PK_CHOFER`,`NOMBRE`,`APELLIDOS`,`PISOS`,`TIEMPO`,`PRECIO`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CorridasDiaModel value) {
        stmt.bindLong(1, value.getPK());
        stmt.bindLong(2, value.getPK_LINEA());
        if (value.getLINEA() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLINEA());
        }
        stmt.bindLong(4, value.getPK_ROL());
        if (value.getROL() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getROL());
        }
        stmt.bindLong(6, value.getPK_CORRIDA());
        stmt.bindLong(7, value.getNO_CORRIDA());
        if (value.getCORRIDA_DESCRIPCION() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCORRIDA_DESCRIPCION());
        }
        stmt.bindLong(9, value.getPK_AUTOBUS());
        if (value.getAUTOBUS() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAUTOBUS());
        }
        stmt.bindLong(11, value.getTIPO_PK());
        stmt.bindLong(12, value.getPK_ORIGEN());
        if (value.getORIGEN() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getORIGEN());
        }
        if (value.getSALIDA() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getSALIDA());
        }
        stmt.bindLong(15, value.getPK_DESTINO());
        if (value.getDESTINO() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getDESTINO());
        }
        if (value.getLLEGADA() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getLLEGADA());
        }
        if (value.getESCALA() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getESCALA());
        }
        if (value.getFECHA() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getFECHA());
        }
        stmt.bindLong(20, value.getPK_RUTA());
        if (value.getRUTA() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getRUTA());
        }
        stmt.bindLong(22, value.getPK_CORRIDA_RUTA());
        if (value.getBLOQUEADO() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getBLOQUEADO());
        }
        if (value.getGUIA() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getGUIA());
        }
        if (value.getCOMPLETO() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getCOMPLETO());
        }
        stmt.bindLong(26, value.getPK_ORIGEN_COMPLETO());
        if (value.getORIGEN_COMPLETO() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getORIGEN_COMPLETO());
        }
        if (value.getSALIDA_COMPLETO() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getSALIDA_COMPLETO());
        }
        if (value.getSALIDA_C() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getSALIDA_C());
        }
        stmt.bindLong(30, value.getPK_DESTINO_COMPLETO());
        if (value.getDESTINO_COMPLETO() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getDESTINO_COMPLETO());
        }
        if (value.getLLEGADA_COMPLETO() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getLLEGADA_COMPLETO());
        }
        if (value.getLLEGADA_C() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getLLEGADA_C());
        }
        if (value.getFECHA_C() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getFECHA_C());
        }
        if (value.getFECHA_M() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getFECHA_M());
        }
        if (value.getUSUARIO() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getUSUARIO());
        }
        stmt.bindLong(37, value.getPK_CHOFER());
        if (value.getNOMBRE() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getNOMBRE());
        }
        if (value.getAPELLIDOS() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getAPELLIDOS());
        }
        if (value.getPISOS() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getPISOS());
        }
        if (value.getTIEMPO() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getTIEMPO());
        }
        stmt.bindDouble(42, value.getPRECIO());
      }
    };
    this.__deletionAdapterOfCorridasDiaModel = new EntityDeletionOrUpdateAdapter<CorridasDiaModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CorridasDiaModel` WHERE `PK` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CorridasDiaModel value) {
        stmt.bindLong(1, value.getPK());
      }
    };
    this.__preparedStmtOfDeleteAllCorridas = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM CorridasDiaModel";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCorridaGuiaGenerada = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE CorridasDiaModel SET GUIA='True' WHERE PK=?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<CorridasDiaModel> corridasModelList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCorridasDiaModel.insert(corridasModelList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CorridasDiaModel corridasModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCorridasDiaModel.handle(corridasModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllCorridas() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCorridas.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllCorridas.release(_stmt);
    }
  }

  @Override
  public void updateCorridaGuiaGenerada(final int pk) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCorridaGuiaGenerada.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, pk);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateCorridaGuiaGenerada.release(_stmt);
    }
  }

  @Override
  public List<CorridasDiaModel> getAll() {
    final String _sql = "SELECT * FROM CorridasDiaModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPK = CursorUtil.getColumnIndexOrThrow(_cursor, "PK");
      final int _cursorIndexOfPKLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_LINEA");
      final int _cursorIndexOfLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "LINEA");
      final int _cursorIndexOfPKROL = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ROL");
      final int _cursorIndexOfROL = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CORRIDA");
      final int _cursorIndexOfPKCORRIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "CORRIDA");
      final int _cursorIndexOfNOCORRIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "NO_CORRIDA");
      final int _cursorIndexOfCORRIDADESCRIPCION = CursorUtil.getColumnIndexOrThrow(_cursor, "CORRIDA_DESCRIPCION");
      final int _cursorIndexOfPKAUTOBUS = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_AUTOBUS");
      final int _cursorIndexOfAUTOBUS = CursorUtil.getColumnIndexOrThrow(_cursor, "AUTOBUS");
      final int _cursorIndexOfTIPOPK = CursorUtil.getColumnIndexOrThrow(_cursor, "TIPO_PK");
      final int _cursorIndexOfPKORIGEN = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ORIGEN");
      final int _cursorIndexOfORIGEN = CursorUtil.getColumnIndexOrThrow(_cursor, "ORIGEN");
      final int _cursorIndexOfSALIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA");
      final int _cursorIndexOfPKDESTINO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_DESTINO");
      final int _cursorIndexOfDESTINO = CursorUtil.getColumnIndexOrThrow(_cursor, "DESTINO");
      final int _cursorIndexOfLLEGADA = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA");
      final int _cursorIndexOfESCALA = CursorUtil.getColumnIndexOrThrow(_cursor, "ESCALA");
      final int _cursorIndexOfFECHA = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA");
      final int _cursorIndexOfPKRUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_RUTA");
      final int _cursorIndexOfRUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "RUTA");
      final int _cursorIndexOfPKCORRIDARUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CORRIDA_RUTA");
      final int _cursorIndexOfBLOQUEADO = CursorUtil.getColumnIndexOrThrow(_cursor, "BLOQUEADO");
      final int _cursorIndexOfGUIA = CursorUtil.getColumnIndexOrThrow(_cursor, "GUIA");
      final int _cursorIndexOfCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "COMPLETO");
      final int _cursorIndexOfPKORIGENCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ORIGEN_COMPLETO");
      final int _cursorIndexOfORIGENCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "ORIGEN_COMPLETO");
      final int _cursorIndexOfSALIDACOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA_COMPLETO");
      final int _cursorIndexOfSALIDAC = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA_C");
      final int _cursorIndexOfPKDESTINOCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_DESTINO_COMPLETO");
      final int _cursorIndexOfDESTINOCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "DESTINO_COMPLETO");
      final int _cursorIndexOfLLEGADACOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA_COMPLETO");
      final int _cursorIndexOfLLEGADAC = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA_C");
      final int _cursorIndexOfFECHAC = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA_C");
      final int _cursorIndexOfFECHAM = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA_M");
      final int _cursorIndexOfUSUARIO = CursorUtil.getColumnIndexOrThrow(_cursor, "USUARIO");
      final int _cursorIndexOfPKCHOFER = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CHOFER");
      final int _cursorIndexOfNOMBRE = CursorUtil.getColumnIndexOrThrow(_cursor, "NOMBRE");
      final int _cursorIndexOfAPELLIDOS = CursorUtil.getColumnIndexOrThrow(_cursor, "APELLIDOS");
      final int _cursorIndexOfPISOS = CursorUtil.getColumnIndexOrThrow(_cursor, "PISOS");
      final int _cursorIndexOfTIEMPO = CursorUtil.getColumnIndexOrThrow(_cursor, "TIEMPO");
      final int _cursorIndexOfPRECIO = CursorUtil.getColumnIndexOrThrow(_cursor, "PRECIO");
      final List<CorridasDiaModel> _result = new ArrayList<CorridasDiaModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CorridasDiaModel _item;
        _item = new CorridasDiaModel();
        final int _tmpPK;
        _tmpPK = _cursor.getInt(_cursorIndexOfPK);
        _item.setPK(_tmpPK);
        final int _tmpPK_LINEA;
        _tmpPK_LINEA = _cursor.getInt(_cursorIndexOfPKLINEA);
        _item.setPK_LINEA(_tmpPK_LINEA);
        final String _tmpLINEA;
        _tmpLINEA = _cursor.getString(_cursorIndexOfLINEA);
        _item.setLINEA(_tmpLINEA);
        final int _tmpPK_ROL;
        _tmpPK_ROL = _cursor.getInt(_cursorIndexOfPKROL);
        _item.setPK_ROL(_tmpPK_ROL);
        final String _tmpROL;
        _tmpROL = _cursor.getString(_cursorIndexOfROL);
        _item.setROL(_tmpROL);
        final int _tmpPK_CORRIDA;
        _tmpPK_CORRIDA = _cursor.getInt(_cursorIndexOfPKCORRIDA);
        _item.setPK_CORRIDA(_tmpPK_CORRIDA);
        final int _tmpNO_CORRIDA;
        _tmpNO_CORRIDA = _cursor.getInt(_cursorIndexOfNOCORRIDA);
        _item.setNO_CORRIDA(_tmpNO_CORRIDA);
        final String _tmpCORRIDA_DESCRIPCION;
        _tmpCORRIDA_DESCRIPCION = _cursor.getString(_cursorIndexOfCORRIDADESCRIPCION);
        _item.setCORRIDA_DESCRIPCION(_tmpCORRIDA_DESCRIPCION);
        final int _tmpPK_AUTOBUS;
        _tmpPK_AUTOBUS = _cursor.getInt(_cursorIndexOfPKAUTOBUS);
        _item.setPK_AUTOBUS(_tmpPK_AUTOBUS);
        final String _tmpAUTOBUS;
        _tmpAUTOBUS = _cursor.getString(_cursorIndexOfAUTOBUS);
        _item.setAUTOBUS(_tmpAUTOBUS);
        final int _tmpTIPO_PK;
        _tmpTIPO_PK = _cursor.getInt(_cursorIndexOfTIPOPK);
        _item.setTIPO_PK(_tmpTIPO_PK);
        final int _tmpPK_ORIGEN;
        _tmpPK_ORIGEN = _cursor.getInt(_cursorIndexOfPKORIGEN);
        _item.setPK_ORIGEN(_tmpPK_ORIGEN);
        final String _tmpORIGEN;
        _tmpORIGEN = _cursor.getString(_cursorIndexOfORIGEN);
        _item.setORIGEN(_tmpORIGEN);
        final String _tmpSALIDA;
        _tmpSALIDA = _cursor.getString(_cursorIndexOfSALIDA);
        _item.setSALIDA(_tmpSALIDA);
        final int _tmpPK_DESTINO;
        _tmpPK_DESTINO = _cursor.getInt(_cursorIndexOfPKDESTINO);
        _item.setPK_DESTINO(_tmpPK_DESTINO);
        final String _tmpDESTINO;
        _tmpDESTINO = _cursor.getString(_cursorIndexOfDESTINO);
        _item.setDESTINO(_tmpDESTINO);
        final String _tmpLLEGADA;
        _tmpLLEGADA = _cursor.getString(_cursorIndexOfLLEGADA);
        _item.setLLEGADA(_tmpLLEGADA);
        final String _tmpESCALA;
        _tmpESCALA = _cursor.getString(_cursorIndexOfESCALA);
        _item.setESCALA(_tmpESCALA);
        final String _tmpFECHA;
        _tmpFECHA = _cursor.getString(_cursorIndexOfFECHA);
        _item.setFECHA(_tmpFECHA);
        final int _tmpPK_RUTA;
        _tmpPK_RUTA = _cursor.getInt(_cursorIndexOfPKRUTA);
        _item.setPK_RUTA(_tmpPK_RUTA);
        final String _tmpRUTA;
        _tmpRUTA = _cursor.getString(_cursorIndexOfRUTA);
        _item.setRUTA(_tmpRUTA);
        final int _tmpPK_CORRIDA_RUTA;
        _tmpPK_CORRIDA_RUTA = _cursor.getInt(_cursorIndexOfPKCORRIDARUTA);
        _item.setPK_CORRIDA_RUTA(_tmpPK_CORRIDA_RUTA);
        final String _tmpBLOQUEADO;
        _tmpBLOQUEADO = _cursor.getString(_cursorIndexOfBLOQUEADO);
        _item.setBLOQUEADO(_tmpBLOQUEADO);
        final String _tmpGUIA;
        _tmpGUIA = _cursor.getString(_cursorIndexOfGUIA);
        _item.setGUIA(_tmpGUIA);
        final String _tmpCOMPLETO;
        _tmpCOMPLETO = _cursor.getString(_cursorIndexOfCOMPLETO);
        _item.setCOMPLETO(_tmpCOMPLETO);
        final int _tmpPK_ORIGEN_COMPLETO;
        _tmpPK_ORIGEN_COMPLETO = _cursor.getInt(_cursorIndexOfPKORIGENCOMPLETO);
        _item.setPK_ORIGEN_COMPLETO(_tmpPK_ORIGEN_COMPLETO);
        final String _tmpORIGEN_COMPLETO;
        _tmpORIGEN_COMPLETO = _cursor.getString(_cursorIndexOfORIGENCOMPLETO);
        _item.setORIGEN_COMPLETO(_tmpORIGEN_COMPLETO);
        final String _tmpSALIDA_COMPLETO;
        _tmpSALIDA_COMPLETO = _cursor.getString(_cursorIndexOfSALIDACOMPLETO);
        _item.setSALIDA_COMPLETO(_tmpSALIDA_COMPLETO);
        final String _tmpSALIDA_C;
        _tmpSALIDA_C = _cursor.getString(_cursorIndexOfSALIDAC);
        _item.setSALIDA_C(_tmpSALIDA_C);
        final int _tmpPK_DESTINO_COMPLETO;
        _tmpPK_DESTINO_COMPLETO = _cursor.getInt(_cursorIndexOfPKDESTINOCOMPLETO);
        _item.setPK_DESTINO_COMPLETO(_tmpPK_DESTINO_COMPLETO);
        final String _tmpDESTINO_COMPLETO;
        _tmpDESTINO_COMPLETO = _cursor.getString(_cursorIndexOfDESTINOCOMPLETO);
        _item.setDESTINO_COMPLETO(_tmpDESTINO_COMPLETO);
        final String _tmpLLEGADA_COMPLETO;
        _tmpLLEGADA_COMPLETO = _cursor.getString(_cursorIndexOfLLEGADACOMPLETO);
        _item.setLLEGADA_COMPLETO(_tmpLLEGADA_COMPLETO);
        final String _tmpLLEGADA_C;
        _tmpLLEGADA_C = _cursor.getString(_cursorIndexOfLLEGADAC);
        _item.setLLEGADA_C(_tmpLLEGADA_C);
        final String _tmpFECHA_C;
        _tmpFECHA_C = _cursor.getString(_cursorIndexOfFECHAC);
        _item.setFECHA_C(_tmpFECHA_C);
        final String _tmpFECHA_M;
        _tmpFECHA_M = _cursor.getString(_cursorIndexOfFECHAM);
        _item.setFECHA_M(_tmpFECHA_M);
        final String _tmpUSUARIO;
        _tmpUSUARIO = _cursor.getString(_cursorIndexOfUSUARIO);
        _item.setUSUARIO(_tmpUSUARIO);
        final int _tmpPK_CHOFER;
        _tmpPK_CHOFER = _cursor.getInt(_cursorIndexOfPKCHOFER);
        _item.setPK_CHOFER(_tmpPK_CHOFER);
        final String _tmpNOMBRE;
        _tmpNOMBRE = _cursor.getString(_cursorIndexOfNOMBRE);
        _item.setNOMBRE(_tmpNOMBRE);
        final String _tmpAPELLIDOS;
        _tmpAPELLIDOS = _cursor.getString(_cursorIndexOfAPELLIDOS);
        _item.setAPELLIDOS(_tmpAPELLIDOS);
        final String _tmpPISOS;
        _tmpPISOS = _cursor.getString(_cursorIndexOfPISOS);
        _item.setPISOS(_tmpPISOS);
        final String _tmpTIEMPO;
        _tmpTIEMPO = _cursor.getString(_cursorIndexOfTIEMPO);
        _item.setTIEMPO(_tmpTIEMPO);
        final double _tmpPRECIO;
        _tmpPRECIO = _cursor.getDouble(_cursorIndexOfPRECIO);
        _item.setPRECIO(_tmpPRECIO);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CorridasDiaModel> loadAllByIds(final int[] Pks) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT ");
    _stringBuilder.append("*");
    _stringBuilder.append(" FROM CorridasDiaModel WHERE PK IN (");
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
      final int _cursorIndexOfPK = CursorUtil.getColumnIndexOrThrow(_cursor, "PK");
      final int _cursorIndexOfPKLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_LINEA");
      final int _cursorIndexOfLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "LINEA");
      final int _cursorIndexOfPKROL = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ROL");
      final int _cursorIndexOfROL = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CORRIDA");
      final int _cursorIndexOfPKCORRIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "CORRIDA");
      final int _cursorIndexOfNOCORRIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "NO_CORRIDA");
      final int _cursorIndexOfCORRIDADESCRIPCION = CursorUtil.getColumnIndexOrThrow(_cursor, "CORRIDA_DESCRIPCION");
      final int _cursorIndexOfPKAUTOBUS = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_AUTOBUS");
      final int _cursorIndexOfAUTOBUS = CursorUtil.getColumnIndexOrThrow(_cursor, "AUTOBUS");
      final int _cursorIndexOfTIPOPK = CursorUtil.getColumnIndexOrThrow(_cursor, "TIPO_PK");
      final int _cursorIndexOfPKORIGEN = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ORIGEN");
      final int _cursorIndexOfORIGEN = CursorUtil.getColumnIndexOrThrow(_cursor, "ORIGEN");
      final int _cursorIndexOfSALIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA");
      final int _cursorIndexOfPKDESTINO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_DESTINO");
      final int _cursorIndexOfDESTINO = CursorUtil.getColumnIndexOrThrow(_cursor, "DESTINO");
      final int _cursorIndexOfLLEGADA = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA");
      final int _cursorIndexOfESCALA = CursorUtil.getColumnIndexOrThrow(_cursor, "ESCALA");
      final int _cursorIndexOfFECHA = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA");
      final int _cursorIndexOfPKRUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_RUTA");
      final int _cursorIndexOfRUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "RUTA");
      final int _cursorIndexOfPKCORRIDARUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CORRIDA_RUTA");
      final int _cursorIndexOfBLOQUEADO = CursorUtil.getColumnIndexOrThrow(_cursor, "BLOQUEADO");
      final int _cursorIndexOfGUIA = CursorUtil.getColumnIndexOrThrow(_cursor, "GUIA");
      final int _cursorIndexOfCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "COMPLETO");
      final int _cursorIndexOfPKORIGENCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ORIGEN_COMPLETO");
      final int _cursorIndexOfORIGENCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "ORIGEN_COMPLETO");
      final int _cursorIndexOfSALIDACOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA_COMPLETO");
      final int _cursorIndexOfSALIDAC = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA_C");
      final int _cursorIndexOfPKDESTINOCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_DESTINO_COMPLETO");
      final int _cursorIndexOfDESTINOCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "DESTINO_COMPLETO");
      final int _cursorIndexOfLLEGADACOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA_COMPLETO");
      final int _cursorIndexOfLLEGADAC = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA_C");
      final int _cursorIndexOfFECHAC = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA_C");
      final int _cursorIndexOfFECHAM = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA_M");
      final int _cursorIndexOfUSUARIO = CursorUtil.getColumnIndexOrThrow(_cursor, "USUARIO");
      final int _cursorIndexOfPKCHOFER = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CHOFER");
      final int _cursorIndexOfNOMBRE = CursorUtil.getColumnIndexOrThrow(_cursor, "NOMBRE");
      final int _cursorIndexOfAPELLIDOS = CursorUtil.getColumnIndexOrThrow(_cursor, "APELLIDOS");
      final int _cursorIndexOfPISOS = CursorUtil.getColumnIndexOrThrow(_cursor, "PISOS");
      final int _cursorIndexOfTIEMPO = CursorUtil.getColumnIndexOrThrow(_cursor, "TIEMPO");
      final int _cursorIndexOfPRECIO = CursorUtil.getColumnIndexOrThrow(_cursor, "PRECIO");
      final List<CorridasDiaModel> _result = new ArrayList<CorridasDiaModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CorridasDiaModel _item_1;
        _item_1 = new CorridasDiaModel();
        final int _tmpPK;
        _tmpPK = _cursor.getInt(_cursorIndexOfPK);
        _item_1.setPK(_tmpPK);
        final int _tmpPK_LINEA;
        _tmpPK_LINEA = _cursor.getInt(_cursorIndexOfPKLINEA);
        _item_1.setPK_LINEA(_tmpPK_LINEA);
        final String _tmpLINEA;
        _tmpLINEA = _cursor.getString(_cursorIndexOfLINEA);
        _item_1.setLINEA(_tmpLINEA);
        final int _tmpPK_ROL;
        _tmpPK_ROL = _cursor.getInt(_cursorIndexOfPKROL);
        _item_1.setPK_ROL(_tmpPK_ROL);
        final String _tmpROL;
        _tmpROL = _cursor.getString(_cursorIndexOfROL);
        _item_1.setROL(_tmpROL);
        final int _tmpPK_CORRIDA;
        _tmpPK_CORRIDA = _cursor.getInt(_cursorIndexOfPKCORRIDA);
        _item_1.setPK_CORRIDA(_tmpPK_CORRIDA);
        final int _tmpNO_CORRIDA;
        _tmpNO_CORRIDA = _cursor.getInt(_cursorIndexOfNOCORRIDA);
        _item_1.setNO_CORRIDA(_tmpNO_CORRIDA);
        final String _tmpCORRIDA_DESCRIPCION;
        _tmpCORRIDA_DESCRIPCION = _cursor.getString(_cursorIndexOfCORRIDADESCRIPCION);
        _item_1.setCORRIDA_DESCRIPCION(_tmpCORRIDA_DESCRIPCION);
        final int _tmpPK_AUTOBUS;
        _tmpPK_AUTOBUS = _cursor.getInt(_cursorIndexOfPKAUTOBUS);
        _item_1.setPK_AUTOBUS(_tmpPK_AUTOBUS);
        final String _tmpAUTOBUS;
        _tmpAUTOBUS = _cursor.getString(_cursorIndexOfAUTOBUS);
        _item_1.setAUTOBUS(_tmpAUTOBUS);
        final int _tmpTIPO_PK;
        _tmpTIPO_PK = _cursor.getInt(_cursorIndexOfTIPOPK);
        _item_1.setTIPO_PK(_tmpTIPO_PK);
        final int _tmpPK_ORIGEN;
        _tmpPK_ORIGEN = _cursor.getInt(_cursorIndexOfPKORIGEN);
        _item_1.setPK_ORIGEN(_tmpPK_ORIGEN);
        final String _tmpORIGEN;
        _tmpORIGEN = _cursor.getString(_cursorIndexOfORIGEN);
        _item_1.setORIGEN(_tmpORIGEN);
        final String _tmpSALIDA;
        _tmpSALIDA = _cursor.getString(_cursorIndexOfSALIDA);
        _item_1.setSALIDA(_tmpSALIDA);
        final int _tmpPK_DESTINO;
        _tmpPK_DESTINO = _cursor.getInt(_cursorIndexOfPKDESTINO);
        _item_1.setPK_DESTINO(_tmpPK_DESTINO);
        final String _tmpDESTINO;
        _tmpDESTINO = _cursor.getString(_cursorIndexOfDESTINO);
        _item_1.setDESTINO(_tmpDESTINO);
        final String _tmpLLEGADA;
        _tmpLLEGADA = _cursor.getString(_cursorIndexOfLLEGADA);
        _item_1.setLLEGADA(_tmpLLEGADA);
        final String _tmpESCALA;
        _tmpESCALA = _cursor.getString(_cursorIndexOfESCALA);
        _item_1.setESCALA(_tmpESCALA);
        final String _tmpFECHA;
        _tmpFECHA = _cursor.getString(_cursorIndexOfFECHA);
        _item_1.setFECHA(_tmpFECHA);
        final int _tmpPK_RUTA;
        _tmpPK_RUTA = _cursor.getInt(_cursorIndexOfPKRUTA);
        _item_1.setPK_RUTA(_tmpPK_RUTA);
        final String _tmpRUTA;
        _tmpRUTA = _cursor.getString(_cursorIndexOfRUTA);
        _item_1.setRUTA(_tmpRUTA);
        final int _tmpPK_CORRIDA_RUTA;
        _tmpPK_CORRIDA_RUTA = _cursor.getInt(_cursorIndexOfPKCORRIDARUTA);
        _item_1.setPK_CORRIDA_RUTA(_tmpPK_CORRIDA_RUTA);
        final String _tmpBLOQUEADO;
        _tmpBLOQUEADO = _cursor.getString(_cursorIndexOfBLOQUEADO);
        _item_1.setBLOQUEADO(_tmpBLOQUEADO);
        final String _tmpGUIA;
        _tmpGUIA = _cursor.getString(_cursorIndexOfGUIA);
        _item_1.setGUIA(_tmpGUIA);
        final String _tmpCOMPLETO;
        _tmpCOMPLETO = _cursor.getString(_cursorIndexOfCOMPLETO);
        _item_1.setCOMPLETO(_tmpCOMPLETO);
        final int _tmpPK_ORIGEN_COMPLETO;
        _tmpPK_ORIGEN_COMPLETO = _cursor.getInt(_cursorIndexOfPKORIGENCOMPLETO);
        _item_1.setPK_ORIGEN_COMPLETO(_tmpPK_ORIGEN_COMPLETO);
        final String _tmpORIGEN_COMPLETO;
        _tmpORIGEN_COMPLETO = _cursor.getString(_cursorIndexOfORIGENCOMPLETO);
        _item_1.setORIGEN_COMPLETO(_tmpORIGEN_COMPLETO);
        final String _tmpSALIDA_COMPLETO;
        _tmpSALIDA_COMPLETO = _cursor.getString(_cursorIndexOfSALIDACOMPLETO);
        _item_1.setSALIDA_COMPLETO(_tmpSALIDA_COMPLETO);
        final String _tmpSALIDA_C;
        _tmpSALIDA_C = _cursor.getString(_cursorIndexOfSALIDAC);
        _item_1.setSALIDA_C(_tmpSALIDA_C);
        final int _tmpPK_DESTINO_COMPLETO;
        _tmpPK_DESTINO_COMPLETO = _cursor.getInt(_cursorIndexOfPKDESTINOCOMPLETO);
        _item_1.setPK_DESTINO_COMPLETO(_tmpPK_DESTINO_COMPLETO);
        final String _tmpDESTINO_COMPLETO;
        _tmpDESTINO_COMPLETO = _cursor.getString(_cursorIndexOfDESTINOCOMPLETO);
        _item_1.setDESTINO_COMPLETO(_tmpDESTINO_COMPLETO);
        final String _tmpLLEGADA_COMPLETO;
        _tmpLLEGADA_COMPLETO = _cursor.getString(_cursorIndexOfLLEGADACOMPLETO);
        _item_1.setLLEGADA_COMPLETO(_tmpLLEGADA_COMPLETO);
        final String _tmpLLEGADA_C;
        _tmpLLEGADA_C = _cursor.getString(_cursorIndexOfLLEGADAC);
        _item_1.setLLEGADA_C(_tmpLLEGADA_C);
        final String _tmpFECHA_C;
        _tmpFECHA_C = _cursor.getString(_cursorIndexOfFECHAC);
        _item_1.setFECHA_C(_tmpFECHA_C);
        final String _tmpFECHA_M;
        _tmpFECHA_M = _cursor.getString(_cursorIndexOfFECHAM);
        _item_1.setFECHA_M(_tmpFECHA_M);
        final String _tmpUSUARIO;
        _tmpUSUARIO = _cursor.getString(_cursorIndexOfUSUARIO);
        _item_1.setUSUARIO(_tmpUSUARIO);
        final int _tmpPK_CHOFER;
        _tmpPK_CHOFER = _cursor.getInt(_cursorIndexOfPKCHOFER);
        _item_1.setPK_CHOFER(_tmpPK_CHOFER);
        final String _tmpNOMBRE;
        _tmpNOMBRE = _cursor.getString(_cursorIndexOfNOMBRE);
        _item_1.setNOMBRE(_tmpNOMBRE);
        final String _tmpAPELLIDOS;
        _tmpAPELLIDOS = _cursor.getString(_cursorIndexOfAPELLIDOS);
        _item_1.setAPELLIDOS(_tmpAPELLIDOS);
        final String _tmpPISOS;
        _tmpPISOS = _cursor.getString(_cursorIndexOfPISOS);
        _item_1.setPISOS(_tmpPISOS);
        final String _tmpTIEMPO;
        _tmpTIEMPO = _cursor.getString(_cursorIndexOfTIEMPO);
        _item_1.setTIEMPO(_tmpTIEMPO);
        final double _tmpPRECIO;
        _tmpPRECIO = _cursor.getDouble(_cursorIndexOfPRECIO);
        _item_1.setPRECIO(_tmpPRECIO);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countCorridas() {
    final String _sql = "select Count(PK) FROM CorridasDiaModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<LineasModel> getLineas() {
    final String _sql = "SELECT PK_LINEA,LINEA FROM CorridasDiaModel GROUP BY PK_LINEA,LINEA";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPKLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_LINEA");
      final int _cursorIndexOfLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "LINEA");
      final List<LineasModel> _result = new ArrayList<LineasModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LineasModel _item;
        _item = new LineasModel();
        final int _tmpPK_LINEA;
        _tmpPK_LINEA = _cursor.getInt(_cursorIndexOfPKLINEA);
        _item.setPK_LINEA(_tmpPK_LINEA);
        final String _tmpLINEA;
        _tmpLINEA = _cursor.getString(_cursorIndexOfLINEA);
        _item.setLINEA(_tmpLINEA);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DestinosModel> getDestinos(final int pk_origen, final int pk_linea) {
    final String _sql = "SELECT PK_DESTINO,DESTINO,PRECIO FROM CorridasDiaModel WHERE PK_ORIGEN=? and PK_LINEA =?  GROUP BY PK_DESTINO,DESTINO,PRECIO";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pk_origen);
    _argIndex = 2;
    _statement.bindLong(_argIndex, pk_linea);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPKDESTINO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_DESTINO");
      final int _cursorIndexOfDESTINO = CursorUtil.getColumnIndexOrThrow(_cursor, "DESTINO");
      final int _cursorIndexOfPRECIO = CursorUtil.getColumnIndexOrThrow(_cursor, "PRECIO");
      final List<DestinosModel> _result = new ArrayList<DestinosModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DestinosModel _item;
        _item = new DestinosModel();
        final int _tmpPK_DESTINO;
        _tmpPK_DESTINO = _cursor.getInt(_cursorIndexOfPKDESTINO);
        _item.setPK_DESTINO(_tmpPK_DESTINO);
        final String _tmpDESTINO;
        _tmpDESTINO = _cursor.getString(_cursorIndexOfDESTINO);
        _item.setDESTINO(_tmpDESTINO);
        final double _tmpPRECIO;
        _tmpPRECIO = _cursor.getDouble(_cursorIndexOfPRECIO);
        _item.setPRECIO(_tmpPRECIO);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HorariosModel> getHorarios(final int pk_linea, final int pk_origen,
      final int pk_destino) {
    final String _sql = "SELECT SALIDA,PRECIO FROM CorridasDiaModel WHERE PK_LINEA =? and PK_ORIGEN=? and PK_DESTINO=?  GROUP BY SALIDA,PRECIO";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pk_linea);
    _argIndex = 2;
    _statement.bindLong(_argIndex, pk_origen);
    _argIndex = 3;
    _statement.bindLong(_argIndex, pk_destino);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSALIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA");
      final int _cursorIndexOfPRECIO = CursorUtil.getColumnIndexOrThrow(_cursor, "PRECIO");
      final List<HorariosModel> _result = new ArrayList<HorariosModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HorariosModel _item;
        _item = new HorariosModel();
        final String _tmpSALIDA;
        _tmpSALIDA = _cursor.getString(_cursorIndexOfSALIDA);
        _item.setSALIDA(_tmpSALIDA);
        final double _tmpPRECIO;
        _tmpPRECIO = _cursor.getDouble(_cursorIndexOfPRECIO);
        _item.setPRECIO(_tmpPRECIO);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CorridasDiaModel> getCorridaFiltro(final String guia, final int pk_linea,
      final int pk_origen, final int pk_destino, final String salida) {
    final String _sql = "SELECT * FROM CorridasDiaModel WHERE GUIA=? AND PK_LINEA=? AND PK_ORIGEN=? AND PK_DESTINO=? and SALIDA=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
    int _argIndex = 1;
    if (guia == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, guia);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, pk_linea);
    _argIndex = 3;
    _statement.bindLong(_argIndex, pk_origen);
    _argIndex = 4;
    _statement.bindLong(_argIndex, pk_destino);
    _argIndex = 5;
    if (salida == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, salida);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPK = CursorUtil.getColumnIndexOrThrow(_cursor, "PK");
      final int _cursorIndexOfPKLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_LINEA");
      final int _cursorIndexOfLINEA = CursorUtil.getColumnIndexOrThrow(_cursor, "LINEA");
      final int _cursorIndexOfPKROL = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ROL");
      final int _cursorIndexOfROL = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CORRIDA");
      final int _cursorIndexOfPKCORRIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "CORRIDA");
      final int _cursorIndexOfNOCORRIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "NO_CORRIDA");
      final int _cursorIndexOfCORRIDADESCRIPCION = CursorUtil.getColumnIndexOrThrow(_cursor, "CORRIDA_DESCRIPCION");
      final int _cursorIndexOfPKAUTOBUS = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_AUTOBUS");
      final int _cursorIndexOfAUTOBUS = CursorUtil.getColumnIndexOrThrow(_cursor, "AUTOBUS");
      final int _cursorIndexOfTIPOPK = CursorUtil.getColumnIndexOrThrow(_cursor, "TIPO_PK");
      final int _cursorIndexOfPKORIGEN = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ORIGEN");
      final int _cursorIndexOfORIGEN = CursorUtil.getColumnIndexOrThrow(_cursor, "ORIGEN");
      final int _cursorIndexOfSALIDA = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA");
      final int _cursorIndexOfPKDESTINO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_DESTINO");
      final int _cursorIndexOfDESTINO = CursorUtil.getColumnIndexOrThrow(_cursor, "DESTINO");
      final int _cursorIndexOfLLEGADA = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA");
      final int _cursorIndexOfESCALA = CursorUtil.getColumnIndexOrThrow(_cursor, "ESCALA");
      final int _cursorIndexOfFECHA = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA");
      final int _cursorIndexOfPKRUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_RUTA");
      final int _cursorIndexOfRUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "RUTA");
      final int _cursorIndexOfPKCORRIDARUTA = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CORRIDA_RUTA");
      final int _cursorIndexOfBLOQUEADO = CursorUtil.getColumnIndexOrThrow(_cursor, "BLOQUEADO");
      final int _cursorIndexOfGUIA = CursorUtil.getColumnIndexOrThrow(_cursor, "GUIA");
      final int _cursorIndexOfCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "COMPLETO");
      final int _cursorIndexOfPKORIGENCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_ORIGEN_COMPLETO");
      final int _cursorIndexOfORIGENCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "ORIGEN_COMPLETO");
      final int _cursorIndexOfSALIDACOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA_COMPLETO");
      final int _cursorIndexOfSALIDAC = CursorUtil.getColumnIndexOrThrow(_cursor, "SALIDA_C");
      final int _cursorIndexOfPKDESTINOCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_DESTINO_COMPLETO");
      final int _cursorIndexOfDESTINOCOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "DESTINO_COMPLETO");
      final int _cursorIndexOfLLEGADACOMPLETO = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA_COMPLETO");
      final int _cursorIndexOfLLEGADAC = CursorUtil.getColumnIndexOrThrow(_cursor, "LLEGADA_C");
      final int _cursorIndexOfFECHAC = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA_C");
      final int _cursorIndexOfFECHAM = CursorUtil.getColumnIndexOrThrow(_cursor, "FECHA_M");
      final int _cursorIndexOfUSUARIO = CursorUtil.getColumnIndexOrThrow(_cursor, "USUARIO");
      final int _cursorIndexOfPKCHOFER = CursorUtil.getColumnIndexOrThrow(_cursor, "PK_CHOFER");
      final int _cursorIndexOfNOMBRE = CursorUtil.getColumnIndexOrThrow(_cursor, "NOMBRE");
      final int _cursorIndexOfAPELLIDOS = CursorUtil.getColumnIndexOrThrow(_cursor, "APELLIDOS");
      final int _cursorIndexOfPISOS = CursorUtil.getColumnIndexOrThrow(_cursor, "PISOS");
      final int _cursorIndexOfTIEMPO = CursorUtil.getColumnIndexOrThrow(_cursor, "TIEMPO");
      final int _cursorIndexOfPRECIO = CursorUtil.getColumnIndexOrThrow(_cursor, "PRECIO");
      final List<CorridasDiaModel> _result = new ArrayList<CorridasDiaModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CorridasDiaModel _item;
        _item = new CorridasDiaModel();
        final int _tmpPK;
        _tmpPK = _cursor.getInt(_cursorIndexOfPK);
        _item.setPK(_tmpPK);
        final int _tmpPK_LINEA;
        _tmpPK_LINEA = _cursor.getInt(_cursorIndexOfPKLINEA);
        _item.setPK_LINEA(_tmpPK_LINEA);
        final String _tmpLINEA;
        _tmpLINEA = _cursor.getString(_cursorIndexOfLINEA);
        _item.setLINEA(_tmpLINEA);
        final int _tmpPK_ROL;
        _tmpPK_ROL = _cursor.getInt(_cursorIndexOfPKROL);
        _item.setPK_ROL(_tmpPK_ROL);
        final String _tmpROL;
        _tmpROL = _cursor.getString(_cursorIndexOfROL);
        _item.setROL(_tmpROL);
        final int _tmpPK_CORRIDA;
        _tmpPK_CORRIDA = _cursor.getInt(_cursorIndexOfPKCORRIDA);
        _item.setPK_CORRIDA(_tmpPK_CORRIDA);
        final int _tmpNO_CORRIDA;
        _tmpNO_CORRIDA = _cursor.getInt(_cursorIndexOfNOCORRIDA);
        _item.setNO_CORRIDA(_tmpNO_CORRIDA);
        final String _tmpCORRIDA_DESCRIPCION;
        _tmpCORRIDA_DESCRIPCION = _cursor.getString(_cursorIndexOfCORRIDADESCRIPCION);
        _item.setCORRIDA_DESCRIPCION(_tmpCORRIDA_DESCRIPCION);
        final int _tmpPK_AUTOBUS;
        _tmpPK_AUTOBUS = _cursor.getInt(_cursorIndexOfPKAUTOBUS);
        _item.setPK_AUTOBUS(_tmpPK_AUTOBUS);
        final String _tmpAUTOBUS;
        _tmpAUTOBUS = _cursor.getString(_cursorIndexOfAUTOBUS);
        _item.setAUTOBUS(_tmpAUTOBUS);
        final int _tmpTIPO_PK;
        _tmpTIPO_PK = _cursor.getInt(_cursorIndexOfTIPOPK);
        _item.setTIPO_PK(_tmpTIPO_PK);
        final int _tmpPK_ORIGEN;
        _tmpPK_ORIGEN = _cursor.getInt(_cursorIndexOfPKORIGEN);
        _item.setPK_ORIGEN(_tmpPK_ORIGEN);
        final String _tmpORIGEN;
        _tmpORIGEN = _cursor.getString(_cursorIndexOfORIGEN);
        _item.setORIGEN(_tmpORIGEN);
        final String _tmpSALIDA;
        _tmpSALIDA = _cursor.getString(_cursorIndexOfSALIDA);
        _item.setSALIDA(_tmpSALIDA);
        final int _tmpPK_DESTINO;
        _tmpPK_DESTINO = _cursor.getInt(_cursorIndexOfPKDESTINO);
        _item.setPK_DESTINO(_tmpPK_DESTINO);
        final String _tmpDESTINO;
        _tmpDESTINO = _cursor.getString(_cursorIndexOfDESTINO);
        _item.setDESTINO(_tmpDESTINO);
        final String _tmpLLEGADA;
        _tmpLLEGADA = _cursor.getString(_cursorIndexOfLLEGADA);
        _item.setLLEGADA(_tmpLLEGADA);
        final String _tmpESCALA;
        _tmpESCALA = _cursor.getString(_cursorIndexOfESCALA);
        _item.setESCALA(_tmpESCALA);
        final String _tmpFECHA;
        _tmpFECHA = _cursor.getString(_cursorIndexOfFECHA);
        _item.setFECHA(_tmpFECHA);
        final int _tmpPK_RUTA;
        _tmpPK_RUTA = _cursor.getInt(_cursorIndexOfPKRUTA);
        _item.setPK_RUTA(_tmpPK_RUTA);
        final String _tmpRUTA;
        _tmpRUTA = _cursor.getString(_cursorIndexOfRUTA);
        _item.setRUTA(_tmpRUTA);
        final int _tmpPK_CORRIDA_RUTA;
        _tmpPK_CORRIDA_RUTA = _cursor.getInt(_cursorIndexOfPKCORRIDARUTA);
        _item.setPK_CORRIDA_RUTA(_tmpPK_CORRIDA_RUTA);
        final String _tmpBLOQUEADO;
        _tmpBLOQUEADO = _cursor.getString(_cursorIndexOfBLOQUEADO);
        _item.setBLOQUEADO(_tmpBLOQUEADO);
        final String _tmpGUIA;
        _tmpGUIA = _cursor.getString(_cursorIndexOfGUIA);
        _item.setGUIA(_tmpGUIA);
        final String _tmpCOMPLETO;
        _tmpCOMPLETO = _cursor.getString(_cursorIndexOfCOMPLETO);
        _item.setCOMPLETO(_tmpCOMPLETO);
        final int _tmpPK_ORIGEN_COMPLETO;
        _tmpPK_ORIGEN_COMPLETO = _cursor.getInt(_cursorIndexOfPKORIGENCOMPLETO);
        _item.setPK_ORIGEN_COMPLETO(_tmpPK_ORIGEN_COMPLETO);
        final String _tmpORIGEN_COMPLETO;
        _tmpORIGEN_COMPLETO = _cursor.getString(_cursorIndexOfORIGENCOMPLETO);
        _item.setORIGEN_COMPLETO(_tmpORIGEN_COMPLETO);
        final String _tmpSALIDA_COMPLETO;
        _tmpSALIDA_COMPLETO = _cursor.getString(_cursorIndexOfSALIDACOMPLETO);
        _item.setSALIDA_COMPLETO(_tmpSALIDA_COMPLETO);
        final String _tmpSALIDA_C;
        _tmpSALIDA_C = _cursor.getString(_cursorIndexOfSALIDAC);
        _item.setSALIDA_C(_tmpSALIDA_C);
        final int _tmpPK_DESTINO_COMPLETO;
        _tmpPK_DESTINO_COMPLETO = _cursor.getInt(_cursorIndexOfPKDESTINOCOMPLETO);
        _item.setPK_DESTINO_COMPLETO(_tmpPK_DESTINO_COMPLETO);
        final String _tmpDESTINO_COMPLETO;
        _tmpDESTINO_COMPLETO = _cursor.getString(_cursorIndexOfDESTINOCOMPLETO);
        _item.setDESTINO_COMPLETO(_tmpDESTINO_COMPLETO);
        final String _tmpLLEGADA_COMPLETO;
        _tmpLLEGADA_COMPLETO = _cursor.getString(_cursorIndexOfLLEGADACOMPLETO);
        _item.setLLEGADA_COMPLETO(_tmpLLEGADA_COMPLETO);
        final String _tmpLLEGADA_C;
        _tmpLLEGADA_C = _cursor.getString(_cursorIndexOfLLEGADAC);
        _item.setLLEGADA_C(_tmpLLEGADA_C);
        final String _tmpFECHA_C;
        _tmpFECHA_C = _cursor.getString(_cursorIndexOfFECHAC);
        _item.setFECHA_C(_tmpFECHA_C);
        final String _tmpFECHA_M;
        _tmpFECHA_M = _cursor.getString(_cursorIndexOfFECHAM);
        _item.setFECHA_M(_tmpFECHA_M);
        final String _tmpUSUARIO;
        _tmpUSUARIO = _cursor.getString(_cursorIndexOfUSUARIO);
        _item.setUSUARIO(_tmpUSUARIO);
        final int _tmpPK_CHOFER;
        _tmpPK_CHOFER = _cursor.getInt(_cursorIndexOfPKCHOFER);
        _item.setPK_CHOFER(_tmpPK_CHOFER);
        final String _tmpNOMBRE;
        _tmpNOMBRE = _cursor.getString(_cursorIndexOfNOMBRE);
        _item.setNOMBRE(_tmpNOMBRE);
        final String _tmpAPELLIDOS;
        _tmpAPELLIDOS = _cursor.getString(_cursorIndexOfAPELLIDOS);
        _item.setAPELLIDOS(_tmpAPELLIDOS);
        final String _tmpPISOS;
        _tmpPISOS = _cursor.getString(_cursorIndexOfPISOS);
        _item.setPISOS(_tmpPISOS);
        final String _tmpTIEMPO;
        _tmpTIEMPO = _cursor.getString(_cursorIndexOfTIEMPO);
        _item.setTIEMPO(_tmpTIEMPO);
        final double _tmpPRECIO;
        _tmpPRECIO = _cursor.getDouble(_cursorIndexOfPRECIO);
        _item.setPRECIO(_tmpPRECIO);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
