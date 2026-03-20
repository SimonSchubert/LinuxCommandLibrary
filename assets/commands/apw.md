# TAGLINE

CLI for Apple Passwords on macOS

# TLDR

**Start the background daemon**

```apw start```

**Authenticate** with the daemon

```apw auth```

**Interactively search passwords**

```apw pw```

**List passwords for a domain** in JSON

```apw pw list [domain.com]```

**Interactively search OTP tokens**

```apw otp```

**List OTP secrets for a domain** in JSON

```apw otp list [domain.com]```

# SYNOPSIS

**apw** _command_ [_options_]

# PARAMETERS

**start**
> Start the background daemon

**auth**
> Authenticate the CLI with the daemon

**pw**
> Interactively list and search passwords

**pw list** [_domain_]
> List passwords in JSON format, optionally filtered by domain

**otp**
> Interactively list and search OTP tokens

**otp list** [_domain_]
> List OTP secrets in JSON format, optionally filtered by domain

**-h**, **--help**
> Display help information

**-V**, **--version**
> Show version number

# DESCRIPTION

**apw** (Apple Passwords) is a command-line interface for accessing Apple Passwords (formerly iCloud Keychain) on macOS. It provides shell access to iCloud-synced login credentials and OTP secrets without opening System Settings. The tool uses a daemon-based architecture where a background process communicates with macOS's built-in Passwords helper tool.

Authentication uses native macOS prompts (Touch ID or password dialog), so credentials are never exposed insecurely. The **list** subcommands output JSON for scripting and automation.

# CAVEATS

Requires **macOS 14 (Sonoma) or later**. The daemon must be running and authenticated before querying. Authentication is required after each system restart.

# HISTORY

**apw** was created by **Ben Dews** (bendews), written in TypeScript with Deno and compiled to a static binary. It is licensed under GPL-3.0 and first released in March 2024.

# SEE ALSO

[pass](/man/pass)(1), [keychain](/man/keychain)(1)
