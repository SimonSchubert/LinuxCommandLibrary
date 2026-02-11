# TAGLINE

Opinionated JavaScript and TypeScript linter

# TLDR

**Lint JavaScript**

```xo```

**Lint specific files**

```xo [file.js]```

**Fix issues**

```xo --fix```

**Specify space indent**

```xo --space```

**Print config**

```xo --print-config```

# SYNOPSIS

**xo** [_--fix_] [_--space_] [_options_] [_files_]

# PARAMETERS

**--fix**
> Auto-fix issues.

**--space**
> Use space indent.

**--semicolon**
> Require semicolons.

**--prettier**
> Use Prettier.

**--print-config**
> Show config.

# DESCRIPTION

**xo** is an opinionated JavaScript and TypeScript linter built on top of ESLint. It provides a zero-configuration linting experience with a curated set of strict rules designed to enforce consistent, high-quality code without requiring manual ESLint setup.

The tool includes built-in TypeScript support and optional Prettier integration for combined linting and formatting. The **--fix** option automatically corrects fixable issues, while **--space** switches from the default tab indentation to spaces. By defaulting to strict, well-chosen rules, xo eliminates the need for teams to debate and configure linting rules individually.

# CAVEATS

Opinionated rules. Node.js required. ESLint-based.

# HISTORY

**xo** was created by **Sindre Sorhus** as an opinionated ESLint wrapper with sensible defaults.

# SEE ALSO

[eslint](/man/eslint)(1), [standard](/man/standard)(1), [prettier](/man/prettier)(1)
