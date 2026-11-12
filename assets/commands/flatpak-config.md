# TAGLINE

Manage configuration for a Flatpak installation

# TLDR

**List** all configuration keys and values

```flatpak config --list```

**Print** the value of a key

```flatpak config --get [languages]```

**Set** locale extensions to install

```flatpak config --set languages "sv;en;fi"```

**Unset** a key so Flatpak uses its default

```flatpak config --unset [languages]```

Configure the **per-user** installation

```flatpak config --user --list```

Configure the **system-wide** installation

```flatpak config --system --list```

# SYNOPSIS

**flatpak config** [_OPTIONS_]

**flatpak config** [_OPTIONS_] **--set** _KEY_ _VALUE_

**flatpak config** [_OPTIONS_] **--get**|**--unset** _KEY_

# PARAMETERS

**--list**
> Print every key and its value.

**--set** _KEY_ _VALUE_
> Set _KEY_ to _VALUE_.

**--get** _KEY_
> Print the value of _KEY_.

**--unset** _KEY_
> Remove _KEY_ so the default applies.

**-u**, **--user**
> Configure the per-user installation.

**--system**
> Configure the default system-wide installation.

**--installation**=_NAME_
> Configure the named system-wide installation from `/etc/flatpak/installations.d/`. **--installation=default** is the same as **--system**.

**-h**, **--help**
> Show help and exit.

**-v**, **--verbose**
> Print debug information during command processing.

# DESCRIPTION

**flatpak config** shows or changes configuration for a Flatpak installation. It is a **flatpak** subcommand, not a separate binary.

Supported keys:

**languages**
> Semicolon-separated two-letter language codes for Locale extensions, or one of the special values star or star-all. When unset, Flatpak uses **extra-languages** plus the current locale.

**extra-languages**
> Extra locale identifiers used when **languages** is unset (language, optional locale, optional codeset, optional modifier), for example `en;en_DK;zh_HK.big5hkscs;uz_UZ.utf8@cyrillic`.

**report-os-info**
> If **false**, or if the file `no-report-os-info` exists under FLATPAK CONFIG DIR, Flatpak does not send OS name, version, and architecture from `/etc/os-release` to remotes in the `Flatpak-Os-Info` HTTP header. Default when unset is **true**.

For remotes, use **flatpak remote-modify**. For per-application permissions, use **flatpak override**.

# CAVEATS

System-wide changes need root or polkit. Per-user configuration lives with the user installation under `~/.local/share/flatpak/`. `*` as a languages value is a special token, not a glob.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-12 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-update](/man/flatpak-update)(1)

# RESOURCES

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-config)```

```[Source code](https://github.com/flatpak/flatpak)```

<!-- verified: 2026-11-12 -->
