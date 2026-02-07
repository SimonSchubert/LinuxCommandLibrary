# TAGLINE

Display personal GitHub activity dashboard

# TLDR

**Show status dashboard**

```gh status```

**Show in specific organization**

```gh status -o [org_name]```

**Exclude repository**

```gh status -e [owner/repo]```

# SYNOPSIS

**gh** **status** [_options_]

# PARAMETERS

**-o**, **--org** _name_
> Limit to organization.

**-e**, **--exclude** _repo_
> Exclude repository.

# DESCRIPTION

**gh status** displays a personalized dashboard of your GitHub activity and pending work. It aggregates issues assigned to you, pull requests awaiting your review, mentions across discussions, and recent repository activity.

The dashboard provides a quick overview of pending tasks without searching across multiple repositories. Organization filtering focuses the view on work within specific organizations, useful for separating personal and work contexts.

# SEE ALSO

[gh](/man/gh)(1), [gh-at](/man/gh-at)(1)
