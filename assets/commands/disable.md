# TAGLINE

Disable shell builtins or other named elements

# TLDR

**Disable a shell builtin** so the external version is used instead

```disable [builtin_name]```

**Disable a shell function**

```disable -f [function_name]```

**Disable a regular alias**

```disable -a [alias_name]```

**Disable a reserved word**

```disable -r [reserved_word]```

**Disable a glob pattern operator** like ~ or #

```disable -p '[operator]'```

**List all currently disabled builtins**

```disable```

# SYNOPSIS

**disable** [_-afmprs_] [_name ..._]

# PARAMETERS

**-a**
> Act on regular or global aliases

**-f**
> Act on shell functions

**-m**
> Treat arguments as glob patterns for matching multiple elements at once (patterns should be quoted)

**-p**
> Act on elements of the shell's pattern (globbing) syntax, such as **?**, **\***, **[**, **~**, **^**, and **#**

**-r**
> Act on reserved words

**-s**
> Act on suffix aliases

# DESCRIPTION

**disable** is a zsh builtin that temporarily deactivates named hash table elements. By default it operates on builtins: when a builtin is disabled, the shell will search **$PATH** for an external command of the same name instead. This is useful for forcing the use of an external version of a command over the shell builtin, such as using an external **echo** or **test** instead of the builtin version.

The command extends beyond builtins to aliases (**-a**), functions (**-f**), reserved words (**-r**), suffix aliases (**-s**), and even glob pattern operators (**-p**). When invoked without arguments, it lists all disabled elements from the corresponding hash table. Disabled elements can be re-enabled with the **enable** builtin.

# CAVEATS

Only available in **zsh**. In **bash**, the equivalent functionality for builtins is provided by **enable -n**, but bash does not support disabling aliases, functions, reserved words, or glob operators this way. Disabling critical builtins like **cd** or **exit** can make the shell difficult to use. The effect does not persist across shell sessions unless added to **~/.zshrc** or another configuration file.

# HISTORY

The concept of selectively disabling builtins originated in **bash** with the **enable -n** syntax. **Zsh** provides the dedicated **disable** command as part of its more modular approach to shell configuration, extending the concept to functions, aliases, reserved words, suffix aliases, and glob pattern operators.

# SEE ALSO

[enable](/man/enable)(1), [builtin](/man/builtin)(1), [zsh](/man/zsh)(1)
