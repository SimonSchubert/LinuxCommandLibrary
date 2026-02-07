# TAGLINE

Automatically commit changes when files are modified

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

**gitwatch** watches a directory and automatically commits changes whenever files are modified. It uses inotify (on Linux) to detect file changes in real time.

The tool is useful for automatic version control of notes, configuration files, or any directory where you want every change tracked without manual commits.

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [git](/man/git)(1)
