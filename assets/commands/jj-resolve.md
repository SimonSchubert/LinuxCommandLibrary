# TLDR

**Resolve conflicts**

```jj resolve```

**Resolve specific file**

```jj resolve [path/to/file]```

**List conflicted files**

```jj resolve --list```

**Resolve with specific tool**

```jj resolve --tool [meld]```

# SYNOPSIS

**jj resolve** [_options_] [_path_]

# PARAMETERS

_PATH_
> Specific file to resolve.

**--list**
> List files with conflicts.

**--tool** _NAME_
> Merge tool to use.

**-r** _REV_
> Revision with conflicts.

**--help**
> Display help information.

# DESCRIPTION

**jj resolve** helps resolve merge conflicts. It launches a merge tool for conflicted files.

The command identifies and processes files with conflict markers. Jujutsu tracks conflicts as first-class states.

jj resolve handles conflicts.

# CAVEATS

Subcommand of jj. Requires configured merge tool. Conflicts persist until resolved.

# HISTORY

jj resolve is part of **Jujutsu**, supporting its unique approach to treating conflicts as normal repository states.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1), [jj-status](/man/jj-status)(1)
