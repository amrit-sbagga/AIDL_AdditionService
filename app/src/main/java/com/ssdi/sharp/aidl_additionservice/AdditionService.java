package com.ssdi.sharp.aidl_additionservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AdditionService extends Service {
    public AdditionService() {
    }

    private IMyAdditionAidlInterface.Stub mBinder = new IMyAdditionAidlInterface.Stub() {
        @Override
        public int add(int num1, int num2) throws RemoteException {
            return (num1+num2);
        }
    };


    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
