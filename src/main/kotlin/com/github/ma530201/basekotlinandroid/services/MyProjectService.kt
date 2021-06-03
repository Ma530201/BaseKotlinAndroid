package com.github.ma530201.basekotlinandroid.services

import com.github.ma530201.basekotlinandroid.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
