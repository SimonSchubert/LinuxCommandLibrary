# TLDR

**Initialize trunk in project**

```trunk init```

**Check code**

```trunk check```

**Format code**

```trunk fmt```

**Upgrade trunk tools**

```trunk upgrade```

**List available linters**

```trunk check list```

# SYNOPSIS

**trunk** _command_ [_options_]

# PARAMETERS

**init**
> Initialize trunk configuration.

**check**
> Run all enabled linters.

**fmt**
> Format code.

**upgrade**
> Upgrade trunk and tools.

**actions**
> Manage trunk actions.

**--all**
> Check all files.

**--fix**
> Auto-fix issues.

**--filter** _linter_
> Run specific linter.

# DESCRIPTION

**trunk** is a code quality tool that manages multiple linters and formatters. Provides unified interface for static analysis, formatting, and CI integration. Auto-detects and configures appropriate tools for your codebase.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1)

