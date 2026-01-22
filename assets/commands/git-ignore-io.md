# TLDR

**Generate gitignore for language**

```git ignore-io [Python]```

**Generate for multiple**

```git ignore-io [Python] [macOS] [vim]```

**List available templates**

```git ignore-io --list```

**Search templates**

```git ignore-io --search [node]```

**Append to gitignore**

```git ignore-io [Python] >> .gitignore```

# SYNOPSIS

**git ignore-io** [_options_] _templates_

# PARAMETERS

_TEMPLATES_
> Template names from gitignore.io.

**--list**, **-l**
> List available templates.

**--search** _TERM_, **-s** _TERM_
> Search templates.

**--help**
> Display help information.

# DESCRIPTION

**git ignore-io** generates .gitignore content from gitignore.io templates. It fetches curated ignore patterns for languages, frameworks, IDEs, and operating systems.

The command accesses the gitignore.io API to retrieve and combine templates. Multiple templates can be combined in a single request for comprehensive coverage.

git ignore-io provides easy access to the gitignore.io template database.

# CAVEATS

Part of git-extras package. Requires network access. Templates may need customization.

# HISTORY

git ignore-io is part of **git-extras**, providing command-line access to **gitignore.io**, the web service for generating gitignore files.

# SEE ALSO

[git-ignore](/man/git-ignore)(1), [gibo](/man/gibo)(1), [gitignore](/man/gitignore)(5)
