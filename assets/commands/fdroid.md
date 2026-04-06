# TAGLINE

F-Droid repository management tool

# TLDR

**Update repository index**

```fdroid update```

**Build app from** source

```fdroid build [app.id]```

**Initialize repository**

```fdroid init```

**Publish signed apps**

```fdroid publish```

**Check metadata for issues**

```fdroid lint [app.id]```

**Check for app updates**

```fdroid checkupdates [app.id]```

# SYNOPSIS

**fdroid** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: update, build, init, publish, lint, etc.

**update**
> Update the repository index.

**build** _APP_
> Build application from source.

**init**
> Initialize new repository.

**publish**
> Publish signed apps.

**lint** _APP_
> Check metadata for issues.

**checkupdates** _APP_
> Check for available upstream updates.

**scanner** _APP_
> Scan APKs for known non-free libraries.

**rewritemeta** _APP_
> Reformat and normalize metadata files.

**deploy**
> Deploy the repository to a server.

**import**
> Import a new app from source repository.

**readmeta**
> Read and validate metadata.

**-v**, **--verbose**
> More verbose output.

**--help**
> Display help information.

# DESCRIPTION

**fdroid** is the server-side tool for managing F-Droid repositories. It builds Android apps from source, maintains repository metadata, and generates the index files that F-Droid clients use.

The tool handles the entire app publication workflow: building APKs from source, signing them, generating metadata, and publishing to repositories. It enforces F-Droid's commitment to open source by building from source code.

fdroid is used by the official F-Droid repository and third-party repositories hosting open source Android applications.

# CONFIGURATION

**config.yml**
> Repository configuration including repo name, description, and keystore settings.

**metadata/**
> Directory containing per-app metadata files describing build recipes and app information.

# CAVEATS

Requires Android SDK. Building apps needs significant resources. Repository setup is complex. Signing requires key management.

# HISTORY

fdroid is the server component of **F-Droid**, the open source Android app repository founded in 2010. It enables anyone to host their own repository of free software Android applications.

# SEE ALSO

[fdroidcl](/man/fdroidcl)(1), [apktool](/man/apktool)(1), [adb](/man/adb)(1)
