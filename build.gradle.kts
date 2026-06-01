plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jmailen.kotlinter") version "4.1.0"
}

group = "com.ntwa"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin stdlib
    implementation(kotlin("stdlib"))

    // Testing
    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.13.2")
}

kotlin {
    jvmToolchain(11)
}

tasks.test {
    useJUnit()
}