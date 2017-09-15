# jquery-kotlin

Kotlin definition files for the jQuery library.

https://jquery.com/

### Project info

The definition files are based on jQuery version 2.x.

### How to use

The releases of this project are available from bintray.
To use it in your project add the following code in your build.gradle file.

    repositories {
        ...
        maven { url = 'https://dl.bintray.com/rjaros/kotlin' }
    }

    dependencies {
        ...
        compile "pl.treksoft:jquery-kotlin:[version]"
    }

Use [kotlin-frontend-plugin](https://github.com/Kotlin/kotlin-frontend-plugin) to include jQuery to your project.

    kotlinFrontend {
        ...
        npm {
            ...
            dependency "jquery"
            ...
        }
        ...
    }
