//Golden stable version hand shake:

//handshake
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

import android.util.Log;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;
import java.util.Hashtable;


import static android.content.ContentValues.TAG;
import static edu.buffalo.cse.cse486586.simpledynamo.SimpleDynamoProvider.Four_digit_id;
import static edu.buffalo.cse.cse486586.simpledynamo.SimpleDynamoProvider.compar_hash;
import static edu.buffalo.cse.cse486586.simpledynamo.SimpleDynamoProvider.consistent_hash;
import static edu.buffalo.cse.cse486586.simpledynamo.SimpleDynamoProvider.five_digit_id;
import static edu.buffalo.cse.cse486586.simpledynamo.SimpleDynamoProvider.getMemberList;

 /*
                    0=suc
                    1=suc of suc
                    2=pre of pre
                    3=pre
                    4=self
                     */


public class Handshake implements Serializable {


    public static String compar_hash_(String hashcode , ArrayList<Handshake> myChordRing) {
        //todo Good # 1

        if (compar_keys(hashcode, myChordRing.get(myChordRing.size() - 1).getkey()) > 0) {

            Log.i("MyLog", "SHIT this should return 177ccecaec32c54b82d5aaafc18a2dadb753e3b111124 check now " + myChordRing.get(0).getkey());
            return myChordRing.get(0).getkey();
        } else if (compar_keys(hashcode, myChordRing.get(myChordRing.size() - 1).getkey()) == 0) {
            Log.i("MyLog", "SHIT the hash is the same " + myChordRing.get(0).getkey());
            return myChordRing.get(myChordRing.size() - 1).getkey();
        } else {

            for (int i = 0; i < myChordRing.size(); i++) {
                Log.i("MyLog", "SHIT BEFORE insert crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
            }
            Handshake wtf = new Handshake();
            wtf.setkey(hashcode); //hack to get the right position in the ring.
            wtf.setval("177ccecaec32c54b82d5aaafc18a2dadb753e3b111124");//Dummy
            myChordRing.add(wtf);
            Collections.sort(myChordRing, LEX);//sort it

            for (int i = 0; i < myChordRing.size(); i++) {
                Log.i("MyLog", "SHIT after insert crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
            }


            int crap_loc = myChordRing.indexOf(wtf);
            int crap_belong_to_index = crap_loc + 1;
            String crap_belong_to_ = myChordRing.get(crap_belong_to_index).getkey();


            myChordRing.remove(wtf);
            for (int i = 0; i < myChordRing.size(); i++) {
                Log.i("MyLog", "SHIT after remove crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
            }


            Log.i("MyLog", " now I know that new hash key belong to " + crap_belong_to_ + "hash code is  " + hashcode);

            return crap_belong_to_;

        }
    }


    public static ArrayList<Handshake> initRing (ArrayList<Handshake> myChordRing) {

        Handshake hardcode0= new Handshake();
        hardcode0.setkey("177ccecaec32c54b82d5aaafc18a2dadb753e3b1");
        hardcode0.setval("11124");

        Handshake hardcode1= new Handshake();


        Handshake hardcode2= new Handshake();


        Handshake hardcode3= new Handshake();


        Handshake hardcode4= new Handshake();



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
        return myChordRing;

    }

    public static boolean get_correct_keys(String key, String failedPort, String recover_from_what) {

        /* Recover the missed key */
        /* https://docs.google.com/presentation/d/1TiRE09XMGR0dbVvKICiX2Ybh0JLxHxRnf8g-wdjzuzM/edit?usp=sharing */

        if (!recover_from_what.equals(getMemberList(failedPort).get(0))) {
            if (!recover_from_what.equals(getMemberList(failedPort).get(3))) {
                if (recover_from_what.equals(getMemberList(failedPort).get(2))) {
                    return consistent_hash(compar_hash(genHash(key))).equals(getMemberList(failedPort).get(3));

                }
            } else {
                return consistent_hash(compar_hash(genHash(key))).equals(failedPort) || consistent_hash(compar_hash(genHash(key))).equals(getMemberList(failedPort).get(3)) || consistent_hash(compar_hash(genHash(key))).equals(getMemberList(failedPort).get(2));

            }
        } else {

            return consistent_hash(compar_hash(genHash(key))).equals(getMemberList(failedPort).get(3)) || consistent_hash(compar_hash(genHash(key))).equals(failedPort);

        }

        Log.i(TAG, " Unhandled case when asking " +  Four_digit_id(five_digit_id(recover_from_what)));
        return false;

    }

//        boolean value = recover_from_what.equals(getMemberList(failedPort).get(0)) ? consistent_hash(compar_hash(genHash(key))).equals(getMemberList(failedPort).get(3)) || consistent_hash(compar_hash(genHash(key))).equals(failedPort) : recover_from_what.equals(getMemberList(failedPort).get(3)) ? consistent_hash(compar_hash(genHash(key))).equals(failedPort) || consistent_hash(compar_hash(genHash(key))).equals(getMemberList(failedPort).get(3)) || consistent_hash(compar_hash(genHash(key))).equals(getMemberList(failedPort).get(2)) : recover_from_what.equals(getMemberList(failedPort).get(2)) ? consistent_hash(compar_hash(genHash(key))).equals(getMemberList(failedPort).get(3)) : false;


//    }







    public static String genHash_(String input)  {
        MessageDigest sha1 = null;
        try {
            sha1 = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] sha1Hash = sha1.digest(input.getBytes());
        Formatter formatter = new Formatter();
        for (byte b : sha1Hash) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }


    //https://developer.android.com/reference/java/io/Serializable.html

    private String msgContent = "";
    //    private double seqNumPrecise = 0.0;
    private int Client_AVD_ID = 0;
    private int Ack = -999;
//    private Cursor pass_query ;

    private int seqNum = -999;

    private ArrayList<Handshake> theRING = new ArrayList<Handshake>();
    private Hashtable<String, String> ConMap = new Hashtable<String, String>();

    private String senderPort = "";


    //todo Handshake Main Structure

    private String thePurpose = "Join";
    private String theKey = "";
    private String theValue = "";
    private int theSender = 0;
    private int theReceiver = 0;


    public String getsenderPort() {
        return senderPort;
    }

    public void setsenderPort(String temp) {
        this.senderPort = temp;
    }


    public String getPurpose() {
        return thePurpose;
    }

    public void setPurpose(String temp) {
        this.thePurpose = temp;
    }


    private int theReplicate;

    public Hashtable<String, String> getConMap() {
        return ConMap;
    }

    public void setConMap(Hashtable<String, String> temp) {
        this.ConMap = temp;
    }


    public int getReplicate() {
        return theReplicate;
    }

    public void setReplicate(int temp) {
        this.theReplicate = temp;
    }


    public ArrayList<Handshake> getRING() {
        return theRING;
    }

    public void setRING(ArrayList<Handshake> temp) {
        this.theRING = temp;
    }


    public Handshake() {
        this.seqNum = seqNum;

    }


    public String getkey() {
        return theKey;
    }

    public void setkey(String seq) {
        this.theKey = seq;
    }

    public String getval() {
        return theValue;
    }

    public void setval(String seq) {
        this.theValue = seq;
    }


    public int getseq() {
        return seqNum;
    }

    public void setseq(int seq) {
        this.seqNum = seq;
    }


    public int getClient_AVD_ID() {
        return Client_AVD_ID;
    }


    public void setClient_AVD_ID(int msg) {
        this.Client_AVD_ID = msg;
    }


//    public int getAck() {
//        return Ack;
//    }
//
//    public void setAck(int msg) {
//        this.Ack = msg;
//    }


    public String getmsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msg) {
        this.msgContent = msg;
    }

    //https://developer.android.com/reference/java/util/Comparator.html
    public static Comparator<Handshake> tieBreaker = new Comparator<Handshake>() {

        public int compare(Handshake x, Handshake y) {

//            if (x.getseq() == y.getseq()) { //if two sequence number is the same, place message with the smaller suggesting process ID at the head.
//                return x.getClient_AVD_ID() - y.getClient_AVD_ID();
//            }


            return x.getseq() - y.getseq(); //if two sequence number is not the same, smaller seq # at the head.
        }
    };

    public static Comparator<Handshake> LEX = new Comparator<Handshake>() {

        public int compare(Handshake x, Handshake y) {

//            return Integer.valueOf(x.getkey()) - Integer.valueOf(y.getkey());
            return x.getkey().compareTo(y.getkey());
        }
    };


    public double tieBreaker(int avd_id) {

        double mini = 0.0;

        switch (avd_id) {
            case 0:
                mini = 0.1;


                break;

            case 1:
                mini = 0.2;


                break;

            case 2:
                mini = 0.3;


                break;

            case 3:
                mini = 0.4;


                break;

            case 4:
                mini = 0.5;


                break;
            default:

                mini = 0.0;
                break;

        }
        return mini;
    }

    ;

    public static int compar_keys(String x, String y) {


        //Return value 0 if the x is equal to this y
        //Return value less than 0 if x is lexicographically less than the y
        //Return value greater than 0 if x is lexicographically greater than the y
        //Source:https://docs.oracle.com/javase/6/docs/api/java/lang/String.html#compareTo%28java.lang.String%29
        return x.compareTo(y);
    }

    public int getTheSender() {
        return theSender;
    }

    public void setTheSender(int theSender) {
        this.theSender = theSender;
    }

    public int getTheReceiver() {
        return theReceiver;
    }

    public void setTheReceiver(int theReceiver) {
        this.theReceiver = theReceiver;
    }


    public static String genHash(String input) {
        MessageDigest sha1 = null;
        try {
            sha1 = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] sha1Hash = sha1.digest(input.getBytes());
        Formatter formatter = new Formatter();
        for (byte b : sha1Hash) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

}














