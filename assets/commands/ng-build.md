# TLDR

**Build for production**

```ng build --configuration production```

**Build with source maps**

```ng build --source-map```

**Build specific project**

```ng build [project-name]```

**Watch mode**

```ng build --watch```

**Set output path**

```ng build --output-path [dist/custom]```

**Build with stats**

```ng build --stats-json```

**Development build**

```ng build --configuration development```

# SYNOPSIS

**ng** **build** [_project_] [_options_]

# PARAMETERS

_PROJECT_
> Project to build.

**--configuration** _NAME_
> Build configuration.

**--source-map**
> Generate source maps.

**--watch**
> Rebuild on changes.

**--output-path** _DIR_
> Output directory.

**--stats-json**
> Generate build stats.

**--help**
> Display help information.

# DESCRIPTION

**ng build** compiles Angular applications. It bundles code for deployment.

The command handles TypeScript compilation. Produces optimized production bundles.

ng build compiles Angular apps.

# CAVEATS

Part of Angular CLI. Configuration in angular.json. Webpack-based.

# HISTORY

ng build is part of **Angular CLI**, providing standardized build process for Angular applications.

# SEE ALSO

[ng](/man/ng)(1), [ng-serve](/man/ng-serve)(1), [webpack](/man/webpack)(1)

