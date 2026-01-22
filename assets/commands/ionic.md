# TLDR

**Create new app**

```ionic start [myapp] [blank|tabs|sidemenu]```

**Serve locally**

```ionic serve```

**Build for production**

```ionic build --prod```

**Add platform**

```ionic capacitor add [ios|android]```

**Run on device**

```ionic capacitor run [ios|android]```

**Generate component**

```ionic generate component [name]```

# SYNOPSIS

**ionic** _command_ [_options_]

# PARAMETERS

**start** _NAME_ _TEMPLATE_
> Create new project.

**serve**
> Start development server.

**build**
> Build web assets.

**capacitor** _COMMAND_
> Capacitor integration commands.

**generate** _TYPE_ _NAME_
> Generate components, pages, services.

**--prod**
> Production build.

**--help**
> Display help information.

# DESCRIPTION

**Ionic** CLI manages Ionic Framework projects. It creates hybrid mobile apps using web technologies.

The tool integrates with Capacitor or Cordova for native functionality. It provides development server, build tools, and code generation.

Ionic builds cross-platform mobile apps.

# CAVEATS

Requires Node.js. Native builds need platform SDKs. Framework updates may require migration.

# HISTORY

Ionic was created by **Drifty Co.** in 2013 as a framework for building hybrid mobile applications with web technologies.

# SEE ALSO

[capacitor](/man/capacitor)(1), [cordova](/man/cordova)(1), [npm](/man/npm)(1), [angular](/man/ng)(1)
