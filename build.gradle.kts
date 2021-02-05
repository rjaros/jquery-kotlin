plugins {
    kotlin("js")
    id("maven-publish")
    id("signing")
}

repositories {
    mavenCentral()
    mavenLocal()
}

// Versions
val kotlinVersion: String by System.getProperties()

kotlin {
    js {
        compilations.all {
            kotlinOptions {
                moduleKind = "umd"
            }
        }
        browser {
            testTask {
                useKarma {
                    useChromeHeadless()
                }
            }
        }
    }
}

dependencies {
    implementation(npm("jquery", "^3.5.1"))
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(kotlin.sourceSets.main.get().kotlin)
}

publishing {
    publications {
        create<MavenPublication>("kotlin") {
            from(components["kotlin"])
            artifact(tasks["sourcesJar"])
            pom {
                defaultPom()
            }
        }
    }
}

setupSigning()
setupPublication()
