# TAGLINE

Snapshot a GitHub user's profile and recent pull-request activity

# TLDR

Profile a **user**, or the author of a pull request or issue in the current repository

```gh-profiler [username]```

Profile from a **profile URL**

```gh-profiler [https://github.com/owner]```

**Concise** report, one flag per category

```gh-profiler [username] --concise```

**Verbose** report, with the reason for each flag

```gh-profiler [username] -v```

Profile authors of the **newest pull requests** in a repository

```gh-profiler [https://github.com/owner/repo] -n [10]```

Look at recently **merged and closed** pull requests

```gh-profiler [https://github.com/owner/repo] --back```

Show only the **comparison table**

```gh-profiler [https://github.com/owner/repo] --table-only```

# SYNOPSIS

**gh-profiler** [_OPTIONS_] [_TARGET_]

# PARAMETERS

_TARGET_
> A GitHub username, a profile URL, a repository URL, or a pull-request or issue number in the repository you are in. A profile URL is treated as a username. A repository URL starts a bulk report of recent pull requests.

**--concise**
> One flag per category instead of the full breakdown.

**-v**, **--verbose**
> Include the explanation for each flag.

**-n**, **--num-targets** _N_
> How many pull requests to preview for a repository URL. The default is 10. The limit is 100.

**--back**
> For a repository URL, look at recently merged and closed pull requests.

**--table-only**
> For a bulk run, print only the comparison table.

**--redact**
> Hide identifying details in the report.

**--ignore-trusted**
> Still profile contributors the tool would otherwise treat as trusted.

**--generate-workflow**
> Write a workflow that runs **gh-profiler --concise** on new pull requests and issues.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**gh-profiler** prints a short read of a GitHub account and of that account's recent pull requests and issues, so a reviewer can decide how much time to spend. It is its own command. It is not a **gh** extension. After install it can also be run as a Python module:

```python -m gh_profiler```

A bare number is resolved as a pull request or issue in the current git repository, and the report is about the person who opened it.

The report uses colored flags for the profile, recent pull requests, and recent issues. It is context, not a verdict.

# CAVEATS

The project states that the tool should not be used as an automatic reason to close a pull request or issue. A flag is a hint about public activity, and a good-faith contributor can still be flagged. If that happens, the author asks for an issue describing the case.

**--benchmark-fetch** times the code that downloads data. It is a development switch, not part of a review.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/ehmatthes/gh-profiler)```

```[Documentation](https://github.com/ehmatthes/gh-profiler#gh-profiler)```

<!-- verified: 2026-11-17 -->
