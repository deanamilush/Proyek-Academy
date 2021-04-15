package com.dean.academy.detail

import androidx.lifecycle.ViewModel
import com.dean.academy.data.CourseEntity
import com.dean.academy.data.ModuleEntity
import com.dean.academy.data.source.AcademyRepository
import com.dean.academy.utils.DataDummy

class DetailCourseViewModel (private val academyRepository: AcademyRepository) : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity = academyRepository.getCourseWithModules(courseId)

    fun getModules(): List<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)
}