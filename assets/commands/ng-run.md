# TAGLINE

executes an Architect target defined in angular

# TLDR

**Run architect target**

```ng run [project]:[target]```

**Run with configuration**

```ng run [project]:[target]:[configuration]```

**Run a production build** through its target

```ng run [project]:build:production```

**Apply several configurations**, comma-separated

```ng run [project]:build:[production,staging]```

**Pass builder options** after the target

```ng run [project]:[target] --[option]=[value]```

**List the options** of a target

```ng run [project]:[target] --help```

# SYNOPSIS

**ng** **run** _project_:_target_[:_configuration_] [_options_]

# PARAMETERS

_project:target_
> Project and Architect target to run (e.g., `my-app:build`).

_project:target:configuration_
> Run the target using the named configuration defined in angular.json (e.g., `my-app:build:production`).

**--help**
> Display help for the specified target.

# DESCRIPTION

**ng run** executes an Architect target defined in **angular.json**. It is the low-level command used to invoke builders and can run custom builders or targets not covered by dedicated commands like **ng build**, **ng serve**, or **ng test**.

Any options accepted by the underlying builder may be appended after the target name. A configuration is selected only through the third colon-separated segment of the target; passing **--configuration** is rejected. Part of the Angular CLI.

# CAVEATS

Requires a valid Angular workspace (angular.json). The target and configuration must be defined in the workspace configuration.

# SEE ALSO

[ng](/man/ng)(1), [ng-build](/man/ng-build)(1), [ng-serve](/man/ng-serve)(1), [ng-test](/man/ng-test)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Homepage](https://angular.dev)```

```[Documentation](https://angular.dev/cli/run)```

<!-- verified: 2026-11-09 -->
