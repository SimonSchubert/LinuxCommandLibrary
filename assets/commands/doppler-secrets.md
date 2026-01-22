# TLDR

**List all secrets**

```doppler secrets```

**Get specific secret**

```doppler secrets get [SECRET_NAME]```

**Set a secret**

```doppler secrets set [KEY]=[value]```

**Delete a secret**

```doppler secrets delete [SECRET_NAME]```

**Download secrets** as env file

```doppler secrets download --no-file --format env```

**Download as JSON**

```doppler secrets download --no-file --format json```

# SYNOPSIS

**doppler secrets** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Operation: get, set, delete, download.

**get** _NAME_
> Retrieve specific secret value.

**set** _KEY=VALUE_
> Set secret value.

**delete** _NAME_
> Remove secret.

**download**
> Export secrets.

**--format** _FORMAT_
> Output format: env, json, yaml.

**--no-file**
> Output to stdout instead of file.

**--config** _NAME_
> Config environment.

**--help**
> Display help information.

# DESCRIPTION

**doppler secrets** manages secrets stored in Doppler. It provides read, write, and export capabilities for secrets within a project and configuration.

The download command exports secrets in various formats for integration with tools that expect .env files or other formats. The no-file flag outputs to stdout for piping.

Secret values are encrypted in transit and at rest. Access is logged for audit purposes.

# CAVEATS

Write operations require appropriate permissions. Deleted secrets may take time to propagate. Some characters may need escaping. Large secrets have size limits.

# HISTORY

doppler secrets provides the core secrets management functionality of the **Doppler** platform, enabling teams to securely manage application configuration.

# SEE ALSO

[doppler](/man/doppler)(1), [doppler-run](/man/doppler-run)(1)
