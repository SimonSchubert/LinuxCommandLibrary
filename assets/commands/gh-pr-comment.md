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

**gh pr comment** adds comments to a pull request. Comments support GitHub-flavored Markdown formatting.

# SEE ALSO

[gh-pr](/man/gh-pr)(1), [gh-issue-comment](/man/gh-issue-comment)(1)

