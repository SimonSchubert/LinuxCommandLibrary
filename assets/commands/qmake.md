# TLDR

**Generate Makefile from .pro file**

```qmake [project.pro]```

**Generate for debug build**

```qmake CONFIG+=debug [project.pro]```

**Generate for release build**

```qmake CONFIG+=release [project.pro]```

**Generate Xcode project**

```qmake -spec macx-xcode [project.pro]```

**Generate Visual Studio project**

```qmake -spec win32-msvc [project.pro] -tp vc```

**Create new .pro file**

```qmake -project```

**Show Qt configuration**

```qmake -query```

# SYNOPSIS

**qmake** [_-o makefile_] [_-spec spec_] [_CONFIG+=options_] [_options_] [_project.pro_]

# PARAMETERS

**-o** _FILE_
> Output file name.

**-spec** _SPEC_
> Platform specification.

**-makefile**
> Generate Makefile (default).

**-project**
> Generate .pro file.

**-tp** _TYPE_
> Target project type.

**-query** [_VAR_]
> Query Qt configuration.

**CONFIG+=**_VALUE_
> Add configuration option.

**-r**, **--recursive**
> Process subdirectories.

**-d**
> Debug mode.

**-v**
> Version information.

# DESCRIPTION

**qmake** generates build system files for Qt projects. It reads .pro project files and produces Makefiles or IDE project files.

Project files (.pro) declare sources, headers, libraries, and build options. The qmake syntax is declarative, simpler than hand-written Makefiles.

Configuration options control build type, features, and platform specifics. Debug and release builds use different compiler flags.

Platform specifications target different build systems. Each platform has makespec files defining compiler, linker, and platform settings.

IDE integration generates native project files. Xcode projects on macOS, Visual Studio solutions on Windows.

Qt modules are linked using QT variable. Network, SQL, widgets, and other modules are added as needed.

# CAVEATS

Being replaced by CMake for new Qt6 projects. Shadow builds recommended for clean source trees. Some features are platform-specific.

# HISTORY

**qmake** has been Qt's build system since the early **1990s**, developed by Trolltech (now The Qt Company). While CMake became the primary build system for Qt 6, qmake remains supported and widely used.

# SEE ALSO

[cmake](/man/cmake)(1), [make](/man/make)(1), [qt](/man/qt)(1), [moc](/man/moc)(1)
