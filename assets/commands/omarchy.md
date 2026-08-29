# TAGLINE

command center for the Omarchy Linux desktop

# TLDR

**List** all available commands

```omarchy commands```

**Update** Omarchy and system packages

```omarchy update```

**Apply** a theme by name

```omarchy theme set [name]```

**List** installed fonts

```omarchy font list```

**Take** a screenshot

```omarchy screenshot```

**Open** the Omarchy menu at a specific path

```omarchy menu summon style.theme```

**Print** help for a command group

```omarchy capture --help```

# SYNOPSIS

**omarchy** [_command_] [_args_...]

**omarchy** commands [**--all**] [**--json**] [**--check**]

**omarchy** _group_ [**--help**]

# DESCRIPTION

**omarchy** is the unified CLI for Omarchy, an opinionated Arch Linux + Hyprland desktop by DHH / 37signals. It is both a dispatcher and a documented front end for the distro's `omarchy-*` helper scripts.

Running **omarchy** with no arguments prints usage, common commands, and command groups. Each group (theme, capture, pkg, update, and so on) can be listed with **omarchy** _group_, and every command accepts **--help**. **omarchy commands** lists every known route; **--json** is machine-readable, **--all** includes hidden commands, and **--check** validates metadata.

Typical groups include **update** (system and Omarchy updates), **theme** and **font**, **capture** (screenshots, screen recording, OCR, QR decode), **pkg** (pacman/AUR helpers), **install**, **menu**, **agent** (coding-agent usage), **toggle**, and hardware helpers such as **brightness**, **bluetooth**, and **wifi**.

This command exists only on Omarchy. Other Arch systems do not ship it.

# PARAMETERS

**commands**
> List all documented commands. **--all** includes hidden ones, **--json** emits JSON, **--check** validates routes and metadata.

**--help**, **-h**
> Print help for the CLI, a group, or a single command.

# COMMANDS

**update**
> Update Omarchy and system packages.

**theme list** / **theme set** _name_
> List or apply desktop themes.

**font list**
> List available fonts.

**screenshot**
> Take a screenshot (also available as **omarchy capture screenshot**).

**menu** [_path_]
> Open the Omarchy menu, optionally jumping to a node such as **style.theme**.

**debug**
> Print diagnostics for support.

**pkg add** / **pkg drop**
> Install or remove packages through Omarchy's package helpers.

# CAVEATS

Omarchy-only. Subcommands wrap scripts in the Omarchy `bin/` directory; behavior and group names change between releases. Run **omarchy commands** on a live system rather than relying on a static list. Many actions assume Hyprland, pacman, and the rest of the Omarchy stack.

# SEE ALSO

[yay](/man/yay)(1), [pacman](/man/pacman)(8), [hyprland](/man/hyprland)(1), [mise](/man/mise)(1), [herdr](/man/herdr)(1)

# RESOURCES

```[Source code](https://github.com/basecamp/omarchy)```

```[Homepage](https://omarchy.org)```

```[Documentation](https://omarchy.org/manual/omarchy-cli/)```

<!-- verified: 2026-08-29 -->
