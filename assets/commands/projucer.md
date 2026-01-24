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

**Projucer** manages JUCE projects. It generates IDE project files.

JUCE framework tool. Audio application development.

Cross-platform generation. Xcode, Visual Studio, Makefiles.

Module management included. Add JUCE modules easily.

GUI and CLI modes. Interactive or automated.

# CAVEATS

Requires JUCE framework. Audio development focused. Large download.

# HISTORY

**Projucer** is part of **JUCE** (Jules' Utility Class Extensions), an audio application framework by ROLI (now PACE).

# SEE ALSO

[cmake](/man/cmake)(1), [make](/man/make)(1)
