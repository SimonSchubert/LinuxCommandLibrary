# TAGLINE

Build terminal apps from HTML and Rust

# TLDR

**Create** a starter app and check that it compiles

```hypercmd new [my-app]```

**Run** the app in the current directory

```hypercmd run```

Pass **arguments** through to the app

```hypercmd run -- [arg1] [arg2]```

**Type-check** templates and Rust, mapping errors back to HTML lines

```hypercmd check```

Forward extra flags to **Cargo**

```hypercmd check --locked --offline```

**Build** an optimized executable into `dist/`

```hypercmd build```

Build a **debug** binary instead (faster compile)

```hypercmd build --debug```

Print the supported **HTML and CSS** profile

```hypercmd profile```

**Upgrade** the installed CLI

```hypercmd upgrade```

Print the CLI **version**

```hypercmd --version```

# SYNOPSIS

**hypercmd** _command_ [_options_] [_args_]

**hypercmd** **--help** | **-h**

**hypercmd** **-V** | **--version**

# DESCRIPTION

**hypercmd** is a command-line tool that creates, checks, runs, and builds terminal applications whose screens are written as HTML files and whose state lives in Rust. It is the CLI for the **hypercmd** runtime, a terminal renderer for **fusor**: fusor compiles the HTML and Rust, and hypercmd lays the result out in terminal cells, handles the keyboard, and keeps the screen in sync when signals change.

The installed binary is **hypercmd**; the crates.io package is **hypercmd-cli**. Native apps run on macOS and Linux. Building an app needs **Rust 1.85** or newer. The CLI is experimental (v0.1); HTML profile and Rust APIs may change until 1.0.

`hypercmd new` writes an ordinary Cargo package: a counter example in `ui/app.html`, layout in `ui/terminal.css`, state in `src/main.rs`, and a `build.rs` that compiles the templates. Edit the HTML and Rust, then run **hypercmd run** again — the CLI does not watch files. `hypercmd check` runs `cargo check` and reports compiler diagnostics at the authored HTML locations. `hypercmd build` writes an optimized host executable to `dist/` beside `Cargo.toml`. `hypercmd profile` lists the supported HTML elements and CSS properties without building an app.

# COMMANDS

**new** _PATH_ [**--hypercmd-path** _CHECKOUT_]
> Create a Cargo package at _PATH_ and check that it compiles. The destination must not exist. The directory name becomes the package and executable name: start with a lowercase letter and use lowercase letters, digits, hyphens, or underscores. Dependencies come from crates.io unless **--hypercmd-path** points at a hypercmd repository root containing `crates/hypercmd` and `crates/hypercmd-build`.

**run** [_ARGS_ ...]
> Build the application in the current directory with Cargo's development profile, then run its executable in the terminal. Arguments go to the application, not to Cargo. Use **--** to separate application arguments from CLI options. Run from a package with one executable; projects with several binaries must use **cargo** to select one. On Unix the CLI replaces itself with the app so the app owns the terminal, signals, and suspend.

**check** [_CARGO_ARGS_ ...]
> Run `cargo check` and report compiler diagnostics at the authored HTML locations alongside Rust diagnostics. Extra arguments are forwarded to Cargo (for example **--locked**, **--offline**, **--frozen**, **--manifest-path**). Do not pass **--message-format**; hypercmd controls Cargo's diagnostic format.

**build** [**--debug**]
> Build a native executable and copy it into `dist/` beside the application's `Cargo.toml`. For a package named `my-app`, the output is `dist/my-app`. Default is an optimized release build for the current host. **--debug** uses Cargo's development profile. Run from the application directory. Projects with several binaries must use Cargo directly.

**profile**
> Print the supported HTML elements and CSS properties with accepted values. Does not build an application.

**upgrade**
> Upgrade the installed CLI to the latest stable release. An equal or older release leaves the installation unchanged. Cargo installations upgrade through Cargo in their existing installation root. Other installations download the matching macOS or Linux archive, verify its SHA-256 checksum and version, and replace the running executable. The replacement is staged in the same directory so a failed download or verification leaves the installed CLI intact. Upgrading the CLI does not change existing projects' dependency versions.

# PARAMETERS

**-h**, **--help**
> Print usage. Every subcommand also accepts **-h** / **--help**.

**-V**, **--version**
> Print the CLI version and exit.

**--hypercmd-path** _CHECKOUT_
> With **new**, depend on a local hypercmd checkout instead of crates.io.

**--debug**
> With **build**, compile without optimizations.

# CONFIGURATION

An application is an ordinary Cargo package. Declare templates and styles under **[package.metadata.hypercmd]** in `Cargo.toml`:

**entry**
> Path to the `<App>` template (for example `ui/app.html`).

**templates**
> Directories of component templates (for example `["ui"]`).

**styles**
> Stylesheet paths (for example `["ui/terminal.css"]`).

The package depends on crates **hypercmd**, **fusor-core** (imported as `fusor`), and **fusor-components**, with **hypercmd-build** as a build-dependency. `build.rs` calls `hypercmd_build::compile_app()`. Reusable components can be mounted with `hypercmd::mount::<Component>(inputs)`.

The terminal stylesheet profile is bounded: flexbox layout, `ch` and percentage sizes, padding, gaps, colors, emphasis, and scrollable overflow. Unsupported markup or CSS fails at build time.

# ENVIRONMENT

**CI**
> When set, interactive commands skip the once-a-day newer-release warning.

**XDG_CACHE_HOME**
> Cache directory for the version-check file `hypercmd/version.json`. Default `~/.cache`.

**CARGO**
> Cargo executable used when **upgrade** updates a Cargo installation. Default `cargo`.

**HYPERCMD_BIN**
> Target path for a non-Cargo **upgrade** (set by the CLI when replacing its own executable).

**HYPERCMD_VERSION**
> With `install.sh`, install a specific tagged release (for example `v0.1.2`).

# CAVEATS

The project is v0.1 and experimental. Until 1.0, each minor release may change the HTML profile and the Rust APIs. Native execution is unavailable on Windows. Building apps requires Rust 1.85 or newer (install from rustup). The `install.sh` installer puts **hypercmd** in `~/.hypercmd/bin` and prints a `PATH` line; Cargo users can `cargo install hypercmd-cli --locked` instead.

**run** and **build** expect a single binary in the current package. The CLI does not watch files: stop the app and run **hypercmd run** again after editing. Interactive commands warn when a newer release is available, checking at most once per 24 hours with a two-second timeout; checks are skipped in CI, when stdout or stderr is redirected, for help and version output, and for `check --offline` or `check --frozen`. Invalid commands, build failures, and other CLI errors return a nonzero exit status.

# HISTORY

**hypercmd** is an MIT-licensed Rust project in the **fusor-rs** organization. The **hypercmd-cli** crate was first published on **3 October 2026**. Current crates **hypercmd**, **hypercmd-build**, and **hypercmd-cli** share version **0.1.2**. It uses fusor to compile HTML templates and Ratatui's buffer and styles for terminal output.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [rustup](/man/rustup)(1), [just](/man/just)(1)

# RESOURCES

```[Source code](https://github.com/fusor-rs/hypercmd)```

```[Homepage](https://cmd.fusor.build)```

```[Documentation](https://cmd.fusor.build/docs/)```

<!-- verified: 2026-10-05 -->
