# TLDR

**Convert AAR to AndroidX**

```jetifier-standalone -i [lib.aar] -o [lib-androidx.aar]```

**Convert JAR**

```jetifier-standalone -i [lib.jar] -o [lib-androidx.jar]```

**Reverse conversion**

```jetifier-standalone -r -i [lib-androidx.aar] -o [lib.aar]```

**List mappings**

```jetifier-standalone -l```

**Verbose mode**

```jetifier-standalone -v -i [input] -o [output]```

# SYNOPSIS

**jetifier-standalone** [_options_] **-i** _input_ **-o** _output_

# PARAMETERS

**-i** _FILE_
> Input AAR/JAR file.

**-o** _FILE_
> Output file.

**-r**, **--reversed**
> Reverse (AndroidX to Support).

**-l**
> List class mappings.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**jetifier** migrates Android libraries from Support Library to AndroidX. It rewrites bytecode and resources to use new package names.

The tool enables using older libraries with AndroidX projects. It processes AAR and JAR files automatically.

jetifier converts to AndroidX.

# CAVEATS

Part of Android SDK. One-way migration preferred. Some libraries incompatible.

# HISTORY

jetifier was created by **Google** to assist in the Android Support Library to AndroidX migration introduced in 2018.

# SEE ALSO

[gradle](/man/gradle)(1), [android](/man/android)(1)
