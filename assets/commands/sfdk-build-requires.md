# TAGLINE

Update Sailfish OS build-time dependencies

# TLDR

**Install or update build-time dependencies**

```sfdk build-requires pull```

**Pull dependencies without refreshing the package cache**

```sfdk build-requires --no-refresh pull```

**Reset the build environment to a clean state, then pull**

```sfdk build-requires reset```

**Show how the build environment differs from a clean one**

```sfdk build-requires diff```

# SYNOPSIS

**sfdk build-requires** [**--**[**no-**]**refresh**] {**pull**|**reset**|**diff**}

# PARAMETERS

**pull**
> Install or update build-time dependencies, refreshing the package cache first unless **--no-refresh** is active.

**reset**
> Reset the target snapshot to the state of the original target, then pull.

**diff**
> Report package installations, removals and replacements compared to the clean build environment.

**--refresh**, **--no-refresh**
> Control whether the package cache is refreshed.

# DESCRIPTION

**sfdk build-requires** manages the build-time dependencies of a Sailfish OS project. The same installation happens implicitly during **sfdk prepare**, **sfdk build**, and **sfdk qmake** or **sfdk cmake**. Part of the Sailfish SDK command-line tool.

# CAVEATS

Unless the **no-snapshot** configuration option is used, **--no-refresh** is implied. To pick up new packages, refresh the original target instead and then run **reset**. The **reset** and **diff** commands are not available with **no-snapshot**.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-build-init](/man/sfdk-build-init)(1), [sfdk-build-shell](/man/sfdk-build-shell)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
