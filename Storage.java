import greenfoot.*;
public class Storage  
{
    public int volume = optiuni.volume;
    
    public Storage()
    {
        
    }
    public void storedata(int p, int value){
        if (UserInfo.isStorageAvailable()) {
             UserInfo myInfo = UserInfo.getMyInfo();
             if(p == -1)
                myInfo.setScore(value);
             else 
                myInfo.setInt(p, value);
             myInfo.store();
        }
    }
    public int getdata(int p){
        if (UserInfo.isStorageAvailable()) {
             int vs = 0;
             UserInfo myInfo = UserInfo.getMyInfo();
             if(p == -1)
                vs = myInfo.getScore();
             else
                vs = myInfo.getInt(p);
             return vs;
       } else return 0;
    }
    
}
