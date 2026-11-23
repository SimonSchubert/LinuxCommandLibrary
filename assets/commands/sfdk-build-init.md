# TAGLINE

Initialize a Sailfish SDK build directory

# TLDR

**Initialize the current directory** as a build directory

```sfdk build-init```

**Initialize a shadow build directory** for sources elsewhere

```mkdir [build] && cd [build] && sfdk build-init [../path/to/sources]```

**Initialize for a specific build target**

```sfdk -c target=[SailfishOS-4.5.0.24-armv7hl] build-init```

**Set the target globally** for subsequent commands

```sfdk config --global target=[SailfishOS-4.5.0.24-aarch64]```

**Initialize with a specific spec file**

```sfdk -c specfile=[rpm/my-app.spec] build-init```

# SYNOPSIS

**sfdk** [**-c** _name_=_value_ ...] **build-init** [_project-dir-or-file_]

# PARAMETERS

_project-dir-or-file_
> Source project directory or project file, for shadow (out-of-tree) builds. Defaults to the current directory.

**-c** **target=**_name_
> Build target to use (required). Usually set once with **sfdk config** and reused by all build commands.

**-c** **specfile=**_path_
> RPM SPEC file to use when the project contains more than one.

**-c** **snapshot=**_suffix_, **-c** **no-snapshot**
> Use a particular snapshot of the build target (default suffix **default**), or **%pool**[**,**_N_] for a temporary pooled snapshot. **no-snapshot** uses the build target directly.

# DESCRIPTION

**sfdk build-init** initializes the current directory as a build directory for the configured build target. It creates a hidden **.sfdk** subdirectory holding build-specific data that sfdk maintains between invocations; removing it stops sfdk treating the directory as a build directory. When _project-dir-or-file_ is given, a shadow build directory is initialized; otherwise the current directory is treated as the source directory. Afterwards commands like **sfdk build-shell**, **sfdk build**, **sfdk qmake** or **sfdk make** can be run there.

This is normally done implicitly by **sfdk build**, **sfdk qmake** or **sfdk cmake**, so running it explicitly is mainly useful for plain build directories used with **sfdk build-shell**. Part of the Sailfish SDK command-line tool **sfdk**.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-config](/man/sfdk-config)(1), [sfdk-build-shell](/man/sfdk-build-shell)(1), [sfdk-build-requires](/man/sfdk-build-requires)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-23 -->

