# TAGLINE

JUCE audio framework project manager

# TLDR

**Open project**

```Projucer [project.jucer]```

**Create a project from a PIP header**

```Projucer --create-project-from-pip [path/to/PIP] [path/to/output]```

**Resave project files**

```Projucer --resave [project.jucer]```

**Set JUCE path**

```Projucer --set-global-search-path [os] [key] [path]```

**Bump the project version**

```Projucer --bump-version [project.jucer]```

**Show status**

```Projucer --status [project.jucer]```

# SYNOPSIS

**Projucer** [_--command_] [_arguments_]

# PARAMETERS

**--resave** _FILE_
> Regenerate IDE files.

**--resave-resources** _FILE_
> Resave just the binary resources.

**--get-version** _FILE_
> Print the project version.

**--set-version** _VERSION_ _FILE_
> Set the project version.

**--bump-version** _FILE_
> Increase the minor version number by 1.

**--create-project-from-pip** _PIP_ _OUTPUT_ [_JUCE_MODULES_] [_USER_MODULES_]
> Generate a project from a PIP file. Module paths are optional and override the global paths.

**--status** _FILE_
> Show project status.

**--set-global-search-path** _OS KEY PATH_
> Set module path.

**--help**
> Show help.

# DESCRIPTION

**Projucer** is the project management tool for the JUCE framework, used to create and maintain cross-platform audio applications and plugins. It reads **.jucer** project files that define source files, modules, and build targets, then generates native IDE projects for Xcode, Visual Studio, Linux Makefiles, and other build systems.

The tool handles JUCE module management, allowing developers to add, remove, and configure framework modules that provide audio processing, GUI components, networking, and other functionality. When the project file changes, **--resave** regenerates all IDE files to keep them in sync.

Projucer operates both as a graphical IDE for interactive development and as a command-line tool for CI/CD automation. The CLI mode supports generating projects from PIP files, regenerating build files, managing versions, and querying project status without launching the GUI.

# CAVEATS

Requires JUCE framework. Audio development focused. Large download.

# HISTORY

**Projucer** is part of **JUCE** (Jules' Utility Class Extensions), an audio application framework by ROLI (now PACE).

# SEE ALSO

[cmake](/man/cmake)(1), [make](/man/make)(1)

# RESOURCES

```[Source code](https://github.com/juce-framework/JUCE)```

```[Homepage](https://juce.com/)```

<!-- verified: 2026-11-08 -->
