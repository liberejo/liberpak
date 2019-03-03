import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    application
    kotlin("jvm") version "1.3.21"
}

group = "org.liberejo"
version = "0.1.0-SNAPSHOT"

application {
    mainClassName = "org.liberejo.launcher.DesktopLauncher"
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.liberejo:launcher:0.1.0-SNAPSHOT")
    implementation("org.liberejo:api:0.1.0-SNAPSHOT")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}