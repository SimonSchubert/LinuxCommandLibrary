# TAGLINE

command-line interface for the Dart programming language

# TLDR

**Run a Dart file** directly

```dart [path/to/file.dart]```

**Create a new project** from a template

```dart create -t [console|package|web] [project_name]```

**Run the project** in the current directory

```dart run```

**Get package dependencies**

```dart pub get```

**Compile to a native executable**

```dart compile exe [bin/main.dart] -o [output]```

**Analyze code** for errors and warnings

```dart analyze```

**Format Dart source code**

```dart format [path/to/directory]```

**Run tests**

```dart test```

# SYNOPSIS

**dart** [_OPTIONS_] [_COMMAND_] [_ARGS_]

**dart** [_DART_FILE_]

# COMMANDS

**run** [_DART_FILE_]
> Run a Dart program in the Dart VM.

**create** _DIRECTORY_
> Create a new project. Use -t for templates (console, package, web).

**compile** _FORMAT_
> Compile Dart to various formats: exe (native), js (JavaScript), aot-snapshot, jit-snapshot, kernel.

**analyze** [_DIRECTORY_|_FILE_]
> Analyze Dart source code for errors and warnings.

**format** [_DIRECTORY_|_FILE_]
> Format Dart source code according to style guidelines.

**fix** [_DIRECTORY_|_FILE_]
> Apply automated fixes to Dart source code.

**test** [_DIRECTORY_|_FILE_]
> Run tests in the package.

**pub** _SUBCOMMAND_
> Work with packages (get, upgrade, publish, etc.).

**doc** _DIRECTORY_
> Generate API reference documentation.

**devtools**
> Launch Dart DevTools for debugging and profiling.

**info**
> Output Dart tooling diagnostic information.

# PARAMETERS

**-h**, **--help**
> Display help information.

**--version**
> Display the Dart SDK version.

**-v**, **--verbose**
> Show additional diagnostic output.

**--enable-experiment**=_NAME_
> Enable experimental language features.

# DESCRIPTION

**dart** is the command-line interface for the Dart programming language. It provides tools for running, compiling, testing, and managing Dart applications and packages.

Dart can run programs directly in the Dart VM with JIT compilation, or compile them to native executables, JavaScript, or WebAssembly for deployment. The **dart pub** subcommand manages package dependencies defined in pubspec.yaml.

The tool supports project templates for different application types including console applications, packages, and web applications. Code analysis and formatting tools help maintain consistent, error-free code.

# CAVEATS

Dart applications require the Dart SDK for development. Native compiled executables are platform-specific. When using packages, always run **dart pub get** after modifying pubspec.yaml. Some experimental features require explicit opt-in via --enable-experiment.

# HISTORY

Dart was developed by Google and first announced in **2011**. It was initially designed as an alternative to JavaScript for web development. With Dart 2.0 in **2018**, the language became strongly typed. The Flutter framework, also using Dart, drove significant adoption starting in **2017**. The unified **dart** command-line tool replaced separate tools like pub, dartanalyzer, and dartfmt in Dart 2.10 (2020).

# SEE ALSO

[flutter](/man/flutter)(1), [pub](/man/pub)(1), [node](/man/node)(1), [go](/man/go)(1)
