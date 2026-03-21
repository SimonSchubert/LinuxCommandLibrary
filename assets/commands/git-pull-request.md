# TAGLINE

Create pull request from the command line

# TLDR

**Create a pull request interactively**

```git pull-request```

**Create a pull request with a title**

```git pull-request -m "[title]"```

**Create a pull request targeting a specific base branch**

```git pull-request -b [base_branch]```

**Create a pull request with title and body**

```git pull-request -m "[title]" -m "[body]"```

**Create a pull request from a specific head branch**

```git pull-request -h [feature_branch] -b [main]```

# SYNOPSIS

**git** **pull-request** [_options_]

# PARAMETERS

**-m**, **--message** _text_
> PR title/message. Use twice to set title and body separately.

**-b**, **--base** _branch_
> Target base branch for the pull request.

**-h**, **--head** _branch_
> Source head branch (defaults to current branch).

**-i**, **--issue** _number_
> Convert an existing issue into a pull request.

# DESCRIPTION

**git pull-request** creates a GitHub pull request from the command line. Part of the **hub** CLI tool (by GitHub), it pushes the current branch if needed and opens a pull request to the specified base branch.

The command can extract PR title and body from commit messages or prompt for them interactively. When invoked without **-m**, an editor opens for composing the message. The first line becomes the title, and subsequent lines become the body.

Note: The **hub** tool is now in maintenance mode. The official replacement is **gh pr create** from the GitHub CLI, which provides more comprehensive GitHub integration.

# SEE ALSO

[gh-pr-create](/man/gh-pr-create)(1), [gh](/man/gh)(1), [hub](/man/hub)(1), [git-extras](/man/git-extras)(1), [git-request-pull](/man/git-request-pull)(1), [git-push](/man/git-push)(1)
