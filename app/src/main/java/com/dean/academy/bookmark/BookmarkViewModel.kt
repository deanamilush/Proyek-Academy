package com.dean.academy.bookmark

import androidx.lifecycle.ViewModel
import com.dean.academy.data.CourseEntity
import com.dean.academy.data.source.AcademyRepository
import com.dean.academy.utils.DataDummy

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = academyRepository.getBookmarkedCourses()

}