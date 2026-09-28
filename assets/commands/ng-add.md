# TAGLINE

adds npm packages with Angular schematics support to your project

# TLDR

**Add package to project**

```ng add [package-name]```

**Add Angular Material**

```ng add @angular/material```

**Add PWA support**

```ng add @angular/pwa```

**Add server-side rendering**

```ng add @angular/ssr```

**Add a specific version**

```ng add [package]@[version]```

**Install without the confirmation prompt**

```ng add [package] --skip-confirmation```

**Preview changes** without writing files

```ng add [package] --dry-run```

**Non-interactive**, accepting defaults

```ng add [package] --defaults --skip-confirmation```

# SYNOPSIS

**ng** **add** _collection_ [_options_]

# PARAMETERS

**--skip-confirmation**
> Skip the confirmation prompt before installing and executing the package.

**-d**, **--dry-run**
> Run through and report activity without writing results.

**--defaults**
> Disable interactive prompts for options that have a default.

**--interactive**
> Enable interactive input prompts (default true; use --no-interactive to disable).

**--force**
> Force overwriting of existing files.

**--registry** _url_
> npm registry to use.

**--verbose**
> Display additional details about internal operations.

Additional options are passed to the package's ng-add schematic.

# DESCRIPTION

**ng add** installs an npm package into the workspace using the detected package manager, then runs its **ng-add** schematic, which configures the project (updating angular.json, adding imports, styles or files). Part of Angular CLI; must be run inside an Angular workspace.

If a version is not given, ng add picks the latest version compatible with the workspace's Angular version.

# CAVEATS

Only packages that ship an ng-add schematic are configured automatically; others are just installed. Schematics can modify source files, so commit before running.

# SEE ALSO

[ng](/man/ng)(1), [ng-generate](/man/ng-generate)(1), [ng-update](/man/ng-update)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/add)```

<!-- verified: 2026-09-29 -->
