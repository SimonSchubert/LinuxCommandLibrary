# TAGLINE

runs linting on Angular project source code

# TLDR

**Lint project**

```ng lint```

**Lint specific project**

```ng lint [project-name]```

**Fix lint issues automatically**

```ng lint --fix```

**Output in specific format**

```ng lint --format json```

# SYNOPSIS

**ng** **lint** [_project_] [_options_]

# PARAMETERS

**--fix**
> Auto-fix lint issues.

**--format** _format_
> Output format (stylish, json, etc.).

**--force**
> Succeed even with lint errors.

**--silent**
> Suppress output.

# DESCRIPTION

**ng lint** runs linting on Angular project source code. Uses ESLint by default in modern Angular versions. Checks code style and potential errors. Part of Angular CLI.

# SEE ALSO

[ng](/man/ng)(1), [eslint](/man/eslint)(1)

