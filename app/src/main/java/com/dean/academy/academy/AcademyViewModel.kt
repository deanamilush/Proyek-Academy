package com.dean.academy.academy

import androidx.lifecycle.ViewModel
import com.dean.academy.data.CourseEntity
import com.dean.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}