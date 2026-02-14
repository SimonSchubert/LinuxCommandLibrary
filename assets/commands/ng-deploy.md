# TAGLINE

Deploys an Angular application to a hosting provider

# TLDR

**Deploy the default project**

```ng deploy```

**Deploy a specific project**

```ng deploy [project-name]```

**Deploy with a build configuration**

```ng deploy --configuration production```

**Deploy without building first**

```ng deploy --no-build```

# SYNOPSIS

**ng deploy** [_project_] [_options_]

# PARAMETERS

_project_
> The project to deploy. Defaults to the default project in the workspace.

**--configuration** _name_
> Build configuration to use for deployment.

**--no-build**
> Skip the build step before deploying.

**--help**
> Display help information.

# DESCRIPTION

**ng deploy** builds and deploys an Angular application to a remote hosting provider. The deploy command requires a deployment builder to be configured in the project's **angular.json** file, which is typically set up by adding a hosting provider package such as **@angular/fire**, **@azure/ng-deploy**, or **@netlify-builder/deploy**.

The command first runs the build process and then invokes the configured builder to upload the output to the target hosting environment.

# CONFIGURATION

A deploy builder must be added via **ng add** before using this command:

```ng add @angular/fire```
```ng add @netlify-builder/deploy```
```ng add @azure/ng-deploy```

This registers the deploy target in **angular.json** under the project's architect section.

# CAVEATS

Requires a deploy builder package to be installed and configured. Without one, the command will fail with a "no deploy target" error. Authentication with the hosting provider is typically required. Part of Angular CLI.

# HISTORY

**ng deploy** was added to Angular CLI in **version 8.3** (**2019**), providing a standardized interface for deployment across different hosting platforms through pluggable builders.

# SEE ALSO

[ng](/man/ng)(1), [ng-build](/man/ng-build)(1), [firebase](/man/firebase)(1)
