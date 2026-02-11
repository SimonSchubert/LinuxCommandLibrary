# TAGLINE

Batch rename files using zsh patterns

# TLDR

**Rename files lowercase to uppercase**

```zmv '(*)' '${(U)1}'```

**Add prefix to all files**

```zmv '(*)' 'prefix_$1'```

**Change file extension**

```zmv '(*).txt' '$1.md'```

**Rename with sequential numbers**

```zmv -n '*.jpg' 'photo_$((++n)).jpg'```

**Dry run (show what would happen)**

```zmv -n '(*)' 'new_$1'```

**Move files to subdirectory**

```zmv '(*.txt)' 'subdir/$1'```

# SYNOPSIS

**zmv** [**-finqQsvwW**] [**-C**|**-L**|**-M**|**-p** _program_] [**--**] _srcpat_ _dest_

# PARAMETERS

**-n**
> Dry run, show what would be done

**-f**
> Force overwrite without prompting

**-i**
> Interactive, prompt before overwriting

**-q**
> Quiet, don't report errors

**-Q**
> Force bare glob qualifiers on pattern

**-s**
> Symbolic link instead of move

**-v**
> Verbose, print each command

**-w**
> Pick out wildcard parts of pattern

**-W**
> Same as -w but with pattern replacement

**-C**
> Copy instead of move

**-L**
> Hard link instead of move

**-M**
> Move (default)

**-p** _program_
> Use specified program instead of mv

# DESCRIPTION

**zmv** is a Zsh builtin for batch renaming files using pattern matching and replacement. It's more powerful than basic mv for complex renaming operations.

The source pattern uses Zsh extended globbing. Parenthesized groups are captured and available as **$1**, **$2**, etc. in the destination pattern. Zsh parameter expansion modifiers can transform captured text.

Common modifiers: **${(U)1}** uppercase, **${(L)1}** lowercase, **${(C)1}** capitalize, **${1:t}** tail (basename), **${1:h}** head (directory).

zmv must be loaded first: **autoload -U zmv**

# CAVEATS

zmv is Zsh-specific. It won't work in bash or other shells.

Always use **-n** (dry run) first to verify the operation before executing.

Patterns use Zsh globbing, which differs from regular expressions. Enable extended_glob (**setopt extended_glob**) for full pattern support.

# SEE ALSO

[mv](/man/mv)(1), [rename](/man/rename)(1), [mmv](/man/mmv)(1), [zsh](/man/zsh)(1)
