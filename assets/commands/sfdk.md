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

**sfdk** develops Sailfish OS apps. It's the SDK command line.

Project scaffolding. Create app templates.

Cross-compilation support. Build for ARM.

Device deployment. Install and run.

Emulator support. Test without hardware.

# CAVEATS

Sailfish SDK required. Platform-specific. Qt/QML knowledge needed.

# HISTORY

**sfdk** is part of the **Sailfish OS SDK** by Jolla, providing command-line tools for mobile application development.

# SEE ALSO

[qmake](/man/qmake)(1), [rpm](/man/rpm)(1)
