// 예전 문법
//buildscript {
//    repositories {
//        mavenCentral()
//    }
//    dependencies {
//        classpath(kotlin("gradle-plugin", version = "1.6.10"))
//    }
//}

// 최신문법에서는 repositories 블록처럼 플러그인을 찾아야할 장소를 언급할 필요가 없고 apply 또한 자동 적용
// 자바 라이브러리 플러그인은 jvm을 기반으로 하는 프로젝트를 위한
// build, compileJava, compileTestJava, javadoc, jar 과 같은 많은 그레이들 작업이 정의되어 있음

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
     `java-library`
    kotlin("jvm") version "1.6.10"
}

group "org.example"
version "1.0-SNAPSHOT"

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}