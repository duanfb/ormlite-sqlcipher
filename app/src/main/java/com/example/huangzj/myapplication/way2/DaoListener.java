package com.example.huangzj.myapplication.way2;


public class DaoListener {

    private DaoThreadMode daoThreadMode = DaoThreadMode.MainThread;

    public void onDataChanged(int daoOperationType, Object data){}

    public void onDataChanged(Object data){}

    protected DaoThreadMode getDaoThreadMode() {
        return daoThreadMode;
    }

    protected void setDaoThreadMode(DaoThreadMode daoThreadMode) {
        this.daoThreadMode = daoThreadMode;
    }
}
