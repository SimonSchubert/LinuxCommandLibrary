# TAGLINE

Deploys an Angular application to a hosting provider

# TLDR

**Deploy the default project**

```ng deploy```

**Deploy a specific project**

```ng deploy [project-name]```

**Deploy with a build configuration**

```ng deploy --configuration production```

**Deploy without building first** (option of some builders, such as angular-cli-ghpages)

```ng deploy --no-build```

# SYNOPSIS

**ng deploy** [_project_] [_options_]

# PARAMETERS

_project_
> The project to deploy. Defaults to the only project with a deploy target, or the project in the current working directory.

**-c**, **--configuration** _names_
> Comma-separated list of named builder configurations from **angular.json**.

**--help**
> Display help information.

# DESCRIPTION

**ng deploy** invokes the deploy builder for a project. The builder must be configured in the project's **angular.json** file, which is typically set up by adding a hosting provider package such as **@angular/fire**, **@netlify-builder/deploy**, **angular-cli-ghpages** or **@jefiozie/ngx-aws-deploy**.

Most builders run the build first and then upload the output to the target hosting environment. Any further options are defined by the builder in use.

# CONFIGURATION

A deploy builder must be added via **ng add** before using this command:

```ng add @angular/fire```

```ng add @netlify-builder/deploy```

```ng add angular-cli-ghpages```

This registers the deploy target in **angular.json** under the project's architect section.

# CAVEATS

Requires a deploy builder package to be installed and configured. Without one, the command reports that it cannot find a "deploy" target and offers to add one of the known providers. Authentication with the hosting provider is typically required. Part of Angular CLI.

# HISTORY

**ng deploy** was added to Angular CLI in **version 8.3** (**2019**), providing a standardized interface for deployment across different hosting platforms through pluggable builders.

# SEE ALSO

[ng](/man/ng)(1), [ng-build](/man/ng-build)(1), [firebase](/man/firebase)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/deploy)```

<!-- verified: 2026-11-09 -->
