# TAGLINE

CLI for stacked diffs workflow

# TLDR

**Create new branch**

```gt branch create [branch-name]```

**Submit stack for review**

```gt stack submit```

**Sync with remote**

```gt repo sync```

**List branches in stack**

```gt log```

**Checkout branch**

```gt branch checkout [branch-name]```

# SYNOPSIS

**gt** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**branch create**
> Create new branch.

**stack submit**
> Submit stack for code review.

**repo sync**
> Synchronize with remote.

**log**
> Show branch stack.

**--help**
> Display help information.

# DESCRIPTION

**gt** (Graphite) is a CLI for stacked diffs workflow. It manages dependent branches and streamlines code review by organizing changes into logical stacks.

The tool integrates with GitHub for pull request management. It simplifies rebasing and updating of branch stacks.

# CAVEATS

Requires GitHub. Workflow differs from traditional git. Opinionated branching model.

# HISTORY

gt was created by **Graphite** to bring stacked diffs workflow (similar to Phabricator) to GitHub.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1), [jj](/man/jj)(1)
