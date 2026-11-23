# TAGLINE

creates Angular artifacts using schematics

# TLDR

**Generate component**

```ng generate component [name]```

**Generate service**

```ng generate service [name]```

**Generate a route guard**

```ng generate guard [name]```

**Generate component** without a test file and with SCSS

```ng generate component [name] --skip-tests --style scss```

**Generate with shorthand**

```ng g c [name]```

**Generate in specific path**

```ng generate component [path/name]```

**Dry run**

```ng generate component [name] --dry-run```

# SYNOPSIS

**ng** **generate** _schematic_ _name_ [_options_]

# SCHEMATICS

**component** (c) / **directive** (d) / **pipe** (p) / **service** (s)
> Generate the corresponding Angular artifact.

**module** (m)
> Generate an NgModule.

**guard** (g) / **interceptor**
> Generate a route guard or HTTP interceptor.

**class** / **interface** / **enum**
> Generate a plain TypeScript class, interface, or enum.

**resolver**
> Generate a route data resolver.

**library**
> Generate a publishable library workspace.

**application**
> Add a new application to a multi-project workspace.

**environments**
> Create environment files for a project (Angular 15+).

**service-worker** / **web-worker** / **app-shell** / **config**
> Add a service worker, a web worker, an app shell, or a CLI config file (karma, browserslist).

# PARAMETERS

**--dry-run**, **-d**
> Show what would be generated without writing files.

**--defaults**
> Disable interactive prompts for options that have a default.

**--force**
> Overwrite existing files.

**--skip-tests**
> Do not generate .spec.ts test files.

**--skip-import**
> Do not import the generated piece into its NgModule.

**--standalone**
> Generate a standalone component/directive/pipe. Default **true** since Angular 17; use **--standalone false** for NgModule-based declarations.

**--flat**
> Create files at the top level of the target path instead of in their own folder.

**--change-detection**, **-c** _strategy_
> Component change detection strategy. Current releases accept **OnPush** (the default) or **Eager**; older releases used **Default** or **OnPush**.

**--type** _type_
> Append a type to the file name (for example _name.component.ts_). Since Angular 20 generated files omit the type suffix by default.

**--inline-template**, **-t**
> Place HTML inline in the component decorator.

**--inline-style**, **-s**
> Place CSS inline in the component decorator.

**--style** _ext_
> Stylesheet extension: css, scss, sass, less, none.

**--prefix**, **-p** _prefix_
> Override the project's selector prefix.

**--export**
> Export the generated declaration from its NgModule (non-standalone only).

**--project** _name_
> Target a specific project in the workspace.

# DESCRIPTION

**ng generate** creates Angular artifacts using schematics. It scaffolds components, services, modules, directives, pipes, guards, interceptors, and more, generating them as standalone (the default since Angular 17) or wiring them into an NgModule and adding matching .spec.ts files. The shorthand **ng g** is equivalent.

Schematics live in **@schematics/angular** and other npm packages; libraries shipped via **ng add** can register their own (for example, **@angular/material** adds **material:navigation**). The available list can be inspected with **ng generate --help**.

# CAVEATS

Must be run inside an Angular CLI workspace (a directory containing **angular.json**). Newly generated files follow the project's coding-style settings (selector prefix, indent, style extension). The set of available schematics depends on which packages have been added with **ng add**.

# SEE ALSO

[ng](/man/ng)(1), [ng-add](/man/ng-add)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/generate)```

<!-- verified: 2026-11-23 -->
