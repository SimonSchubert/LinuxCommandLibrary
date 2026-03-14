# TAGLINE

Smart directory changer with learning

# TLDR

**Change to a directory** matching a pattern

```scd [pattern]```

**Add directories** to the index

```scd -a [path/to/directory]```

**Recursively add directories** to the index

```scd -ar [path/to/directory]```

**Create a directory alias**

```scd --alias=[name]```

**Remove a directory alias**

```scd --unalias=[name]```

**Show verbose directory rankings**

```scd -v [pattern]```

# SYNOPSIS

**scd** [_options_] [_pattern_...]

# PARAMETERS

**-a, --add**
> Add specified directories to the directory index.

**-r, --recursive**
> Apply --add or --unindex recursively.

**--alias**=_NAME_
> Create alias for the current or specified directory, stored in ~/.scdalias.zsh.

**--unalias**=_NAME_
> Remove an alias definition.

**--unindex**
> Remove specified directories from the index.

**-v, --verbose**
> Display directory rank in the selection menu.

**-h, --help**
> Show help message.

# DESCRIPTION

**scd** is a Z shell script for changing to any directory with a few keystrokes. It keeps a history of visited directories, which serves as an index of known paths. The directory index is updated after every cd command and can also be filled manually with **scd -a**.

To switch to a directory, scd needs just a few fragments of the desired path to match against the index. A selection menu is displayed when there are several matches, with preference given to recently visited paths. Permanent directory aliases can be created for instant access.

scd is available as an oh-my-zsh plugin and also works with bash through shell integration.

# CAVEATS

Primarily a zsh script; bash support requires separate setup. History-based learning needs time to build a useful index.

# SEE ALSO

[cd](/man/cd)(1), [z](/man/z)(1), [autojump](/man/autojump)(1), [fasd](/man/fasd)(1)
