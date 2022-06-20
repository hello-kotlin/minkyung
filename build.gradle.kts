import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {}

plugins {
    id("org.springframework.boot") version "2.7.0" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = "com.example"
    version = "0.0.1-SNAPSHOT"

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
