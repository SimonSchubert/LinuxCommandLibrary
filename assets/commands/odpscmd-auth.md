# TLDR

**Configure authentication**

```odpscmd auth config```

**Set access credentials**

```odpscmd auth set --access-id [id] --access-key [key]```

**Check authentication**

```odpscmd auth whoami```

**Clear credentials**

```odpscmd auth clear```

# SYNOPSIS

**odpscmd** **auth** [_command_] [_options_]

# PARAMETERS

**config**
> Configure authentication.

**set**
> Set credentials.

**whoami**
> Show current user.

**clear**
> Clear credentials.

**--access-id** _ID_
> Access key ID.

**--access-key** _KEY_
> Access key secret.

**--help**
> Display help information.

# DESCRIPTION

**odpscmd auth** manages MaxCompute authentication. Configures access keys.

The tool handles credential storage. Part of odpscmd suite.

odpscmd auth manages credentials.

# CAVEATS

Legacy tool. Credentials stored in config file.

# HISTORY

odpscmd auth provides **authentication** for MaxCompute Console.

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odps-auth](/man/odps-auth)(1)

