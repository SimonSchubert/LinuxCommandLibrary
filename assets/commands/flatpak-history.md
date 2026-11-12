# TAGLINE

Show historical changes to Flatpak installations

# TLDR

**Show** installs, updates, and removals

```flatpak history```

Show **per-user** installation changes

```flatpak history --user```

Show **system-wide** installation changes

```flatpak history --system```

Changes **since** a time

```flatpak history --since [2h]```

Changes **until** a time

```flatpak history --until [2026-01-01 00:00:00]```

**Newest** entries first

```flatpak history --reverse```

Pick **columns**

```flatpak history --columns [application,change,time]```

# SYNOPSIS

**flatpak history** [_OPTIONS_]

# PARAMETERS

**-u**, **--user**
> Show changes to the user installation.

**--system**
> Show changes to the default system-wide installation.

**--installation**=_NAME_
> Show changes to the named installation from `/etc/flatpak/installations.d/`. **--installation=default** is the same as **--system**.

**--since**=_TIME_
> Only show changes newer than _TIME_. Absolute times look like `YYYY-MM-DD HH:MM:SS`; relative times look like `2h`, `7days`, or `4days 2hours`.

**--until**=_TIME_
> Only show changes older than _TIME_.

**--reverse**
> Newest entries first.

**--columns**=_FIELD,..._
> Columns to print. Repeat the option or list fields with commas. Append `:s`, `:m`, `:e`, or `:f` to control ellipsis (start, middle, end, full). Field names may be abbreviated to a unique prefix. Use **help** to list columns, **all** to show every column.

**-h**, **--help**
> Show help and exit.

**-v**, **--verbose**
> Print debug information during command processing.

# DESCRIPTION

**flatpak history** lists installs, updates, and removals of applications and runtimes. It is a **flatpak** subcommand, not a separate binary.

By default it shows both per-user and system-wide installations. Restrict that with **--user**, **--system**, or **--installation**.

The data comes from the systemd journal. The same events are also available with **journalctl** using message id `c7b39b1e006b464599465e105b361485`.

**--columns** fields include **time**, **change**, **ref**, **application**, **arch**, **branch**, **installation**, **remote**, **old-commit**, **commit**, **url**, **user**, and **tool**.

# CAVEATS

Needs a readable systemd journal. Empty output is common on systems without journald, or when the journal was rotated past the events. System-wide history may require extra privileges to read journal entries written as root.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-12 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-uninstall](/man/flatpak-uninstall)(1), [flatpak-config](/man/flatpak-config)(1), [journalctl](/man/journalctl)(1)

# RESOURCES

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-history)```

```[Source code](https://github.com/flatpak/flatpak)```

<!-- verified: 2026-11-12 -->
