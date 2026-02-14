# TAGLINE

Runs end-to-end tests for an Angular application

# TLDR

**Run end-to-end tests**

```ng e2e```

**Run e2e tests for a specific project**

```ng e2e [project-name]```

**Run e2e tests with a specific configuration**

```ng e2e --configuration production```

**Run e2e tests on a specific port**

```ng e2e --port [4200]```

# SYNOPSIS

**ng e2e** [_project_] [_options_]

# PARAMETERS

_project_
> The project to run end-to-end tests for. Defaults to the default project.

**--configuration** _name_
> Target build configuration.

**--port** _port_
> Port for the development server used during testing.

**--dev-server-target** _target_
> Dev server target to run tests against.

**--help**
> Display help information.

# DESCRIPTION

**ng e2e** builds the application, starts a development server, and runs end-to-end tests against it. The command requires an e2e testing framework builder to be configured in the project's **angular.json** file.

Since Angular CLI 12, no default e2e framework is included. Users must add a testing package such as **Cypress**, **Playwright**, or **Nightwatch** via **ng add** to provide the e2e builder.

# CONFIGURATION

An e2e builder must be added before using this command:

```ng add @cypress/schematic```
```ng add @playwright-ng/schematics```

# CAVEATS

Requires an e2e testing framework to be installed and configured. Protractor was removed as the default in Angular CLI 12. The dev server must be available for tests to run against. Part of Angular CLI.

# HISTORY

**ng e2e** originally used **Protractor** as the default end-to-end testing framework. With Angular CLI **12** (**2021**), Protractor was deprecated and the command became framework-agnostic, requiring users to install a testing builder explicitly.

# SEE ALSO

[ng](/man/ng)(1), [ng-test](/man/ng-test)(1), [cypress](/man/cypress)(1), [playwright](/man/playwright)(1)
