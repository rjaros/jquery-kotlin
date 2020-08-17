plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    maven ("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenLocal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
    implementation(gradleApi())
}
