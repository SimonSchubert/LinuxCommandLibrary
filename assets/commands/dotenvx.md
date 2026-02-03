# TLDR

**Run command with .env loaded**

```dotenvx run -- [command]```

**Run with specific env file**

```dotenvx run -f [.env.production] -- [command]```

**Encrypt env file**

```dotenvx encrypt```

**Decrypt env file**

```dotenvx decrypt```

**Set a key**

```dotenvx set [KEY] [value]```

**Get a key**

```dotenvx get [KEY]```

**Convert to encrypted format**

```dotenvx convert```

# SYNOPSIS

**dotenvx** _command_ [_options_]

# SUBCOMMANDS

**run**
> Load env and run command.

**get**
> Get environment variable.

**set**
> Set environment variable.

**encrypt**
> Encrypt .env file.

**decrypt**
> Decrypt .env file.

**convert**
> Convert to encrypted format.

**genexample**
> Generate .env.example.

# PARAMETERS

**-f**, **--env-file** _file_
> Path to env file.

**--overload**
> Override existing env vars.

# DESCRIPTION

**dotenvx** is an enhanced dotenv tool that loads environment variables from .env files with support for encryption. Provides secure secret management for development and deployment.

# SEE ALSO

[dotenv](/man/dotenv)(1), [env](/man/env)(1)

