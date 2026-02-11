# TAGLINE

JUCE audio framework project manager

# TLDR

**Open project**

```Projucer [project.jucer]```

**Create new project**

```Projucer --create-project [project-name]```

**Resave project files**

```Projucer --resave [project.jucer]```

**Set JUCE path**

```Projucer --set-global-search-path [os] [key] [path]```

**Generate Makefile**

```Projucer --resave [project.jucer]```

**Show status**

```Projucer --status [project.jucer]```

# SYNOPSIS

**Projucer** [_--resave_] [_--create-project_] [_options_] [_file_]

# PARAMETERS

**--resave** _FILE_
> Regenerate IDE files.

**--create-project** _NAME_
> Create new project.

**--status** _FILE_
> Show project status.

**--set-global-search-path** _OS KEY PATH_
> Set module path.

**--help**
> Show help.

# DESCRIPTION

**Projucer** is the project management tool for the JUCE framework, used to create and maintain cross-platform audio applications and plugins. It reads **.jucer** project files that define source files, modules, and build targets, then generates native IDE projects for Xcode, Visual Studio, Linux Makefiles, and other build systems.

The tool handles JUCE module management, allowing developers to add, remove, and configure framework modules that provide audio processing, GUI components, networking, and other functionality. When the project file changes, **--resave** regenerates all IDE files to keep them in sync.

Projucer operates both as a graphical IDE for interactive development and as a command-line tool for CI/CD automation. The CLI mode supports creating new projects, regenerating build files, and querying project status without launching the GUI.

# CAVEATS

Requires JUCE framework. Audio development focused. Large download.

# HISTORY

**Projucer** is part of **JUCE** (Jules' Utility Class Extensions), an audio application framework by ROLI (now PACE).

# SEE ALSO

[cmake](/man/cmake)(1), [make](/man/make)(1)
