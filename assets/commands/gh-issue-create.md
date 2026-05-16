# TAGLINE

create new GitHub issues with metadata

# TLDR

**Create an issue** interactively

```gh issue create```

**Create with title and body**

```gh issue create -t "[title]" -b "[body]"```

**Read the body from a** file (use - for stdin)

```gh issue create -t "[title]" -F [body.md]```

**Open the editor** to compose the issue

```gh issue create -e```

**Add labels and assignees**

```gh issue create -t "[title]" -l [bug] -l [urgent] -a [@me]```

**Use an issue template** by name

```gh issue create -T "[Bug report]"```

**Target a specific** repository

```gh issue create -R [owner/repo] -t "[title]"```

**Open the browser** form

```gh issue create -w```

# SYNOPSIS

**gh** **issue** **create** [_options_]

# PARAMETERS

**-t**, **--title** _string_
> Issue title. Prompts if omitted.

**-b**, **--body** _string_
> Issue body. Prompts if omitted.

**-F**, **--body-file** _file_
> Read the body from a file. Use `-` to read from stdin.

**-e**, **--editor**
> Skip prompts and open `$EDITOR` to write the title and body.

**-l**, **--label** _name_
> Add a label by name. Repeatable.

**-a**, **--assignee** _login_
> Assign a user by login. `@me` self-assigns. Repeatable.

**-m**, **--milestone** _name_
> Set the milestone by name.

**-p**, **--project** _title_
> Add the issue to a project by title. Repeatable.

**-T**, **--template** _name_
> Use an issue template by name.

**--recover** _file_
> Recover input from a failed previous run.

**-w**, **--web**
> Open a browser to create the issue.

**-R**, **--repo** _[HOST/]OWNER/REPO_
> Target a specific repository.

# DESCRIPTION

**gh issue create** files a new issue on GitHub with comprehensive metadata support. Without flags it walks through an interactive prompt for title, body, labels, assignees, and project assignment. With flags, every field can be supplied non-interactively for use in scripts and CI.

Issue templates configured on the repository can be selected with **-T/--template** by name; the template body is used as the starting text. **-F/--body-file** is convenient for piping the output of another tool (for example a generated bug report) directly into a new issue. The alias `gh issue new` is equivalent.

# SEE ALSO

[gh-issue](/man/gh-issue)(1)
