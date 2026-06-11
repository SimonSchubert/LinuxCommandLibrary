# TAGLINE

Define and look up zsh styles by context

# TLDR

**Define a style** for a pattern (e.g. enable case-insensitive completion matching)

```zstyle ':completion:*' matcher-list 'm:{a-zA-Z}={A-Za-z}'```

**List all** style definitions in zstyle form

```zstyle -L```

**List styles** matching a meta-pattern

```zstyle -L ':completion:*'```

**Delete a style** for a pattern

```zstyle -d ':completion:*' menu```

**Look up a style** value into a scalar variable

```zstyle -s ':completion:*' completer REPLY```

**Look up a style** as an array

```zstyle -a ':completion:*:descriptions' format DESCR```

**Test a boolean style** (returns 0 if set to yes/true/on/1)

```zstyle -t ':completion:*' verbose```

**Define a dynamically-evaluated** style with `-e`

```zstyle -e ':completion:*' max-errors 'reply=($((($#PREFIX+$#SUFFIX)/3))numeric)'```

# SYNOPSIS

**zstyle** [ **-L** [ _metapattern_ [ _style_ ] ] ]

**zstyle** [ **-** | **--** | **-e** ] _pattern_ _style_ _string_ ...

**zstyle** **-d** [ _pattern_ [ _style_ ... ] ]

**zstyle** **-g** _name_ [ _pattern_ [ _style_ ] ]

**zstyle** **-{a|b|s}** _context_ _style_ _name_ [ _sep_ ]

**zstyle** **-{T|t}** _context_ _style_ [ _string_ ... ]

**zstyle** **-m** _context_ _style_ _pattern_

# PARAMETERS

**-L** [_metapattern_ [_style_]]
> List style definitions as **zstyle** commands. Optional _metapattern_ filters by pattern, _style_ filters by style name.

**-e**
> Treat the value as code to be evaluated when the style is looked up; the parameter **reply** must be set to the resulting strings.

**-d** [_pattern_ [_style_ ...]]
> Delete styles. Without arguments deletes all definitions. With a _pattern_, deletes that pattern; with _styles_, deletes only those.

**-g** _name_ [_pattern_ [_style_]]
> Get definitions into the array _name_. Returns patterns, styles for a pattern, or values for a (pattern, style) pair.

**-s** _context_ _style_ _name_ [_sep_]
> Read the style as a scalar into _name_, joining multiple values with spaces or _sep_. Returns 0 if set, 1 otherwise.

**-b** _context_ _style_ _name_
> Read the style as a boolean (`yes` if the single value is **yes**, **true**, **on**, or **1**; otherwise `no`).

**-a** _context_ _style_ _name_
> Read the style as an array; if _name_ is associative, alternate strings become keys and values.

**-t** _context_ _style_ [_string_ ...]
> Test a style. Status 0 = matches/true, 1 = defined but not matching, 2 = undefined.

**-T** _context_ _style_ [_string_ ...]
> Like **-t** but returns 0 (instead of 2) when the style is undefined for any matching pattern.

**-m** _context_ _style_ _pattern_
> Pattern-match a style value. Returns 0 if _pattern_ matches at least one of the value's strings.

# DESCRIPTION

**zstyle** is a builtin from the **zsh/zutil** module used to define and look up styles. A style is a name/value pair stored against a pattern; lookups supply a colon-separated **context** string that is matched against those patterns. The most specific matching pattern wins.

Pattern specificity is determined by the number of colon-separated components and how literal each component is. Literal strings beat patterns, complex patterns beat the wildcard `*`, and ties are broken in favor of the pattern defined first. A `*` matches any number of characters including colons.

Styles are most prominently used by zsh's shell-function-based completion system, where contexts follow the form **:completion:_function_:_completer_:_command_:_argument_:_tag_**. They are also used by prompt themes (e.g. **vcs_info**), zsh plugins, and arbitrary user code that calls **zstyle -s/-a/-b/-t** to read user preferences.

# CAVEATS

A common gotcha with **-L**: the meta-pattern is matched against the stored pattern, so `zstyle -L ":completion:*"` matches any stored pattern beginning with `:completion:`, not just the literal `:completion:*`. Use `:completion:\*` to match the literal asterisk. The **-L** option cannot be combined with other options.

The **-e** form re-evaluates its value on every lookup; if **reply** is left unset by the evaluation, the style is treated as undefined.

# CONFIGURATION

Styles are typically set in **~/.zshrc** after **autoload -U compinit && compinit**. There is no on-disk configuration file dedicated to styles; they live in shell memory until the shell exits.

Common contexts include **:completion:\***, **:vcs_info:\***, **:zle:\***, and plugin-specific namespaces such as **:weather:\*** or **:zsh-autosuggest**.

# HISTORY

The **zstyle** builtin was introduced as part of the **zsh/zutil** module to support the new function-based completion system that replaced the older **compctl** approach in **zsh 4.0** (2001). It became the standard configuration mechanism for completion behavior, prompt themes such as **vcs_info**, and many third-party zsh plugins.

# SEE ALSO

[zsh](/man/zsh)(1)
