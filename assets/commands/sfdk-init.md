# TAGLINE

Initialize new Sailfish OS projects

# TLDR

**Initialize a new QML application project** named after the current directory

```sfdk init --type qtquick2app```

**Initialize a project with a specific name**

```sfdk init --type qtquick2app [myapp]```

**Use CMake** instead of the default builder

```sfdk init --type qtquick2app --builder cmake```

**Initialize a QML-only project**

```sfdk init --type qtquick2app-qmlonly```

**List available project types** and their builders

```sfdk init --list-types```

**Initialize inside a non-empty directory**

```sfdk init --type qtquick2app --force```

# SYNOPSIS

**sfdk init** **-t**|**--type** _type_ [**-b**|**--builder** _builder_] [**--force**] [_name_]

**sfdk init** **-l**|**--list-types**

# PARAMETERS

**-t**, **--type** _type_
> Project type to create (e.g., qtquick2app).

**-b**, **--builder** _builder_
> Builder to use. Available builders depend on the project type; qmake and cmake are known, with qmake as the default.

**-l**, **--list-types**
> List the valid project types with their builders.

**--force**
> Run even if the current directory is not empty.

_name_
> Project name, used e.g. as the main package name. Defaults to the directory name.

# DESCRIPTION

**sfdk init** initializes a new Sailfish OS project of the selected type under the current working directory. Part of the Sailfish SDK command-line tools.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-config](/man/sfdk-config)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-09 -->
