# =========================================================================
#  Linux Command Library - Compose Desktop ProGuard rules
#  Applied only to release builds via
#  compose.desktop.application.buildTypes.release.proguard
# =========================================================================

# -------- Kotlin metadata / reflection hygiene --------
-keep class kotlin.Metadata { *; }
-keepattributes *Annotation*, Signature, InnerClasses, EnclosingMethod, RuntimeVisibleAnnotations, AnnotationDefault
-dontwarn kotlin.**
-dontwarn kotlinx.**

# -------- Kotlin Coroutines (upstream coroutines.pro) --------
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepclassmembers class kotlinx.coroutines.** {
    volatile <fields>;
}
-keepclassmembers class kotlin.coroutines.SafeContinuation {
    volatile <fields>;
}
-dontwarn java.lang.instrument.ClassFileTransformer
-dontwarn sun.misc.SignalHandler
-dontwarn java.lang.instrument.Instrumentation
-dontwarn sun.misc.Signal
-dontwarn java.lang.ClassValue
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement

# -------- kotlinx.serialization (upstream rules/common.pro) --------
-keepclassmembers @kotlinx.serialization.Serializable class ** {
    static ** Companion;
}
-if @kotlinx.serialization.internal.NamedCompanion class *
-keepclassmembers class * {
    static <1> *;
}
-if @kotlinx.serialization.Serializable class ** {
    static **$* *;
}
-keepclassmembers class <2>$<3> {
    kotlinx.serialization.KSerializer serializer(...);
}
-if @kotlinx.serialization.Serializable class ** {
    public static ** INSTANCE;
}
-keepclassmembers class <1> {
    public static <1> INSTANCE;
    kotlinx.serialization.KSerializer serializer(...);
}
-keepclassmembers public class **$$serializer {
    private ** descriptor;
}
-dontnote kotlinx.serialization.**
-dontwarn kotlinx.serialization.internal.ClassValueReferences

# -------- Type-safe navigation routes --------
# Route.kt declares a @Serializable sealed class Route with data object/class
# subtypes used as NavHost type-safe destinations. Navigation Compose looks up
# the generated $serializer via reflection from the KClass, so the route types
# and their generated serializers must survive shrinking.
-keep @kotlinx.serialization.Serializable class com.linuxcommandlibrary.app.Route
-keep @kotlinx.serialization.Serializable class com.linuxcommandlibrary.app.Route$* { *; }
-keepclassmembers class com.linuxcommandlibrary.app.Route$* {
    *** Companion;
    kotlinx.serialization.KSerializer serializer(...);
}

# -------- AndroidX Navigation (upstream navigation-common rules) --------
-keepclassmembers class ** implements androidx.navigation.NavArgs {
    public static *** fromBundle(android.os.Bundle);
}
-keep class * extends androidx.navigation.Navigator
-keep class androidx.navigation.NavType { *; }
-keep class androidx.navigation.CollectionNavType { *; }
-keep class androidx.navigation.serialization.** { *; }
-keepclassmembers class androidx.navigation.serialization.** { *; }

# -------- Koin 4.x (no upstream rules file) --------
-keep class org.koin.** { *; }
-keepclassmembers class org.koin.** { *; }
-dontwarn org.koin.**

# Keep our DI module declarations so Koin's factory lookups by KClass still work.
-keep class com.linuxcommandlibrary.app.di.** { *; }
-keep class com.linuxcommandlibrary.shared.platform.** { *; }
-keep class com.linuxcommandlibrary.app.platform.** { *; }

# Keep ViewModels (Koin resolves by KClass; lifecycle ViewModel requires default ctor access).
-keep class * extends androidx.lifecycle.ViewModel { <init>(...); }
-keepnames class * extends androidx.lifecycle.ViewModel

# -------- Compose Material 3 / ProGuard Kotlin-2 metadata workaround --------
# Harmless once version.set("7.5.0") is in place; kept as defence-in-depth.
-dontwarn androidx.compose.material.**
-keep class androidx.compose.material3.** { *; }
