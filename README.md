# jquery-kotlin

Kotlin definition files for the jQuery library.

https://jquery.com/

### Project info

The definition files are based on jQuery version 2.x, but are compatible with newer versions as well.

### How to use

The releases of this project are available from bintray.
To use it in your project add the following code in your build.gradle.kts file.

    repositories {
        ...
        maven { url = uri("https://dl.bintray.com/rjaros/kotlin") }
    }

    dependencies {
        ...
        api("pl.treksoft:jquery-kotlin:$jqueryKotlinVersion")
    }

Don't forget to include jQuery in your project.


    dependencies {
        ...
        implementation(npm("jquery", "^3.5.1"))
    }
