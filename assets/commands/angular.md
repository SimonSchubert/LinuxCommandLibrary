# TLDR

**Create a new Angular workspace** and application

```ng new [project-name]```

**Serve the application** with live reload

```ng serve```

**Serve on a specific port** and open browser

```ng serve --port [4200] --open```

**Generate a new component**

```ng generate component [component-name]```

**Generate a service**

```ng generate service [service-name]```

**Build the application** for production

```ng build --configuration production```

**Run unit tests**

```ng test```

**Run end-to-end tests**

```ng e2e```

# SYNOPSIS

**ng** _command_ [_options_]

# PARAMETERS

**new** (alias: **n**)
> Create a new Angular workspace and initial application

**serve** (alias: **s**, **dev**)
> Build and serve the application with live reload on file changes

**generate** (alias: **g**)
> Generate components, services, modules, pipes, directives, and other schematics

**build** (alias: **b**)
> Compile the application into the dist/ output directory

**test** (alias: **t**)
> Run unit tests using the configured test runner

**e2e** (alias: **e**)
> Build, serve, and run end-to-end tests

**lint**
> Run linting tools on the application code

**add**
> Add support for an external library (installs and configures packages)

**update**
> Update the workspace and its dependencies

**deploy**
> Invoke the deploy builder for the project

**config**
> Get or set configuration values in angular.json

**cache**
> Configure and manage the persistent disk cache

**version** (alias: **v**)
> Display Angular CLI version information

**--help**
> Display help for any command

**--dry-run**
> Preview changes without writing files

**--verbose**
> Enable verbose logging output

# DESCRIPTION

**ng** is the command-line interface for Angular, a platform for building web applications. It provides tools for creating projects, generating code, building, testing, and deploying Angular applications.

The CLI automates common development tasks through schematics - templates that generate boilerplate code for components, services, modules, and other Angular constructs. The **generate** command supports creating components, directives, pipes, services, classes, guards, interfaces, enums, and modules.

Projects are configured through **angular.json**, which defines build targets, file paths, and environment-specific settings. The CLI supports multiple projects within a single workspace, enabling monorepo-style development.

The **serve** command provides a development server with hot module replacement, automatically rebuilding and refreshing the browser when source files change. Production builds use **build --configuration production** which enables optimizations like ahead-of-time compilation, tree shaking, and minification.

# CAVEATS

Requires Node.js and npm to be installed. Global installation via **npm install -g @angular/cli** provides the ng command system-wide, but projects can also use locally installed versions. Some commands like **deploy** require additional packages to be installed first using **ng add**.

# HISTORY

Angular CLI was introduced alongside **Angular 2** in **September 2016** to simplify project setup and development workflows. It replaced the manual configuration required for TypeScript compilation, module bundling, and build optimization. The CLI has evolved significantly, with major updates accompanying each Angular version, introducing features like differential loading, Ivy compilation, and standalone components.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [webpack](/man/webpack)(1), [react-scripts](/man/react-scripts)(1), [vue](/man/vue)(1)
