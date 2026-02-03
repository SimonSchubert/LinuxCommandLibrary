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

**gist** creates GitHub Gists from the command line. Gists are simple way to share snippets and files. Requires GitHub authentication via ~/.gist or environment variable.

# SEE ALSO

[gh-gist](/man/gh-gist)(1), [gh](/man/gh)(1)

