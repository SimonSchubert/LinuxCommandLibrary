# TAGLINE

Retrieves or sets Angular CLI configuration values

# TLDR

**Get a configuration value**

```ng config [jsonPath]```

**Set a configuration value**

```ng config [jsonPath] [value]```

**Get the schematic collections**

```ng config cli.schematicCollections```

**Set the default package manager**

```ng config cli.packageManager [npm|yarn|pnpm|bun]```

**Get global configuration value**

```ng config --global [jsonPath]```

**Show all project configuration**

```ng config```

# SYNOPSIS

**ng config** [_jsonPath_] [_value_] [_options_]

# PARAMETERS

_jsonPath_
> JSON path to the configuration value using dot notation (e.g., **projects.myApp.architect.build**).

_value_
> New value to set at the specified JSON path. If omitted, the current value is printed.

**--global**, **-g**
> Access the global configuration in the home directory (**~/.angular-config.json**) instead of the project-level angular.json.

**--help**
> Display help information.

# DESCRIPTION

**ng config** reads and writes values in the Angular workspace configuration file (**angular.json**). Configuration values are accessed using JSON path notation, such as **a[3].foo.bar[2]**. With no arguments the whole configuration is printed. When only a path is provided, the current value is displayed. When a value is also provided, the configuration is updated.

This command is useful for scripting Angular workspace setup and for inspecting or modifying build configurations, default schematics, and CLI behavior.

# CAVEATS

Part of Angular CLI. The configuration file must be valid JSON. Invalid JSON paths will produce errors. Changes to angular.json affect all developers working on the project.

# HISTORY

**ng config** was introduced with **Angular CLI 6** in **2018** as part of the workspace configuration overhaul that replaced **.angular-cli.json** with **angular.json**.

# SEE ALSO

[ng](/man/ng)(1), [ng-new](/man/ng-new)(1), [ng-build](/man/ng-build)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/config)```

<!-- verified: 2026-11-09 -->
