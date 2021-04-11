package com.dean.academy.bookmark

import androidx.lifecycle.ViewModel
import com.dean.academy.data.CourseEntity
import com.dean.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}