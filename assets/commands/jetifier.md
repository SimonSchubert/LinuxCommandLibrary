# TAGLINE

migrates Android libraries from Support Library to AndroidX

# TLDR

**Convert AAR to AndroidX**

```jetifier-standalone -i [lib.aar] -o [lib-androidx.aar]```

**Convert JAR**

```jetifier-standalone -i [lib.jar] -o [lib-androidx.jar]```

**Reverse conversion**

```jetifier-standalone -r -i [lib-androidx.aar] -o [lib.aar]```

**Use a custom mapping config**

```jetifier-standalone -i [lib.aar] -o [output.aar] -c [mapping.config]```

**Verbose logging**

```jetifier-standalone -l verbose -i [input] -o [output]```

# SYNOPSIS

**jetifier-standalone** [_options_] **-i** _input_ **-o** _output_

# PARAMETERS

**-i**, **--input** _FILE_
> Input library (JAR, AAR, or ZIP). Required.

**-o**, **--output** _FILE_
> Output file. Overwritten if it exists. Required.

**-r**
> Reverse mode (AndroidX to Support Library).

**-c**, **--config** _FILE_
> Custom configuration file for mappings.

**-l**, **--log** _LEVEL_
> Logging level: error, warning, info, or verbose (default: warning).

**-s**, **--strict**
> Throw errors instead of falling back when rules are missing.

**-stripSignatures**, **--stripSignatures**
> Strip signature files from signed libraries instead of failing.

**-t**, **-timestamp** _POLICY_
> Timestamp policy for archived entries: keepPrevious (default), epoch, or now.

**-rebuildTopOfTree**, **--rebuildTopOfTree**
> Rebuild the Maven distribution ZIP according to the generated POM file. Not needed for jetification.

# DESCRIPTION

**jetifier** migrates Android libraries from Support Library to AndroidX. It rewrites Java, XML, POM, and ProGuard references from **android.support** packages to the corresponding **androidx** packages.

The tool enables using older libraries with AndroidX projects. It processes JAR, AAR, and ZIP files, including nested archives. Update libraries to Support Library 28.0.0 before migrating.

# CAVEATS

Distributed as a standalone download; the Android Gradle plugin bundles its own copy, enabled with **android.enableJetifier**. Forward migration (Support to AndroidX) is preferred. Types without a mapping rule are not guaranteed to migrate. Jetifier is considered legacy as most libraries have migrated to AndroidX natively, and the npm **jetifier** wrapper for React Native is archived and marked obsolete.

# HISTORY

jetifier was created by **Google** to assist in the Android Support Library to AndroidX migration introduced in 2018.

# SEE ALSO

[gradle](/man/gradle)(1)

# RESOURCES

```[Documentation](https://developer.android.com/tools/jetifier)```

<!-- verified: 2026-11-09 -->
