# TAGLINE

creates a new GitHub repository and adds it as a remote

# TLDR

**Create new GitHub repository**

```hub create```

**Create with description**

```hub create -d "[description]"```

**Create private repository**

```hub create -p```

**Create in organization**

```hub create [org/repo]```

**Create and open in browser**

```hub create --browse```

**Create with homepage**

```hub create -h [https://example.com]```

# SYNOPSIS

**hub** **create** [_options_] [_name_]

# PARAMETERS

**-d**, **--description** _text_
> Repository description.

**-p**, **--private**
> Create private repository.

**-h**, **--homepage** _url_
> Repository homepage URL.

**-o**, **--browse**
> Open the new repository in a web browser.

**-c**, **--copy**
> Copy the new repository URL to the clipboard instead of printing.

**--remote-name** _name_
> Set the name for the new git remote (default: origin).

# DESCRIPTION

**hub create** creates a new GitHub repository and adds it as a remote. Uses the current directory name if no name specified. Can create repositories in organizations by specifying org/repo format.

# CAVEATS

Hub is deprecated. Consider using **gh repo create** instead.

# SEE ALSO

[hub](/man/hub)(1), [gh-repo-create](/man/gh-repo-create)(1)

