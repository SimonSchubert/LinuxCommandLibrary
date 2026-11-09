# TAGLINE

creates a new Angular workspace and generates an initial application

# TLDR

**Create a new Angular workspace**

```ng new [my-app]```

**Create without prompts** using defaults

```ng new [my-app] --defaults```

**Create with specific style format**

```ng new [my-app] --style [css|scss|sass|less|tailwind]```

**Create with server-side rendering**

```ng new [my-app] --ssr```

**Create without initial git repository**

```ng new [my-app] --skip-git```

**Create without installing dependencies**

```ng new [my-app] --skip-install```

**Create an empty workspace** with no initial application

```ng new [my-workspace] --no-create-application```

**Create in dry-run mode** to preview changes

```ng new [my-app] --dry-run```

# SYNOPSIS

**ng** **new** [_name_] [_options_]

**ng** **n** [_name_] [_options_]

# PARAMETERS

_NAME_
> Name for the new workspace and initial project.

**--routing**
> Enable routing in the initial application (default: true). Use **--no-routing** to disable.

**--style** _STYLE_
> Stylesheet format: css, scss, sass, less or tailwind.

**-g**, **--skip-git**
> Do not initialize a git repository.

**--commit**
> Configure the initial git commit (default: true).

**--skip-install**
> Do not install dependency packages.

**-S**, **--skip-tests**
> Do not generate spec files for the initial project.

**--test-runner** _RUNNER_
> Unit test runner: vitest (default) or karma.

**--standalone**
> Use the standalone API without NgModules (default: true).

**--zoneless**
> Create an application that does not use zone.js (default for new applications).

**--strict**
> Enable stricter type checking and bundle budgets (default: true).

**--minimal**
> Generate a minimal workspace without any testing frameworks.

**--defaults**
> Disable interactive prompts for options with a default.

**--interactive**
> Enable interactive prompts (default: true). Use **--no-interactive** to disable.

**-d**, **--dry-run**
> Run through without making changes (preview mode).

**--force**
> Force overwriting of existing files.

**-p**, **--prefix** _PREFIX_
> Prefix for generated selectors (default: app).

**--package-manager** _PM_
> Package manager to use: npm, yarn, pnpm or bun.

**--directory** _DIR_
> Directory to create the workspace in.

**--new-project-root** _PATH_
> Path for new projects, relative to the workspace root (default: projects).

**-s**, **--inline-style**
> Include styles inline in the component TS file.

**-t**, **--inline-template**
> Include template inline in the component TS file.

**--view-encapsulation** _MODE_
> View encapsulation strategy (Emulated, None, ShadowDom).

**--ssr**
> Configure the application for Server-Side Rendering and Static Site Generation.

**--create-application**
> When false, creates an empty workspace with no initial application (default: true).

**--ai-config** _TOOL_
> Generate configuration files for the given AI tools.

**--file-name-style-guide** _YEAR_
> File naming convention for generated files: 2016 or 2025 (default).

**-c**, **--collection** _NAME_
> Schematics collection to use for generating the initial application.

**--help**
> Display help information.

# DESCRIPTION

**ng new** creates a new Angular workspace and generates an initial application. It scaffolds the complete project structure including configuration files, source directories, and optionally installs npm dependencies.

The command sets up TypeScript configuration, Angular-specific settings in angular.json, and testing infrastructure. Run without **--defaults** or **--no-interactive**, the CLI prompts for missing input such as the workspace name.

Boolean options that default to true are turned off with a **--no-** prefix, for example **--no-standalone**.

# CAVEATS

Requires Node.js and Angular CLI installed globally (**npm install -g @angular/cli**). The workspace name must be a valid npm package name. Available options and defaults change between Angular major versions; run **ng new --help** for the installed version. Installing dependencies for a large workspace can take several minutes.

# HISTORY

**ng new** is part of **Angular CLI**. Standalone components became the default in Angular 17, which also introduced the **--ssr** option.

# SEE ALSO

[ng](/man/ng)(1), [ng-generate](/man/ng-generate)(1), [ng-serve](/man/ng-serve)(1), [ng-build](/man/ng-build)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Homepage](https://angular.dev)```

```[Documentation](https://angular.dev/cli/new)```

<!-- verified: 2026-11-09 -->
