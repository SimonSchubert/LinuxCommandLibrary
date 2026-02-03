# TLDR

**Start interactive mode** to browse commands, basics, and tips

```lcl```

**Show details** for a specific command

```lcl [grep]```

**List all available commands** in the library

```lcl --list```

**Show version** information

```lcl --version```

**Find commands** by piping list output to grep

```lcl --list | grep [network]```

# SYNOPSIS

**lcl** [_command_]

**lcl** [**--list** | **-l**]

**lcl** [**--version** | **-v**]

**lcl** [**--help** | **-h**]

# PARAMETERS

**command**
> Name of a Linux command to display directly. If an exact match is found, shows the command details. If multiple partial matches exist, lists them for selection.

**-l**, **--list**
> List all available commands in the library. Useful for piping to other tools like grep.

**-v**, **--version**
> Display the current version of Linux Command Library.

**-h**, **--help**
> Show help information with usage examples.

# DESCRIPTION

**lcl** (Linux Command Library) is a native CLI application that provides offline access to over **6200 Linux command** man pages, **23+ basic categories**, and general terminal tips. It functions as an interactive terminal-based reference tool for Unix and Linux commands.

The application operates in two modes: **interactive mode** when run without arguments, presenting a navigable TUI (Terminal User Interface) with menus for commands, basics, and tips; and **direct mode** when given a command name argument, displaying that command's documentation immediately.

In interactive mode, the interface supports both arrow key navigation and vim-style keybindings (**j/k** for up/down). The search screen allows real-time filtering by typing characters. All content is bundled within the binary, requiring no internet connection.

# INTERACTIVE CONTROLS

**Arrow Up / k**
> Move selection up

**Arrow Down / j**
> Move selection down

**Enter**
> Select current item

**Escape / q**
> Go back or exit

**Page Up / Page Down**
> Scroll by page

**Home / End**
> Jump to start or end of list

**Type characters**
> Filter commands in search screen

# CAVEATS

The TUI requires a terminal that supports ANSI escape sequences. On Windows, raw mode input has limited support and falls back to line-based input. Some terminal emulators may not render the interface correctly if they lack proper escape sequence handling.

# HISTORY

Linux Command Library originated as an **Android app** released on the Google Play Store and F-Droid, later expanding to **iOS**, **desktop** (via Compose Multiplatform), and the **web**. The native CLI version was added in **2025** using **Kotlin/Native** with the Mordant library for terminal rendering, providing a lightweight offline reference tool that runs directly in the terminal without requiring a JVM. The project maintains command documentation sourced from official man pages and the tldr-pages community project.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [cheat](/man/cheat)(1), [apropos](/man/apropos)(1)
