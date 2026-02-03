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

**gh gist** manages GitHub Gists. Create, view, edit, and share code snippets and small files.

# SEE ALSO

[gh](/man/gh)(1), [gist](/man/gist)(1)

