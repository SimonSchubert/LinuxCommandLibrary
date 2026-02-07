# TAGLINE

Run a shell command string through Bun

# TLDR

**Run a shell command**

```bun -c "[shell command]"```

**Run with environment from .env**

```bun -c "[command]" --env-file [.env]```

# SYNOPSIS

**bun** **-c** _command_

# DESCRIPTION

**bun -c** runs a shell command string, similar to **sh -c** but using Bun's built-in shell implementation. It can load environment variables from **.env** files before executing the command, making it useful for running scripts that depend on environment configuration without additional tooling.

# SEE ALSO

[bun](/man/bun)(1), [bun-run](/man/bun-run)(1), [bun-x](/man/bun-x)(1)
