# TLDR

**Compile a single resource file**

```aapt2 compile [path/to/resource.xml] -o [output_directory]```

**Compile all resources in a directory**

```aapt2 compile --dir [path/to/res] -o [resources.zip]```

**Link compiled resources into an APK**

```aapt2 link -o [output.apk] -I [android.jar] [compiled_resources.flat] --manifest [AndroidManifest.xml]```

**Dump APK information**

```aapt2 dump [badging|permissions|resources] [path/to/app.apk]```

**Convert between APK formats**

```aapt2 convert -o [output.apk] [input.apk]```

**Optimize an APK**

```aapt2 optimize -o [optimized.apk] [input.apk]```

# SYNOPSIS

**aapt2** _command_ [_options_] [_files_]

# PARAMETERS

**compile**
> Compile individual resource files into binary format (.flat files).

**link**
> Merge compiled resources and generate the final APK or resource table.

**dump**
> Print information about an APK (badging, permissions, resources, configurations).

**diff**
> Compare two APKs and show differences.

**optimize**
> Optimize APK resources for size and performance.

**convert**
> Convert APK between binary and proto formats.

**-o** _file_
> Specify output file or directory.

**-I** _path_
> Add an Android JAR or APK to the include path (typically android.jar).

**--dir** _path_
> Compile all resources in the specified directory.

**--manifest** _file_
> Specify the AndroidManifest.xml file during linking.

**-v**
> Enable verbose output.

**--help**
> Display help for a specific command.

# DESCRIPTION

**aapt2** (Android Asset Packaging Tool 2) is Google's next-generation tool for compiling and packaging Android application resources. It replaces the original aapt tool with a faster, incremental compilation approach.

The tool operates in two main phases: **compile** transforms individual resource files (XML, PNG, etc.) into an intermediate binary format (.flat files), while **link** combines these compiled resources with the manifest to produce the final APK or resource archive. This separation enables incremental builds where only changed resources need recompilation.

aapt2 is typically invoked automatically by build systems like Gradle, but can be used directly for custom build pipelines, debugging resource issues, or inspecting APK contents.

# CAVEATS

aapt2 has stricter validation than the original aapt and will fail on malformed resources that aapt silently accepted. Resource file names must be lowercase and contain only **a-z**, **0-9**, and underscores. The tool is distributed as part of the Android SDK Build Tools and requires the appropriate android.jar for the target API level.

# HISTORY

**aapt2** was introduced by Google in **2017** as part of Android Studio 3.0 and the Android Gradle Plugin 3.0. It was developed to address performance limitations of the original aapt tool, particularly for large projects with many resources. The incremental compilation model significantly reduces build times by avoiding reprocessing unchanged resources.

# SEE ALSO

[apksigner](/man/apksigner)(1), [zipalign](/man/zipalign)(1), [adb](/man/adb)(1), [bundletool](/man/bundletool)(1)
