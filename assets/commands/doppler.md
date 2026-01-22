# TLDR

**Login to Doppler**

```doppler login```

**Setup project** configuration

```doppler setup```

**List secrets** in current config

```doppler secrets```

**Run command with** secrets injected

```doppler run -- [command]```

**Download secrets** to file

```doppler secrets download --no-file --format [env]```

**Switch project**

```doppler configure set project [project_name]```

# SYNOPSIS

**doppler** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: login, setup, secrets, run, configure, etc.

**login**
> Authenticate with Doppler.

**setup**
> Configure project in current directory.

**secrets**
> List or manage secrets.

**run** **--** _COMMAND_
> Run command with secrets as environment variables.

**configure** **set** _KEY_ _VALUE_
> Set configuration value.

**--help**
> Display help information.

# DESCRIPTION

**Doppler** is a secrets management platform with a CLI for injecting secrets into applications. It securely stores and syncs environment variables across development, staging, and production environments.

The run command injects secrets as environment variables, eliminating hardcoded credentials and .env files. Secrets are fetched at runtime, ensuring applications always use current values.

Doppler supports team collaboration with access controls, audit logs, and integrations with CI/CD platforms and cloud providers.

# CAVEATS

Requires Doppler account. Network connectivity needed to fetch secrets. Free tier has limitations. Local caching available for offline scenarios.

# HISTORY

Doppler was founded in **2018** to solve the problem of secrets management for development teams. The CLI provides secure, consistent access to secrets across all environments.

# SEE ALSO

[vault](/man/vault)(1), [aws-vault](/man/aws-vault)(1), [sops](/man/sops)(1)
