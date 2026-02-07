# TAGLINE

Generate formatted changelogs from commit history

# TLDR

**Generate changelog**

```git changelog```

**Changelog since tag**

```git changelog --tag [v1.0.0]```

**List commits only**

```git changelog --list```

**Changelog to file**

```git changelog > CHANGELOG.md```

**Specify commit range**

```git changelog [v1.0.0]..[v2.0.0]```

# SYNOPSIS

**git changelog** [_options_] [_range_]

# PARAMETERS

_RANGE_
> Commit range for changelog.

**--tag** _TAG_
> Generate since tag.

**--list**
> List commits without formatting.

**--no-merges**
> Exclude merge commits.

**--all**
> Include all commits.

**--help**
> Display help information.

# DESCRIPTION

**git changelog** generates a changelog from git commit history. It formats commits into release notes, grouped by version tags or date ranges, suitable for documentation.

The command is part of git-extras and supports various output formats. It can filter merge commits, format messages, and generate markdown-ready output suitable for inclusion in project documentation.

Using tags as version markers, it groups commits into release sections, making it straightforward to maintain a CHANGELOG.md file that documents the evolution of a project.

# CAVEATS

Part of git-extras package. Quality depends on commit messages. May need customization for project conventions.

# HISTORY

git changelog is part of **git-extras**, created by **TJ Holowaychuk** to automate changelog generation from repository history.

# SEE ALSO

[git-log](/man/git-log)(1), [git-tag](/man/git-tag)(1)
