# TAGLINE

List running Flatpak application instances

# TLDR

List **running** instances

```flatpak ps```

Show the application id and the **sandbox** process id

```flatpak ps --columns=application,child-pid```

Show the **runtime** and its branch next to each application

```flatpak ps --columns=application,runtime,runtime-branch```

List the **column names** this command accepts

```flatpak ps --columns=help```

# SYNOPSIS

**flatpak ps** [_OPTIONS_]

# PARAMETERS

**-h**, **--help**
> Show help and exit.

**-v**, **--verbose**
> Print debug information while the command runs.

**--ostree-verbose**
> Print OSTree debug information while the command runs.

**--columns**=_FIELD_[,_FIELD_]...
> Choose which columns to print. Repeat the option or pass a comma-separated list. A column name may be shortened to a unique prefix. Append **:start**, **:middle**, **:end**, or **:full** to change how a long value is cut off.

# DESCRIPTION

**flatpak ps** lists Flatpak instances that are running. It is a subcommand of **flatpak**, not a separate program.

Columns include **instance**, **application**, **arch**, **branch**, **commit**, **runtime**, **runtime-branch**, **runtime-commit**, **pid** (the wrapper process), **child-pid** (the sandbox process), **active** (whether the app has a window), and **background** (no open windows). **all** prints every column.

The instance id is the value in the **instance** column. Details for that instance are in the file **/run/user/$UID/.flatpak/**_INSTANCE_**/info**.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-21 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-run](/man/flatpak-run)(1), [flatpak-list](/man/flatpak-list)(1)

# RESOURCES

```[Source code](https://github.com/flatpak/flatpak)```

```[Homepage](https://flatpak.org)```

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-ps)```

<!-- verified: 2026-11-21 -->
