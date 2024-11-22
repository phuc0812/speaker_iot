# Distributed under the OSI-approved BSD 3-Clause License.  See accompanying
# file Copyright.txt or https://cmake.org/licensing for details.

cmake_minimum_required(VERSION 3.5)

file(MAKE_DIRECTORY
  "C:/Users/DELL/esp/v4.4.7/esp-idf/components/bootloader/subproject"
  "D:/tkhtnkd/speaker_iot/build/bootloader"
  "D:/tkhtnkd/speaker_iot/build/bootloader-prefix"
  "D:/tkhtnkd/speaker_iot/build/bootloader-prefix/tmp"
  "D:/tkhtnkd/speaker_iot/build/bootloader-prefix/src/bootloader-stamp"
  "D:/tkhtnkd/speaker_iot/build/bootloader-prefix/src"
  "D:/tkhtnkd/speaker_iot/build/bootloader-prefix/src/bootloader-stamp"
)

set(configSubDirs )
foreach(subDir IN LISTS configSubDirs)
    file(MAKE_DIRECTORY "D:/tkhtnkd/speaker_iot/build/bootloader-prefix/src/bootloader-stamp/${subDir}")
endforeach()
