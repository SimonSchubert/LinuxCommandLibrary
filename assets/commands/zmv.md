# TAGLINE

Batch rename files using zsh patterns

# TLDR

**Rename files lowercase to uppercase**

```zmv '(*)' '${(U)1}'```

**Add prefix to all files**

```zmv '(*)' 'prefix_$1'```

**Change file extension**

```zmv '(*).txt' '$1.md'```

**Change extension recursively**

```zmv '(**/)(*).txt' '$1$2.md'```

**Same, letting zmv add the parentheses**

```zmv -w '**/*.txt' '$1$2.md'```

**Rename with sequential numbers**

```n=0; zmv '*.jpg' 'photo_$((++n)).jpg'```

**Dry run (show what would happen)**

```zmv -n '(*)' 'new_$1'```

**Move files to subdirectory**

```zmv '(*.txt)' 'subdir/$1'```

**Copy instead of moving**

```zmv -C '(*).txt' '$1.bak'```

# SYNOPSIS

**zmv** [**-finqQsvwW**] [**-C**|**-L**|**-M**|**-p** _program_|**-P** _program_] [**-o** _optstring_] [**--**] _srcpat_ _dest_

# PARAMETERS

**-n**
> No execution, print what would happen

**-f**
> Force overwriting of destination files. Not passed to mv, cp or ln (use **-o-f** for that)

**-i**
> Interactive, show each line and ask whether to execute it

**-q**
> Turn bare glob qualifiers off. Now the default, so this has no effect

**-Q**
> Force bare glob qualifiers on

**-s**
> Symbolic, passed down to ln. Only works with **-L** or zln

**-v**
> Verbose, print each line as it is executed

**-w**
> Pick out wildcard parts of the pattern and implicitly add parentheses for referring to them

**-W**
> Like **-w**, and also turn wildcards in the replacement into sequential **${1}** .. **${N}** references

**-C**
> Force cp

**-L**
> Force ln

**-M**
> Force mv

**-o** _optstring_
> Split into words and pass verbatim to the cp, ln or mv command

**-p** _program_
> Call _program_ instead of cp, ln or mv. It must understand **program -- old new**

**-P** _program_
> Like **-p**, for programs that do not understand the **--** convention

# DESCRIPTION

**zmv** is a Zsh autoloaded function for batch renaming files using pattern matching and replacement. It's more powerful than basic mv for complex renaming operations. The same function moves, copies or links depending on the last two characters of its name, so it also works as **zcp** and **zln**.

The source pattern uses Zsh extended globbing. Parenthesized groups are captured and available as **$1**, **$2**, etc. in the destination pattern, and **$f** holds the original file name. Zsh parameter expansion modifiers can transform captured text.

Common modifiers: **${(U)1}** uppercase, **${(L)1}** lowercase, **${(C)1}** capitalize, **${1:t}** tail (basename), **${1:h}** head (directory).

zmv must be loaded first: **autoload -U zmv**

# CAVEATS

zmv is Zsh-specific. It won't work in bash or other shells.

Always use **-n** (dry run) first to verify the operation before executing. Quote both arguments so the shell does not expand them.

Any error, such as two files mapping to the same name or an existing destination without **-f**, aborts the whole run without doing anything.

Patterns use Zsh globbing, which differs from regular expressions. The pattern is always treated as **extendedglob**, whether or not that option is set. Slashes do not work inside parentheses, except for the special forms **(\*\*/)** and **(\*\*\*/)**.

# SEE ALSO

[mv](/man/mv)(1), [rename](/man/rename)(1), [mmv](/man/mmv)(1), [zsh](/man/zsh)(1)

# RESOURCES

```[Homepage](https://www.zsh.org)```

```[Documentation](https://zsh.sourceforge.io/Doc/Release/User-Contributions.html)```

<!-- verified: 2026-11-09 -->
