# TAGLINE

Integrated development environment for Qt

# TLDR

**Start Qt Creator**

```qtcreator```

**Open project**

```qtcreator [project.pro]```

**Open CMake project**

```qtcreator [CMakeLists.txt]```

**Open file**

```qtcreator [file.cpp]```

**Open at line**

```qtcreator [file.cpp:42]```

**Start with clean settings**

```qtcreator -noload all```

**Client mode** (open in running instance)

```qtcreator -client [file.cpp]```

# SYNOPSIS

**qtcreator** [_-client_] [_-noload plugins_] [_options_] [_files_]

# PARAMETERS

**-client**
> Open in running instance.

**-noload** _PLUGINS_
> Don't load plugins.

**-load** _PLUGINS_
> Load only specified plugins.

**-settingspath** _PATH_
> Settings directory.

**-pid** _PID_
> Attach to process.

**-lastsession**
> Restore last session.

**-block**
> Block until files closed.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**qtcreator** is Qt's integrated development environment. It provides editing, debugging, profiling, and deployment for Qt and C++ projects.

The IDE supports Qt projects (qmake, CMake), plain CMake, and other build systems. Project wizards create new applications, libraries, and plugins.

Code editing features include syntax highlighting, completion, refactoring, and clang-based code model. The editor understands Qt-specific constructs.

Debugging integrates GDB, LLDB, and CDB. Visual debugging shows Qt types properly. QML debugging handles JavaScript and UI elements.

Profiling tools analyze CPU usage, memory allocation, and QML performance. These help optimize application performance.

Deployment configurations target desktop, embedded, Android, iOS, and other platforms. Cross-compilation toolchains are configurable.

# CAVEATS

Resource-intensive for large projects. Initial project loading can be slow. Some features require commercial Qt license.

# HISTORY

**Qt Creator** was released by **Nokia** (then owner of Qt) in **2008**. It consolidated Qt development tools into a modern IDE. Development continues under **The Qt Company**.

# SEE ALSO

[qmake](/man/qmake)(1), [cmake](/man/cmake)(1), [gdb](/man/gdb)(1), [clang](/man/clang)(1)
