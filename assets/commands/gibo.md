# TAGLINE

Generate .gitignore files from community-maintained templates

# TLDR

**List available boilerplates**

```gibo list```

**Generate gitignore**

```gibo dump [Python] [macOS]```

**Search boilerplates**

```gibo search [node]```

**Write to .gitignore**

```gibo dump [Python] >> .gitignore```

**Update boilerplate list**

```gibo update```

# SYNOPSIS

**gibo** _command_ [_boilerplates_]

# PARAMETERS

**dump** _NAMES_
> Output gitignore boilerplates.

**list**
> List available boilerplates.

**search** _PATTERN_
> Search for boilerplates.

**update**
> Update local boilerplate cache.

**root**
> Show boilerplate repository path.

**version**
> Show version information.

**--help**
> Display help information.

# DESCRIPTION

**gibo** (gitignore boilerplates) generates .gitignore files from community-maintained templates hosted in GitHub's official gitignore repository. It provides templates for languages, frameworks, IDEs, and operating systems.

Multiple boilerplates can be combined in a single command. The tool caches templates locally for offline use and supports searching by name.

# CAVEATS

Requires network for updates. Some templates may need customization. Cache stored in ~/.gitignore-boilerplates.

# HISTORY

gibo was created by **Simon Whitaker** to provide easy access to GitHub's gitignore templates collection.

# SEE ALSO

[git](/man/git)(1), [gitignore](/man/gitignore)(5)
