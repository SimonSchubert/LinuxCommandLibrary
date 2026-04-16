# TAGLINE

executes an Architect target defined in angular

# TLDR

**Run architect target**

```ng run [project]:[target]```

**Run with configuration**

```ng run [project]:[target]:[configuration]```

**Run custom builder**

```ng run [project]:build:production```

# SYNOPSIS

**ng** **run** _project_:_target_[:_configuration_] [_options_]

# PARAMETERS

_project:target_
> Project and Architect target to run (e.g., `my-app:build`).

_project:target:configuration_
> Run the target using the named configuration defined in angular.json (e.g., `my-app:build:production`).

**--help**
> Display help for the specified target.

**--configuration** _name_, **-c** _name_
> Named builder configuration to use (alternative to third colon-separated segment).

# DESCRIPTION

**ng run** executes an Architect target defined in **angular.json**. It is the low-level command used to invoke builders and can run custom builders or targets not covered by dedicated commands like **ng build**, **ng serve**, or **ng test**.

Any options accepted by the underlying builder may be appended after the target name. Part of the Angular CLI.

# CAVEATS

Requires a valid Angular workspace (angular.json). The target and configuration must be defined in the workspace configuration.

# SEE ALSO

[ng](/man/ng)(1), [ng-build](/man/ng-build)(1)

