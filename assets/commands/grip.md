# TLDR

**Preview README in current directory**

```grip```

**Preview and open in browser**

```grip -b```

**Preview specific file**

```grip [README.md]```

**Preview on specific port**

```grip [file.md] [8080]```

**Export to HTML**

```grip --export [file.md]```

**Preview offline without GitHub API**

```grip --offline [file.md]```

**Preview from stdin**

```cat [file.md] | grip -```

# SYNOPSIS

**grip** [_options_] [_path_] [_address_]

# PARAMETERS

**-b**, **--browser**
> Open in browser after starting.

**--export**
> Export to HTML file instead of serving.

**--offline**
> Render without GitHub API.

**--norefresh**
> Disable auto-refresh on file changes.

**--quiet**
> Suppress terminal output.

**--user** _user_
> GitHub username for API auth.

**--pass** _pass_
> GitHub password or token.

# DESCRIPTION

**grip** (GitHub Readme Instant Preview) is a command-line server that renders GitHub-flavored Markdown using GitHub's API. It displays how your README will appear on GitHub with accurate styling. Changes to files are reflected instantly without page refresh. Use **--offline** to avoid API rate limits for basic rendering.

# CAVEATS

Without authentication, GitHub API rate limits may apply. Use **--user** and **--pass** with a personal access token for higher limits.

# SEE ALSO

[markdown](/man/markdown)(1), [pandoc](/man/pandoc)(1)

