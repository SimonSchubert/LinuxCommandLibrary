# TAGLINE

Sailfish OS application development toolkit

# TLDR

**Build package**

```sfdk build```

**Deploy to device**

```sfdk deploy --device```

**Run on device**

```sfdk device exec [command]```

**Create project**

```sfdk init --template [app] [project-name]```

**List devices**

```sfdk device list```

**Set target**

```sfdk config --target=[target-name]```

# SYNOPSIS

**sfdk** _command_ [_options_] [_args_]

# PARAMETERS

**build**
> Build project.

**deploy**
> Deploy to device.

**device**
> Device operations.

**init**
> Create project.

**config**
> Configuration.

**--device**
> Target device.

**--target** _NAME_
> Build target.

# DESCRIPTION

**sfdk** is the command-line interface for the Sailfish OS SDK, providing tools for developing, building, and deploying Sailfish OS applications. It handles project scaffolding from templates, cross-compilation for ARM and x86 targets, and deployment to physical devices or emulators.

The toolkit integrates with Qt/QML build systems (qmake, cmake) and manages the build environment including target SDK installations and build dependencies. Applications can be tested on emulated devices without requiring physical hardware, streamlining the development cycle.

# CAVEATS

Sailfish SDK required. Platform-specific. Qt/QML knowledge needed.

# HISTORY

**sfdk** is part of the **Sailfish OS SDK** by Jolla, providing command-line tools for mobile application development.

# SEE ALSO

[qmake](/man/qmake)(1), [rpm](/man/rpm)(1)
