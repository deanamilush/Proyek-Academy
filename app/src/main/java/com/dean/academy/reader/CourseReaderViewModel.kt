package com.dean.academy.reader

import androidx.lifecycle.ViewModel
import com.dean.academy.data.ContentEntity
import com.dean.academy.data.ModuleEntity
import com.dean.academy.data.source.AcademyRepository
import com.dean.academy.utils.DataDummy

class CourseReaderViewModel (private val academyRepository: AcademyRepository) : ViewModel() {

    private lateinit var courseId: String
    private lateinit var moduleId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun setSelectedModule(moduleId: String) {
        this.moduleId = moduleId
    }

    fun getModules(): ArrayList<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)

    fun getSelectedModule(): ModuleEntity = academyRepository.getContent(courseId, moduleId)
}