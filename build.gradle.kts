plugins {
    java
    application
}

group = "dev.chanchalsadhukhan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("dev.chanchalsadhukhan.learntrack.Main")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "dev.chanchalsadhukhan.learntrack.Main"
    }
}

tasks.register<Exec>("runJar") {
    dependsOn(tasks.jar)

    standardInput = System.`in`

    commandLine(
        "java",
        "-jar",
        "${layout.buildDirectory.get()}/libs/${project.name}-${project.version}.jar"
    )
}
