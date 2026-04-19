# TAGLINE

open repository pages in web browser

# TLDR

**Open repository in browser**

```gh browse```

**Open specific file**

```gh browse [path/to/file]```

**Open at specific line**

```gh browse [path/to/file]:[line]```

**Open a specific issue or PR** by number

```gh browse [123]```

**Open releases page**

```gh browse --releases```

**Open specific branch**

```gh browse --branch [branch_name]```

**Open a specific repository**

```gh browse --repo [owner/repo]```

**Print URL without opening**

```gh browse -n```

# SYNOPSIS

**gh** **browse** [_options_] [_file[:line]]_

# PARAMETERS

**-a**, **--actions**
> Open repository Actions page.

**-b**, **--branch** _branch_
> Select branch by name.

**-c**, **--commit** _sha_
> Select commit by SHA (defaults to the last commit).

**-n**, **--no-browser**
> Print URL instead of opening the browser.

**-p**, **--projects**
> Open repository projects.

**-r**, **--releases**
> Open repository releases.

**-R**, **--repo** _[HOST/]OWNER/REPO_
> Select another repository.

**-s**, **--settings**
> Open repository settings.

**-w**, **--wiki**
> Open repository wiki.

**--blame**
> Open the blame view for a file.

# DESCRIPTION

**gh browse** opens the GitHub repository in a web browser. It intelligently navigates to specific repository pages, files, and even line numbers based on the arguments provided.

When run in a git repository, it automatically detects the GitHub remote and opens the corresponding page. The command supports opening various repository sections including issues, pull requests, wiki, settings, and releases. It can also navigate to specific files and line numbers, making it easy to share code references with others.

The --no-browser flag allows printing URLs without opening them, useful for scripting and integration with other tools.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)

