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

Copyright 2015 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.

