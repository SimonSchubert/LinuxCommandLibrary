# TAGLINE

displays Angular CLI and package versions

# TLDR

**Show Angular versions**

```ng version```

**Show version as JSON**

```ng version --json```

# SYNOPSIS

**ng** **version** [_options_]

# PARAMETERS

**--json**
> Output as JSON.

**--help**
> Display help information.

# DESCRIPTION

**ng version** displays Angular CLI and package versions, including `@angular/core`, `@angular/cli`, RxJS, TypeScript, Node.js, and the package manager in use. When run outside an Angular workspace it prints only the globally installed CLI information. `v` is accepted as a short alias (`ng v`).

The output is useful when reporting bugs, auditing dependency versions, or diagnosing build issues.

# CAVEATS

Part of Angular CLI. Useful for troubleshooting. Shows local project versions.

# HISTORY

ng version is part of **Angular CLI** for displaying version information and dependency details.

# SEE ALSO

[ng](/man/ng)(1), [node](/man/node)(1), [npm](/man/npm)(1)

