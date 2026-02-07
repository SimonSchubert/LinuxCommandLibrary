# TAGLINE

Execute package binaries

# TLDR

**Execute a package binary**

```bun exec [binary] [args...]```

**Execute a local package binary**

```bun exec ./node_modules/.bin/[binary]```

# SYNOPSIS

**bun** **exec** _command_ [_args..._]

# DESCRIPTION

**bun exec** executes a command, typically a binary from an installed package. It's similar to **npx** but integrated with Bun's faster runtime.

The command searches for executables in node_modules/.bin and in the PATH.

# SEE ALSO

[bun](/man/bun)(1), [bun-x](/man/bun-x)(1), [bun-run](/man/bun-run)(1)
