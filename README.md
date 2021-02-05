# jquery-kotlin

Kotlin definition files for the jQuery library.

https://jquery.com/

### Project info

The definition files are based on jQuery version 2.x, but are compatible with newer versions as well.

### How to use

The artifacts of this project are published to Maven Central.
To use it in your project add the following code in your build.gradle.kts file.

    dependencies {
        ...
        api("io.kvision:jquery-kotlin:$jqueryKotlinVersion")
    }
