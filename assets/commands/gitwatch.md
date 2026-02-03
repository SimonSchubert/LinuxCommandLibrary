# TLDR

**Watch directory and auto-commit**

```gitwatch [path]```

**Watch with custom message**

```gitwatch -m "[Auto commit]" [path]```

**Watch and push**

```gitwatch -r [remote] -b [branch] [path]```

**Watch specific branch**

```gitwatch -b [branch] [path]```

# SYNOPSIS

**gitwatch** [_options_] _path_

# PARAMETERS

**-m** _message_
> Commit message.

**-r** _remote_
> Remote to push to.

**-b** _branch_
> Branch name.

**-d** _seconds_
> Delay before commit.

**-l** _length_
> Commit message length.

# DESCRIPTION

**gitwatch** watches a directory and automatically commits changes. Uses inotify to detect file changes. Useful for automatic version control of notes or configs.

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [git](/man/git)(1)

