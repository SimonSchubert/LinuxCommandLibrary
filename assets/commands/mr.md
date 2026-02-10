# TAGLINE

manages multiple version control repositories

# TLDR

**Update all repositories**

```mr update```

**Check status of all repos**

```mr status```

**Commit in all repos**

```mr commit -m "[message]"```

**Register current directory**

```mr register```

**Run command in all repos**

```mr run [git fetch]```

**List registered repos**

```mr list```

**Pull all repos**

```mr pull```

# SYNOPSIS

**mr** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Action to perform.

**update**
> Update all registered repos.

**status**
> Show status of all repos.

**commit**
> Commit in all repos.

**register**
> Register current repo.

**run** _CMD_
> Run command in all repos.

**--help**
> Display help information.

# DESCRIPTION

**mr** (myrepos) manages multiple version control repositories. It runs commands across all repos.

The tool works with git, svn, hg, and more. Configuration in ~/.mrconfig.

# CAVEATS

Requires mrconfig setup. Supports multiple VCS types. Perl-based.

# HISTORY

mr was created by **Joey Hess** to manage multiple version control repositories from a single command.

# SEE ALSO

[git](/man/git)(1), [vcsh](/man/vcsh)(1), [repo](/man/repo)(1)

