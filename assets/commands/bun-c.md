# TAGLINE

Run a shell command string through Bun's built-in shell

# TLDR

**Run a shell command**

```bun -c "[shell command]"```

**Run a pipeline**

```bun -c "cat [file.txt] | grep [pattern]"```

**Run with environment from .env file**

```bun -c "[command]" --env-file [.env]```

# SYNOPSIS

**bun** **-c** _command_ [_options_]

# PARAMETERS

**-c** _command_
> Execute the given command string using Bun's built-in shell.

**--env-file** _file_
> Load environment variables from the specified file before executing.

# DESCRIPTION

**bun -c** runs a shell command string, similar to **sh -c** but using Bun's built-in cross-platform shell implementation. It supports common shell features like pipes, redirects, and environment variable expansion. It can load environment variables from **.env** files before executing the command, making it useful for running scripts that depend on environment configuration without additional tooling.

# SEE ALSO

[bun](/man/bun)(1), [bun-run](/man/bun-run)(1), [bun-x](/man/bun-x)(1), [sh](/man/sh)(1)
