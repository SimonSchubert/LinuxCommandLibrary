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

**Preview** what would be done without building anything

```kdesrc-build --pretend [component_name]```

**Rebuild only** the components that failed last time

```kdesrc-build --rebuild-failures```

Build **all** configured components

```kdesrc-build```

# SYNOPSIS

**kdesrc-build** [_options_] [_components_]

# PARAMETERS

**--initial-setup**
> Install distribution build dependencies, generate a configuration file and set up the shell environment

**--no-src**
> Don't update source code

**--no-include-dependencies**
> Don't build dependencies

**--refresh-build**
> Clean build directories before building

**--resume-from** _COMPONENT_
> Resume the build starting with the specified component

**--resume-after** _COMPONENT_
> Resume the build with the component after the specified one

**--rebuild-failures**
> Build only the components that failed during the previous run

**-p**, **--pretend**, **--dry-run**
> Show what would be done without updating or building anything

**--metadata-only**
> Only download the KDE project metadata needed for dependency resolution

**--run** [**--exec** _NAME_] _PROGRAM_
> Source the install prefix environment and run a built program (alias **--start-program**)

**--stop-on-failure**, **--no-stop-on-failure**
> Stop, or continue, after a component fails to build

# DESCRIPTION

**kdesrc-build** is a tool for building KDE software from source repositories. It automates downloading, configuring, and compiling KDE components with proper dependency handling.

The tool manages a local checkout of KDE source code and can build individual components or entire desktop environments. Configuration is read from **kdesrc-buildrc** in the current directory, **~/.config/kdesrc-buildrc**, or the legacy **~/.kdesrc-buildrc**.

# CAVEATS

Requires significant disk space and time. Build dependencies must be installed. kdesrc-build is **no longer actively developed**: KDE now recommends **kde-builder**, which accepts largely the same options but uses a YAML configuration (**kde-builder.yaml**); existing kdesrc-buildrc files can be converted.

# HISTORY

kdesrc-build, written in **Perl** and originally named **kdesvn-build** from the Subversion era, was for many years the standard tool for KDE developers to build KDE software from source. In **2024** KDE switched its recommended workflow to **kde-builder**, a Python rewrite, and kdesrc-build was superseded.

# SEE ALSO

[kde-builder](/man/kde-builder)(1), [cmake](/man/cmake)(1), [ninja](/man/ninja)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://invent.kde.org/sdk/kdesrc-build)```

<!-- verified: 2026-09-29 -->
