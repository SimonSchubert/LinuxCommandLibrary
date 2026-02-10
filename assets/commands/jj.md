# TAGLINE

jujutsu, a Git-compatible version control system

# TLDR

**Initialize repository**

```jj init```

**Show status**

```jj status```

**Create new change**

```jj new```

**Describe change**

```jj describe -m "[message]"```

**Show log**

```jj log```

**Push to remote**

```jj git push```

**Squash into parent**

```jj squash```

# SYNOPSIS

**jj** [_options_] _command_ [_args_]

# PARAMETERS

**init**
> Initialize new repository.

**status**
> Show working copy status.

**new**
> Create new change.

**describe**
> Update change description.

**log**
> Show revision history.

**git** _CMD_
> Git interop commands.

**--help**
> Display help information.

# DESCRIPTION

**jj** is Jujutsu, a Git-compatible version control system. It uses a different model with automatic commits and conflict handling.

The tool tracks uncommitted changes as first-class revisions. It supports anonymous branches and powerful history rewriting.

# CAVEATS

Git-compatible but different workflow. Learning curve from Git. Relatively new project.

# HISTORY

Jujutsu was created at **Google** by **Martin von Zweigbergk** as a modern VCS with Git compatibility and improved UX.

# SEE ALSO

[jj-git](/man/jj-git)(1), [jj-log](/man/jj-log)(1), [git](/man/git)(1)
