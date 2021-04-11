package com.dean.academy.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}