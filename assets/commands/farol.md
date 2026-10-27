# TAGLINE

Static risk report for a pull request, after the review and before the merge

# TLDR

**Score** the commits between two refs

```farol analyze --base [main] --head [HEAD]```

**List** routes in the tree

```farol routes```

**Impact** of one file

```farol impact [src/app.ts]```

**Render** a saved report

```farol report --in [farol.json]```

**HTML** for that report

```farol html --in [farol.json]```

**Comment** on pull request 42

```farol comment --in [farol.json] --pr [42]```

# SYNOPSIS

**farol** [_options_] _command_ [_options_]

# COMMANDS

**analyze** **--base** _REF_ **--head** _REF_
> Compare two refs and write a risk report. **--base** and **--head** are required. Optional: **--coverage**, **--eslint**, **--out**, **--ignore** (repeatable globs), **--pr** (a positive integer), **--audit**, **--usage**, **--coverage-ignore**, **--since**, **--reviewers**, **--cache-dir**, and **--no-cache**. The cache defaults to **~/.cache/farol**.

**report** **--in** _FILE_
> Turn a saved analysis into a text report. **--in** is required. Optional: **--repo**, **--pr**, **--report-url**, **--reviewers**, **--since-in**, **--since-report-url**.

**html** **--in** _FILE_
> Write an HTML report. **--in** is required. Optional: **--out**, **--repo**, **--pr**, **--reviewers**.

**comment** **--in** _FILE_ **--pr** _N_
> Post the report as a pull-request comment. **--in** and **--pr** are required. Optional: **--repo**, **--report-url**, **--reviewers**, **--new**, **--since-in**, **--since-report-url**. This command reads a GitHub token and the repository name from the environment:

```
GITHUB_TOKEN=... GITHUB_REPOSITORY=owner/name farol comment --in farol.json --pr 42
```

**routes** [**--ref** _REF_]
> List routes in the tree at an optional ref.

**impact** [_FILE_] [**--ref** _REF_]
> Show what depends on a file. The file is the argument, or the file named in **.farol.json** when the argument is omitted.

**calibrate** **--history** _DIR_
> Calibrate scores from one or more history directories (**--history** repeats). Optional **--window** is a number of days (default **14**) and **--out** selects the output file.

**history** **--since** _DATE_
> Record history from a date. **--since** is required. Optional: **--branch** (default **HEAD**), **--out** (default **farol-history**), **--ignore**, **--first-parent**.

**reviewers** **--in** _FILE_
> Suggest reviewers from a saved analysis. **--in** is required. Optional **--out**.

**usage** [**--out** _FILE_] [**--days** _N_]
> Pull usage data. **--days** defaults to the Datadog setting in config, or **14**. Set both of these:

```
DD_API_KEY=... DD_APP_KEY=... farol usage
```

# PARAMETERS

**--config** _FILE_
> Config file. The default is **farol.config.json**, relative to **--cwd**.

**--cwd** _DIR_
> Project directory. When a **.farol.json** is found walking up from the working directory and **--cwd** is omitted, the project is that file's directory.

**--farol-file** _FILE_
> Use this **.farol.json** instead of the nearest one.

**--verbose**
> More log output.

**--cache-dir** _DIR_
> Analysis cache. The default is **~/.cache/farol**, or the directory in this variable when it is set:

```
FAROL_CACHE_DIR=/var/tmp/farol farol analyze --base main --head HEAD
```

**--no-cache**
> Ignore the analysis cache.

# DESCRIPTION

**farol** is a static analysis CLI for pull requests in TypeScript and React, Go, and Python. **analyze** reads the diff between two refs and writes where the merge risk sits, so a reviewer can spend time on the riskiest files. It runs in shadow mode: the report is advisory and the merge stays a human decision. The project tree is not executed.

The npm package is **@winninjs/farol** and the command is **farol**. It needs Node.js 22 or newer. A **.farol.json** marks a project. **farol.config.json** holds tool settings such as the Datadog window used by **usage**.

# CAVEATS

**analyze** requires both **--base** and **--head**. **comment** needs a GitHub token and **GITHUB_REPOSITORY** (owner/name). **usage** needs a Datadog API key and application key. Ignore patterns are globs; pass each one as its own **--ignore** argument. A positive **--pr** is the only accepted pull-request number.

# HISTORY

**farol** is published by Winnin. It is written in TypeScript and licensed under MIT.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1)

# RESOURCES

```[Source code](https://github.com/winnin/farol)```

```[Homepage](https://winnin.github.io/farol/)```

```[Documentation](https://github.com/winnin/farol/blob/main/docs/reference.md)```

<!-- verified: 2026-10-27 -->
