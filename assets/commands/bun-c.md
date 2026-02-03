# TLDR

**Run a shell command**

```bun -c "[shell command]"```

**Run with environment from .env**

```bun -c "[command]" --env-file [.env]```

# SYNOPSIS

**bun** **-c** _command_

# DESCRIPTION

**bun -c** (or **bun --bun -c**) runs a shell command string. This is similar to **sh -c** but uses Bun's shell implementation.

This allows running arbitrary shell commands through Bun's runtime.

# SEE ALSO

[bun](/man/bun)(1), [bun-run](/man/bun-run)(1), [bun-x](/man/bun-x)(1)
