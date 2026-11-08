# TAGLINE

Apply RPM SPEC file patches to the source tree

# TLDR

**Apply all patches listed in the SPEC file**

```sfdk apply```

**Reverse the applied patches**

```sfdk apply -R```

# SYNOPSIS

**sfdk apply** [**-R**]

# PARAMETERS

**-R**
> Reverse apply patches, as with **patch -R**.

# DESCRIPTION

**sfdk apply** applies all patches defined in the RPM SPEC file to the source tree. Part of the Sailfish SDK command-line tool.

# CAVEATS

Unlike **sfdk prepare**, changes made this way are not automatically recorded in a version control system.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-prepare](/man/sfdk-prepare)(1), [patch](/man/patch)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
