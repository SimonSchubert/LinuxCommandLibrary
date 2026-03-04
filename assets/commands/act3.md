# TAGLINE

Glance at the last 3 runs of your GitHub Actions

# TLDR

**View last 3 runs** of all workflows in the current repository

```act3```

**View runs for a specific repository**

```act3 -r [owner/repo]```

**Output results in table format**

```act3 --format table```

**Open failed workflow pages** in the browser

```act3 -o```

# SYNOPSIS

**act3** [_options_]

# PARAMETERS

**-r** _repo_
> Specify the GitHub repository (owner/repo format)

**-o**
> Open failed workflow run pages in the browser

**--format** _format_
> Output format: table or html

# DESCRIPTION

**act3** is a command-line tool that displays the results of the last three GitHub Actions workflow runs directly in the terminal. It auto-detects the GitHub repository from the current directory and shows the status of recent runs including success, failure, and cancelled states, providing a quick snapshot without needing to open the GitHub web interface.

Written in Go, it is useful for developers who want to monitor CI/CD pipelines without leaving the terminal. It also supports HTML output for generating shareable reports.

# CAVEATS

Requires a valid GitHub token for API access. Only shows the last three runs per workflow. Early-stage software with features still under development.

# HISTORY

**act3** was created by **Dhruva Thakur** (dhth) as an open-source Go project released under the MIT license on GitHub.

# SEE ALSO

[gh](/man/gh)(1), [act](/man/act)(1)
