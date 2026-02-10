# TAGLINE

manages GitHub issues from the command line

# TLDR

**List open issues**

```hub issue```

**List issues with labels**

```hub issue -l [bug]```

**Create new issue**

```hub issue create```

**Create with title and body**

```hub issue create -m "[title]" -m "[body]"```

**Show specific issue**

```hub issue show [123]```

**List assignee's issues**

```hub issue -a [username]```

# SYNOPSIS

**hub** **issue** [_subcommand_] [_options_]

# SUBCOMMANDS

**list**
> List issues (default).

**create**
> Create new issue.

**show** _number_
> Display issue details.

**labels**
> List available labels.

# PARAMETERS

**-l**, **--label** _label_
> Filter by label.

**-a**, **--assignee** _user_
> Filter by assignee.

**-s**, **--state** _state_
> Filter by state (open, closed, all).

**-m**, **--message** _msg_
> Issue title/body.

# DESCRIPTION

**hub issue** manages GitHub issues from the command line. List, create, and view issues without leaving the terminal.

# CAVEATS

Hub is deprecated. Consider using **gh issue** instead.

# SEE ALSO

[hub](/man/hub)(1), [gh-issue](/man/gh-issue)(1)

