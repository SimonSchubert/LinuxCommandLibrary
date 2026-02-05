# TLDR

**Create a new Angular workspace**

```ng new [my-app]```

**Create without prompts** using defaults

```ng new [my-app] --defaults```

**Create with routing enabled**

```ng new [my-app] --routing```

**Create with specific style format**

```ng new [my-app] --style [scss|sass|less|css]```

**Create without initial git repository**

```ng new [my-app] --skip-git```

**Create without installing dependencies**

```ng new [my-app] --skip-install```

**Create with strict mode** for enhanced type checking

```ng new [my-app] --strict```

**Create in dry-run mode** to preview changes

```ng new [my-app] --dry-run```

# SYNOPSIS

**ng** **new** [_name_] [_options_]

# PARAMETERS

_NAME_
> Name for the new workspace and initial project.

**--routing**
> Generate a routing module for the initial project.

**--style** _STYLE_
> File extension for style files (css, scss, sass, less).

**--skip-git**
> Do not initialize a git repository.

**--skip-install**
> Do not install dependency packages.

**--skip-tests**
> Do not generate spec files for the initial project.

**--strict**
> Enable stricter type checking and bundle budgets.

**--defaults**
> Disable interactive prompts and use default values.

**--dry-run**
> Run through without making changes (preview mode).

**--prefix** _PREFIX_
> Prefix for generated selectors (default: app).

**--package-manager** _PM_
> Package manager to use (npm, yarn, pnpm, cnpm).

**--directory** _DIR_
> Directory to create the workspace in.

**--inline-style**
> Include styles inline in the component TS file.

**--inline-template**
> Include template inline in the component TS file.

**--view-encapsulation** _MODE_
> View encapsulation strategy (Emulated, None, ShadowDom).

**--ssr**
> Configure the application for Server-Side Rendering.

**--help**
> Display help information.

# DESCRIPTION

**ng new** creates a new Angular workspace and generates an initial application. It scaffolds the complete project structure including configuration files, source directories, and optionally installs npm dependencies.

The command sets up TypeScript configuration, Angular-specific settings in angular.json, and testing infrastructure with Karma and Jasmine. The generated workspace follows Angular best practices and conventions.

When run without the **--defaults** flag, the CLI prompts for routing preferences and stylesheet format. The **--strict** option enables additional TypeScript compiler checks, stricter bundle budgets, and lint rules for improved code quality.

# CAVEATS

Requires Node.js and Angular CLI installed globally (**npm install -g @angular/cli**). The workspace name must be a valid npm package name (lowercase, no spaces). Creating large workspaces with full dependency installation can take several minutes depending on network speed.

# HISTORY

The **ng new** command has been part of **Angular CLI** since its initial release in **2016**. It evolved alongside Angular, adding options for routing in Angular 4, strict mode in Angular 10, and SSR scaffolding in Angular 17. The command generates standalone components by default since Angular 17.

# SEE ALSO

[ng](/man/ng)(1), [ng-generate](/man/ng-generate)(1), [ng-serve](/man/ng-serve)(1), [ng-build](/man/ng-build)(1)
