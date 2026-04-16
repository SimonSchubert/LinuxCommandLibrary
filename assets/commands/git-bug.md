# TAGLINE

Distributed bug tracker embedded in git

# TLDR

**Add a new bug**

```git bug add```

**List bugs**

```git bug ls```

**Show bug details**

```git bug show [bug-id]```

**Add comment**

```git bug comment [bug-id]```

**Push bugs to remote**

```git bug push```

**Launch the web UI**

```git bug webui```

**Open interactive terminal UI**

```git bug termui```

# SYNOPSIS

**git bug** _command_ [_options_]

# PARAMETERS

**add** [**-t** _title_] [**-m** _message_]
> Create a new bug.

**ls**, **list**
> List bugs.

**show** _ID_
> Show bug details.

**comment** _ID_
> Add comment to bug.

**label** _ID_ _label_
> Add or remove labels on a bug.

**status** _ID_
> Display or change the status (open/close) of a bug.

**push** [_remote_]
> Push bugs to a git remote.

**pull** [_remote_]
> Pull bugs from a git remote.

**close** _ID_
> Mark a bug as closed.

**open** _ID_
> Reopen a closed bug.

**user**
> List, create, or adopt identities.

**webui**
> Launch the web user interface.

**termui**
> Launch the terminal user interface.

**--help**
> Display help information.

# DESCRIPTION

**git-bug** is a distributed bug tracker embedded in git. Bugs are stored as git objects, enabling offline bug management, distributed synchronization, and integration with git workflows.

The tool provides full issue tracking including titles, descriptions, comments, labels, and status. Bugs sync with git push/pull, enabling decentralized issue management without relying on external services like GitHub Issues or Jira.

Bugs are stored as git objects and can be managed entirely offline, syncing with collaborators through standard git push and pull operations.

# CAVEATS

Separate from GitHub/GitLab issues. Requires setup on collaborators' machines. Web UI available separately.

# HISTORY

git-bug was created by **Michael Muré** to provide truly distributed bug tracking that lives alongside code in git repositories.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1)
