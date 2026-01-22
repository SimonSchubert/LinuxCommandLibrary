# TLDR

**Enable filenames completion** for a completion function

```compopt -o filenames```

**Enable directory completion** only

```compopt -o dirnames```

**Disable default completion** behavior

```compopt +o default```

**Add space after completion**

```compopt -o nospace```

**Remove the nospace option**

```compopt +o nospace```

**Set options for a specific command**

```compopt -o filenames [command_name]```

# SYNOPSIS

**compopt** [-o _option_] [-DE] [+o _option_] [_name_...]

# PARAMETERS

**-o** _OPTION_
> Enable the specified completion option.

**+o** _OPTION_
> Disable the specified completion option.

**-D**
> Apply to default completion (when no specific completion is defined).

**-E**
> Apply to empty command completion (completion on empty line).

**-I**
> Apply to initial word completion.

**filenames**
> Perform filename completion and processing (escaping, trailing slash).

**dirnames**
> Perform directory name completion.

**nospace**
> Do not append a space after completion.

**default**
> Use default readline completion if no matches.

**bashdefault**
> Use bash default completions if no matches.

**plusdirs**
> Add directory names to completions.

# DESCRIPTION

**compopt** is a Bash builtin command used within programmable completion functions to modify completion behavior dynamically. It allows completion functions to change options based on context or arguments.

When called without arguments inside a completion function, compopt modifies the options for the current completion. When command names are provided, it modifies the completion specification for those commands, similar to **complete -o**.

This command is essential for creating sophisticated completion functions that adapt their behavior based on what's being completed. For example, a function might enable filename completion only when the user is completing a file path argument.

# CAVEATS

compopt only works within the context of programmable completion. It must be called from a completion function or when specifying named commands. Using compopt outside a completion context with no command names specified will produce an error.

# HISTORY

compopt was introduced in **Bash 4.0**, released in **2009**. It was added to provide dynamic control over completion options, complementing the existing **complete** builtin which sets static completion specifications. This enabled more context-aware completion functions.

# SEE ALSO

[complete](/man/complete)(1), [compgen](/man/compgen)(1), [bash](/man/bash)(1)
