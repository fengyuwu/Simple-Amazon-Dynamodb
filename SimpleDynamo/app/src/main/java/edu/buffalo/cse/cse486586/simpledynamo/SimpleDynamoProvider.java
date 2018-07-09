/*

improve delete performance

Record: test the whole phase for 50 times, all pass!

Safe to submit.

Testing command:

su root

source ~/.bash_profile &&
cd .. &&
python run_avd.py 5 &&
python set_redir.py 10000
./simpledynamo-grading.osx /Users/dev/Desktop/SimpleDynamo-fengyuwu-version3-submit-/app/build/outputs/apk/app-debug.apk

Intensive testing all pass.


 */
//with per key deletion, and recover start will clean database :
//Golden stable version

//without hack
/* Testing
   python set_redir.py 10000
   ./simpledynamo-grading.osx /Users/dev/Desktop/SimpleDynamo/app/build/outputs/apk/app-debug.apk
 */

/* Compile
   If it does not compile...
   Please change the classpath 'com.android.tools.build:gradle:3.0.1' to classpath 'com.android.tools.build:gradle:2.2.3' at the build:gradle file.
   feel free to email me at fengyuwu@Buffallo.edu. it works on my machine.
 */

/* Environment
//
//Test Environment Mac OS
//build.gradle and Template code from Steve ko, it works on my end.
//I lost my original Template code copy of from git hub repo after some commit. For some reason, 3.0.1 is buggy in my end.
//If does not compile, please change the build/gradle file
//
//   classpath 'com.android.tools.build:gradle:3.0.1' to classpath 'com.android.tools.build:gradle:2.2.3'
//and let the ide fix/ sync itself.
//Thanks. feel free to email me at fengyuwu@Buffallo.edu
//https://docs.google.com/document/d/1Y24TKLiBYLHk7hKFgHy2zQJI3UTHkBbNJ7mGYkwyy6E/edit
//http://www.cse.buffalo.edu/~stevko/courses/cse486/spring17/files/SimpleDht.zip
//http://www.cse.buffalo.edu/~stevko/courses/cse486/spring17/files
//classpath 'com.android.tools.build:gradle:2.2.3'
//  compileSdkVersion 19 distributionUrl=https\://services.gradle.org/distributions/gradle-2.14.1-all.zip
// buildToolsVersion "21.1.2"
*/

/* Final Version All test pass
//
//Intensive testing passed 10/10 Every time it runs
//UI code can not be disabled for performance
//Final Version
//UI/UN-need Exception handing codes can be comment out/delete to improve performance.
//Exception handle code, some exception is just warning from write fail and read is more important,as i need to clean the content provider and queue.
//Also used to detect failed avd / process so that it will remove bad message. (Log cat can not be deleted in order for the program to run)!
//Socket message passing code  mainly based on old PA1,PA2A and https://docs.oracle.com/javase/tutorial/networking/sockets/index.html
//https://developer.android.com/reference/java/net/Socket.html
//https://developer.android.com/reference/java/net/ServerSocket.html
//Sockets mainly based on https://docs.oracle.com/javase/tutorial/networking/sockets/examples/EchoClient.java
//Server Sockets mainly based on https://docs.oracle.com/javase/tutorial/networking/sockets/examples/EchoServer.java
//Socket message passing code mainly base on https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html
//https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html
//        https://stackoverflow.com/questions/9412040/how-to-get-column-value-from-sqlite-cursor
//URI,content provider code mainly base on PA1,PA2A.
Os error is a path problem!
source ~/.bash_profile
Then it is good
Mar 16 9:55am pass 1%, query done,delete unimplemented. But still pass since the test did not check for delete.
Upon completing a new node join request, affected nodes should have updated their predecessor and successor pointers correctly.
1% if local insert/query/delete operations work correctly with 1 AVD. Every time it test, it start on one avd, chosen randomly.
Query is done. Need to set dir 10000 to make it to work! otherwise only pass 1 %, if setdir 3%
minSdkVersion 19
        targetSdkVersion 19
* All Source:
* https://stackoverflow.com/questions/9412040/how-to-get-column-value-from-sqlite-cursor
* https://docs.google.com/document/d/1iU2kCjM-XGsbDBRtaV24U1g10jKTe1jq5mplSK0hOtU/edit#heading=h.evov0wf199ob
 * https://developer.android.com/guide/components/activities/activity-lifecycle.html
 * https://developer.android.com/reference/android/view/View.html
 * https://developer.android.com/reference/android/text/method/MovementMethod.html
 * https://developer.android.com/reference/android/text/method/ScrollingMovementMethod.html
 * https://developer.android.com/reference/android/widget/Button.html
 * https://developer.android.com/reference/android/content/ContentResolver.html
 * https://developer.android.com/reference/android/app/Activity.html
 * https://developer.android.com/reference/android/view/View.OnClickListener.html
 * https://developer.android.com/guide/topics/ui/menus.html
 * https://developer.android.com/reference/android/view/MenuInflater.html
 * http://www.gecg.in/papers/ds5thedn.pdf
 * https://studylib.net/doc/7830646/isis-algorithm-for-total-ordering-of-messages
 * https://docs.google.com/document/d/1xgXwZ6GYA152WT3K0B1MPP7F0mf0sPCPzfqr528pO5Y/edit
 * https://www.cse.buffalo.edu/~eblanton/course/cse586/materials/2018S/12-multicast2.pdf
 * https://www.youtube.com/watch?v=yHRYetSvyjU&t=461s&list=LLDLR_M72v5WJbeR8k5Vw1Ow&index=3
 * https://www.cse.buffalo.edu/~stevko/courses/cse486/spring17/lectures/12-multicast2.pdf
 * https://developer.android.com/reference/java/io/ObjectOutputStream.html
 * https://developer.android.com/reference/java/io/ObjectInputStream.html
 * https://developer.android.com/guide/topics/ui/notifiers/toasts.html
 * Some Code From PA1 PA2A Steve's template code/hacks (Sockets, array, array list, content provider,content resolver,uri, cursor,sqlite, The book, Piaaza etc...
 * https://developer.android.com/reference/java/io/Serializable.html
 * https://developer.android.com/reference/java/util/Comparator.html
 * https://developer.android.com/reference/java/util/PriorityQueue.html
 * https://developer.android.com/reference/java/util/concurrent/PriorityBlockingQueue.html
 * https://developer.android.com/reference/java/util/Collection.html
 * https://developer.android.com/reference/java/lang/Exception.html
 * https://developer.android.com/reference/android/os/AsyncTask.html
 * https://developer.android.com/reference/java/lang/Enum.html
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
 * https://www.cse.buffalo.edu/~eblanton/course/cse586/materials/2018S/group-messenger-2.pdf
 * https://docs.google.com/document/d/1xgXwZ6GYA152WT3K0B1MPP7F0mf0sPCPzfqr528pO5Y/edit
 * // Additional Source:
    //https://developer.android.com/training/data-storage/shared-preferences.html#java
    //https://developer.android.com/reference/android/content/Context.html#getSharedPreferences(java.lang.String,%20int)
    //https://developer.android.com/reference/android/content/SharedPreferences.html#getInt(java.lang.String,%20int)
    //https://developer.android.com/reference/android/database/Cursor.html#moveToNext()
    //https://developer.android.com/reference/android/database/Cursor.html#getColumnIndex(java.lang.String)
    //https://docs.oracle.com/javase/6/docs/api/java/lang/String.html#compareTo%28java.lang.String%29
    //https://docs.oracle.com/javase/tutorial/essential/concurrency/guardmeth.html
    //https://developer.android.com/reference/java/util/Comparator.html
    //https://docs.oracle.com/javase/6/docs/api/java/lang/String.html#compareTo%28java.lang.String%29
    //https://docs.google.com/presentation/d/1TiRE09XMGR0dbVvKICiX2Ybh0JLxHxRnf8g-wdjzuzM/edit?usp=sharing
    //https://docs.google.com/document/d/1VpTvRTb7TETtN59ovdfb1FMQDRXfq6H5Toh7L7Dq1P4/edit
    //https://www.cse.buffalo.edu/~eblanton/course/cse586/materials/2018S/simple-dynamo.pdf
    //https://www.allthingsdistributed.com/files/amazon-dynamo-sosp2007.pdf
    //https://www.cse.buffalo.edu//~stevko/courses/cse486/spring17/lectures/26-dynamo.pdf
    //PA1,2,3
 */
        package edu.buffalo.cse.cse486586.simpledynamo;

        import java.io.ObjectInputStream;
        import java.io.ObjectOutputStream;
        import java.net.InetAddress;
        import java.net.ServerSocket;
        import java.net.Socket;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;

        import java.util.Hashtable;
        import java.util.Iterator;
        import java.util.Map;

        import android.annotation.SuppressLint;
        import android.content.ContentProvider;
        import android.content.ContentValues;
        import android.content.Context;
        import android.content.SharedPreferences;
        import android.database.Cursor;
        import android.database.MatrixCursor;
        import android.net.Uri;
        import android.os.AsyncTask;
        import android.telephony.TelephonyManager;
        import android.util.Log;


        import static edu.buffalo.cse.cse486586.simpledynamo.Handshake.get_correct_keys;
        import static edu.buffalo.cse.cse486586.simpledynamo.Handshake.genHash;


public class SimpleDynamoProvider extends ContentProvider {


    /* Variables Creation */

    private MysqlHelper mOpenHelper;
    private String failedAVD = "10000";
    private static final int fixed_port = 10000;
    private Hashtable<String, String> database = new Hashtable<>();
    private ArrayList<Handshake> myDHT = new ArrayList<>();
    private int INF = 11108;


    @Override
    public String getType(Uri uri) {
        /* Template code */
        return null;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
         /* Template code */
        return 0;
    }

    public static int five_digit_id(String x) {
         /* Print Emulator ID in the form of five digits */
        return Integer.parseInt(x);
    }

    public static int Four_digit_id(int x) {
         /* Print Emulator ID in the form of four digits */
        switch (x) {
            case 11108:
                return 5554;
            case 11112:
                return 5556;
            case 11116:
                return 5558;
            case 11120:
                return 5560;
            default:
                return 5562;

        }
    }

    public static int compar_keys(String x, String y) {

         /* Compare keys value
            Return value 0 if the x is equal to this y
            Return value less than 0 if x is lexicographically less than the y
            Return value greater than 0 if x is lexicographically greater than the y
            Source:https://docs.oracle.com/javase/6/docs/api/java/lang/String.html#compareTo%28java.lang.String%29 */

        return x.compareTo(y);
    }


    public static String compar_hash(String hashcode) {
        /* Compare key's hash value */
        ArrayList<Handshake> myChordRing = new ArrayList<>();

        Handshake hardcode0 = new Handshake();
        hardcode0.setkey("177ccecaec32c54b82d5aaafc18a2dadb753e3b1");
        hardcode0.setval("11124");

        Handshake hardcode1 = new Handshake();


        Handshake hardcode2 = new Handshake();


        Handshake hardcode3 = new Handshake();


        Handshake hardcode4 = new Handshake();


        myChordRing.add(hardcode0);

        hardcode1.setkey("208f7f72b198dadd244e61801abe1ec3a4857bc9");
        hardcode1.setval("11112");

        myChordRing.add(hardcode1);

        hardcode2.setkey("33d6357cfaaf0f72991b0ecd8c56da066613c089");
        hardcode2.setval("11108");

        myChordRing.add(hardcode2);

        hardcode3.setkey("abf0fd8db03e5ecb199a9b82929e9db79b909643");
        hardcode3.setval("11116");

        myChordRing.add(hardcode3);

        hardcode4.setkey("c25ddd596aa7c81fa12378fa725f706d54325d12");
        hardcode4.setval("11120");

        myChordRing.add(hardcode4);


        if (compar_keys(hashcode, myChordRing.get(myChordRing.size() - 1).getkey()) > 0) {

//            Log.i("MyLog", "SHIT this should return 177ccecaec32c54b82d5aaafc18a2dadb753e3b111124 check now " + myChordRing.get(0).getkey());
            return consistent_hash(myChordRing.get(0).getkey());
        } else if (compar_keys(hashcode, myChordRing.get(myChordRing.size() - 1).getkey()) == 0) {
//            Log.i("MyLog", "SHIT the hash is the same " + myChordRing.get(0).getkey());
            return consistent_hash(myChordRing.get(myChordRing.size() - 1).getkey());
        } else {

            int i = myChordRing.size() - 1;
            do {
                if (!(i >= 0)) break;
//                Log.i("MyLog", "SHIT BEFORE insert crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
                i--;
            } while (true);
            Handshake wtf = new Handshake();
            wtf.setkey(hashcode); //hack to get the right position in the ring.
            wtf.setval("177ccecaec32c54b82d5aaafc18a2dadb753e3b111124");//Dummy
            myChordRing.add(wtf);
            Collections.sort(myChordRing, LEX);//sort it

            i = 0;
            if (i < myChordRing.size()) {
                do {
//                    Log.i("MyLog", "SHIT after insert crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
                    i++;
                } while (i < myChordRing.size());
            }


            int crap_loc = myChordRing.indexOf(wtf);
            int crap_belong_to_index = crap_loc + 1;
            String crap_belong_to_ = myChordRing.get(crap_belong_to_index).getkey();


            myChordRing.remove(wtf);
            i = myChordRing.size() - 1;
            while (true) {
                if (!(i >= 0)) break;
//                Log.i("MyLog", "SHIT after remove crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
                i--;
            }


//            Log.i("MyLog", " now I know that new hash key belong to " + crap_belong_to_ + "hash code is  " + hashcode);

            return consistent_hash(crap_belong_to_);

        }
    }


    public static Comparator<Handshake> LEX = new Comparator<Handshake>() {
        //todo done

        public int compare(Handshake x, Handshake y) {

             /* Compare key's hash value comparator*/
            return x.getkey().compareTo(y.getkey());

        }
    };


    public static String consistent_hash(String x) {
         /* Calculate port based on hash */

        if (x.equals("177ccecaec32c54b82d5aaafc18a2dadb753e3b1")) {
            return "11124";
        } else if (x.equals("208f7f72b198dadd244e61801abe1ec3a4857bc9")) {
            return "11112";
        } else if (x.equals("33d6357cfaaf0f72991b0ecd8c56da066613c089")) {
            return "11108";
        } else if (x.equals("abf0fd8db03e5ecb199a9b82929e9db79b909643")) {
            return "11116";
        } else if (x.equals("c25ddd596aa7c81fa12378fa725f706d54325d12")) {
            return "11120";
        }

        return x;
    }


    public synchronized void notifyJoy() {
        /* Release lock */

        INF = 11107;

        notifyAll();

    }

    public static ArrayList<String> getMemberList(String Node_ID_In_Five_Digit) {
        /* Calculate key's position */

        //0=suc
        //1=suc of suc
        //2=pre of pre
        //3=pre
        //4=self

        switch (Node_ID_In_Five_Digit) {
            case "11108":

                return new ArrayList<String>() {{
                    add("11116");
                    add("11120");
                    add("11124");
                    add("11112");
                    add("11108");
                }};

            case "11112":
                return new ArrayList<String>() {{
                    add("11108");
                    add("11116");
                    add("11120");
                    add("11124");
                    add("11112");
                }};

            case "11116":
                return new ArrayList<String>() {{
                    add("11120");
                    add("11124");
                    add("11112");
                    add("11108");
                    add("11116");
                }};

            case "11120":
                return new ArrayList<String>() {{
                    add("11124");
                    add("11112");
                    add("11108");
                    add("11116");
                    add("11120");
                }};

            case "11124":
                return new ArrayList<String>() {{
                    add("11112");
                    add("11108");
                    add("11116");
                    add("11120");
                    add("11124");
                }};

        }


        return null;
    }


    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {


         /* Delete right away, and forwarded delete request to replicas */
        if (!failedAVD.equals(String.valueOf(five_digit_id(consistent_hash(compar_hash(genHash(selection))))))) {
            Log.v("delete", "  port is mismatched, delete forward for key " + selection  + "current port " + failedAVD);
            Del_Resolver(selection);
        }

        /* Delete forwarded */
        else {
            Log.v("delete", "  port is matched, delete this key at this port now and forward delete to its replicas for key" + selection + "current port "+ failedAVD);
//            Log.v("delete", " key is deleted right away and later at its replicas "+ selection +" at this port "+ failedAVD);
//            mOpenHelper.getWritableDatabase().delete("my_table", "key=?", new String[]{selection});
//            mOpenHelper.getWritableDatabase().execSQL("delete from " + "my_table");
            String [] a7 ={selection};
            mOpenHelper.getReadableDatabase().delete("my_table", "key = ?", a7);

            Del_Resolver_rep_only(selection);
        }

        return 0;
    }


    @Override
    public synchronized Uri insert(Uri uri, ContentValues values) {

         /* Insert right away, and forwarded insert request to replicas */
        if (!failedAVD.equals(String.valueOf(five_digit_id(consistent_hash(compar_hash(genHash(values.getAsString("key")))))))) {
            Log.v("ContentProvider", "Normal Insert key " + values.get("key") + " val " + values.get("value"));



            /* Insert forwarded matched node */
            Handshake Insert_Request = new Handshake();
            Insert_Request.setkey(values.getAsString("key"));
            Insert_Request.setval(values.getAsString("value"));

            Insert_Request.setPurpose("Insert");


            Insert_Thread(Insert_Request,five_digit_id(consistent_hash(compar_hash(genHash(Insert_Request.getkey())))));
            Log.i("ContentProvider", "  checking grader insert to " + failedAVD + " insert key  " + Insert_Request.getkey() + "  value  " + Insert_Request.getval() + " redirected to " + five_digit_id(consistent_hash(compar_hash(genHash(Insert_Request.getkey())))) + " managed by " + five_digit_id(consistent_hash(compar_hash(genHash(Insert_Request.getkey())))));

            /* Insert forwarded to replicas node */
            int i = 1;
            do {
                if (!(i >= 0)) break;

                Handshake Insert_Request2 = new Handshake();
                Insert_Request2.setkey(Insert_Request.getkey());
                Insert_Request2.setval(Insert_Request.getval());
                Insert_Request2.setPurpose("Insert");


                Insert_Thread(Insert_Request2,five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(Insert_Request2.getkey())))).get(i)));
                Log.i("ContentProvider", "  checking grader insert to " + failedAVD + " insert key  " + Insert_Request2.getkey() + "  value  " + Insert_Request2.getval() + " redirected to " + five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(Insert_Request2.getkey())))).get(i)) + " managed by " + five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(Insert_Request2.getkey())))).get(i)));

                i--;
            } while (true);
        }

        /* Insert forwarded */
        else {
            Log.v("ContentProvider", "Insert key right away and forward request to replicas " + values.get("key") + " val " + values.get("value"));


            Log.i("ContentProvider", "  checking grader insert to " + failedAVD + " insert key  " + values.getAsString("key") + "  value  " + values.getAsString("value") + " was inserted right away to " + failedAVD);

            mOpenHelper.getWritableDatabase().insertWithOnConflict("my_table", null, values, 5);//android dev website

             /* Insert forwarded to replicas node */
            int i = 1;
            do {
                if (!(i >= 0)) break;

                Handshake Insert_Request2 = new Handshake();
                Insert_Request2.setkey(values.getAsString("key"));
                Insert_Request2.setval(values.getAsString("value"));
                Insert_Request2.setPurpose("Insert");


                Insert_rep_Thread(Insert_Request2,five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(values.getAsString("key"))))).get(i)));

                i--;
            } while (true);


        }

        return uri;

    }


    @Override
    public synchronized Cursor query(Uri uri, String[] projection, String selection,
                                     String[] selectionArgs, String sortOrder) {


        /* Handle query based on case */
        switch (selection) {
            case "*":

                Query_star();

                if (INF == 11108) {
                    do {

                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Log.i("loop", "INF loop " + INF);
                    } while (INF == 11108);
                }


                Log.i("loop", "INF loop broke" + INF);
                String[] a1 = {"key", "value"};
                MatrixCursor cus = new MatrixCursor(a1);


                int i = 0;
                do {
                    if (!(i < myDHT.size())) break;// 1 -5 AVD
                    int j = 0;
                    do {
                        if (!(j < myDHT.get(i).getRING().size())) break;
                        String[] a2 = {myDHT.get(i).getRING().get(j).getkey(), myDHT.get(i).getRING().get(j).getval()};

                        cus.addRow(a2);


                        j++;
                    } while (true);


                    i++;
                } while (true);


                Log.i("MyLog", " return all dht done good " + INF++);

                return cus;


//                }

            case "@":

                Log.v("ContentProvider", "query @ right away at " + Four_digit_id(five_digit_id(failedAVD)));


                return mOpenHelper.getReadableDatabase().rawQuery("SELECT * FROM my_table;", null);

            default:


                String[] a2 = {"key", "value"};
                MatrixCursor cus2 = new MatrixCursor(a2);


                database.clear();
                Log.v("normal", "query single request received at " + Four_digit_id(five_digit_id(failedAVD)) + " query key " + selection + " managed by " + Four_digit_id(five_digit_id(consistent_hash(compar_hash(genHash(selection))))));


                /* Query the last node of the chain of partitions */
                Handshake query_request = new Handshake();

                query_request.setkey(selection);

                Query_Thread(query_request, five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(1)));

                do {
                    if ((database.containsKey(selection))) {
                        break;
                    } else {
                        //INF loop
                    }

                } while (true);


                String[] a3 = {selection, database.get(selection)};
                cus2.addRow(a3);


                Log.i("normal", "Returned query single key is done and return key " + selection + " val " + database.get(selection) + " size of table is " + database.size());


                return cus2;


        }


    }


    @SuppressLint({"HardwareIds", "ApplySharedPref"})
    @Override
    public boolean onCreate() {

        try {

            Log.v("delete", " pass 20 score time : 50 th");

            /* Initialize SQLite database with template code from PA1 PA2 PA3 */
            /* Identify failed node */
            /* https://developer.android.com/training/data-storage/shared-preferences.html#java */
            /* https://developer.android.com/reference/android/content/Context.html#getSharedPreferences(java.lang.String,%20int) */
            /* https://developer.android.com/reference/android/content/SharedPreferences.html#getInt(java.lang.String,%20int) */

            Context context = this.getContext();
            ServerSocket serverSocket = new ServerSocket(fixed_port);
            new ServerTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, serverSocket);
            mOpenHelper = new MysqlHelper(getContext());
            TelephonyManager tel;
            assert context != null;
            tel = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            @SuppressLint("HardwareIds") String portStr;
            assert tel != null;
            portStr = tel.getLine1Number().substring(tel.getLine1Number().length() - 4);
            final String hack = String.valueOf((five_digit_id(portStr) * 2));
            SharedPreferences sharedPref = context.getSharedPreferences("sharedPref", Context.MODE_PRIVATE);
            int highScore = sharedPref.getInt("sharedPref", 11108); //
            failedAVD = hack;
            switch (highScore) {
                case 11108:

                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putInt("sharedPref", 11124);
                    editor.commit();

                    break;
                case 11124:

                /* recovery thread */
                    Recover_Thread();
                    break;
            }

        } catch (Exception e) {

        }

        return true;
    }


    @SuppressLint("StaticFieldLeak")
    private class ServerTask extends AsyncTask<ServerSocket, Handshake, Void> {
        protected Void doInBackground(ServerSocket... connections) {
            ServerSocket serverSocket = connections[0];
            try {
                do {
                    Socket connection = serverSocket.accept();
                    ObjectInputStream ois = new ObjectInputStream(connection.getInputStream());
                    Handshake msg = (Handshake) ois.readObject();

                     /* Server Handler */
                    synchronized (mOpenHelper) {

                        switch (msg.getPurpose()) {

                             /* Mass key query */
                            case "6":


                                Handshake pass_dht = new Handshake();


                                Cursor cursor6 = mOpenHelper.getReadableDatabase().rawQuery("SELECT * FROM my_table;", null);


                                ArrayList<Handshake> mass_query = new ArrayList<>();

                                if (!cursor6.moveToNext()) {
                                    Log.i("Server", " mass query ");

                                } else {
                                    do {

                                        //https://developer.android.com/reference/android/database/Cursor.html#moveToNext()
                                        //https://developer.android.com/reference/android/database/Cursor.html#getColumnIndex(java.lang.String)
                                        Handshake st = new Handshake();
                                        st.setkey(cursor6.getString(0));
                                        st.setval(cursor6.getString(1));
                                        mass_query.add(st);

                                    } while (cursor6.moveToNext());
                                }

                                pass_dht.setRING(mass_query);

                                ObjectOutputStream oos;
                                oos = new ObjectOutputStream(connection.getOutputStream());

                                oos.writeObject(pass_dht);
                                oos.flush();


                            case "Insert":

                                ContentValues values = new ContentValues();
                                values.put("value", msg.getval());//Adds a value to the set. see at class MysqlHelper.java
                                values.put("key", msg.getkey());

                                mOpenHelper.getWritableDatabase().insertWithOnConflict("my_table", null, values, 5);//android dev website
                                Log.i("Server", " at " + failedAVD + " inserted key  " + msg.getkey());
                                break;


                            case "Delete":
                                Log.v("delete", " key is finally deleted "+ msg.getkey() +" at this port "+ failedAVD);
//                                mOpenHelper.getWritableDatabase().delete("my_table", "key=?", new String[]{msg.getkey()});
//                                mOpenHelper.getWritableDatabase().execSQL("delete from " + "my_table");
                                String [] a7 ={msg.getkey()};
                                mOpenHelper.getReadableDatabase().delete("my_table", "key = ?", a7);


                            break;

                            case "Recovery":

                                Hashtable<String, String> temp = new Hashtable<>();
                                Hashtable<String, String> correct_keys = new Hashtable<>();

                                cursor6 = mOpenHelper.getReadableDatabase().rawQuery("SELECT * FROM my_table;", null);
                                if (!cursor6.moveToNext()) {
                                    Log.i("Server", "empty database ");
                                } else {
                                    do {

                                        temp.put(cursor6.getString(0), cursor6.getString(1));

                                    } while (cursor6.moveToNext());
                                }


                                Iterator<Map.Entry<String, String>> iterator = temp.entrySet().iterator();
                                if (!iterator.hasNext()) {
                                    Log.v("Request", " No more missed key ");
                                } else {
                                    do {
                                        Hashtable.Entry<String, String> entry = iterator.next();


                                        if (!get_correct_keys(entry.getKey(), msg.getsenderPort(), failedAVD)) {

                                            Log.i("Server", " This key " + entry.getKey() + " is inserted by " + Four_digit_id(five_digit_id(consistent_hash(compar_hash(genHash(entry.getKey()))))) + " and should not be recover ");

                                        } else {
                                            correct_keys.put(entry.getKey(), entry.getValue());
                                            Log.i("Server", " This key " + entry.getKey() + " is inserted by " + Four_digit_id(five_digit_id(consistent_hash(compar_hash(genHash(entry.getKey()))))) + " and should be recover  Info current node " + Four_digit_id(five_digit_id(failedAVD)) + "failed node " + Four_digit_id(five_digit_id(msg.getsenderPort())));

                                        }


                                    } while (iterator.hasNext());
                                }

                                msg.setConMap(correct_keys);
                                ObjectOutputStream writter = new ObjectOutputStream(connection.getOutputStream());
                                writter.writeObject(msg);
                                writter.flush();
                                break;


                            default:

                                 /* Single key query */

                                String[] a6 = {msg.getkey()};
                                Cursor cursor = mOpenHelper.getReadableDatabase().query(false, "my_table", null, "key = ?", a6, null, null, null, "1");

                                if (!cursor.moveToLast()) {
                                    Log.i("Server", " This request query single key " + msg.getkey() + " is not found at this node " + Four_digit_id(five_digit_id(failedAVD)));
                                } else {

                                    msg.setval(cursor.getString(1));


                                    Log.i("Server", " This request query single key " + msg.getkey() + " is found at this node " + Four_digit_id(five_digit_id(failedAVD)) + " and returning val " + msg.getval());
                                    writter = new ObjectOutputStream(connection.getOutputStream());
                                    writter.writeObject(msg);
                                    writter.flush();


                                }


                                break;


                        }


                    }
                } while (true);

            } catch (Exception e) {
                Log.i("Server", e.toString());

            }
            return null;
        }
    }


    public class HelloRunnable implements Runnable {

        public void run() {

            Log.v("Hello", "Hello from a thread!");

        }

    }

    private synchronized void Recover_Thread() {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {

                try {
                    mOpenHelper.getWritableDatabase().execSQL("delete from " + "my_table");
                    Log.v("delete", " failed node just recover, cleaning stale data first at " + failedAVD);

                     /* Calculated the replicas server id */

                    ArrayList<String> Ask_who = new ArrayList<String>() {{
                        add(getMemberList(failedAVD).get(3));
                        add(getMemberList(failedAVD).get(2));
                        add(getMemberList(failedAVD).get(0));
                    }};


                    int i = Ask_who.size() - 1;
                    do {
                        if (!(i >= 0)) break;

                        Handshake recover_from = new Handshake();

                        recover_from.setsenderPort(failedAVD);//the failed port

                        recover_from.setPurpose("Recovery"); //the purpose

                        Log.v("Request", " verify replicas server " + Ask_who.get(i) + " for this failed node " + failedAVD);

                        /* Ask for missing data from replicas server */

                        Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), (five_digit_id(Ask_who.get(i))));
                        ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());
                        oos.writeObject(recover_from);
                        oos.flush();

                        /* Read missing data from replicas server */
                        ObjectInputStream reader = new ObjectInputStream(connection.getInputStream());
                        Handshake msgReceived = (Handshake) reader.readObject();


                        /* Recover missing data from replicas server */
                        Iterator<Map.Entry<String, String>> iterator = msgReceived.getConMap().entrySet().iterator();
                        if (!iterator.hasNext()) {
                            Log.v("Request", " No more missed data ");
                        } else {
                            do {
                                Map.Entry<String, String> entry = iterator.next();

                                ContentValues values = new ContentValues();
                                values.put("value", entry.getValue());
                                values.put("key", entry.getKey());
                                mOpenHelper.getWritableDatabase().insertWithOnConflict("my_table", null, values, 5);//android dev website


                            } while (iterator.hasNext());
                        }

                        i--;
                    } while (true);


                } catch (Exception e) {
                    Log.i("Request", e.toString());
                }

            }

        }).start();

    }

    private void Insert_Thread(final Handshake temp,final int where_to) {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {

                try {

                     /* Insert key thread */
                    Log.v("Request", " Insert key " + (temp.getkey() + " val " + temp.getval()));

                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), (where_to));

                    ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());

                    oos.writeObject(temp);

                    oos.flush();
                    oos.close();
                    connection.close();


                } catch (Exception e) {
                    Log.i("Request", e.toString());
                }


            }


        }).start();

    }

    private void Insert_rep_Thread(final Handshake temp,final int where_to) {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {

                try {

                     /* Insert key's replication thread */
                    Log.v("Request", " Insert replicas for key " + (temp.getkey() + " val " + temp.getval()));

                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), (where_to));

                    ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());

                    oos.writeObject(temp);
                    oos.flush();
                    oos.close();
                    connection.close();


                } catch (Exception e) {
                    Log.i("Request", e.toString());
                }


            }


        }).start();

    }


    private void Query_Thread(final Handshake temp, final int whereto) {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {


                try {


                      /* Query key's thread */
                    Log.i("normal", " This request query single key " + temp.getkey() + " is sent to  " + Four_digit_id(whereto));
                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), (whereto));
                    connection.setSoTimeout(5000);

                    ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());

                    oos.writeObject(temp);
                    oos.flush();

                    ObjectInputStream reader = new ObjectInputStream(connection.getInputStream());
                    Handshake got_msg = (Handshake) reader.readObject();


                    reader.close();
                    oos.close();
                    connection.close();


                    Log.i("normal", "before hash table inserted key " + got_msg.getkey() + " val " + got_msg.getval() + " size of table is " + database.size());
                    database.put(got_msg.getkey(), got_msg.getval());
                    Log.i("normal", "after hash table inserted key " + got_msg.getkey() + " val " + got_msg.getval() + " size of table is " + database.size());


                } catch (Exception e) {

                     /* Query key's timeout thread call timeout thread now to save it */
                    Log.e("timeout ", e.toString() + "query single key time out for Emulator " + Four_digit_id(whereto));
                    Timeout_Thread(temp);


                }


            }


        }).start();

    }


    private void Timeout_Thread(final Handshake temp) {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {


                try {

                    Log.e("timeout", " This is the First timeout thread to handle failed avd query ");
                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), (five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(temp.getkey())))).get(0))));

                    connection.setSoTimeout(5000);

                    ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());

                    oos.writeObject(temp);
                    oos.flush();

                    ObjectInputStream reader = new ObjectInputStream(connection.getInputStream());
                    Handshake got_msg = (Handshake) reader.readObject();


                    reader.close();
                    oos.close();
                    connection.close();


                    Log.e("timeout", "before hash table inserted key " + got_msg.getkey() + " val " + got_msg.getval() + " size of table is " + database.size());
                    database.put(got_msg.getkey(), got_msg.getval());
                    Log.e("timeout", "after hash table inserted key " + got_msg.getkey() + " val " + got_msg.getval() + " size of table is " + database.size());


                } catch (Exception e) {
                       /* This should not happen, but handle the case where there are two Emulator had failed */
                    Log.e("timeout", e.toString() + " This is the First timeout thread to handle failed avd query and it also failed");
                    Back_Up_Timeout_Thread(temp);


                }


            }


        }).start();

    }


    private void Back_Up_Timeout_Thread(final Handshake temp) {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {


                try {
                      /* This should not happen, but handle the case where there are two Emulator had failed */

                    Log.e("timeout", " This is the Second timeout thread to handle failed avd query ");
                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), (five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(temp.getkey())))).get(2))));


                    connection.setSoTimeout(5000);
                    ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());

                    oos.writeObject(temp);
                    oos.flush();

                    ObjectInputStream reader = new ObjectInputStream(connection.getInputStream());
                    Handshake got_msg = (Handshake) reader.readObject();


                    reader.close();
                    oos.close();
                    connection.close();


                    Log.e("timeout", "before hash table inserted key " + got_msg.getkey() + " val " + got_msg.getval() + " size of table is " + database.size());
                    database.put(got_msg.getkey(), got_msg.getval());
                    Log.e("timeout", "after hash table inserted key " + got_msg.getkey() + " val " + got_msg.getval() + " size of table is " + database.size());


                } catch (Exception e) {
                    Log.e("timeout", e.toString() + " This is the Second timeout thread to handle failed avd query and it also failed ");


                }


            }


        }).start();

    }

//
//    private void Delete_Thread(final String selection) {
//        new Thread(new HelloRunnable() {
//            @Override
//            public void run() {
//
//
//                try {
//
//                    /* delete nodes */
//                    Handshake delete_request = new Handshake();
//                    delete_request.setPurpose("Delete");
//                    delete_request.setkey(selection);
//                    Log.v("delete", " port was mismatch, now deleting key itself " + (selection));
//                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), ((five_digit_id(consistent_hash(compar_hash(genHash(selection)))))));
//                    ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());
//                    oos.writeObject(delete_request);
//                    oos.flush();
//                    oos.close();
//                    connection.close();
//
//
//                    /* and its replication */
//                    int i = 1;
//                    while (true) {
//                        if ((i >= 0)) {
//                            Log.v("delete", "port was mismatch, now also deleting key's replicas  " + (five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(i))));
//                            Handshake delete_request2 = new Handshake();
//                            delete_request2.setPurpose("Delete");
//                            delete_request2.setkey(selection);
//                            Socket connection2 = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), ((five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(i)))));
//                            ObjectOutputStream oos2 = new ObjectOutputStream(connection2.getOutputStream());
//                            oos2.writeObject(delete_request2);
//                            oos2.flush();
//                            oos2.close();
//                            connection2.close();
//
//                            i--;
//                        } else {
//                            break;
//                        }
//                    }
//
//
//                } catch (Exception e) {
//                     /* first i = 1 and then 0 */
//                    Log.i("delete", e.toString());
//
//                }
//
//
//            }
//
//
//        }).start();
//
//    }

//    private void Rep_Del_Thread(final String selection) {
//        new Thread(new HelloRunnable() {
//            @Override
//            public void run() {
//
//
//                try {
//
//
//                     /* delete replication only */
//                    int i = 1;
//                    while (true) {
//                        if ((i >= 0)) {
//                            Log.v("delete", " port was matched, now just deleting replicas only " + (five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(i))));
//                            Handshake delete_request2 = new Handshake();
//                            delete_request2.setPurpose("Delete");
//                            delete_request2.setkey(selection);
//                            Socket connection2 = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), ((five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(i)))));
//                            ObjectOutputStream oos2 = new ObjectOutputStream(connection2.getOutputStream());
//                            oos2.writeObject(delete_request2);
//                            oos2.flush();
//                            oos2.close();
//                            connection2.close();
//
//                            i--;
//                        } else {
//                            break;
//                        }
//                    }
//
//
//                } catch (Exception e) {
//                    /* first i = 1 and then 0 */
//                    Log.i("delete", e.toString());
//
//                }
//
//
//            }
//
//
//        }).start();
//
//    }

    private void Del_Resolver(final String selection) {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {



                int self = five_digit_id(consistent_hash(compar_hash(genHash(selection))));//key managed by what port? (head)
                int suc = five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(0)); //key 's suc
                int suc_of_suc = five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(1));  //key 's suc of suc


                try {



                    Log.v("delete", "The delete resolver is trying to delete key " + (selection) + " at port "+ self);
                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), self);
                    ObjectOutputStream oos;
                    oos = new ObjectOutputStream(connection.getOutputStream());
                    Handshake resend_msg = new Handshake(); //msg obj
                    resend_msg.setPurpose("Delete");
                    resend_msg.setkey(selection);

                    oos.writeObject(resend_msg);//send out the msg
                    oos.flush();//Force send out the msg

                    oos.close();
                    connection.close();


                } catch (Exception eee) {
                    Log.v("delete", " (Failed) The delete resolver is trying to delete key  " + (selection) + " at port "+ self);

                }

                try {


                    Log.v("delete", "The delete resolver is trying to delete key " + (selection) + " at port "+ suc);
                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), suc);
                    ObjectOutputStream oos;
                    oos = new ObjectOutputStream(connection.getOutputStream());
                    Handshake resend_msg = new Handshake(); //msg obj
                    resend_msg.setPurpose("Delete");
                    resend_msg.setkey(selection);

                    oos.writeObject(resend_msg);//send out the msg
                    oos.flush();//Force send out the msg

                    oos.close();
                    connection.close();


                } catch (Exception eee) {

                    Log.v("delete", " (Failed) The delete resolver is trying to delete key  " + (selection) + " at port "+ suc);

                }

                try {


                    Log.v("delete", "The delete resolver is trying to delete key " + (selection) + " at port "+ suc_of_suc);
                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), suc_of_suc);
                    ObjectOutputStream oos;
                    oos = new ObjectOutputStream(connection.getOutputStream());
                    Handshake resend_msg = new Handshake(); //msg obj
                    resend_msg.setPurpose("Delete");
                    resend_msg.setkey(selection);

                    oos.writeObject(resend_msg);//send out the msg
                    oos.flush();//Force send out the msg

                    oos.close();
                    connection.close();


                } catch (Exception eee) {
                    Log.v("delete", " (Failed) The delete resolver is trying to delete key  " + (selection) + " at port "+ suc_of_suc);

                }









            }


        }).start();

    }

    private void Del_Resolver_rep_only(final String selection) {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {


                int suc = five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(0)); //key 's suc
                int suc_of_suc = five_digit_id(getMemberList(consistent_hash(compar_hash(genHash(selection)))).get(1));  //key 's suc of suc



                try {


                    Log.v("delete", "The delete resolver is trying to delete key " + (selection) + " at port "+ suc);
                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), suc);
                    ObjectOutputStream oos;
                    oos = new ObjectOutputStream(connection.getOutputStream());
                    Handshake resend_msg = new Handshake(); //msg obj
                    resend_msg.setPurpose("Delete");
                    resend_msg.setkey(selection);

                    oos.writeObject(resend_msg);//send out the msg
                    oos.flush();//Force send out the msg

                    oos.close();
                    connection.close();


                } catch (Exception eee) {

                    Log.v("delete", " (Failed) The delete resolver is trying to delete key  " + (selection) + " at port "+ suc);

                }

                try {


                    Log.v("delete", "The delete resolver is trying to delete key " + (selection) + " at port "+ suc_of_suc);
                    Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), suc_of_suc);
                    ObjectOutputStream oos;
                    oos = new ObjectOutputStream(connection.getOutputStream());
                    Handshake resend_msg = new Handshake(); //msg obj
                    resend_msg.setPurpose("Delete");
                    resend_msg.setkey(selection);

                    oos.writeObject(resend_msg);//send out the msg
                    oos.flush();//Force send out the msg

                    oos.close();
                    connection.close();


                } catch (Exception eee) {
                    Log.v("delete", " (Failed) The delete resolver is trying to delete key  " + (selection) + " at port "+ suc_of_suc);

                }









            }


        }).start();

    }


    private void Query_star() {
        new Thread(new HelloRunnable() {
            @Override
            public void run() {


                /* Mass query */
                try {


                    {

                        try {


                            Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11108); //update other AVD except 5554.
                            ObjectOutputStream oos;
                            oos = new ObjectOutputStream(connection.getOutputStream());
                            Handshake resend_msg = new Handshake(); //msg obj
                            resend_msg.setPurpose("6");

                            oos.writeObject(resend_msg);//send out the msg
                            oos.flush();//Force send out the msg

                            ObjectInputStream ois;
                            ois = new ObjectInputStream(connection.getInputStream());
                            Handshake get_back_cusor;
                            get_back_cusor = (Handshake) ois.readObject();
                            myDHT.add(get_back_cusor);


                        } catch (Exception eee) {


                        }

                        try {


                            Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11112); //update other AVD except 5554.
                            ObjectOutputStream oos;
                            oos = new ObjectOutputStream(connection.getOutputStream());
                            Handshake resend_msg = new Handshake(); //msg obj
                            resend_msg.setPurpose("6");

                            oos.writeObject(resend_msg);//send out the msg
                            oos.flush();//Force send out the msg

                            ObjectInputStream ois;
                            ois = new ObjectInputStream(connection.getInputStream());
                            Handshake get_back_cusor;
                            get_back_cusor = (Handshake) ois.readObject();
                            myDHT.add(get_back_cusor);


                        } catch (Exception eee) {

                        }

                        try {


                            Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11116); //update other AVD except 5554.
                            ObjectOutputStream oos;
                            oos = new ObjectOutputStream(connection.getOutputStream());
                            Handshake resend_msg = new Handshake(); //msg obj
                            resend_msg.setPurpose("6");

                            oos.writeObject(resend_msg);//send out the msg
                            oos.flush();//Force send out the msg

                            ObjectInputStream ois;
                            ois = new ObjectInputStream(connection.getInputStream());
                            Handshake get_back_cusor;
                            get_back_cusor = (Handshake) ois.readObject();
                            myDHT.add(get_back_cusor);


                        } catch (Exception eee) {

                        }

                        try {


                            Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11120); //update other AVD except 5554.
                            ObjectOutputStream oos;
                            oos = new ObjectOutputStream(connection.getOutputStream());
                            Handshake resend_msg = new Handshake(); //msg obj
                            resend_msg.setPurpose("6");

                            oos.writeObject(resend_msg);//send out the msg
                            oos.flush();//Force send out the msg

                            ObjectInputStream ois;
                            ois = new ObjectInputStream(connection.getInputStream());
                            Handshake get_back_cusor;
                            get_back_cusor = (Handshake) ois.readObject();
                            myDHT.add(get_back_cusor);


                        } catch (Exception eee) {

                        }

                        try {


                            Socket connection = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11124); //update other AVD except 5554.
                            ObjectOutputStream oos;
                            oos = new ObjectOutputStream(connection.getOutputStream());
                            Handshake resend_msg = new Handshake(); //msg obj
                            resend_msg.setPurpose("6");

                            oos.writeObject(resend_msg);//send out the msg
                            oos.flush();//Force send out the msg

                            ObjectInputStream ois;
                            ois = new ObjectInputStream(connection.getInputStream());
                            Handshake get_back_cusor;
                            get_back_cusor = (Handshake) ois.readObject();
                            myDHT.add(get_back_cusor);


                        } catch (Exception eee) {

                        }


                        notifyJoy();


                    }


                } catch (Exception e) {
                    Log.i("Request", e.toString());

                }


            }


        }).start();

    }


}










































