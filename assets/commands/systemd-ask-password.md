# TAGLINE

Query user for system password

# TLDR

**Query** a system password with a specific prompt

```systemd-ask-password "[prompt]"```

**Specify** an identifier for the password query

```systemd-ask-password --id [identifier] "[prompt]"```

**Use** a kernel keyring key name as cache

```systemd-ask-password --keyname [key_name] "[prompt]"```

**Set** a custom timeout for the query

```systemd-ask-password --timeout [seconds] "[prompt]"```

**Force** the use of an agent system (never ask on TTY)

```systemd-ask-password --no-tty "[prompt]"```

**Store** a password in the kernel keyring without displaying

```systemd-ask-password --no-output --keyname [key_name] "[prompt]"```

**Pipe** a password to a command without trailing newline

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

# SEE ALSO

[systemd](/man/systemd)(1), [systemd-tty-ask-password-agent](/man/systemd-tty-ask-password-agent)(1), [cryptsetup](/man/cryptsetup)(8)
