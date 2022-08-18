cmake_minimum_required(VERSION 3.18.1)

project("simpleapps")

add_library(
        simpleapps
        SHARED
        native-lib.cpp)

find_library(
        log-lib
        log)

target_link_libraries(
        simpleapps
        ${log-lib})