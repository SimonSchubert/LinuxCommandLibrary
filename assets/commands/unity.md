# TAGLINE

Standalone CLI to install and manage Unity Editors, modules, and projects

# TLDR

**Install** the latest long-term support Editor

```unity install lts```

**Install a specific Editor** with Android, iOS, and WebGL modules

```unity install [6000.2.10f1] -m android ios webgl```

**List Editors** installed on this machine

```unity editors -i```

**Open a project** (resolves the Editor version from project settings)

```unity open [path/to/project]```

**Sign in** to a Unity account (browser flow)

```unity auth login```

**Self-update** the CLI binary

```unity upgrade```

**Show help** for a subcommand

```unity install --help```

# SYNOPSIS

**unity** [_global-options_] _command_ [_args_]

# DESCRIPTION

**unity** is Unity Technologies' standalone command-line interface for installing and managing Unity Editors and modules from a terminal, without the Unity Hub desktop application. It is a self-contained binary aimed at CI agents, automation scripts, and terminal-first workflows. The tool is experimental; flags and subcommands may change between releases.

With **unity** you can download Editors by version or alias (**lts**, **latest**, major streams such as **6**), add platform modules (**android**, **ios**, **webgl**, and others), list installed and available releases, open projects with the matching Editor, manage licenses and auth, and self-update via **unity upgrade**. Output can be human-readable, **json**, **tsv**, or **ndjson** for pipelines.

Driving a *running* Editor (for example **unity command** or **unity command eval**) requires the experimental **com.unity.pipeline** package in the project; install it with **unity pipeline install** after signing in. That layer is optional for pure Editor install and project-open workflows.

On Linux the official install script places the binary at **~/.local/bin/unity**. Package and Homebrew installs use the package name **unity-cli** but still provide the **unity** command, because **unity** is already taken by other packages on some distributions.

# PARAMETERS

Global options and the full subcommand set are version-dependent. Run **unity --help** and **unity** _command_ **--help** for the installed binary. Common commands:

**install** [_version_] [**-m** _module_...]

> Install an Editor. Version may be a full string (for example **6000.3.7f1**) or an alias such as **lts** or **latest**. Alias **i**.

**install-modules** **-e** _version_ **-m** _module_...

> Add modules to an Editor already installed via Hub or CLI. Alias **im**.

**uninstall** _version_

> Remove an installed Editor. Alias **u**.

**editors** [**-i** | **-r**]

> List installed (**-i**) or available (**-r**) Editors; subcommands include **add** and **default**. Alias **e**.

**open** _path_

> Open a project with the Editor version declared by the project. A path as the first argument is treated like **open**.

**auth** **login** | **status** | **logout**

> Manage the Unity account session. Alias **a**.

**upgrade**

> Replace the CLI binary with the latest release (or print the package-manager upgrade command if the install is managed).

**doctor**

> Print environment and configuration diagnostics.

**--format** _human|json|tsv|ndjson_

> Select structured output for automation. **--json** is a global shorthand for JSON.

# INSTALLATION

**Install script** (macOS/Linux; beta channel as of 2026):

```
curl -fsSL https://public-cdn.cloud.unity3d.com/hub/prod/cli/install.sh | UNITY_CLI_CHANNEL=beta bash
```

**Homebrew cask** (binary name remains **unity**):

```
brew install --cask unity-cli
```

**Linux packages** (Unity repos; package name **unity-cli**):

```
sudo apt install unity-cli
```

```
sudo dnf install unity-cli
```

Register Unity's apt/rpm repositories first as described in the official docs. Self-update with **unity upgrade**, or use the matching package manager when the install is package-managed.

# CAVEATS

The CLI is labeled experimental by Unity. Scripts that still invoke the Hub with **-- --headless** need migration: version flags, error streams (**stderr**), piped default format (**tsv**), and exit codes differ from the old Hub CLI.

Modules can only be added to Editors installed through the Hub or this CLI. Manually unpacked Editors must be reinstalled or registered before modules work.

Driving a live Editor needs **com.unity.pipeline** and a signed-in session; that package is also experimental.

# HISTORY

Unity long offered Hub desktop automation via **-- --headless**. In **2026** Unity introduced this standalone **unity** binary as a faster, dependency-free replacement for terminal and CI workflows, with structured output, service-account auth, and optional live Editor control through the Pipeline package.

# SEE ALSO

[godot](/man/godot)(1)

# RESOURCES

```[Documentation](https://docs.unity.com/en-us/unity-cli)```

```[Homepage](https://unity.com/blog/meet-the-unity-cli)```

<!-- verified: 2026-08-11 -->
