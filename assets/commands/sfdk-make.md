# TAGLINE

Run the make build step in the Sailfish build environment

# TLDR

**Build the project**

```sfdk make```

**Build with parallel jobs**

```sfdk make -j[4]```

**Run a specific make target**

```sfdk make [clean]```

# SYNOPSIS

**sfdk make** [_make-extra-arg_...]

# DESCRIPTION

**sfdk make** runs **rpmbuild** to execute just the %build section of the RPM SPEC file, suppressing any **qmake** invocation and any project-generating **cmake** invocation found there. Extra arguments are passed to make. Part of the Sailfish SDK command-line tool.

For CMake projects using make as the build tool, **sfdk cmake --build .** **--** _make-extra-arg_ gives the same results.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-qmake](/man/sfdk-qmake)(1), [sfdk-cmake](/man/sfdk-cmake)(1), [sfdk-make-install](/man/sfdk-make-install)(1), [make](/man/make)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
