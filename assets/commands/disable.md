# TAGLINE

Disable shell builtins or other named elements

# TLDR

**Disable a shell builtin**

```disable [builtin_name]```

**Disable a shell function**

```disable -f [function_name]```

**Disable a reserved word**

```disable -r [reserved_word]```

**List all disabled builtins**

```disable```

**Re-enable a disabled builtin**

```enable [builtin_name]```

# SYNOPSIS

**disable** [_-afmprs_] [_name ..._]

# PARAMETERS

**-a**
> Disable aliases

**-f**
> Disable shell functions

**-m**
> Treat arguments as patterns for matching

**-p**
> Disable shell parameters (variables)

**-r**
> Disable reserved words

**-s**
> Disable suffix aliases (zsh)

# DESCRIPTION

**disable** is a zsh builtin that prevents named elements from being used. When a builtin is disabled, the shell will search **$PATH** for an external command of the same name instead. This is useful for forcing the use of an external version of a command over the shell builtin, such as using an external **echo** or **test** instead of the builtin version.

Disabled elements can be re-enabled with the **enable** builtin.

# CAVEATS

Only available in zsh. In bash, the equivalent functionality is provided by **enable -n**. Disabling critical builtins like **cd** or **exit** can make the shell difficult to use. The effect does not persist across shell sessions unless added to shell configuration files.

# HISTORY

The concept of disabling builtins was introduced in **bash** with the **enable -n** syntax. **Zsh** provides the dedicated **disable** command as part of its more modular approach to shell configuration, extending the concept to functions, aliases, and reserved words.

# SEE ALSO

[enable](/man/enable)(1), [builtin](/man/builtin)(1), [zsh](/man/zsh)(1)
