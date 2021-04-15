package com.dean.academy.academy

import androidx.lifecycle.ViewModel
import com.dean.academy.data.CourseEntity
import com.dean.academy.data.source.AcademyRepository
import com.dean.academy.utils.DataDummy

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): List<CourseEntity> = academyRepository.getAllCourses()

}