# TAGLINE

Build desktop apps with web technologies

# TLDR

**Initialize Tauri in an existing project**

```tauri init```

**Start the development server**

```tauri dev```

**Build the production application**

```tauri build```

**Build with the debug profile**

```tauri build --debug```

**Build for a specific target**

```tauri build --target [x86_64-apple-darwin]```

**Build specific bundle types**

```tauri build --bundles [deb,appimage]```

**Compile without creating bundles**

```tauri build --no-bundle```

**Add a plugin**

```tauri add [plugin]```

**Generate icons**

```tauri icon [icon.png]```

**Show environment information**

```tauri info```

# SYNOPSIS

**tauri** [_command_] [_options_]

**cargo tauri** [_command_] [_options_]

# COMMANDS

**init**: Initialize a Tauri project in an existing directory.

**dev**: Start the application in development mode with hot-reload.

**build**: Build the application for production.

**bundle**: Generate bundles for an already built application.

**android**: Android development and build commands.

**ios**: iOS development and build commands (macOS only).

**migrate**: Migrate a project from Tauri v1 to v2.

**info**: Show environment diagnostic information.

**add**: Add a Tauri plugin to the project.

**remove**: Remove a Tauri plugin from the project.

**plugin**: Plugin development commands.

**icon**: Generate icons from a source image.

**signer**: Signing utilities for updates.

**permission**: Manage permissions.

**capability**: Manage capabilities.

**inspect**: Inspect project values.

**completions**: Generate shell completions.

# PARAMETERS

**-v**, **--verbose**
> Enable verbose logging.

**-d**, **--debug**
> Build with the debug profile (build and bundle).

**-t**, **--target** _target_
> Target triple (e.g., x86_64-unknown-linux-gnu).

**-f**, **--features** _features_
> Space or comma separated Rust features to enable.

**-b**, **--bundles** _bundles_
> Bundle types to package, such as deb, rpm, appimage, msi, nsis, app or dmg.

**--no-bundle**
> Skip the bundling step after compiling.

**--no-sign**
> Skip code signing during build or bundling.

**--ci**
> Skip prompting for values (also enabled by the CI environment variable).

**-r**, **--runner** _runner_
> Binary to use for building the application (default: cargo).

**-c**, **--config** _config_
> JSON string or path to a JSON, JSON5 or TOML file to merge with the default configuration.

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

**Tauri** was created as a lightweight alternative to Electron, using system webviews instead of bundled Chromium. Version 1.0 was released in 2022, and version 2.0 added mobile platform support. The project is maintained by the Tauri Programme within The Commons Conservancy.

# SEE ALSO

[cargo](/man/cargo)(1), [npm](/man/npm)(1), [electron](/man/electron)(1)

# RESOURCES

```[Homepage](https://tauri.app)```

```[Source code](https://github.com/tauri-apps/tauri)```

```[Documentation](https://tauri.app/reference/cli/)```

<!-- verified: 2026-11-09 -->
