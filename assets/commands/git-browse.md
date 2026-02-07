# TAGLINE

Open repository in web browser

# TLDR

**Open repository in browser**

```git browse```

**Open specific commit**

```git browse [commit]```

**Open specific branch**

```git browse --branch [name]```

**Open issues page**

```git browse --issues```

**Print URL without opening**

```git browse -u```

# SYNOPSIS

**git** **browse** [_options_] [_commit_]

# PARAMETERS

**--branch** _name_
> Open specific branch.

**--issues**
> Open issues page.

**-u**, **--url**
> Print URL only.

# DESCRIPTION

**git browse** is a git-extras command that automatically detects your repository's remote URL and opens it in your default web browser. It intelligently handles GitHub, GitLab, and Bitbucket repositories, constructing the appropriate web URLs.

The command can navigate directly to specific commits, branches, or repository sections like the issues page. This eliminates the need to manually type or copy repository URLs when you want to view code on the hosting platform.

The --url option allows scripting and automation by printing the URL instead of opening it, useful for integration with other tools or workflows.

# SEE ALSO

[gh-browse](/man/gh-browse)(1), [git-extras](/man/git-extras)(1)

