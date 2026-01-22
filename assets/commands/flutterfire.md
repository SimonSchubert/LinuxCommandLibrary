# TLDR

**Configure Firebase**

```flutterfire configure```

**Reconfigure specific** platform

```flutterfire configure --platforms=[android,ios]```

**Configure with specific** project

```flutterfire configure --project=[firebase-project-id]```

**Update configuration**

```flutterfire configure --yes```

# SYNOPSIS

**flutterfire** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: configure, install.

**configure**
> Set up Firebase for Flutter project.

**--project** _ID_
> Firebase project ID.

**--platforms** _LIST_
> Platforms to configure.

**--yes**
> Accept defaults without prompts.

**--out** _FILE_
> Output configuration file path.

**--help**
> Display help information.

# DESCRIPTION

**flutterfire** is the CLI for setting up Firebase in Flutter projects. It automates the configuration process, generating platform-specific files and Dart code.

The tool connects to your Firebase project and downloads configuration for selected platforms. It generates firebase_options.dart for initializing Firebase in your Flutter app.

flutterfire eliminates manual copying of configuration files and ensures consistency across platforms.

# CAVEATS

Requires Firebase CLI and authentication. Firebase project must exist. Platform SDKs needed for each target.

# HISTORY

flutterfire was created by the **FlutterFire** team to simplify Firebase integration in Flutter apps. It replaced manual configuration with automated setup across all supported platforms.

# SEE ALSO

[flutter](/man/flutter)(1), [firebase](/man/firebase)(1)
