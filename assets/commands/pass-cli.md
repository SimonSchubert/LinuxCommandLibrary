# TAGLINE

Secure CLI and TUI password and API key manager

# TLDR

**Launch the interactive TUI**

```pass-cli```

**Initialize a new vault**

```pass-cli init```

**Add a credential**

```pass-cli add [name] --url [https://example.com]```

**Retrieve a credential**

```pass-cli get [name]```

**Generate a random password**

```pass-cli generate --length [32]```

# SYNOPSIS

**pass-cli** [_command_] [_options_]

# PARAMETERS

**init**
> Initialize a new password vault.

**add** _NAME_
> Add a new credential to the vault.

**get** _NAME_
> Retrieve a credential by name.

**list**
> Display all stored credentials.

**update** _NAME_
> Modify an existing credential.

**delete** _NAME_
> Remove a credential from the vault.

**generate**
> Create a random password.

**vault backup create**
> Create a manual vault backup.

**doctor**
> Run vault health checks.

# DESCRIPTION

**pass-cli** is a secure, cross-platform password and API key manager for the command line. It stores credentials locally with AES-256-GCM encryption and provides both a non-interactive CLI and an interactive TUI mode. Designed for developers who need quick, script-friendly access to credentials without cloud dependencies.

# HISTORY

**pass-cli** was created by **arimxyer** and is written in **Go**.

# SEE ALSO

[pass](/man/pass)(1), [passepartui](/man/passepartui)(1), [kure](/man/kure)(1), [gopass](/man/gopass)(1)
