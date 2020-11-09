# IonDTN-3.6.1

### Intro

ION is NASA's Implementation of DTN (Delay and Disruption Network). It is a series of protocols that enable communications in an environment subject to long delays and frequent signal disruption.

This repo holds the source code of an implementation of ION for Android devices. The app has not been mainteined in a few years, and the goal is to successfully run it and update it to current standards.

The application project is located in [ion-opensource-3.6.1/arch-android/IonDTN]

### Before Running The App

Download NDK version 17c [https://developer.android.com/ndk/downloads/older_releases].

Update the ndk.dir and sdk.dir variables to point to where your ndk and sdk are installed. File located in [ion-opensource-3.6.1/arch-android/IonDTN/local.properties].

Assign a static IP of 192.168.232.2 to the emulator. Tutorial to do this in [https://service.uoregon.edu/TDClient/2030/Portal/KB/ArticleDet?ID=33742]

Copy the android_node.rc file to the emulator (drag file and drop into emulator). FIle located in [ion-opensource-3.6.1/arch-android/Documentation/resources/code/android_node.rc].

### Running The App

Currently running on an API 26 device (x86).

With the above changes the app should build and run. If you run into more errors, the 'Bug Fixes' section below covers some errord we have run into.

Set up steps:
 - Select 1 as the node number.
 - Choose set up configuration based on file and select the uploaded android_node.rc file.
 - Toggle the slider on the next screen to start ION.

Currently, the app crashes at this stage and we are trying to determine:
 - How to access the appropriate logs that show the crash reason.
 - Fix the bug to start up the node successfully.
 
 
 ### More Documentation

The last group to maintain the app, left a thorough documentation on the set up process of the application. It can be found in the source code at [ion-opensource-3.6.1/arch-android/Documentation/index.html]. This is a better resource than the short comments left in this README.
 
 ### Bug Fixes
 
ERROR:In function ‘memcpy’,inlined from ‘rsend’ at 
dgr/test/file2udp.c:327:2:/usr/include/x86_64-linux-gnu/bits/string_fortified.h:34:10: error: ‘__builtin_memcpy’ forming offset [9, 40] is out of the bounds [0, 8] of object ‘seqCounter’ with type ‘long int’ [-Werror=array-bounds]return __builtin___memcpy_chk (__dest, __src, __len, __bos0 (__dest));

SOLUTION:Changed line 327 in file2udp.c from memcpy(buffer, (char *) &seqCounter, 40); to memcpy(buffer, (char *) &seqCounter, sizeof(seqCounter));

ERROR:nm/shared/utils/utils.c: In function ‘utils_serialize_real32’:nm/shared/utils/utils.c:806:10: error: ‘%f’ directive output truncated writing between 3 and 317 bytes into a region of size 1 [-Werror=format-truncation=]*size = snprintf(too_small, sizeof too_small, "%f", value) + 1;

SOLUTION:CFLAGS="-Wno-format-truncation" ./configureERROR:Build error no such file or directory libtinfo.so.5SOLUTION:sudo ln -s /lib/x86_64-linux-gnu/libtinfo.so.6 /lib/x86_64-linux-gnu/libtinfo.so.5
