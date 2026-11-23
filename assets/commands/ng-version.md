# TAGLINE

displays Angular CLI and package versions

# TLDR

**Show Angular versions**

```ng version```

**Show versions** using the short alias

```ng v```

**Show version as JSON**

```ng version --json```

# SYNOPSIS

**ng** **version** [_options_]

# PARAMETERS

**--json**
> Output version information in JSON format.

**--help**
> Display help information.

# DESCRIPTION

**ng version** displays Angular CLI and package versions, including `@angular/core`, `@angular/cli`, RxJS, TypeScript, Node.js, and the package manager in use. When run outside an Angular workspace it prints only the globally installed CLI information. `v` is accepted as a short alias (`ng v`).

The output is useful when reporting bugs, auditing dependency versions, or diagnosing build issues.

# CAVEATS

Versions of the project's packages are read from the local **node_modules**, so run **npm install** first for accurate output. The **--json** option is only available in recent Angular CLI releases.

# SEE ALSO

[ng](/man/ng)(1), [node](/man/node)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/version)```

<!-- verified: 2026-11-23 -->
