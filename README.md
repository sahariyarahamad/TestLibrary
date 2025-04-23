# How to use this library
## Step 1. Add  it in your settings.gradle

```gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
## Step 2. Add the dependency build.gradle(:app)
```gradle
dependencies {
	        implementation 'com.github.sahariyarahamad:TestLibrary:$VERSION_CODE'
	}
```
# Current Version
[![GitHub release_version](https://img.shields.io/github/v/release/sahariyarahamad/mediacaptionapp)](https://github.com/sahariyarahamad/TestLibrary/releases)

## Step 3. Past those code where you want to show toast
```java
new TestLibrary(this)
                .showToast("toast from test library", 0);
```
> **NOTE**: `0` for show toast less then 1 second and
      `1` for show more then 1 second

# Author Sahariyar Ahamad
