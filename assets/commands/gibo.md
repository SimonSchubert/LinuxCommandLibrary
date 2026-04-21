# TAGLINE

Generate .gitignore files from community-maintained templates

# TLDR

**List available boilerplates**

```gibo list```

**Combine multiple boilerplates to stdout**

```gibo dump [Python] [macOS] [VisualStudioCode]```

**Search boilerplates by substring**

```gibo search [node]```

**Append a boilerplate to your .gitignore**

```gibo dump [Python] >> .gitignore```

**Update the locally cached boilerplate repository**

```gibo update```

**Show where boilerplates are stored on disk**

```gibo root```

# SYNOPSIS

**gibo** _command_ [_boilerplates_]

# PARAMETERS

**dump** _NAMES_...
> Write the named boilerplates to standard output, separated by headers. Names are matched case-insensitively against templates from github.com/github/gitignore.

**list**
> List all available boilerplates, grouped by category.

**search** _STR_
> List boilerplates whose names contain _STR_.

**update**
> Fetch the latest boilerplates from the upstream repository.

**root**
> Print the directory where gibo stores its local clone of the boilerplate repository.

**version**
> Print the current gibo version.

**help**
> Display help text.

# DESCRIPTION

**gibo** (gitignore boilerplates) generates .gitignore files from community-maintained templates hosted in GitHub's official gitignore repository. It provides templates for languages, frameworks, IDEs, and operating systems.

Multiple boilerplates can be combined in a single command. The tool caches templates locally for offline use and supports searching by name.

# CAVEATS

An initial `gibo update` is required the first time you use the tool, to clone the upstream boilerplate repository locally. Run `gibo update` periodically to pick up new templates. Boilerplate names are case-insensitive but must match a template file in github/gitignore; use `gibo list` or `gibo search` to discover valid names.

# HISTORY

**gibo** was created by **Simon Whitaker** as a shell script that wraps a local clone of **github.com/github/gitignore**. A Go rewrite (gibo-go) has since replaced the original shell implementation while keeping the same command surface.

# SEE ALSO

[git](/man/git)(1)
