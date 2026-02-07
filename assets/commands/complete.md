# TAGLINE

specify bash command argument completion

# TLDR

**Complete with files**

```complete -f [command]```

**Complete with directories**

```complete -d [command]```

**Complete with word list**

```complete -W '[start stop restart]' [myservice]```

**Complete using function**

```complete -F [_my_completion] [mycommand]```

**Remove completion**

```complete -r [command]```

**List all completions**

```complete -p```

**Complete with no space after**

```complete -o nospace -W '[opt1 opt2]' [command]```

# SYNOPSIS

**complete** [_options_] [_name_...]

# DESCRIPTION

**complete** specifies how arguments for commands should be completed. Bash builtin for programmable completion. Defines completion specifications (compspecs) for commands.

# PARAMETERS

**-a**
> Complete with aliases

**-b**
> Complete with builtins

**-c**
> Complete with commands

**-d**
> Complete with directories

**-f**
> Complete with files

**-g**
> Complete with groups

**-j**
> Complete with jobs

**-k**
> Complete with keywords

**-s**
> Complete with services

**-u**
> Complete with users

**-v**
> Complete with variables

**-A** _action_
> Use action for completion

**-W** _wordlist_
> Complete from wordlist

**-F** _function_
> Call shell function

**-C** _command_
> Run command for completions

**-G** _pattern_
> Glob pattern for files

**-X** _pattern_
> Filter out matches

**-P** _prefix_
> Add prefix to results

**-S** _suffix_
> Add suffix to results

**-p**
> Print current completions

**-r**
> Remove completion spec

# COMP-OPTIONS (-o)

**filenames**: Treat as filenames (add slashes, quote)

**nospace**: Don't append space after completion

**nosort**: Don't sort alphabetically

**bashdefault**: Fall back to bash defaults

**default**: Fall back to readline defaults

# CAVEATS

Bash builtin only. Completions stored per-session. Use /etc/bash_completion.d/ for persistent completions.

# SEE ALSO

[compgen](/man/compgen)(1), [bash](/man/bash)(1)
