import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalDistributionDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

kotlin {


    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
        }
    }
    js {

        browser {

        }
        binaries.executable()
    }
    task("testClasses")
}



tasks.register("preCleanBuild") {
    group = "build"
    description = "Runs `clean` before build tasks."

    dependsOn("clean")

    doLast {
        println("Running build tasks after clean...")
    }
}
