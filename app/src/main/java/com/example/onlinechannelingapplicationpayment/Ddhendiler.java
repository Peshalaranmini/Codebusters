package com.example.onlinechannelingapplicationpayment;

public class Ddhendiler public boolean addOrder(first_Name,int Last_Name,Card_Number,Security_Code){
    SQLiteDatabase db= getWritableDatabase();
    ContentValues values= new ContentValues();

    values.put(User.Userdetails.COL_NAME,first_Name);
    values.put(User.Userdetails.Last_Name,Last_Name);
    values.put(User.Userdetails.Card_Numbers,Card_Number);
    values.put(User.Userdetails.Security_Code,Security_Code);
    long id= db.insert(User.Userdetails.TABLE_NAME, null,values);
}
        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
        public boolean deleteOrder(User.Userdetails){

            SQLiteDatabase db= this.getWritableDatabase();
            String queryString ="DELETE From" +  USER TABLE + "WHERE"+ COL_Address+ " "+User{
                Cursor Cursor =db.rawQuery(queryString, selection args:null);

                if (cursor.moveTOFirst()) {
                    return true;
                }
                else {
                    return false;
                }

            }
        }{
}
