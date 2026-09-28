# TAGLINE

Angular CLI

# TLDR

**Create new project**

```ng new [project-name]```

**Serve application**

```ng serve```

**Build application**

```ng build```

**Generate component**

```ng generate component [name]```

**Generate service**

```ng generate service [name]```

**Run tests**

```ng test```

**Add library**

```ng add [package-name]```

**Update Angular** core and CLI, running migrations

```ng update @angular/core @angular/cli```

**Show versions** of Angular packages

```ng version```

# SYNOPSIS

**ng** _command_ [_arguments_] [_options_]

# COMMANDS

**new** [_name_] (alias **n**)
> Create a new Angular workspace.

**serve** [_project_] (aliases **dev**, **s**)
> Build and serve the application, rebuilding on file changes.

**build** [_project_] (alias **b**)
> Compile an application or library into an output directory (dist/ by default).

**generate** _schematic_ (alias **g**)
> Generate or modify files (component, service, directive, pipe, guard, etc.).

**test** [_project_] (alias **t**)
> Run unit tests.

**e2e** [_project_] (alias **e**)
> Build, serve and run end-to-end tests (requires an e2e package to be added).

**add** _package_
> Install a library and run its setup schematic.

**update** [_packages_]
> Update the workspace and its dependencies, running migrations.

**lint** [_project_]
> Run linting (requires a linter such as angular-eslint).

**deploy** [_project_]
> Invoke the deploy builder.

**extract-i18n** [_project_]
> Extract i18n messages from source code.

**run** _target_
> Run an Architect target, e.g. project:target[:configuration].

**config** [_json-path_] [_value_]
> Get or set values in angular.json.

**cache**
> Configure the persistent disk cache and show statistics.

**analytics**
> Configure usage analytics.

**completion**
> Set up shell autocompletion.

**version** (alias **v**)
> Show Angular CLI and package versions.

**--help**
> Display help for any command.

# DESCRIPTION

**ng** is the Angular CLI. It creates, develops, builds, tests and maintains Angular applications and libraries.

Workspace configuration lives in **angular.json**. Most commands run builders (Architect targets) or schematics defined there; new projects use the esbuild-based application builder with a Vite dev server.

A project-local CLI in node_modules takes precedence over a globally installed one, so each workspace uses its own CLI version.

# CAVEATS

Requires a supported Node.js version (checked at startup). Most commands only work inside an Angular workspace. ng lint, ng e2e and ng deploy do nothing until a corresponding package is added (e.g. ng add @angular-eslint/schematics).

# HISTORY

Angular CLI was created by **Google** and first released in **2016** alongside Angular 2, originally based on ember-cli. It has followed Angular's major version numbering since version 6 (2018).

# SEE ALSO

[ng-new](/man/ng-new)(1), [ng-serve](/man/ng-serve)(1), [ng-build](/man/ng-build)(1), [ng-generate](/man/ng-generate)(1), [ng-add](/man/ng-add)(1), [ng-update](/man/ng-update)(1), [npm](/man/npm)(1), [node](/man/node)(1), [nx](/man/nx)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Homepage](https://angular.dev)```

```[Documentation](https://angular.dev/cli)```

<!-- verified: 2026-09-29 -->
