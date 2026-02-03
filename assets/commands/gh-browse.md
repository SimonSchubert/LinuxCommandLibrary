# TLDR

**Open repository in browser**

```gh browse```

**Open specific file**

```gh browse [path/to/file]```

**Open at specific line**

```gh browse [path/to/file]:[line]```

**Open issues page**

```gh browse --issues```

**Open pull requests page**

```gh browse --pulls```

**Open specific branch**

```gh browse --branch [branch_name]```

**Print URL without opening**

```gh browse -n```

# SYNOPSIS

**gh** **browse** [_options_] [_file[:line]]_

# PARAMETERS

**-b**, **--branch** _branch_
> Select branch.

**-n**, **--no-browser**
> Print URL only.

**-p**, **--projects**
> Open projects page.

**-r**, **--releases**
> Open releases page.

**-s**, **--settings**
> Open settings page.

**-w**, **--wiki**
> Open wiki page.

**--issues**
> Open issues page.

**--pulls**
> Open pull requests page.

# DESCRIPTION

**gh browse** opens the GitHub repository in a web browser. Can navigate directly to files, issues, pull requests, and other repository pages.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)

