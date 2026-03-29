# TAGLINE

manages MaxCompute authentication for the odpscmd console

# TLDR

**Configure authentication interactively**

```odpscmd auth config```

**Set access credentials directly**

```odpscmd auth set --access-id [id] --access-key [key]```

**Show the current authenticated user**

```odpscmd auth whoami```

**Clear stored credentials**

```odpscmd auth clear```

# SYNOPSIS

**odpscmd** **auth** [_command_] [_options_]

# PARAMETERS

**config**
> Configure authentication interactively.

**set**
> Set credentials non-interactively using flags.

**whoami**
> Display the current authenticated user.

**clear**
> Remove stored credentials.

**--access-id** _ID_
> Alibaba Cloud access key ID.

**--access-key** _KEY_
> Alibaba Cloud access key secret.

**--help**
> Display help information.

# DESCRIPTION

**odpscmd auth** manages authentication for the odpscmd MaxCompute Console, the legacy Java-based CLI for Alibaba Cloud MaxCompute (formerly ODPS).

Credentials (access key ID and secret) are obtained from the Alibaba Cloud console and stored locally in the odpscmd configuration file. The `whoami` subcommand verifies connectivity by displaying the current account identity.

For the newer Go-based CLI, see [odps-auth](/man/odps-auth)(1).

# CAVEATS

Legacy tool. Credentials are stored in a local config file in plaintext. Requires Java runtime.

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odps-auth](/man/odps-auth)(1)
