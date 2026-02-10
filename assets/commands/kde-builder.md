# TAGLINE

tool for building KDE software from source repositories

# TLDR

**Initialize** kde-builder

```kde-builder --initial-setup```

**Build** a KDE component and its dependencies

```kde-builder [component_name]```

Build **without updating** or dependencies

```kde-builder -SD [component_name]```

**Refresh** build directories before compiling

```kde-builder -r [component_name]```

**Resume** compilation from a specific dependency

```kde-builder -f [dependency_component] [component_name]```

**Run** a built component

```kde-builder --run [executable_name]```

Install **login session**

```kde-builder --install-login-session-only```

# SYNOPSIS

**kde-builder** [_options_] [_components_]

# PARAMETERS

**--initial-setup**
> Initialize kde-builder configuration

**-S**, **--no-src**
> Don't update source code

**-D**, **--no-include-dependencies**
> Don't build dependencies

**-r**, **--refresh-build**
> Clean and refresh build directories

**-f**, **--resume-from** _COMPONENT_
> Resume build from specified component

**--run** _EXECUTABLE_
> Run a built component

**--install-login-session-only**
> Install login session files

**--no-stop-on-failure**
> Continue building if a component fails

# DESCRIPTION

**kde-builder** is a tool for building KDE software from source repositories. It handles dependency resolution, source updates, configuration, and compilation of KDE components.

The tool is a drop-in replacement for kdesrc-build with improved performance and usability. It can build individual components or entire desktop environments like Plasma.

# CAVEATS

Requires significant disk space and build time. Build dependencies must be installed separately. Configuration file customization may be needed for specific setups.

# HISTORY

kde-builder was developed as a modern replacement for kdesrc-build, providing easier setup and improved performance for building KDE software from source.

# SEE ALSO

[kdesrc-build](/man/kdesrc-build)(1), [cmake](/man/cmake)(1), [ninja](/man/ninja)(1)
