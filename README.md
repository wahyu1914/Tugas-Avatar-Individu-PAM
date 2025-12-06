Avatar - Android Studio Project (Kotlin)
=======================================

This is a minimal Android Studio project scaffold implementing the assignment from the supplied PDF.
Project highlights:
- Package: com.example.avatar
- Four Activities: LoginActivity (launcher), RegisterActivity, ProfileActivity, AvatarActivity
- Uses ConstraintLayout for all layouts
- Registration saves data to SharedPreferences
- AvatarActivity displays simple drawable placeholders for face components and checkboxes to toggle them

How to open:
1. Download the ZIP from the provided link.
2. Open Android Studio and choose "Open" then select the unzipped project folder containing settings.gradle.kts.
3. Let Gradle sync. (You may need to update Gradle and plugin versions depending on your Android Studio.)

Notes:
- Drawable "components" are simple shapes as placeholders. Replace them with provided avatar resources if you have them.
- This scaffold uses Gradle Kotlin DSL (.kts). If you prefer Groovy build.gradle, convert accordingly.
