package com.github.mensinda.mesoncommunity.services

import com.intellij.openapi.project.Project
import com.github.mensinda.mesoncommunity.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
