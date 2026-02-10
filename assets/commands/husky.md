# TAGLINE

improves Git hooks management for JavaScript projects

# TLDR

**Initialize husky**

```npx husky init```

**Add pre-commit hook**

```npx husky add .husky/pre-commit "npm test"```

**Install hooks**

```npx husky install```

**Set hook**

```npx husky set .husky/pre-push "npm run lint"```

# SYNOPSIS

**husky** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to run.

**init**
> Initialize husky.

**install**
> Install git hooks.

**add** _FILE_ _CMD_
> Add hook script.

**set** _FILE_ _CMD_
> Set hook content.

**--help**
> Display help information.

# DESCRIPTION

**Husky** improves Git hooks management for JavaScript projects. It enables running linters, tests, and other scripts on commit and push.

The tool simplifies hook configuration in package.json. It's widely used with lint-staged for pre-commit code quality checks.

# CAVEATS

Node.js package. Requires npm/yarn. Version 5+ has different API.

# HISTORY

Husky was created to simplify Git hook management in **JavaScript** projects, becoming a standard dev dependency.

# SEE ALSO

[lint-staged](/man/lint-staged)(1), [git](/man/git)(1), [npm](/man/npm)(1)
