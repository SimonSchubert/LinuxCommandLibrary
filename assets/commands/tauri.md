# TAGLINE

Build desktop apps with web technologies

# TLDR

**Initialize a new Tauri project**

```tauri init```

**Start development server**

```tauri dev```

**Build production application**

```tauri build```

**Build with debug symbols**

```tauri build --debug```

**Build for specific target**

```tauri build --target [x86_64-apple-darwin]```

**Build specific bundle types**

```tauri build --bundles [deb,appimage]```

**Generate icons**

```tauri icon [icon.png]```

**Display version**

```tauri --version```

# SYNOPSIS

**tauri** [_command_] [_options_]

**cargo tauri** [_command_] [_options_]

# COMMANDS

**init**: Initialize a new Tauri project in existing directory.

**dev**: Start development server with hot-reload.

**build**: Build production application bundle.

**icon**: Generate icons from source image.

**info**: Show environment diagnostic information.

**add**: Add a Tauri plugin to the project.

**plugin**: Plugin development commands.

**signer**: Signing utilities for updates.

**completions**: Generate shell completions.

# PARAMETERS

**-v**, **--verbose**
> Enable verbose logging.

**-d**, **--debug**
> Build with debug profile.

**-t**, **--target** _target_
> Target triple (e.g., x86_64-unknown-linux-gnu).

**-f**, **--features** _features_
> Comma-separated Rust features to enable.

**-b**, **--bundles** _bundles_
> Bundle types: deb, rpm, appimage, msi, app, dmg, updater.

**-r**, **--runner** _runner_
> Build tool to use (default: cargo).

**-c**, **--config** _file_
> Path to tauri.conf.json or config JSON string.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**tauri** is the command-line interface for building Tauri applications. Tauri is a framework for building tiny, fast desktop applications with web technologies (HTML, CSS, JavaScript) and a Rust backend.

The CLI manages the complete application lifecycle: project initialization, development with hot-reload, production builds, and distribution packaging. It integrates with the frontend build process and handles platform-specific bundling.

Applications can be built for Windows (MSI, NSIS), macOS (DMG, app bundle), and Linux (DEB, RPM, AppImage). The framework produces small binaries by using the system webview rather than bundling a browser engine.

Install via Cargo: `cargo install tauri-cli` or npm: `npm add -D @tauri-apps/cli`

# CAVEATS

Requires Rust toolchain and platform-specific dependencies (WebKitGTK on Linux, Xcode on macOS, WebView2 on Windows). Cross-compilation has limitations. Universal macOS builds require both ARM and Intel targets installed.

# HISTORY

**Tauri** was created as a lightweight alternative to Electron, using system webviews instead of bundled Chromium. Version 1.0 was released in 2022, with version 2.0 adding mobile platform support. The project is maintained by the Tauri Program within the Commons Conservancy.

# SEE ALSO

[cargo](/man/cargo)(1), [npm](/man/npm)(1), [electron](/man/electron)(1)
