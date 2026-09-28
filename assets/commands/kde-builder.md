# TAGLINE

tool for building KDE software from source repositories

# TLDR

**Set up** kde-builder: install distro dependencies and generate the config

```kde-builder --initial-setup```

**Build** a KDE project and its dependencies

```kde-builder [project_name]```

Build **without updating** sources or building dependencies

```kde-builder -SD [project_name]```

**Clean build** directories before compiling

```kde-builder -c [project_name]```

**Preview** what would be done without doing it

```kde-builder -p [project_name]```

**Resume** the build from a specific project

```kde-builder -f [dependency_project] [project_name]```

**Resume** after fixing a failed build

```kde-builder --resume```

**Run** a built program with the development environment

```kde-builder --run [executable_name] [arguments]```

Install the **Plasma login session** files

```kde-builder --install-login-session-only```

# SYNOPSIS

**kde-builder** [_options_] [_projects_]

# PARAMETERS

**--initial-setup**
> Install distro packages and generate the config file (same as **--install-distro-packages --generate-config**).

**--generate-config**
> Generate the kde-builder.yaml configuration file.

**-p**, **--pretend**, **--dry-run**
> Show what would be done without doing it.

**-S**, **--no-src**
> Don't update source code.

**-s**, **--src-only**
> Only update source code, don't build.

**-d**, **--include-dependencies**; **-D**, **--no-include-dependencies**
> Build, or don't build, the projects' dependencies.

**-c**, **--clean-build**
> Remove the build directory before building.

**--reconfigure**
> Rerun CMake without cleaning the build directory.

**-f**, **--resume-from** _PROJECT_
> Resume the build starting from the given project.

**-a**, **--resume-after** _PROJECT_
> Resume the build starting after the given project.

**--resume**
> Resume from the project that failed, without source updates.

**--stop-before**, **--stop-after** _PROJECT_
> Stop the build before or after the given project.

**--no-stop-on-failure**
> Continue building other projects if one fails.

**--rebuild-failures**
> Build only the projects that failed in the previous run.

**-!**, **--ignore-projects** _PROJECT_...
> Skip the given projects.

**--run** [**-f**] _PROGRAM_ [_ARGS_]
> Run a program with the environment of the install prefix; **-f** detaches it.

**--install-login-session-only**
> Only install the Plasma login session files.

**--dependency-tree** _PROJECT_
> Print the dependency tree of a project.

**--rc-file** _FILE_
> Use a different config file.

**--self-update**
> Update kde-builder itself via git pull.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**kde-builder** is a tool for building KDE software from source repositories. It handles dependency resolution, source updates, configuration, compilation and installation of KDE projects into a separate prefix.

It can build individual applications or an entire Plasma desktop. Settings are read from **kde-builder.yaml** in the current directory or **~/.config/kde-builder.yaml**.

# CAVEATS

Requires significant disk space and build time. Automatic dependency installation only works on supported distributions. The **-r**/**--refresh-build** option of older versions was replaced by **-c**/**--clean-build**. Configuration moved from kdesrc-buildrc to YAML; existing files can be converted.

# HISTORY

kde-builder is a **Python** rewrite of the Perl-based **kdesrc-build**, led by **Andrew Shark** and released in **2024**. It replaced kdesrc-build as the tool recommended by KDE for building its software from source.

# SEE ALSO

[kdesrc-build](/man/kdesrc-build)(1), [cmake](/man/cmake)(1), [ninja](/man/ninja)(1)

# RESOURCES

```[Source code](https://invent.kde.org/sdk/kde-builder)```

```[Documentation](https://kde-builder.kde.org/)```

<!-- verified: 2026-09-29 -->
