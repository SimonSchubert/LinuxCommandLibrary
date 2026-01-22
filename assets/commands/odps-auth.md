# TLDR

**Login to ODPS**

```odps auth login```

**Configure credentials**

```odps auth config --access-id [id] --access-key [key]```

**Show current user**

```odps auth whoami```

**Logout**

```odps auth logout```

# SYNOPSIS

**odps** **auth** [_command_] [_options_]

# PARAMETERS

**login**
> Authenticate to ODPS.

**logout**
> Remove credentials.

**config**
> Configure authentication.

**whoami**
> Show current identity.

**--access-id** _ID_
> Access key ID.

**--access-key** _KEY_
> Access key secret.

**--help**
> Display help information.

# DESCRIPTION

**odps auth** manages MaxCompute authentication. Configures access credentials.

The tool handles login and credential storage. Part of ODPS CLI.

odps auth manages credentials.

# CAVEATS

Credentials stored locally. Part of Alibaba Cloud ODPS tools.

# HISTORY

odps auth provides **authentication management** for Alibaba Cloud MaxCompute.

# SEE ALSO

[odps](/man/odps)(1), [odpscmd](/man/odpscmd)(1)

