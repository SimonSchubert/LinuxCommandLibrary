# TAGLINE

native CLI for offline access to thousands of Linux command references

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

**Page through** a command's details

```lcl [tar] | less -R```

# SYNOPSIS

**lcl** [_command_]

**lcl** [**--list** | **-l**]

**lcl** [**--version** | **-v**]

**lcl** [**--help** | **-h**]

# PARAMETERS

**command**
> Name of a Linux command to display directly (case-insensitive). If an exact match is found, or the search yields a single result, its details are printed. If several commands match, up to 10 candidates are listed and the program exits.

**-l**, **--list**
> List all available commands in the library. Useful for piping to other tools like grep.

**-v**, **--version**
> Display the current version of Linux Command Library.

**-h**, **--help**
> Show help information with usage examples.

# DESCRIPTION

**lcl** (Linux Command Library) is a native CLI application that provides offline access to over **9000 Linux command** pages, **30 basic categories**, and general terminal tips. It functions as an interactive terminal-based reference tool for Unix and Linux commands.

The application operates in two modes: **interactive mode** when run without arguments, presenting a navigable TUI (Terminal User Interface) with menus for commands, basics, and tips; and **direct mode** when given a command name argument, printing that command's documentation to stdout without entering the TUI.

In interactive mode, the interface supports arrow key navigation, vim-style keybindings, and the mouse wheel. The search screen allows real-time filtering by typing characters. All content is bundled within the binary, requiring no internet connection.

# INTERACTIVE CONTROLS

**Arrow Up / k**
> Move selection up

**Arrow Down / j**
> Move selection down

**Enter / l**
> Select current item

**Escape / q / h**
> Go back or exit

**Page Up / Page Down**
> Scroll by page (**b** / **Space** in detail views)

**Home / End**
> Jump to start or end (**g** / **G** in detail views)

**Mouse wheel / click**
> Scroll lists and open links in command details

**Type characters**
> Filter commands in search screen

# CAVEATS

The TUI requires a terminal that supports ANSI escape sequences. On Windows, and wherever raw mode is unavailable, it falls back to line-based input where items are chosen by typing their number and **0** or **q** goes back. Only the first argument is evaluated. Some terminal emulators may not render the interface correctly if they lack proper escape sequence handling.

# HISTORY

Linux Command Library originated as an **Android app** released on the Google Play Store and F-Droid, later expanding to **iOS**, **desktop** (via Compose Multiplatform), and the **web**. An earlier JVM-based CLI was replaced in **2026** by a native CLI built with **Kotlin/Native** with the Mordant library for terminal rendering, providing a lightweight offline reference tool that runs directly in the terminal without requiring a JVM. The project maintains command documentation sourced from official man pages and the tldr-pages community project.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [cheat](/man/cheat)(1), [navi](/man/navi)(1), [apropos](/man/apropos)(1), [whatis](/man/whatis)(1)

# RESOURCES

```[Source code](https://github.com/SimonSchubert/LinuxCommandLibrary)```

```[Homepage](https://linuxcommandlibrary.com)```

<!-- verified: 2026-11-23 -->
