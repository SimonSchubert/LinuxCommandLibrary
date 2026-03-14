# TAGLINE

generate completion matches in bash

# TLDR

**List all commands**

```compgen -c```

**List commands starting with prefix**

```compgen -c [ls]```

**List all aliases**

```compgen -a```

**List all shell functions**

```compgen -A function```

**List all builtins**

```compgen -b```

**List all variables**

```compgen -v```

**Complete from word list**

```compgen -W '[start stop restart]' -- [sta]```

**List all users**

```compgen -u```

# SYNOPSIS

**compgen** [_options_] [_word_]

# DESCRIPTION

**compgen** is a Bash builtin that generates possible completion matches for a word. It is primarily used inside programmable completion functions but is also useful interactively for discovering available commands, functions, variables, and other shell entities. When given a word argument, only matches starting with that word are shown.

# PARAMETERS

**-a**
> Aliases

**-b**
> Builtins

**-c**
> Commands

**-d**
> Directories

**-e**
> Exported variables

**-f**
> Files

**-g**
> Groups

**-j**
> Jobs

**-k**
> Keywords

**-s**
> Services

**-u**
> Users

**-v**
> Variables

**-A** _action_
> Completion action type

**-W** _wordlist_
> Complete from word list

**-G** _pattern_
> Glob pattern for filenames

**-P** _prefix_
> Add prefix to completions

**-S** _suffix_
> Add suffix to completions

**-X** _pattern_
> Filter out matching completions

# ACTIONS (-A)

alias, arrayvar, binding, builtin, command, directory, disabled, enabled, export, file, function, group, hostname, job, keyword, running, service, setopt, signal, stopped, user, variable

# CAVEATS

Bash builtin only, not available in other shells. Returns true unless invalid option or no matches. Used in completion scripts with complete builtin.

# SEE ALSO

[complete](/man/complete)(1), [bash](/man/bash)(1)
