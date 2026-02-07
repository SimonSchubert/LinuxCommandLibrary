# TAGLINE

Add comments to pull requests

# TLDR

**Add comment to PR**

```gh pr comment [number] -b "[comment]"```

**Comment interactively**

```gh pr comment [number]```

**Comment from file**

```gh pr comment [number] -F [comment.md]```

**Edit last comment**

```gh pr comment [number] --edit-last -b "[new text]"```

# SYNOPSIS

**gh** **pr** **comment** [_number_] [_options_]

# PARAMETERS

**-b**, **--body** _text_
> Comment body.

**-F**, **--body-file** _file_
> Read body from file.

**--edit-last**
> Edit last comment.

**-R**, **--repo** _owner/repo_
> Repository.

# DESCRIPTION

**gh pr comment** adds comments to pull requests from the command line. It provides flexible options for composing comments, including inline text, file input, and interactive editing.

When called without the --body flag, the command opens your default editor for composing the comment. Comments support full GitHub-flavored Markdown including code blocks, tables, task lists, and @ mentions. The --edit-last option allows modifying your most recent comment on a pull request.

# SEE ALSO

[gh-pr](/man/gh-pr)(1), [gh-issue-comment](/man/gh-issue-comment)(1)
