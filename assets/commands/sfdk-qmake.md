# TAGLINE

Run qmake in Sailfish build environment

# TLDR

**Run qmake in build environment**

```sfdk qmake```

**Configure with debug option**

```sfdk qmake CONFIG+=debug```

**Display qmake help**

```sfdk qmake --help```

# SYNOPSIS

**sfdk qmake** [_qmake_options_]

# DESCRIPTION

**sfdk qmake** runs qmake inside the Sailfish OS build environment with correct Qt configuration. Together with **sfdk make**, it allows running rpmbuild so that just the corresponding part of the %build section of the SPEC file is executed. Part of Sailfish SDK.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-cmake](/man/sfdk-cmake)(1), [sfdk-make](/man/sfdk-make)(1), [qmake](/man/qmake)(1)

