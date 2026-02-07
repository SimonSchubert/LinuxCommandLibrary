# TAGLINE

manage code snippets and shareable files

# TLDR

**Create a gist**

```gh gist create [file]```

**Create public gist**

```gh gist create -p [file]```

**Create from stdin**

```echo "[content]" | gh gist create```

**List gists**

```gh gist list```

**View a gist**

```gh gist view [gist_id]```

**Edit a gist**

```gh gist edit [gist_id]```

**Delete a gist**

```gh gist delete [gist_id]```

**Clone a gist**

```gh gist clone [gist_id]```

# SYNOPSIS

**gh** **gist** _command_ [_options_]

# SUBCOMMANDS

**create**
> Create a gist.

**list**
> List gists.

**view**
> View a gist.

**edit**
> Edit a gist.

**delete**
> Delete a gist.

**clone**
> Clone a gist.

**rename**
> Rename gist file.

# PARAMETERS

**-p**, **--public**
> Make gist public.

**-d**, **--desc** _text_
> Gist description.

**-f**, **--filename** _name_
> Set filename.

# DESCRIPTION

**gh gist** manages GitHub Gists, a simple way to share code snippets, notes, and small files. Gists can be public or secret, with secret gists hidden from search but accessible via URL.

Each gist supports multiple files and full version history through git. They can be cloned like regular repositories, making them useful for sharing configuration files, scripts, or documentation. Gists support syntax highlighting and can be embedded in websites.

The CLI provides full lifecycle management from creation through editing and deletion, with support for reading content from stdin for scripting workflows.

# SEE ALSO

[gh](/man/gh)(1), [gist](/man/gist)(1)

