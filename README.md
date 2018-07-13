Simple-Amazon-Dynamodb
===================================

Pre-requisites
--------------

- Android Studio
- Android API 19
- Android Virtual Device
- Python



Getting Started
---------------

This project implemented a simplified version of the Amazon Dynamo key-value storage system. To test the system, clone the whole project and open it in Android Studio. 


Testing
-------

Firstly, Install Python and create Android Virtual Devices using the Python script create_avd.py, then run the Python script run_avd.py to boot up the virtual devices. finally, download the test case files from the test folder. 

After the download is completed, open an existing Android Studio project and choose the Simple-Amazon-Dynamodb directory. Then, In the built-in terminal of Android Studio, navigate to the location of where you download your test case files.

Now, type the following command in your terminal (For example: if the system is macOS):
- python set_redir.py 10000
- ./simpledynamo-grading.osx 

After these commands are executed, the test case will run and verify the correctness of the system.


License
-------

MIT License

Copyright (c) 2018 Fengyu Wu

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

