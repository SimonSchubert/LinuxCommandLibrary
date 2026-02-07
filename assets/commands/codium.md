# TAGLINE

privacy-focused VS Code without Microsoft telemetry

# TLDR

**Open current directory** in VSCodium

```codium .```

**Open specific files**

```codium [file1.js] [file2.js]```

**Open file at specific line** and column

```codium -g [file.js:25:10]```

**Compare two files** in diff view

```codium -d [file1.js] [file2.js]```

**Install an extension**

```codium --install-extension [ms-python.python]```

**List installed extensions**

```codium --list-extensions```

**Open in new window**

```codium -n [path/to/project]```

# SYNOPSIS

**codium** [_options_] [_paths_...]

# PARAMETERS

**-n**, **--new-window**
> Open a new VSCodium window.

**-r**, **--reuse-window**
> Reuse the last active window.

**-g**, **--goto** _file:line[:column]_
> Open file at specific line and optional column position.

**-d**, **--diff** _file1_ _file2_
> Open diff editor comparing two files.

**-m**, **--merge** _path1_ _path2_ _base_ _result_
> Perform three-way merge.

**-w**, **--wait**
> Wait for files to be closed before returning.

**--locale** _locale_
> Set display language.

**--user-data-dir** _dir_
> Specify directory for user data; enables isolated instances.

**--extensions-dir** _dir_
> Set root path for extensions.

**--disable-extensions**
> Disable all installed extensions.

**--disable-gpu**
> Disable GPU hardware acceleration.

**--inspect-extensions** _port_
> Debug extensions at specified port.

**-s**, **--status**
> Print process usage and diagnostics.

**--verbose**
> Print verbose output.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Show help information.

# EXTENSION COMMANDS

**--install-extension** _id_
> Install or update extension by ID from Open VSX Registry.

**--uninstall-extension** _id_
> Remove an installed extension.

**--list-extensions**
> Show all installed extensions.

**--show-versions**
> Display extension version numbers with --list-extensions.

**--update-extensions**
> Update all installed extensions.

# DESCRIPTION

**codium** is the command-line interface for VSCodium, a community-driven, freely-licensed binary distribution of Visual Studio Code without Microsoft telemetry and tracking. It provides the same functionality as VS Code with enhanced privacy.

The CLI is functionally identical to VS Code's **code** command. All files, folders, and multi-root workspace features work the same way. Extensions are sourced from the **Open VSX Registry** instead of Microsoft's marketplace by default.

Settings are stored in **~/.config/VSCodium/User/settings.json** on Linux and extensions in **~/.vscode-oss**. This separation from VS Code allows running both editors simultaneously without conflicts.

VSCodium is available as native packages for Windows, macOS, and Linux, as well as Flatpak and Snap packages. The standalone CLI is also distributed separately for headless and remote scenarios.

# CAVEATS

Some proprietary VS Code extensions (like Remote Development, Live Share, and some GitHub integrations) are not available from the Open VSX Registry. Extensions must be installed from Open VSX or manually from VSIX files. Certain Microsoft-specific features may not function identically.

# HISTORY

VSCodium was created in **2018** as a response to concerns about Microsoft's telemetry in Visual Studio Code. The project builds VS Code from the open-source **vscode** repository but removes Microsoft branding, telemetry, and licensing restrictions. It uses the **MIT license** and has grown to become the primary choice for developers seeking a fully open-source VS Code experience.

# SEE ALSO

[vscode](/man/vscode)(1), [neovim](/man/neovim)(1), [vim](/man/vim)(1)
