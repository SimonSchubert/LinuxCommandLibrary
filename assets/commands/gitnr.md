# TAGLINE

Create .gitignore files from templates

# TLDR

**Create** .gitignore for current directory

```gitnr```

**Create** .gitignore for specific language

```gitnr rust```

**Create** .gitignore with multiple templates

```gitnr rust python node```

**List** available templates

```gitnr --list```

# SYNOPSIS

**gitnr** [_options_] [_templates_]

# PARAMETERS

**-l, --list**
> List all available templates

**-s, --search** _QUERY_
> Search for templates

**-a, --append**
> Append to existing .gitignore

**-o, --output** _FILE_
> Output to specific file

**-f, --force**
> Overwrite existing file

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gitnr** creates .gitignore files using templates from the GitHub gitignore repository. It supports hundreds of templates for different languages, frameworks, and tools.

The tool fetches templates from GitHub's official gitignore repository and combines multiple templates when needed.

# AVAILABLE TEMPLATES

Common templates include:
- Languages: rust, python, node, go, java
- IDEs: vscode, intellij, vim
- Tools: docker, terraform, ansible
- OS: macos, windows, linux

# CAVEATS

Requires internet connection to fetch templates. GitHub API rate limits may apply. Some templates may need customization for specific project needs.

# HISTORY

**gitnr** was created as a convenient way to generate .gitignore files without browsing the GitHub repository manually.

# SEE ALSO

[gitignore](https://git-scm.com/docs/gitignore), [gitignore.io](https://www.toptal.com/developers/gitignore)