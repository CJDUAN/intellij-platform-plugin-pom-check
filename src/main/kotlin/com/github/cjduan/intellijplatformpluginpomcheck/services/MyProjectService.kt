package com.github.cjduan.intellijplatformpluginpomcheck.services

import com.intellij.openapi.project.Project
import com.github.cjduan.intellijplatformpluginpomcheck.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
