# TAGLINE

Rebuild the command hash table

# TLDR

**Rebuild the command hash table**

```rehash```

**Rehash after installing new software**

```sudo apt install [package] && rehash```

# SYNOPSIS

**rehash**

# DESCRIPTION

**rehash** is a shell builtin that rebuilds the internal hash table of executable commands. The shell maintains a hash table mapping command names to their full paths to avoid repeated **$PATH** searches. When new programs are installed or removed, this table can become outdated, causing the shell to report "command not found" for newly installed programs or to run stale paths.

Running **rehash** forces the shell to discard the cached hash table and rediscover all executables in the directories listed in **$PATH**.

In **zsh**, rehash also regenerates the completion list so that tab completion reflects newly installed commands.

# CAVEATS

In **bash**, the equivalent command is **hash -r**. Most modern shells handle this automatically when **$PATH** is modified, but newly installed programs within existing **$PATH** directories may still require a manual rehash. The command only affects the current shell session.

# HISTORY

Command hashing was introduced in the **Bourne Shell** to improve performance by caching command locations. The **rehash** builtin appeared in **csh** (1978) and was adopted by **tcsh**, **zsh**, and other shells. Bash uses the **hash** builtin instead but supports the same concept.

# SEE ALSO

[hash](/man/hash)(1), [which](/man/which)(1), [type](/man/type)(1), [zsh](/man/zsh)(1)
