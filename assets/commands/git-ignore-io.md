# TAGLINE

Generate gitignore from templates

# TLDR

**Generate gitignore for language**

```git ignore-io [Python]```

**Generate for multiple types**

```git ignore-io [Python] [macOS] [vim]```

**Append to .gitignore** in current directory

```git ignore-io -a [Python] [vim]```

**Replace .gitignore** in current directory

```git ignore-io -r [Python] [macOS]```

**List available templates** in table format

```git ignore-io -l```

**Search templates**

```git ignore-io -s [node]```

# SYNOPSIS

**git ignore-io** [_options_] _templates_

# PARAMETERS

_TEMPLATES_
> Template names from gitignore.io.

**-a**, **--append** _TYPES_
> Append new content to .gitignore under current directory.

**-r**, **--replace** _TYPES_
> Replace .gitignore in current directory with new content.

**-l**, **--list-in-table**
> List available templates in table format.

**-L**, **--list-alphabetically**
> List available templates alphabetically.

**-s**, **--search** _WORD_
> Search for a word in available types.

**-t**, **--show-update-time**
> Show the last modified time of the cached type list.

**-u**, **--update-list**
> Update the cached type list.

**--help**
> Display help information.

# DESCRIPTION

**git ignore-io** generates .gitignore content from gitignore.io templates. It fetches curated ignore patterns for languages, frameworks, IDEs, and operating systems via the gitignore.io API.

Multiple templates can be combined in a single request for comprehensive coverage. Part of the git-extras suite, it provides quick command-line access to the extensive gitignore.io template database.

# CAVEATS

Part of git-extras package. Requires network access. Templates may need customization.

# HISTORY

git ignore-io is part of **git-extras**, providing command-line access to **gitignore.io**, the web service for generating gitignore files.

# SEE ALSO

[git-ignore](/man/git-ignore)(1), [gibo](/man/gibo)(1), [git-extras](/man/git-extras)(1)
