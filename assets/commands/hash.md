# TAGLINE

shell built-in that manages the hash table of recently executed commands

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

Shell built-in; behavior and available options vary by shell (bash, zsh, ksh each implement their own version). The hash table becomes stale if a hashed command's file is moved or removed. Run `hash -r` after installing software or modifying PATH. Only affects the current shell session, not child processes.

# HISTORY

**hash** has been part of Unix shells since the Bourne shell. POSIX only mandates the `-r` option; bash extends it with `-p`, `-d`, `-t`, and `-l` for finer control over the command path cache.

# SEE ALSO

[type](/man/type)(1), [which](/man/which)(1), [command](/man/command)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#Bourne-Shell-Builtins)```

<!-- verified: 2026-07-17 -->
