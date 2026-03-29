# TAGLINE

Compile an Angular application

# TLDR

**Build for production**

```ng build --configuration production```

**Build with source maps**

```ng build --source-map```

**Build a specific project** in a workspace

```ng build [project-name]```

**Watch mode** to rebuild on file changes

```ng build --watch```

**Set output path**

```ng build --output-path [dist/custom]```

**Build with a custom base href**

```ng build --base-href [/my-app/]```

**Generate stats JSON** for bundle analysis

```ng build --stats-json```

**Development build**

```ng build --configuration development```

# SYNOPSIS

**ng** **build** [_project_] [_options_]

# PARAMETERS

_PROJECT_
> The name of the project to build, as specified in angular.json.

**-c**, **--configuration** _name_
> One or more named builder configurations (comma-separated), as defined in angular.json.

**--source-map**
> Generate source maps for scripts and styles (default: false).

**--watch**
> Rebuild on file changes (default: false).

**--output-path** _dir_
> Output directory relative to workspace root.

**--base-href** _url_
> Base URL for the application being built.

**--aot**
> Build using Ahead of Time compilation (default: true).

**--optimization**
> Enable optimization including minification, tree-shaking, and dead-code elimination (default: true).

**--output-hashing** _mode_
> Cache-busting hashing mode: none, all, media, or bundles (default: none).

**--delete-output-path**
> Delete the output path before building (default: true).

**--stats-json**
> Generate a stats.json file for bundle analysis (default: false).

**--progress**
> Log progress to the console while building (default: true).

**--extract-licenses**
> Extract all licenses to a separate file (default: true).

**--subresource-integrity**
> Enable subresource integrity validation (default: false).

**--verbose**
> Add detailed output logging (default: false).

**--named-chunks**
> Use file name for lazy loaded chunks (default: false).

**--poll** _ms_
> File watching poll time period in milliseconds.

**--ssr**
> Enable Server-Side Rendering at runtime (default: false).

**--prerender**
> Enable Static Site Generation (prerendering) during build.

**--help**
> Display help information.

# DESCRIPTION

**ng build** compiles an Angular application or library into an output directory. It handles TypeScript compilation, bundling, minification, tree-shaking, and other optimizations to produce deployment-ready artifacts.

The application builder uses esbuild as the build tool. Default configuration options are specified in the workspace configuration file (angular.json) or can be overridden with a named alternative configuration. Command-line options override those set in angular.json.

A "production" configuration with full optimizations is typically defined by default when creating a project with the CLI. A "development" configuration with faster builds and source maps is also available.

# CAVEATS

Part of **Angular CLI**. Build configuration is managed in angular.json. Option names on the command line use dash-case, while in the configuration file they use camelCase. Some options can only be set through angular.json. The `--prod` flag was removed in Angular 12; use `--configuration production` instead.

# HISTORY

**ng build** is part of **Angular CLI**, first released alongside Angular 2 in **2016**. The build system was originally based on Webpack, but modern versions of Angular (17+) have migrated to **esbuild** for significantly faster build times.

# SEE ALSO

[ng](/man/ng)(1), [ng-serve](/man/ng-serve)(1), [webpack](/man/webpack)(1)

