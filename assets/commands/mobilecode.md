# TAGLINE

Open-source AI coding agent with iOS and Android device previews

# TLDR

**Launch** the interactive TUI

```mobilecode```

**Open** a specific project directory

```mobilecode [path/to/project]```

**Run** a prompt non-interactively

```mobilecode run "[fix the crash in MainActivity]"```

**Use** a specific model

```mobilecode --model [anthropic/claude-sonnet-4]```

**Continue** the last session

```mobilecode --continue```

**Log in** to an AI provider

```mobilecode auth login```

**List** available models

```mobilecode models```

**Start** a headless server

```mobilecode serve --port [4096]```

**Open** the web interface

```mobilecode web```

# SYNOPSIS

**mobilecode** [_command_] [_options_] [_project_]

# PARAMETERS

**--model**, **-m** _PROVIDER/MODEL_
> Model to use, in **provider/model** form (for example **anthropic/claude-sonnet-4**).

**--continue**, **-c**
> Resume the last session.

**--session**, **-s** _ID_
> Continue a specific session by ID.

**--fork**
> Fork the session before continuing (requires **--continue** or **--session**).

**--prompt** _TEXT_
> Initial prompt when launching the TUI.

**--agent** _NAME_
> Agent to use (build, plan, or a custom agent).

**--auto**
> Auto-approve permissions that are not explicitly denied.

**--mini**
> Start the minimal interactive interface instead of the full TUI.

**--print-logs**
> Print logs to stderr.

**--log-level** _LEVEL_
> **DEBUG**, **INFO**, **WARN**, or **ERROR**.

**--pure**
> Run without external plugins.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# COMMANDS

**run** [_message_...]
> Send a prompt non-interactively and exit. **--format** **default**|**json**, **--file** _path_, **--dir** _path_, **--attach** _url_.

**serve**
> Start a headless MobileCode server.

**web**
> Start the server and open the web interface.

**attach** _url_
> Connect the TUI to a running server (for example **http://localhost:4096**).

**auth**, **providers**
> Manage AI provider credentials. **login**, **logout**, **list**.

**models** [_provider_]
> List models. **--verbose**, **--refresh**.

**session list**
> List saved sessions. **session delete** _ID_ removes one.

**stats**
> Token usage and cost.

**mcp**
> Register and manage MCP servers.

**console login**
> Log in to the OpenCode console.

# DESCRIPTION

**mobilecode** is a fork of **opencode** aimed at mobile apps. It keeps OpenCode's terminal UI, desktop app, web UI, model providers, MCP, plugins, and skills. When it finds an iOS or Android project it can start a simulator or emulator preview and show the live device next to the session.

iOS detection covers Xcode projects and workspaces, CocoaPods, and Expo apps, then runs **serve-sim**. Android detection covers Gradle projects and Expo apps, then runs **serve-avd**. Projects are searched up to two directories below the session root.

The device pane starts with the session. A titlebar run control builds, installs, and launches the app: **xcodebuild** plus **simctl** on iOS, **./gradlew :**_module_**:assembleDebug** plus **adb** on Android. The same operations are exposed over HTTP as **/api/device-preview**.

The default command with no subcommand starts the TUI in the current directory (or in _project_ if given).

# CONFIGURATION

**~/.config/opencode**
> Config directory, including **opencode.json**. Existing OpenCode provider credentials, plugins, and skills apply unchanged.

**~/.local/share/opencode**
> Data directory (sessions, **auth.json**, and related state).

**OPENCODE_***
> Environment variables keep the OpenCode prefix, including **OPENCODE_SERVER_PASSWORD** and **OPENCODE_SERVER_USERNAME** for **serve** / **web**.

The install script places the binary in **~/.mobilecode/bin** and prepends that directory to PATH.

# CAVEATS

iOS preview needs macOS with Xcode (**serve-sim** wants Node 20 or newer). Android preview needs the SDK platform-tools, at least one AVD, a JDK that the project's Gradle version supports, and **aapt2** from the SDK build-tools to read the package name from a built APK.

The curl installer downloads a GitHub release tarball or zip into **~/.mobilecode/bin**. From source, clone the repo and run **bun run --cwd packages/opencode src/index.ts**. Cloud models need provider credentials (**mobilecode auth login**). The TUI needs a capable terminal.

# HISTORY

**MobileCode** is an MIT-licensed fork of **OpenCode** (anomalyco/opencode) by **hsandhu**. OpenCode is the SST team's open-source coding agent. This fork adds simulator and emulator previews via **serve-sim** and **serve-avd** while keeping OpenCode's CLI shape, config paths, and license.

# SEE ALSO

[opencode](/man/opencode)(1), [claude](/man/claude)(1), [aider](/man/aider)(1), [xcodebuild](/man/xcodebuild)(1), [adb](/man/adb)(1)

# RESOURCES

```[Source code](https://github.com/hsandhu/mobilecode)```

<!-- verified: 2026-09-05 -->
