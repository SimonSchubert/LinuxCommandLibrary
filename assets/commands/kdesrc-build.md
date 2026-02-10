# TAGLINE

tool for building KDE software from source repositories

# TLDR

**Initialize** kdesrc-build

```kdesrc-build --initial-setup```

**Build** a KDE component and its dependencies

```kdesrc-build [component_name]```

Build **without updating** or dependencies

```kdesrc-build --no-src --no-include-dependencies [component_name]```

**Refresh** build directories before compiling

```kdesrc-build --refresh-build [component_name]```

**Resume** from a specific dependency

```kdesrc-build --resume-from [dependency_component] [component_name]```

**Run** a built component

```kdesrc-build --run --exec [executable_name] [component_name]```

Build **all** configured components

```kdesrc-build```

# SYNOPSIS

**kdesrc-build** [_options_] [_components_]

# PARAMETERS

**--initial-setup**
> Initialize configuration

**--no-src**
> Don't update source code

**--no-include-dependencies**
> Don't build dependencies

**--refresh-build**
> Clean build directories before building

**--resume-from** _COMPONENT_
> Resume from specified component

**--run** **--exec** _NAME_
> Run built executable

**--no-stop-on-failure**
> Continue building if component fails

# DESCRIPTION

**kdesrc-build** is a tool for building KDE software from source repositories. It automates downloading, configuring, and compiling KDE components with proper dependency handling.

The tool manages a local checkout of KDE source code and can build individual components or entire desktop environments. Configuration is stored in ~/.config/kdesrc-buildrc.

# CAVEATS

Requires significant disk space and time. Build dependencies must be installed. Consider using kde-builder as a modern replacement with improved performance.

# HISTORY

kdesrc-build has been the standard tool for KDE developers to build KDE software from source for many years. It's being gradually replaced by kde-builder.

# SEE ALSO

[kde-builder](/man/kde-builder)(1), [cmake](/man/cmake)(1), [make](/man/make)(1)
