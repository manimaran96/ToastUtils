# ToastUtils - Library

*  Android Custom Toast notification with different colors.
*  Toast of Normal, Info, Success, Warning, Error.
*  Each Toast have diffrent color and icon.
*  Simple and Easy to Use


### Screen Shots

<img src="https://gitlab.com/manimaran/toastutils/raw/master/files/toast_utils.jpg" data-canonical-src="https://gitlab.com/manimaran/toastutils/raw/master/files/toast_utils.jpg" width="300" height="500" />

<br>

### Toast Messages

<img src="https://gitlab.com/manimaran/toastutils/raw/master/files/normal.png" data-canonical-src="https://gitlab.com/manimaran/toastutils/raw/master/files/normal.png" width="400" height="100" />

<img src="https://gitlab.com/manimaran/toastutils/raw/master/files/info.png" data-canonical-src="https://gitlab.com/manimaran/toastutils/raw/master/files/info.png" width="400" height="100" />

<br>

<img src="https://gitlab.com/manimaran/toastutils/raw/master/files/success.png" data-canonical-src="https://gitlab.com/manimaran/toastutils/raw/master/files/success.png" width="400" height="100" />

<img src="https://gitlab.com/manimaran/toastutils/raw/master/files/warning.png" data-canonical-src="https://gitlab.com/manimaran/toastutils/raw/master/files/warning.png" width="400" height="100" />

<img src="https://gitlab.com/manimaran/toastutils/raw/master/files/error.png" data-canonical-src="https://gitlab.com/manimaran/toastutils/raw/master/files/error.png" width="400" height="100" />

### How To Use

1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories

```xml
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
    }
```

2. Add the dependency

```xml
    dependencies {
        implementation 'com.gitlab.manimaran:toastutils:v1.0'
	}
```

3. Inside Java Code

```java
    // Short
    ToastUtils.showShort(getApplicationContext(), "Short Toast");

    // Long
    ToastUtils.showLong(getApplicationContext(), "Long Toast");

    // Custom
    ToastUtils.showCustom(getApplicationContext(), "Custom Toast for 3sec", 3000); // 3sec - duration

    // Info - Short
    ToastUtils.showInfoShort(getApplicationContext(), "Info Toast - Short"); 

    // Success - Short
    ToastUtils.showSuccessShort(getApplicationContext(), "Success Toast - Short");

    // Warning - Short
    ToastUtils.showWarningShort(getApplicationContext(), "Warning Toast - Short");

    // Error - Short
    ToastUtils.showErrorShort(getApplicationContext(), "Error Toast - Short");

    // Info - Long
    ToastUtils.showInfoLong(getApplicationContext(), "Info Toast - Long");

    // Success - Long
    ToastUtils.showSuccessLong(getApplicationContext(), "Success Toast - Long");

    // Warning - Long
    ToastUtils.showWarningLong(getApplicationContext(), "Warning Toast - Long");

    // Error - Long
    ToastUtils.showErrorLong(getApplicationContext(), "Error Toast - Long");

    // Info - Custom
    ToastUtils.showInfoCustom(getApplicationContext(), "Info Toast - Custom for 3sec", 3000); 

    // Success - Custom
    ToastUtils.showSuccessCustom(getApplicationContext(), "Success Toast - Custom for 3sec", 3000);

    // Warning - Custom
    ToastUtils.showWarningCustom(getApplicationContext(), "Warning Toast - Custom for 3sec", 3000);

    // Error - Custom
    ToastUtils.showErrorCustom(getApplicationContext(), "Error Toast - Custom for 3sec", 3000); 
```