# 🚨 C-Alerts

Una librería ligera para Android (Kotlin) que simplifica la creación de **diálogos estándar**:  
✅ Carga (loading)  
✅ Éxito  
❌ Error 
Ideal para mantener una experiencia de usuario consistente sin repetir código en cada actividad o fragmento.

---

## 📲 Instalación

### Paso 1: Agrega JitPack a tu `settings.gradle.kts`

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```
### Paso 2: Agrega la dependencia
Opción A: Directamente en build.gradle.kts (app)
```kotlin
dependencies {
    implementation 'com.github.BreydenN:C-Alerts:1.1.0'
}
```

Opción B: Usando libs.versions.toml (recomendado para proyectos organizados)
En gradle/libs.versions.toml:
```kotlin
[versions]
cAlerts = "1.1.0"

[libraries]
c-alerts = { group = "com.github.BreydenN", name = "C-Alerts", version.ref = "cAlerts" }
```

Luego en build.gradle.kts (app):
```kotlin
dependencies {
    implementation(libs.cAlerts)
}
```

## 🚀 Uso básico
```kotlin
// Mostrar loading
LoadingActivity.showLoadingDialog(this)

// Cerrar loading
LoadingActivity.closeLoadingDialog()

// Éxito
LoadingActivity.showSuccessDialog(this, "¡Listo!")

// Error
LoadingActivity.showErrorDialog(this, "Algo falló")
```
