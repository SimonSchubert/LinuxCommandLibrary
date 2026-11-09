# TAGLINE

Run qmake in Sailfish build environment

# TLDR

**Run qmake in build environment**

```sfdk qmake```

**Configure with debug option**

```sfdk qmake CONFIG+=debug```

**Do a shadow build** of a project in another directory

```sfdk qmake [path/to/project]```

**Run qmake, then build**

```sfdk qmake && sfdk make```

**Show building command help**

```sfdk --help-building```

# SYNOPSIS

**sfdk qmake** [_project-dir-or-file_] [**--**] [_qmake-extra-arg_...]

# DESCRIPTION

**sfdk qmake** runs **rpmbuild** in the Sailfish OS build environment and executes only the %build section of the RPM SPEC file, suppressing any **make** call in it. Together with **sfdk make**, it runs the configure and compile parts separately. Part of Sailfish SDK.

With a _project-dir-or-file_ a shadow build is done; otherwise the current directory is the project directory.

# CAVEATS

The project needs an RPM SPEC file, and a build target must be selected, for example with **sfdk config target=**. The file name part of the path is ignored, since the qmake call inside the SPEC file selects the project file.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-cmake](/man/sfdk-cmake)(1), [sfdk-make](/man/sfdk-make)(1), [qmake](/man/qmake)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-09 -->
