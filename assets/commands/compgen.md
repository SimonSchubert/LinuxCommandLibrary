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
> Generate alias names.

**-b**
> Generate shell builtin names.

**-c**
> Generate command names (builtins, functions, and executables on PATH).

**-d**
> Generate directory names.

**-e**
> Generate names of exported shell variables.

**-f**
> Generate filenames.

**-g**
> Generate group names.

**-j**
> Generate job names.

**-k**
> Generate shell reserved words (keywords).

**-s**
> Generate service names.

**-u**
> Generate usernames.

**-v**
> Generate shell variable names.

**-A** _action_
> Generate completions using the given action. Valid actions include: alias, arrayvar, binding, builtin, command, directory, disabled, enabled, export, file, function, group, hostname, job, keyword, running, service, setopt, signal, stopped, user, variable.

**-F** _function_
> Call shell function to generate completions.

**-C** _command_
> Run command in a subshell and use its output as completions.

**-W** _wordlist_
> Split wordlist on IFS and generate matches from resulting words.

**-G** _pattern_
> Expand the glob pattern and use the results as completions.

**-P** _prefix_
> Prepend prefix to each generated completion.

**-S** _suffix_
> Append suffix to each generated completion.

**-X** _pattern_
> Filter completions using the pattern; a leading **!** negates the filter.

# CAVEATS

Bash builtin only, not available in other shells. Returns true unless invalid option or no matches. Used in completion scripts with complete builtin.

# SEE ALSO

[complete](/man/complete)(1), [bash](/man/bash)(1)
