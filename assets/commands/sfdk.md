# TAGLINE

Sailfish OS application development toolkit

# TLDR

**Create a project**

```sfdk init --type [qtquick2-app]```

**List available project types**

```sfdk init --list-types```

**List build targets**

```sfdk tools list```

**Set the build target**

```sfdk config target=[target-name]```

**Build the project**

```sfdk build```

**List devices**

```sfdk device list```

**Set the device, then deploy to it**

```sfdk config device=[device-name] && sfdk deploy --sdk```

**Run a command on the device**

```sfdk device exec [command]```

**Use a SPEC file from another location**

```sfdk --specfile [path/to/file.spec] build```

# SYNOPSIS

**sfdk** [_global-options_] _command_ [_command-options_]

**sfdk** {**--help**|**--help-**_domain_|**--help-all**}

**sfdk** **--version**

# PARAMETERS

**init**
> Initialize a new project.

**build**
> Execute all build steps at once.

**build-init**, **build-requires**, **build-shell**
> Set up the build directory, update dependencies, and run custom build steps.

**prepare**, **apply**, **qmake**, **cmake**, **make**, **make-install**, **package**
> Execute individual build steps.

**deploy**, **undeploy**
> Deploy to a device or remove from it.

**check**
> Perform quality checks.

**device**, **emulator**
> Maintain and control registered devices and emulators.

**engine**, **tools**
> Maintain and control the build engine and build tools.

**debug**
> Debug software with the GNU debugger.

**compiledb**
> Generate a compilation database.

**qmltypes**
> Generate qmltypes files.

**scrape**
> Save modifications from sources as patches.

**config**, **misc**, **maintain**
> Configure sfdk, manage miscellaneous SDK properties, and launch the SDK Maintenance tool.

**-c** _name_[**=**[_value_]]
> Push a configuration option for this command only.

**-C** _path_
> Run as if started in _path_.

**--specfile** _file_
> Shorthand for the **specfile** configuration option.

**--quiet**
> Suppress informational messages.

**--debug**
> Enable diagnostic messages and disable reverse path mapping in command output.

**--no-pager**
> Do not paginate output.

**--no-session**
> Do not read or write session-scope configuration.

# DESCRIPTION

**sfdk** is the command-line interface for the Sailfish OS SDK, providing tools for developing, building, and deploying Sailfish OS applications. It handles project scaffolding from templates, cross-compilation for ARM and x86 targets, and deployment to physical devices or emulators.

The toolkit integrates with Qt/QML build systems (qmake, cmake) and manages the build environment including target SDK installations and build dependencies. Applications can be tested on emulated devices without requiring physical hardware, streamlining the development cycle.

# CAVEATS

Sailfish SDK required. Platform-specific. Qt/QML knowledge needed.

# HISTORY

**sfdk** is part of the **Sailfish OS SDK** by Jolla, providing command-line tools for mobile application development.

# SEE ALSO

[sfdk-init](/man/sfdk-init)(1), [sfdk-config](/man/sfdk-config)(1), [sfdk-device](/man/sfdk-device)(1), [sfdk-deploy](/man/sfdk-deploy)(1), [sfdk-emulator](/man/sfdk-emulator)(1), [qmake](/man/qmake)(1), [rpm](/man/rpm)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
