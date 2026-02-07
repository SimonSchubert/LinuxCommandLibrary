# TAGLINE

encrypted environment variable manager

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

# CONFIGURATION

**.env**
> Default environment variables file loaded automatically.

**.env.keys**
> Encryption keys for decrypting .env files.

# DESCRIPTION

**dotenvx** is an enhanced dotenv tool that loads environment variables from .env files with support for encryption. It extends the traditional dotenv pattern with built-in encryption capabilities, allowing teams to securely commit encrypted environment files to version control.

The tool supports multiple environment files (.env.production, .env.staging), automatic decryption at runtime, and key management for team-based secret sharing. It provides a modern approach to managing application secrets without external secret management services.

# SEE ALSO

[dotenv](/man/dotenv)(1), [env](/man/env)(1)

