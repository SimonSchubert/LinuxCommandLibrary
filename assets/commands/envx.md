# TAGLINE

Environment variable management tool

# TLDR

**Load** environment from .env file

```envx load [.env]```

**Export** current environment to file

```envx export [filename.env]```

**Run** command with specific environment

```envx run -e [KEY=VALUE] -- [command]```

**Check** for required variables

```envx check [REQUIRED_VAR1] [REQUIRED_VAR2]```

# SYNOPSIS

**envx** [_command_] [_options_] [_arguments_]

# PARAMETERS

**load** [_FILE_]
> Load environment variables from file

**export** [_FILE_]
> Export current environment to file

**run** [_options_] -- _COMMAND_
> Run command with modified environment

**check** _VARIABLES_
> Verify required variables are set

**-e, --env** _KEY=VALUE_
> Set environment variable

**-f, --file** _FILE_
> Specify environment file

**--expand**
> Expand variable references in values

**--override**
> Override existing variables

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**envx** is an environment variable management tool that provides utilities for loading, exporting, and manipulating environment configurations. It supports .env files, variable expansion, and temporary environment modifications.

The tool is useful for managing environment configurations across different environments (development, staging, production) and ensuring required variables are present before running applications.

# CAVEATS

Variable expansion may have security implications with untrusted input. .env file format may vary between tools. System environment variables are protected from modification in some cases.

# HISTORY

**envx** was created to provide a consistent way to manage environment variables across projects and environments.

# SEE ALSO

[dotenv](/man/dotenv)(1), [env](/man/env)(1), [direnv](/man/direnv)(1)