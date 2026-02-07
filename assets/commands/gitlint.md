# TAGLINE

Lint and enforce commit message conventions

# TLDR

**Lint last commit**

```gitlint```

**Lint specific commit**

```gitlint --commit [commit-hash]```

**Lint commit range**

```gitlint --commits [HEAD~5..HEAD]```

**Generate config**

```gitlint generate-config```

**Install hook**

```gitlint install-hook```

# SYNOPSIS

**gitlint** [_options_] [_command_]

# PARAMETERS

**--commit** _SHA_
> Check specific commit.

**--commits** _RANGE_
> Check commit range.

**generate-config**
> Create .gitlint config file.

**install-hook**
> Install commit-msg hook.

**--config** _FILE_
> Use config file.

**--help**
> Display help information.

# DESCRIPTION

**gitlint** enforces commit message conventions by checking that messages follow configured rules for format, length, and content. This ensures consistent, readable commit history across a project.

Rules cover title length, body formatting, and conventional commit patterns. It can run as a commit-msg hook for immediate feedback during commits.

# CONFIGURATION

**.gitlint**
> Project-level configuration file defining commit message rules, ignored rules, and custom settings.

# CAVEATS

Python tool. Rules are configurable. May need customization for project conventions.

# HISTORY

gitlint was created to enforce commit message standards, supporting various conventions including Conventional Commits.

# SEE ALSO

[git-commit](/man/git-commit)(1), [commitlint](/man/commitlint)(1)
