# TAGLINE

Create and manage GitHub Gists from the command line

# TLDR

**Create a gist from file**

```gist [file]```

**Create public gist**

```gist -p [file]```

**Create from stdin**

```echo "[content]" | gist```

**Create with description**

```gist -d "[description]" [file]```

**List your gists**

```gist -l```

**Update existing gist**

```gist -u [gist_id] [file]```

**Copy URL to clipboard**

```gist -c [file]```

**Open in browser**

```gist -o [file]```

# SYNOPSIS

**gist** [_options_] [_files_...]

# PARAMETERS

**-p**, **--public**
> Make public (default private).

**-d**, **--description** _text_
> Gist description.

**-l**, **--list** [_user_]
> List gists.

**-u**, **--update** _id_
> Update existing gist.

**-c**, **--copy**
> Copy URL to clipboard.

**-o**, **--open**
> Open in browser.

**-f**, **--filename** _name_
> Set filename.

# DESCRIPTION

**gist** creates and manages GitHub Gists from the command line. Gists provide a lightweight way to share code snippets, notes, and small files without creating a full repository. Each gist supports multiple files, syntax highlighting, version control, forking, and commenting.

The tool requires authentication through a GitHub personal access token. Gists are private by default unless created with the -p flag. It integrates with the system clipboard and browser for streamlined workflows.

# CONFIGURATION

**~/.gist**
> Stores the GitHub personal access token for authentication.

**GITHUB_TOKEN**
> Environment variable alternative for authentication token.

# SEE ALSO

[gh-gist](/man/gh-gist)(1), [gh](/man/gh)(1)
