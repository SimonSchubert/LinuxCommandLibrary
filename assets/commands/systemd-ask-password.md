# TAGLINE

Query user for system password

# TLDR

Ask for a password on the terminal or through a running agent

```systemd-ask-password "[prompt]"```

**Echo** the characters as they are typed

```systemd-ask-password --echo "[prompt]"```

Reuse an answer that is **already cached** in the kernel keyring

```systemd-ask-password --accept-cached --keyname [key_name] "[prompt]"```

Cache the answer **without printing it**

```systemd-ask-password --no-output --keyname [key_name] "[prompt]"```

Accept **several passwords** in one query

```systemd-ask-password --multiple "[prompt]"```

Give up after a **time limit**

```systemd-ask-password --timeout [30] "[prompt]"```

Never prompt on the terminal, so **only an agent** can answer

```systemd-ask-password --no-tty --id [myapp]/[disk] "[prompt]"```

Choose the **icon** an agent shows beside the prompt

```systemd-ask-password --icon [drive-harddisk] "[prompt]"```

Feed the answer to a command **without a trailing newline**

```systemd-ask-password -n | [command]```

# SYNOPSIS

**systemd-ask-password** [_options_] [_message_]

# PARAMETERS

**--id _identifier_**
> Unique identifier for the password query

**--keyname _name_**
> Kernel keyring key name for caching

**--timeout _seconds_**
> Timeout for password entry

**--no-tty**
> Never query password on current TTY

**--no-output**
> Don't print password to stdout

**-n, --newline=no**
> Don't print trailing newline

**--accept-cached**
> Accept cached password from keyring

# DESCRIPTION

**systemd-ask-password** queries the user for a system password and optionally caches it in the kernel keyring. It integrates with the systemd password agent infrastructure for boot-time password prompts.

The tool is commonly used for disk encryption passphrases, but can be used in any script requiring secure password input with optional caching.

# CAVEATS

Cached passwords in the kernel keyring are cleared on reboot. The **--no-tty** option requires a password agent to be running. Part of the systemd suite.

# INSTALL

```apt: sudo apt install systemd```

```dnf: sudo dnf install systemd```

```pacman: sudo pacman -S systemd```

```zypper: sudo zypper install systemd```

```brew: brew install systemd```

```nix: nix profile install nixpkgs#systemd```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[systemd-tty-ask-password-agent](/man/systemd-tty-ask-password-agent)(1), [cryptsetup](/man/cryptsetup)(8)
