# TLDR

**Show command hash table**

```hash```

**Clear hash table**

```hash -r```

**Add command to hash**

```hash -p [/usr/local/bin/mycommand] [mycommand]```

**Remove command from hash**

```hash -d [command]```

**Show path for command**

```hash -t [command]```

# SYNOPSIS

**hash** [_options_] [_name_...]

# PARAMETERS

**-r**
> Clear hash table.

**-p** _path_ _name_
> Add path for name.

**-d** _name_
> Delete name from hash.

**-t** _name_
> Print path for name.

**-l**
> List in reusable format.

# DESCRIPTION

**hash** is a shell built-in that manages the hash table of recently executed commands. The shell uses this table to remember the full paths of commands, avoiding repeated PATH searches.

When a command is executed, the shell stores its path in the hash table. Subsequent invocations use the cached path, improving performance.

# EXAMPLES

```bash
# View hash table
hash

# Clear after installing new software
hash -r

# Check where a command is hashed
hash -t python

# List all hashed commands
hash -l
```

# CAVEATS

Shell built-in; behavior varies by shell. Hash becomes stale if commands move. Use hash -r after PATH changes or software installation. Only affects current shell session.

# HISTORY

The hash command has been part of Unix shells since the Bourne shell. It provides manual control over the command path caching mechanism that shells use for performance.

# SEE ALSO

[type](/man/type)(1), [which](/man/which)(1), [command](/man/command)(1)
